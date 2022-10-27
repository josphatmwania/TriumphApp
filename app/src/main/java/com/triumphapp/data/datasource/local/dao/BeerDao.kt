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


    /**
     * This function adds a list of beers to the DB. If a beer exits, it
     * replaces it
     *
     * @param beer is the beer to be added
     */

    @Insert(onConflict = OnConflictStrategy.Replace)
    suspend fun addBeers(beer: List<BeerEntity>)

    /**
     * Getting beer by its id  and @return the beer from the DB
     * @param id the id of the beer
     */

    @Query("SELECT * FROM beers WHERE id = :id")
    suspend fun getBeerById(id: String) : BeerEntity


    /**
     *
     * Deleting everything from the table
     *
     */

    @Query("DELETE FROM beers")
    suspend fun deleteAll()

















}