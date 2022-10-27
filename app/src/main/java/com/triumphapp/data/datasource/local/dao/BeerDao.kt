package com.triumphapp.data.datasource.local.dao

import androidx.room.*
import com.triumphapp.data.datasource.local.models.BeerEntity

/**
 * Defining the Database interactions
 */


@Dao
interface BeerDao {

    /**
     * Getting all the beers from the DB
     * @return a list of all the beers in the DB
     */


    /**
     * Returns List in ascending order
     */
    @Query("SELECT * FROM beers WHERE name LIKE '%' || :filterByName || '%' ORDER BY name ASC")
    suspend fun  getAllBeers(filterByName: String = ""): List<BeerEntity>


}