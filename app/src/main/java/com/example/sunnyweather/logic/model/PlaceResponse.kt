package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 天气数据json
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted") val address: String
)

data class Location(val lng: String, val lat: String)

