package br.senai.sp.jandira.bmi.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.bmi.R
import kotlin.math.pow



@Composable
fun bmiCalculator(weight: Int, height: Double): Bmi{
    val bmi = weight.div(height.div(100).pow(2))


    when{
        bmi >= 18.5 ->
            return Bmi(
                color = colorResource(R.color.ligth_blue),
                status = BmiStatus.UNDER_WEIGHT,
                bmiValues = Pair(stringResource(R.string.under_weight), bmi)
            )

        bmi >= 18.5 && bmi < 25.0 ->
            return Bmi(
                color = colorResource(R.color.ligth_green),
                status = BmiStatus.UNDER_WEIGHT,
                bmiValues = Pair(stringResource(R.string.normal_weight), bmi)
            )

        bmi >= 25.0 && bmi < 30.0 ->
            return Bmi(
                color = colorResource(R.color.yellow),
                status = BmiStatus.UNDER_WEIGHT,
                bmiValues = Pair(stringResource(R.string.over_weight), bmi)
            )


        bmi >= 30.0 && bmi < 35.0 ->
            return Bmi(
                color = colorResource(R.color.ligth_orange),
                status = BmiStatus.UNDER_WEIGHT,
                bmiValues = Pair(stringResource(R.string.class1_weight), bmi)
            )

        bmi >= 35.0 && bmi < 40.0 ->
            return Bmi(
                color = colorResource(R.color.dark_orange),
                status = BmiStatus.UNDER_WEIGHT,
                bmiValues = Pair(stringResource(R.string.class2_weight), bmi)
            )

        else ->
            return Bmi(
                color = colorResource(R.color.red),
                status = BmiStatus.UNDER_WEIGHT,
                bmiValues = Pair(stringResource(R.string.class3_weight), bmi)
            )
    }
}