package com.raj.mycomposeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.raj.mycomposeapp.activity.showToast

@Composable
fun StaticCardScreen(navController: NavController) {

    Card(
        elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .wrapContentHeight()
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp) //margin
            .border(width = 2.dp, color = Color.Gray)
            .padding(12.dp)) { //padding inner
            Image(painter = painterResource(id = R.drawable.rajkumar),
                contentDescription = "User profile pic",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape))


            Column(modifier = Modifier.padding(3.dp, 0.dp, 0.dp, 0.dp)) {
                val context = LocalContext.current
                Text(text = stringResource(id = R.string.my_name))
                Text(text = stringResource(id = R.string.description),
                    color = colorResource(id = R.color.purple_500))
                Button(modifier = Modifier.padding(0.dp, 3.dp, 0.dp, 0.dp), onClick = {
                    showToast(context, "Profile is Clicked")
                }) {
                    Text("View Profile ",
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold)
                }

            }
        }
    }
}
