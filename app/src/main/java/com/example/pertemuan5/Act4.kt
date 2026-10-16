package com.example.pertemuan5

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ParentDataModifier

@Composable
fun FormDataDiri(modifier: Modifier) {
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}

    var Nama by remember {mutableStateOf("")}
    val gender:List<String> = listOf("Laki-laki", "perempuan")


    }