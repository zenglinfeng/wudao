package com.dreamy.zen.service.impl;

import com.dreamy.zen.dao.CityDao;
import com.dreamy.zen.domain.City;
import com.dreamy.zen.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
/*@Override
    public City findByName (String cityName){

        return cityDao.findByName(cityName);
    }*/
    @Override
    public List<City> findAll(){

        return  cityDao.findAll();

    }

}
