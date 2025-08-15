package com.example.ktorclient.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val Body: String,
    val that: Int,
    val title: String,
    val userId: Int
)