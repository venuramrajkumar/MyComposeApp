package com.raj.mycomposeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun DemoItemScreen(navController: NavController) {

    Box (modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(3.dp)) {

            Button(modifier = Modifier
                .padding(5.dp),
                onClick = {
                    navController.navigate("title")
                }) {
                Text(text = "Demo Title ")
            }

            Button(modifier = Modifier
                .padding(5.dp),
                onClick = {
                    navController.navigate("StaticCardScreen")
                }) {
                Text(text = "Demo StaticList ")
            }

            Button(modifier = Modifier
                .padding(5.dp),
                onClick = {
                    navController.navigate("myContent")
                }) {
                Text(text = "Demo Dynamic List ")
            }

            Button(modifier = Modifier
                .padding(5.dp),
                onClick = {
                    navController.navigate("useXmlInCompose")
                }) {
                Text(text = "Demo Use xml in Compose ")
            }

        }

    }

}