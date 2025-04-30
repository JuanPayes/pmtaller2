package com.pmtaller2.JuanPayes_00005923.navigation

sealed class AppScreens(val route: String) {
    object HomeScreen : AppScreens("home_screen")
    object RestaurantDetail : AppScreens("restaurant_detail/{restaurantId}") {
        fun createRoute(restaurantId: Int): String = "restaurant_detail/$restaurantId"
    }
    object SearchScreen : AppScreens("search_screen")
    object OrdersScreen : AppScreens("orders_screen")
}