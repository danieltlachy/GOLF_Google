package com.example.golf.util

import android.view.View
import androidx.fragment.app.Fragment
import com.example.golf.R
import com.example.golf.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.golf.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.golf.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}