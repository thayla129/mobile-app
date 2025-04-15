package br.senai.sp.jandira.bmi.screens.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.bmi.R

@Composable
fun BmiLevels(
    leftText: String = "",
    rightText: String = "",
    background: Color = Color.Transparent,
    bulletBackground: Color = colorResource(R.color.light_blue)
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Card(
            modifier = Modifier.size(20.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(containerColor = bulletBackground)
        ) {}

        Spacer(modifier = Modifier.width(8.dp))

        Card(
            modifier = Modifier.weight(1f),
            colors = CardDefaults.cardColors(containerColor = background),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = leftText, color = Color.Black)
                if (rightText.isNotEmpty()) {
                    Text(text = rightText, color = Color.Black)
                }
            }
        }
    }
}
