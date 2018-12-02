package com.tessellative.demo.kotlinmybatisannotations.dao

import com.tessellative.demo.kotlinmybatisannotations.model.Country
import com.tessellative.demo.kotlinmybatisannotations.model.CountryLanguage
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Component


@Mapper
@Component
interface CountryDao {

    @Select("SELECT * FROM country WHERE code = #{code}")
    @Results(value = [
        Result(property = "cities", column = "code", many = Many(
                select = "com.tessellative.demo.kotlinmybatisannotations.dao.CityDao.getByCountryCode")),
        Result(property = "countryLanguages", column = "code", many = Many(select = "getLanguagesForCountryCode"))
    ])
    fun getByCode(@Param("code") code: String): Country

    @Select("SELECT * FROM country WHERE continent = #{continent}")
    fun getByContinent(@Param("continent") continent: String): List<Country>

    @Select("SELECT * FROM country WHERE region = #{region}")
    fun getByRegion(@Param("region") region: String): List<Country>

    @Select("SELECT * FROM countryLanguage WHERE countrycode = #{countryCode}")
    fun getLanguagesForCountryCode(@Param("countryCode") countryCode: String): List<CountryLanguage>
}