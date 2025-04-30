package com.pmtaller2.JuanPayes_00005923

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmtaller2.JuanPayes_00005923.navigation.AppNavigation
import com.pmtaller2.JuanPayes_00005923.ui.theme.JuanPayes_00005923Theme
@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JuanPayes_00005923Theme {
                    AppNavigation()
            }
        }
    }
}
@ExperimentalMaterial3Api
@Preview
@Composable
fun mainPreview(){
    AppNavigation()
}
