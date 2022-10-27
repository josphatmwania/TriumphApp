package com.triumphapp.domain.models

import java.math.BigDecimal

/**
 * This is the beer domain class
 *
 *
 */

data class Beer {
    val id: String,
    val name: String,
    val imageUrl: String,
    val abv: BigDecimal,
    val tagline: String,
    val description: String,
    val brewersTips: String,
    val foodPairing: List<String>

}