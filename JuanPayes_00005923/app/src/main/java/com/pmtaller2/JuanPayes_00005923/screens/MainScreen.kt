package com.pmtaller2.JuanPayes_00005923.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pmtaller2.JuanPayes_00005923.data.Restaurant
import coil.compose.AsyncImage
import com.pmtaller2.JuanPayes_00005923.navigation.AppScreens


@Composable
fun MainScreen(
    restaurants: List<Restaurant>,
    onRestaurantClick: (Restaurant) -> Unit,
    navController: NavController
) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        val groupedByCategory = restaurants
            .flatMap { it.categories.map { category -> category to it } }
            .groupBy({ it.first }, { it.second })

        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            groupedByCategory.forEach { (category, restaurantsInCategory) ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(16.dp)
                    )

                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(restaurantsInCategory.distinctBy { it.id }) { restaurant ->
                            RestaurantCard(restaurant = restaurant, onClick = {
                                onRestaurantClick(restaurant)
                            })
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar {
        NavigationBarItem(
            selected = currentRoute == AppScreens.HomeScreen.route,
            onClick = {
                navController.navigate(AppScreens.HomeScreen.route) {
                    popUpTo(AppScreens.HomeScreen.route) { inclusive = false }
                    launchSingleTop = true
                }
            },
            icon = { Icon(Icons.Default.Home, contentDescription = "Listado") },
            label = { Text("Restaurantes") }
        )

        NavigationBarItem(
            selected = currentRoute == AppScreens.SearchScreen.route,
            onClick = {
                navController.navigate(AppScreens.SearchScreen.route) {
                    popUpTo(AppScreens.HomeScreen.route) { inclusive = false }
                    launchSingleTop = true
                }
            },
            icon = { Icon(Icons.Default.Search, contentDescription = "Búsqueda") },
            label = { Text("Búsqueda") }
        )

        NavigationBarItem(
            selected = currentRoute == AppScreens.OrdersScreen.route,
            onClick = {
                navController.navigate(AppScreens.OrdersScreen.route) {
                    popUpTo(AppScreens.HomeScreen.route) { inclusive = false }
                    launchSingleTop = true
                }
            },
            icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Órdenes") },
            label = { Text("Órdenes") }
        )
    }
}



