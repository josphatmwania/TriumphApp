package com.triumphapp.data.datasource.local.converters

import androidx.room.Typeconverter
import com.google.gson.Gson


/**
 *
 * This is DB Converters for a list of strings
 */




class ListStringConverter {

    private val gson = Gson()

    @TypeConverter
    fun fromString(stringListString: String) : List<String> =
        gson.fromJson(stringListString, Array<String> ::class.java).toList()

    @TypeConverter
    fun toString(stringListString: List<String>) =
        gson.toJson(stringList)

}