package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.BMI.UserDataScreens.UserDataScreens
import br.senai.sp.jandira.bmi.screens.BMIResultScreens
import br.senai.sp.jandira.bmi.ui.theme.BMITheme
import sp.senai.jandira.bmi.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {

                val controleDeNavegacao = rememberNavController()
                NavHost(
                    navController = controleDeNavegacao,
                    startDestination = "home"

                ){
                    composable(route = "home"){ HomeScreen(controleDeNavegacao) }
                    composable(route = "user_data"){ UserDataScreens(controleDeNavegacao) }
                    composable(route = "bmi_result"){ BMIResultScreens(controleDeNavegacao) }
                }
            }
        }
    }
}

