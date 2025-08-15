package com.example.ktorclient.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val Body: String,
    val id : Int,
    val title: String,
    val userId: Int
)