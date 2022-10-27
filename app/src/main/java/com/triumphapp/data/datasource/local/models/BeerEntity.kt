package com.triumphapp.data.datasource.local.models

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.math.BigDecimal
import androidx.room.Entity
import com.triumphapp.domain.models.Beer

/**
 * This is the beer database entity
 *  * @property id the id of the beer.
 * @property name the name of the beer.
 * @property imageUrl the image url of the beer.
 * @property abv the alcohol by volume of the beer.
 * @property tagline the tagline of the beer.
 * @property description the description of the beer.
 * @property brewersTips tips from the brewers.
 * @property foodPairing list of food pairing with the beer.
 *
 */



@Entity(tableName = "beers")
data class BeerEntity {

    @PrimaryKey
    @ColumnInfo(name ="id")
    val id: Int,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="image_url")
    val imageUrl: String,

    @ColumnInfo(name= "abv")
    val abv: String,

    @ColumnInfo(name="Tagline")
    val tagline:String,

    @ColumnInfo(name= "description")
    val description: String,

    @ColumnInfo(name="brewers_tips")
    val brewersTips:String,


    @ColumnInfo(name = "food_pairing")
    val foodPairing: List<String>


    /**
     * Mapping the Beer entity into the domain model functions
     *
     */








}