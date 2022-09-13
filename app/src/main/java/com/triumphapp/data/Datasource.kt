package com.triumphapp.data

import com.triumphapp.model.Affirmations

class Datasource() {

//    Loading list of affirmations
    fun loadAffirmations() : List<Affirmations> {
        return listOf<Affirmations>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation1, R.drawable.image2),
            Affirmation(R.string.affirmation1, R.drawable.image3),
            Affirmation(R.string.affirmation1, R.drawable.image4),
            )
    }




}