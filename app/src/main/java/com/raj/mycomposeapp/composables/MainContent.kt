package com.raj.mycomposeapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.raj.mycomposeapp.activity.Title
import com.raj.mycomposeapp.activity.UseXmlInCompose
import com.raj.mycomposeapp.activity.myContent


@Composable
fun MainContent() {
    val navController = rememberNavController()

    Surface(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController ,
            startDestination = "DemoItemScreen" ,
            builder = {
                composable("DemoItemScreen") {
                    DemoItemScreen(navController)
                }
                composable("StaticCardScreen") {
                    StaticCardScreen(navController = navController)
                }
                composable("title") {
                    Title()
                }
                composable("myContent") {
                    myContent()
                }
                composable("useXmlInCompose") {
                    UseXmlInCompose()
                }
            })
    }
}