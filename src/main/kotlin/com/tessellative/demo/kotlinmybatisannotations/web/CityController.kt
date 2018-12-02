package com.tessellative.demo.kotlinmybatisannotations.web

import com.tessellative.demo.kotlinmybatisannotations.model.City
import com.tessellative.demo.kotlinmybatisannotations.service.CityService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cities")
class CityController(val cityService: CityService) {

    @RequestMapping("/{id}")
    fun byId(@PathVariable("id") id: Long): City {
        return cityService.byId(id)
    }

    @RequestMapping("/byname/{name}")
    fun byName(@PathVariable("name") name: String): List<City> {
        return cityService.byName(name)
    }

    @RequestMapping("/bycountrycode/{code}")
    fun byCountryCode(@PathVariable("code") countryCode: String): List<City> {
        return cityService.byCountryCode(countryCode)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun addNew(@RequestBody city: City): City {
        return cityService.addNew(city)
    }

}