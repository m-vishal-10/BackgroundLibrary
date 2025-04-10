package com.vishal.backgroundlibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vishal.gradientbackground.background.BackgroundGradients
import com.vishal.gradientbackground.button.GradientButton
import com.vishal.gradientbackground.button.NeonGlowButton

@Composable
fun ButtonDemoScreen() {
    Box(modifier = Modifier
        .background(BackgroundGradients.CottonCandy)
        .fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally, // Center the text horizontally
            verticalArrangement = Arrangement.Center
        ) {
            GradientButton("Sample1") { }
            NeonGlowButton("Sample2") { }
        }

    }
}