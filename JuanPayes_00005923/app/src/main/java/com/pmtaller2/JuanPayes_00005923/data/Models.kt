package com.pmtaller2.JuanPayes_00005923.data

import kotlinx.serialization.Serializable

@Serializable
data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)

@Serializable
data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)