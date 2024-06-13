package com.developerstring.typesafenavigationcompose.navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeScreen

@Serializable
data class WelcomeScreen(
    val name: String?,
    val message: String,
)