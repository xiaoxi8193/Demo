package com.example.demo.common.lce

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.example.demo.R

@Composable
fun LoadingContent(
    modifier: Modifier = Modifier
) {
    //将动画文件加载出来
    val composable by rememberLottieComposition(
        LottieCompositionSpec.RawRes(R.raw.app_load1)
    )
    //将动画文件转为适合 Compose 中使用的 State 文件
    val process by animateLottieCompositionAsState(
        composition = composable,
        iterations = LottieConstants.IterateForever //动画永远重复
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //将动画文件和 State 文件放入 LottieAnimation 中
        LottieAnimation(composition = composable, progress = process)
    }

}