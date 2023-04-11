package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth(), content = {
                        Image(
                            painter = painterResource(id = R.drawable.flowerbackground),
                            contentDescription = null
                        )
                    }
                )
                Column {
                    greeting()
                    greeting2()
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(20.dp)) {
                    Button(onClick = {
                        Toast.makeText(applicationContext, "You clicked the Button.", Toast.LENGTH_LONG).show()
                    }) {
                        Text("Submit Request")
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.dp)) {
                    Spacer(modifier = Modifier.height(30.dp))
                    Card(
                        elevation = 4.dp,
                        backgroundColor = Color.Yellow,
                        shape = RoundedCornerShape(20.dp),
                        contentColor = Color.Blue
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text("AB CDE", fontWeight = FontWeight.W700)
                            Text("+0 12345678")
                            Text("XYZ city.", color = Color.Gray)
                        }
                    }

                }
            }
            }
        }
    @Preview
    @Composable
    fun greeting(){
        Column {
            Text("Ivy Njoroge", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Bold))
            Text("Google", style = TextStyle(color = Color.Red, fontWeight = FontWeight.Light))
            Text("Microsoft", style = TextStyle(color = Color.Red, fontSize = 20.sp))
        }


    }
    @Preview
    @Composable
    fun greeting2(){
        Column {
            Text("Ivy Njoroge", style = TextStyle(color = Color.Yellow, fontWeight = FontWeight.Bold))
            Text("Google", style = TextStyle(color = Color.Yellow, fontWeight = FontWeight.Light))
            Text("Microsoft", style = TextStyle(color = Color.Yellow, fontSize = 20.sp))
        }


    }




    }


