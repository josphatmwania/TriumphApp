package com.triumphapp.data.datasource.remote

import com.triumphapp.data.datasource.remote.models.BeerDto
import retrofit2.http.GET
import retrofit2.http.Path


/**
 *
 * This is the API data source
 *
 *
 */


interface BeerApi {

    /**
     *
     * This gets a list of beers from the api
     *
     * and @return a list of beers
     *
     *
     */



    @GET("v2/beers")
    suspend fun getAllBeers(): List<BeerDto>


    /**
     *
     * This gets a beer by its id from the API
     *
     * @param id the id of the beer
     *
     * @return a list of beers from Punk API
     *
     *
     */


    @GET("v2/beers/{id} ")
    suspend fun getBeerById(@Path("id") id: String): List<BeerDto>
}