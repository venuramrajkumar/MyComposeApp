package com.raj.mycomposeapp

import android.content.Context

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.raj.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserCard()
        }
    }
}


@Composable
fun UserCard() {

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


        Column(modifier = Modifier.padding(3.dp,0.dp,0.dp,0.dp)) {
            val context = LocalContext.current
            Text(text = stringResource(id = R.string.my_name))
            Text(text = stringResource(id = R.string.description), color = colorResource(id = R.color.purple_500))
            Button(modifier = Modifier.padding(0.dp,3.dp,0.dp,0.dp), onClick = {
                showToast(context, "Profile is Clicked")
            }) {
                Text("View Profile ", fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
            }

        }
    }

}


fun showToast(context: Context, msg: String) {
    Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
}

@Composable
fun Title() {
    val context = LocalContext.current
    Text(text = stringResource(id = R.string.my_name),
        fontSize = 16.sp,
        fontFamily = FontFamily.Cursive,
        color = colorResource(id = R.color.purple_200),
        modifier = Modifier.clickable {
            Toast.makeText(context, "It is clickable", Toast.LENGTH_SHORT).show()
        },
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        softWrap = true
    )
}


@Preview(showBackground = false)
@Composable
fun MyViewPreview() {

    Surface(Modifier.fillMaxSize()) {
        //Title()
        UserCard()
    }
}
