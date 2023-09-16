package com.cruzreyes.product_calculator.welcomePage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class WelcomeActivity(welcomeText: Unit) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeText()
        }
    }
}

@Composable
fun WelcomeText() {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Text("Welcome to Product Calculator"
                , color = Color.Blue
                , modifier = Modifier.align(CenterHorizontally))
            Text("By Brandon Cruz Reyes"
                , color = Color.Blue
                , modifier = Modifier.align(CenterHorizontally))
        }

}

@Composable
@Preview
fun DefaultPreview() {
    WelcomeText()
}