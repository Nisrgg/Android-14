package com.example.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme
import java.math.RoundingMode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UnitConverter(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun UnitConverter(modifier : Modifier =  Modifier){

    var inputValue by remember { mutableStateOf("")}
    var outputValue by remember { mutableStateOf("")}
    var inputUnit by remember { mutableStateOf("Meter")}
    var outputUnit by remember { mutableStateOf("Meter")}
    var iExpanded by remember { mutableStateOf(false)}
    var oExpanded by remember { mutableStateOf(false)}
    val conversionFactor = remember{mutableStateOf(1.0)}
    val oConversionFactor = remember{mutableStateOf(1.0)}

    fun convertUnits(){
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0
        val result : Double = (inputValueDouble * conversionFactor.value * oConversionFactor.value).toBigDecimal().setScale(3, RoundingMode.UP).toDouble()
        outputValue = result.toString()
    }


    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Unit Converter",
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = inputValue, onValueChange = {
            inputValue = it
            convertUnits()
        })
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            //iExpanded
            Box{
                //input unit
                Button(onClick = { iExpanded = true }) {
                    Text(inputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "")
                }
                DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false }) {
                    DropdownMenuItem(
                        text = { Text("Centimeter")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Centimetres"
                            conversionFactor.value = 0.01
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Meter")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Metres"
                            conversionFactor.value = 1.0
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Feet")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Feet"
                            conversionFactor.value = 0.3048
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Inches")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Inches"
                            conversionFactor.value = 0.0254
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Millimeter")},
                        onClick = {
                            iExpanded = false
                            inputUnit = "Millimeter"
                            conversionFactor.value = 0.0001
                            convertUnits()
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            //oExpanded
            Box {
                //Output unit
                Button(onClick = { oExpanded = true }) {
                    Text(outputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "")
                }
                DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false }) {
                    DropdownMenuItem(
                        text = { Text("Centimeter")},
                        onClick = {
                            oExpanded = false
                            oConversionFactor.value = 100.0
                            outputUnit = "Centimetre"
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Meter")},
                        onClick = {
                            oExpanded = false
                            oConversionFactor.value = 1.0
                            outputUnit = "Meter"
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Feet")},
                        onClick = {
                            oExpanded = false
                            oConversionFactor.value = 3.281
                            outputUnit = "Feet"
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Inches")},
                        onClick = {
                            oExpanded = false
                            oConversionFactor.value = 39.37
                            outputUnit = "Inches"
                            convertUnits()
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Millimeter")},
                        onClick = {
                            oExpanded = false
                            oConversionFactor.value = 1000.0
                            outputUnit = "Millimeter"
                            convertUnits()
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text("Result: $outputValue $outputUnit",
                style = MaterialTheme.typography.headlineMedium
            )

    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}