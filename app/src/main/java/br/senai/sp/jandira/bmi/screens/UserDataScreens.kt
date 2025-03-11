package br.senai.sp.jandira.BMI.UserDataScreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import br.senai.sp.jandira.bmi.R


@Composable
fun UserDataScreens(modifier: Modifier = Modifier) {
    val nomeState = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(Color(0xFFDA3C3C), Color(0xFF000000))
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "HI!",
                fontSize = 24.sp,
                color = Color.White,

                )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(800.dp)
                    .padding(bottom = 0.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column(
                            modifier = Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                modifier = Modifier.size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    2.dp, Brush.linearGradient(
                                        listOf(Color(0xFF103159), Color(0xFF95C1F6))
                                    )
                                ),
                                elevation = CardDefaults.elevatedCardElevation(2.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.men),
                                    contentDescription = stringResource(id = R.string.Logo),
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier.fillMaxWidth().padding(10.dp, 5.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(
                                    0xFF103159
                                )
                                )
                            ) {
                                Text(text = stringResource(R.string.male), fontSize = 16.sp, color = Color.White)
                            }
                        }

                        Column(
                            modifier = Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                modifier = Modifier.size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    2.dp, Brush.linearGradient(
                                        listOf(Color(0xFFA40870), Color(0xFFEE9ED8))
                                    )
                                ),
                                elevation = CardDefaults.elevatedCardElevation(2.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.female),
                                    contentDescription = stringResource(id = R.string.Logo),
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier.fillMaxWidth().padding(10.dp, 5.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(
                                    0xFFA40870
                                )
                                )
                            ) {
                                Text(text = stringResource(R.string.female), fontSize = 16.sp, color = Color.White)
                            }
                        }
                    }

                    Column(
                        modifier = Modifier.padding(0.dp, 10.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nomeState.value = it },
                            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                            shape = RoundedCornerShape(12.dp),
                            label = { Text(stringResource(R.string.age)) },
                            leadingIcon = {
                                Icon(imageVector = Icons.Filled.Person, contentDescription = "Ícone de Idade")
                            },

                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                capitalization = KeyboardCapitalization.None
                            )
                        )

                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nomeState.value = it },
                            modifier = Modifier.fillMaxWidth().padding(0.dp, 25.dp),
                            shape = RoundedCornerShape(12.dp),
                            label = { Text(stringResource(R.string.weight)) },
                            leadingIcon = {
                                Icon(imageVector = Icons.Filled.Create, contentDescription = "Ícone de Peso")
                            },

                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                capitalization = KeyboardCapitalization.None
                            )
                        )

                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nomeState.value = it },
                            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                            shape = RoundedCornerShape(12.dp),
                            label = { Text(stringResource(R.string.height)) },
                            leadingIcon = {
                                Icon(imageVector = Icons.Filled.Face, contentDescription = "Ícone de altura")
                            },

                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                capitalization = KeyboardCapitalization.None
                            )
                        )
                    }

                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth(),
                        border = BorderStroke(
                            1.dp, Brush.linearGradient(
                                listOf(Color(0xFF103159), Color(0xFF103650))
                            )
                        ),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFFDA3C3C)),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = stringResource(R.string.buttonCalculate), fontSize = 20.sp)
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreensPreview() {
    UserDataScreens()
}

//