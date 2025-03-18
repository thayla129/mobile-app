package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.senai.sp.jandira.BMI.UserDataScreens.UserDataScreens
import br.senai.sp.jandira.bmi.ui.theme.BMITheme
import sp.senai.jandira.bmi.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {
                UserDataScreens()
            }
        }
    }
}

