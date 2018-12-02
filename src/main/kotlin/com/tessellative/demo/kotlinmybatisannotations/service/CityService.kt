package com.tessellative.demo.kotlinmybatisannotations.service

import com.tessellative.demo.kotlinmybatisannotations.dao.CityDao
import com.tessellative.demo.kotlinmybatisannotations.model.City
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


/**
 * Transactional boundary for {@see City} related service calls
 */
@Service
class CityService(val cityDao: CityDao) {

    @Transactional
    fun byId(id: Long): City {
        return cityDao.getById(id)
    }

    @Transactional
    fun byName(name: String): List<City> {
        return cityDao.getByName(name)
    }

    @Transactional
    fun byCountryCode(countryCode: String): List<City> {
        return cityDao.getByCountryCode(countryCode)
    }

    @Transactional
    fun addNew(city: City): City {
        cityDao.insert(city)
        return city
    }

}