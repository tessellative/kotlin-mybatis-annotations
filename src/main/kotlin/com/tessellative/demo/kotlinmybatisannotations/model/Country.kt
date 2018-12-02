package com.tessellative.demo.kotlinmybatisannotations.model

data class Country(
        var id: Int = 0,
        var name: String = "",
        var continent: String = "",
        var region: String = "",
        var surfaceArea: Double = 0.0,
        var indepYear: Int = 0,
        var population: String = "",
        var lifeExpectancy: Double = 0.0,
        var gnp: Double = 0.0,
        var gnpold: Double = 0.0,
        var localName: String = "",
        var governmentForm: String = "",
        var headOfState: String = "",
        var capital: String = "",
        var code2: String = "",
        var cities: List<City> = emptyList(),
        var countryLanguages: List<CountryLanguage> = emptyList()
)
