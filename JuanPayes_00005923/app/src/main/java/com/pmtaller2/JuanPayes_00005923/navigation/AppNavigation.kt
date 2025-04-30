package com.pmtaller2.JuanPayes_00005923.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pmtaller2.JuanPayes_00005923.screens.MainScreen
import com.pmtaller2.JuanPayes_00005923.screens.OrderScreen
import com.pmtaller2.JuanPayes_00005923.screens.RestaurantScreen
import com.pmtaller2.JuanPayes_00005923.screens.SearchScreen
import restaurants

@ExperimentalMaterial3Api
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val restaurantList = restaurants

    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.route) {
        composable(AppScreens.HomeScreen.route) {
            MainScreen(
                restaurants = restaurantList,
                onRestaurantClick = { selected ->
                    navController.navigate(AppScreens.RestaurantDetail.createRoute(selected.id))
                },
                navController = navController
            )
        }
        composable(
            route = AppScreens.RestaurantDetail.route,
            arguments = listOf(navArgument("restaurantId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("restaurantId")
            val selectedRestaurant = restaurantList.find { it.id == id }

            if (selectedRestaurant != null) {
                RestaurantScreen(restaurant = selectedRestaurant, navController = navController)
            }
        }
        composable(AppScreens.OrdersScreen.route) {
            OrderScreen(navController = navController)
        }
        composable(AppScreens.SearchScreen.route) {
            SearchScreen(navController = navController, restaurantList = restaurantList)
        }
    }
}