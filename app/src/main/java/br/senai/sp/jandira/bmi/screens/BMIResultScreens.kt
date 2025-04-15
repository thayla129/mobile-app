package br.senai.sp.jandira.bmi.screens

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R
import br.senai.sp.jandira.bmi.model.bmiCalculator
import br.senai.sp.jandira.bmi.screens.componentes.BmiLevels
import java.util.*

@Composable
fun BMIResultScreens(controleDeNavegacao: NavHostController?) {

    val context = LocalContext.current
    val userFile = context.getSharedPreferences("user_file", Context.MODE_PRIVATE)

    val userAge = userFile.getInt("user_age", 0)
    val userWeight = userFile.getInt("user_weight", 0)
    val userHeight = userFile.getInt("user_height", 0)

    val resultBmi = bmiCalculator(userWeight, userHeight.toDouble())

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF228B22),
                        Color(0xFF90EE90)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(20.dp),
                text = stringResource(R.string.titleYourBMIResult),
                fontSize = 34.sp,
                color = Color.White
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(horizontal = 32.dp, vertical = 20.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        // Círculo com o valor do IMC
                        Card(
                            modifier = Modifier.size(140.dp),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(Color.White),
                            border = BorderStroke(5.dp, resultBmi.color)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = String.format(Locale.getDefault(), "%.1f", resultBmi.bmiValues.second),
                                    fontSize = 40.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black
                                )
                            }
                        }

                        Text(
                            text = resultBmi.bmiValues.first,
                            fontSize = 28.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 12.dp)
                        )

                        // Idade, peso, altura
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(90.dp)
                                .padding(top = 16.dp),
                            colors = CardDefaults.cardColors(Color(0xFFD3D3D3)),
                            shape = RoundedCornerShape(20.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(10.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(text = stringResource(R.string.age), fontSize = 20.sp)
                                    Text(text = "$userAge", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                                }
                                VerticalDivider()
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(text = stringResource(R.string.weight), fontSize = 20.sp)
                                    Text(text = "$userWeight", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                                }
                                VerticalDivider()
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(text = stringResource(R.string.height), fontSize = 20.sp)
                                    Text(text = "$userHeight", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }

                        // Níveis IMC
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp)
                                .padding(top = 30.dp)
                        ) {
                            BmiLevels(leftText = stringResource(R.string.under_weight))
                            BmiLevels(leftText = stringResource(R.string.normal_weight))
                            BmiLevels(leftText = stringResource(R.string.over_weight))
                            BmiLevels(leftText = stringResource(R.string.class1_weight))
                            BmiLevels(leftText = stringResource(R.string.class2_weight))
                            BmiLevels(leftText = stringResource(R.string.class3_weight))
                        }
                    }

                    // Botão
                    Button(
                        onClick = { controleDeNavegacao?.navigate("home") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(top = 16.dp),
                        border = BorderStroke(
                            2.dp,
                            brush = Brush.linearGradient(
                                listOf(Color(0xFF467FE3), Color(0xFF467FE3))
                            )
                        ),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF374ABE)),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.buttonNewCalc),
                            fontSize = 30.sp
                        )
                    }
                }
            }
        }
    }
}

// Preview deve estar fora da função principal
@Preview(showSystemUi = true)
@Composable
fun BMIResultScreenPreview() {
    BMIResultScreens(null)
}
