package com.tessellative.demo.kotlinmybatisannotations.model

data class City(
        var id: Long = 0,
        var name: String = "",
        var countryCode: String = "",
        var district: String = "",
        var population: Int = 0
)
