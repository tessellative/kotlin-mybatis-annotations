package com.tessellative.demo.kotlinmybatisannotations.service

import com.tessellative.demo.kotlinmybatisannotations.dao.CountryDao
import com.tessellative.demo.kotlinmybatisannotations.model.Country
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


/**
 * Transactional boundary for {@see Country} related service calls
 */
@Service
class CountryService(val countryDao: CountryDao) {

    @Transactional
    fun byCode(code: String): Country {
        return countryDao.getByCode(code)
    }

    @Transactional
    fun byContinent(continent: String): List<Country> {
        return countryDao.getByContinent(continent)
    }

    @Transactional
    fun byRegion(region: String): List<Country> {
        return countryDao.getByRegion(region)
    }

}