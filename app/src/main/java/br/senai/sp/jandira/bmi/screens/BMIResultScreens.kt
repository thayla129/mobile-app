package br.senai.sp.jandira.bmi.screens

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun BMIResultScreens() {
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
            verticalArrangement = Arrangement.SpaceBetween, // Garante que o botão fique na parte inferior
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .padding(20.dp),
                text = stringResource(R.string.titleYourBMIResult),
                fontSize = 34.sp,
                color = Color.White
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
                shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(32.dp)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier.size(140.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(Color.White),
                        border = BorderStroke(
                            5.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFFFA6134),
                                    Color(0xFFFA6134)
                                )
                            )
                        )
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = stringResource(R.string.circleNumber),
                                fontSize = 40.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Text(
                        text = stringResource(R.string.YouHaveClassIObesity),
                        fontSize = 28.sp
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp),
                        colors = CardDefaults.cardColors(Color(0xFFD3D3D3)),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(10.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceAround
                            ) {
                                Text(text = stringResource(R.string.Age), fontSize = 20.sp)
                                Text(
                                    text = stringResource(R.string.ageNumber),
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            VerticalDivider()
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceAround
                            ) {
                                Text(text = stringResource(R.string.Weight), fontSize = 20.sp)
                                Text(
                                    text = stringResource(R.string.weigthNumber),
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            VerticalDivider()
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceAround
                            ) {
                                Text(text = stringResource(R.string.Height), fontSize = 20.sp)
                                Text(
                                    text = stringResource(R.string.heightNumber),
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.weight(1f)) // Empurra o botão para baixo

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        border = BorderStroke(
                            2.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFF467FE3),
                                    Color(0xFF467FE3)
                                )
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

@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreens()
}
