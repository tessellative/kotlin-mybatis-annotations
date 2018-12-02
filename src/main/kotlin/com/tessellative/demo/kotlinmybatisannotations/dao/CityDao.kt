package com.tessellative.demo.kotlinmybatisannotations.dao

import com.tessellative.demo.kotlinmybatisannotations.model.City
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Component

@Mapper
@Component
interface CityDao {

    @Select("SELECT * FROM city WHERE id = #{id}")
    fun getById(@Param("id") id: Long): City

    @Select("SELECT * FROM city WHERE name = #{name}")
    fun getByName(@Param("name") name: String): List<City>

    @Select("SELECT * FROM city WHERE countrycode = #{countryCode}")
    fun getByCountryCode(@Param("countryCode") countryCode: String): List<City>


    @Insert("INSERT INTO city(name, countrycode, district, population) " +
            "VALUES(#{name}, #{countryCode}, #{district}, #{population})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    fun insert(city: City): Long


}
