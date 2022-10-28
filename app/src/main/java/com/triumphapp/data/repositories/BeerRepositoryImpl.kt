package com.triumphapp.data.repositories


import com.triumphapp.data.datasource.local.dao.BeerDao
import com.triumphapp.data.datasource.local.models.mapToDomain
import com.triumphapp.data.datasource.local.models.mapToEntity
import com.triumphapp.data.datasource.remote.BeerApi
import com.triumphapp.data.datasource.remote.models.mapToDomain
import com.triumphapp.data.extensions.emitData
import com.triumphapp.domain.models.Beer
import com.triumphapp.domain.framework.Result
import com.triumphapp.domain.repositories.BeerRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.FlowOn
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


/**
 *
 * Implementing  the Beer Repository
 *
 * @property dispatcher the coroutine dispatcher
 * @property beerApi the api data source
 * @property beerDao the database datasource
 *
 *
 */




class BeerRepositoryImpl @Inject Constructor{
    private val dispatcher: CoroutineDispatcher,
    private val beerApi: BeerApi,
    private val beerDao: BeerDao
    ) : BeerRepository {

        override suspend fun getBeers(
            forceRefresh: Boolean,
            filterByName: String
        ): Flow<Result<List<Beer>>> = flow {
            emitData(
                forceRefresh = forceRefresh,
                loadFromDb = { beerDao.getAllBeers(filterByName = filterByName).map { it.mapToDomain() } },
                saveToDb = { data -> beerDao.addAllBeers(data.map { it.mapToEntity() }) },
                loadFromApi = { beerApi.getAllBeers().map { it.mapToDomain() } }
            )
        }.flowOn(dispatcher)

        override suspend fun getBeerById(forceRefresh: Boolean, id: String): Flow<Result<Beer>> = flow {
            emitData(
                forceRefresh = forceRefresh,
                loadFromDb = { beerDao.getBeerById(id = id).mapToDomain() },
                saveToDb = { data -> beerDao.addBeer(data.mapToEntity()) },
                loadFromApi = { beerApi.getBeerById(id = id).first().mapToDomain()  }
            )
        }.flowOn(dispatcher)

}