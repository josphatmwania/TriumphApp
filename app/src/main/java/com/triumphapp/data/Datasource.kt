package com.triumphapp.data

import com.triumphapp.model.Affirmations

class Datasource() {

//    Loading list of affirmations
    fun loadAffirmations() : List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            )
    }




}