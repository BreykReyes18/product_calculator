     package com.cruzreyes.product_calculator.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cruzreyes.product_calculator.welcomePage.WelcomeActivity
import com.cruzreyes.product_calculator.welcomePage.WelcomeText

     class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeActivity(WelcomeText())
            }
        }
    }