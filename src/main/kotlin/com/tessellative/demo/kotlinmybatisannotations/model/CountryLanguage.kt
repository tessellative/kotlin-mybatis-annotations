package com.tessellative.demo.kotlinmybatisannotations.model

data class CountryLanguage(
        var countryCode: String = "",
        var language: String = "",
        var isOfficial: Boolean = false,
        var percentage: Double = 0.0
)