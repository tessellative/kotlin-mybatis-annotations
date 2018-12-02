package com.tessellative.demo.kotlinmybatisannotations.web

import com.tessellative.demo.kotlinmybatisannotations.model.Country
import com.tessellative.demo.kotlinmybatisannotations.service.CountryService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/countries")
class CountryController(val countryService: CountryService) {

    @RequestMapping("/{code}")
    fun byId(@PathVariable("code") code: String): Country {
        return countryService.byCode(code)
    }

    @RequestMapping("/bycontinent/{continent}")
    fun byContinent(@PathVariable("continent") continent: String): List<Country> {
        return countryService.byContinent(continent)
    }

    @RequestMapping("/byregion/{region}")
    fun byRegion(@PathVariable("region") region: String): List<Country> {
        return countryService.byRegion(region)
    }
}