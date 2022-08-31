package com.example.myapplication.Services

import com.example.myapplication.Model.Category
import com.example.myapplication.Model.Product

object DataService {

    val category = listOf(
        Category("SHIRTS","shirtImage"),
        Category("HOODIES", "hoodiesImage"),
        Category("HATS", "hatImages"),
        Category("DIGITAL", "digitalgoodsImages")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$20", "hat01"),
        Product("Hat Black", "$40", "hat02"),
        Product("Hat White", "$30", "hat03"),
        Product("Hat Snapbox", "$50", "hat04")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$40","hoodie01"),
        Product("Hoodie Red", "$50","hoodie02"),
        Product("Hoodie Black", "$60","hoodie03"),
        Product("Hoodie Blue", "$34","hoodie04")
    )

    val shirt = listOf(
        Product("Shirt Black", "$23", "shirt01"),
        Product("Shirt Gray", "$33", "shirt02"),
        Product("Shirt Blue", "$45", "shirt03"),
        Product("Shirt KickFlip", "$34", "shirt04"),
        Product("Shirt Studio", "$34", "shirt05")

    )

}