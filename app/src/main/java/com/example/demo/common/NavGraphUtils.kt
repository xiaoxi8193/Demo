package com.example.demo.common

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkOut
import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.google.accompanist.navigation.animation.composable

object AppDestinations{
    const val LOGIN_PAGE_ROUTE = "login_page_route"
}


@ExperimentalAnimationApi
fun NavGraphBuilder.composable(
    route: String,
    arguments: List<NamedNavArgument> = emptyList(),
    deepLinks: List<NavDeepLink> = emptyList(),
    content: @Composable AnimatedVisibilityScope.(NavBackStackEntry) -> Unit
){
    composable(
        route = route,
        arguments = arguments,
        deepLinks = deepLinks,
        enterTransition = {
            expandVertically() //进入动画设置的是垂直展开
        },
        exitTransition = {
            shrinkOut() //退出动画设置的是缩小动画
        },
        content = content
    )
}

/**
 * 对应用程序中的导航操作进行建模。
 */
class AppActions(navController: NavController){
    val upPress: () -> Unit ={
        navController.navigateUp()
    }
}