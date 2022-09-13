package com.triumphapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmations(

//    Affirmations has one Image & string
//    The stringResourceId represents an ID for the affirmation text stored in a string resource.
//    The imageResourceId represents an ID for the affirmation image stored in a drawable resource.

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int

)
