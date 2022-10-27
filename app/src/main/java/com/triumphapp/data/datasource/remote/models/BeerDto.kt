package com.triumphapp.data.datasource.remote.models

import com.triumphapp.domain.models.Beer
import com.google.gson.annotations.SerializedName
import java.math.BigDecimal


/**
 *  * The Beer Data Access Object. It represents the json response.
 *
 * @property id the id of the beer.
 * @property name the name of the beer.
 * @property imageUrl the image url of the beer.
 * @property abv the alcohol by volume of the beer.
 * @property tagline the tagline of the beer.
 * @property description the description of the beer.
 * @property brewersTips tips from the brewers.
 * @property foodPairing list of food pairing with the beer.
 *
 *
 */



data class BeerDto {
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("food_paring") val foodParing: List<String>,
    @SerializedName("brewers_tips") val brewerTips: String,
    @SerializedName("description") val description: String,
    @SerializedName("tagline") val tagline: tagline: String,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("abv") val abv: String

}

    /**
     * This function maps the Beer DTO into a domain model
     *
     */
fun BeerDto.mapToDomain() : Beer =
    Beer(
        id = id.toString(),
        name = name,
        abv = BigDecimal(abv),
        imageUrl = imageUrl,
        tagline = tagline,
        description = description,
        brewersTips = brewersTips,
        foodPairing = foodPairing

    )

