package com.triumphapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.triumphapp.model.Affirmations
import java.lang.reflect.Modifier

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
    fun AffirmationCard(affirmation: Affirmation, modifier : Modifier = Modifier) {
        Card(modifier = modifier.padding(8.dp), elevation = 4.dp) {
            Column{
                Image(
                    painter = painterResource(affirmation.imageResourceId),
                    contentDescription = stringResource(affirmation.stringResourceId),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.crop
                )
            }


        }



    }






