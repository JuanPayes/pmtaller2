package com.pmtaller2.JuanPayes_00005923.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pmtaller2.JuanPayes_00005923.data.Restaurant


@ExperimentalMaterial3Api
@Composable
fun SearchScreen(
    navController: NavController,
    restaurantList: List<Restaurant>
){
    var searchQuery by remember { mutableStateOf("") }
    val context = LocalContext.current
    val filteredDishes = remember(searchQuery, restaurantList) {
        restaurantList.flatMap { restaurant ->
            restaurant.menu.map { dish ->
                Triple(dish, restaurant.name, restaurant.categories)
            }
        }.filter { (dish, restaurantName, categories) ->
            dish.name.contains(searchQuery, ignoreCase = true) ||
                    restaurantName.contains(searchQuery, ignoreCase = true) ||
                    categories.any { it.contains(searchQuery, ignoreCase = true) }
        }
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Buscar") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { Text("Buscar por platillo, restaurante o categoría") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            if (filteredDishes.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text("No se encontraron resultados")
                }
            } else {
                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(filteredDishes, key = { it.first.id }) { (dish, restaurantName, _) ->
                        Card(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(12.dp)
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AsyncImage(
                                    model = dish.imageUrl,
                                    contentDescription = dish.name,
                                    modifier = Modifier
                                        .size(80.dp)
                                        .clip(RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(dish.name, style = MaterialTheme.typography.titleMedium)
                                    Text("Restaurante: $restaurantName", style = MaterialTheme.typography.bodySmall)
                                }
                                Button(onClick = {
                                    Toast.makeText(
                                        context,
                                        "${dish.name} agregado al carrito",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }) {
                                    Text("Agregar")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}



