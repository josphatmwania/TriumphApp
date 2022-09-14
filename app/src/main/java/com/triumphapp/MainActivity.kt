package com.triumphapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.triumphapp.model.Affirmations

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}

    @Composable
    fun AffirmationApp() {
        val context = LocalContext.current
        AffirmationTheme {

        }
    }


    @Composable
    fun AffirmationCard(affirmation: Affirmations){


    }






