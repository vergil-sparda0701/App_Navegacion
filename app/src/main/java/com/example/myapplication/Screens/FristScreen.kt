package com.example.myapplication.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.Navigation.AppScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun FirstScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "FirstScreen") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue, // Fondo azul
                titleContentColor = Color.White, // Texto en blanco
                navigationIconContentColor = Color.White))}) { BodyContent(navController) }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text("Hola Navegacion")
        Button(onClick = {navController.navigate(route = AppScreens.SecondScreen.route)}){
            Text("Navega")
        }
    }
}
