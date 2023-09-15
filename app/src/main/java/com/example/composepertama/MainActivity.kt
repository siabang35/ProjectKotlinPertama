package com.example.composepertama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.tooling.preview.Preview
import com.example.composepertama.ui.theme.ComposePertamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePertamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =  MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

// Fungsi Composable dibawah ini memungkinkan untuk penentuan UI aplikasi
// Fungsi Tata Letak(Layout) untuk menambah teks baru(multiple texts) dan mengatur posisi teks dengan Column
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary), // Ubah latar belakang ke warna primer Material Design
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tambahkan elemen gambar di sini (error saat install app)
        //Image(
           // painter = painterResource(id = R.drawable.myimage), // ID Gambar
           // contentDescription = null, // Ganti dengan deskripsi gambar jika diperlukan
           // modifier = Modifier
       // )
        Text(
            text = "Hello Anime Lovers $name!",
            modifier = modifier,
            color = MaterialTheme.colorScheme.onPrimary // atur warna teks ke warna teks pada latar belakang primer
        )
        Text(
            text = "Selamat Datang di ComposePertama!",
            modifier = modifier,
            color = MaterialTheme.colorScheme.onPrimary // atur warna teks ke warna teks pada latar belakang primer
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePertamaTheme {
        Greeting("Android")
    }
}