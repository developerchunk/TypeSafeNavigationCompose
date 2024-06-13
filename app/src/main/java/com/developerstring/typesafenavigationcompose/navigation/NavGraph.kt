package com.developerstring.typesafenavigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.developerstring.typesafenavigationcompose.screens.HomeScreen
import com.developerstring.typesafenavigationcompose.screens.WelcomeScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = HomeScreen) {

        composable<HomeScreen> {
            HomeScreen(navController = navController)
        }

        composable<WelcomeScreen> { navBackStackEntry ->

            val arguments = navBackStackEntry.toRoute<WelcomeScreen>()
            WelcomeScreen(navController = navController, arguments = arguments)

        }

    }

}