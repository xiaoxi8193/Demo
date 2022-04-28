package com.example.demo

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraph
import com.example.demo.common.composable
import com.example.demo.common.AppActions
import com.example.demo.common.AppDestinations
import com.example.demo.ui.view.login.viewmodel.LoginViewModel
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavGraph(
    startDestination: String = AppDestinations.LOGIN_PAGE_ROUTE
) {
    val navController = rememberAnimatedNavController()
    val actions = remember(navController) {
        AppActions(navController)
    }
    AnimatedNavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(AppDestinations.LOGIN_PAGE_ROUTE) {
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LaunchedEffect(Unit) {

            }

        }
    }
}