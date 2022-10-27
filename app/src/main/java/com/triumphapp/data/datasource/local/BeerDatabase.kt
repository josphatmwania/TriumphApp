package com.triumphapp.data.datasource.local

import androidx.room.Database
import androidx.room.TypeCOnverters
import com.triumphapp.data.datasource.local.models.BeerEntity
import com.triumphapp.data.datasource.local.dao.BeerDao
import com.triumphapp.data.datasource.local.converters.StringListConverters
import androidx.room.RoomDatabase


/**
 *
 * This is the DB for the beers
 *
 */


@Database(
    entities = [BeerEntity::class],
    version = 1,
    exportSchema = false

)

@TypeConverters(StringListConverters::class)
abstract class BeerDatabase : RoomDatabase(){

    abstract fun getBeerDao() : BeerDao

    companion object {
        const val DATABASE_NAME: String = "beerdatabase"
    }
}
