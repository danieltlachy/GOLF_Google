package com.example.golf.data

sealed class Category(val category: String) {

    object Jacket: Category("Jacket")
    object Tshirt: Category("Tshirt")
    object Sneakers: Category("Sneakers")
    object Accessory: Category("Accessory")
    object Toys: Category("Toys")
}