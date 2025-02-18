package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.horizontalGradient(
                listOf(
                    Color(0xFFDC79E7),
                    Color(0xFF8F71BD),
                )
            ))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.yoga),
                contentDescription = stringResource(R.string.logo),
                modifier = Modifier
                    .padding(vertical = 60.dp)
            )
            Text(
                text = stringResource(R.string.welcome),
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(bottom = 60.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .height(150.dp),
                shape = RoundedCornerShape(
                    topStart = 48.dp,
                    topEnd = 48.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 40.dp, top = 40.dp)
                ) {
                    Text(
                        text = stringResource(R.string.your_name),
                        fontSize = 30.sp,
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = {
                            Text(text = "Digite o seu nome")
                        }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(top = 220.dp, start = 300.dp)
                ) {
                    Button(onClick = {}) {
                        Text(text = stringResource(R.string.next))
                        Icon(
                            imageVector = Icons.Filled.ArrowFoward,
                      " "     contentDescription = "

                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
