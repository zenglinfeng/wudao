package com.dreamy.zen.dao;

import com.dreamy.zen.domain.City;

import java.util.List;

public interface CityDao {
  // public  City findByName(@Param("cityName") String  cityName);
   List<City> findAll();
}
