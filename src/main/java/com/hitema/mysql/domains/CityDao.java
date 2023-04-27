package com.hitema.mysql.domains;

import com.hitema.mysql.abstracts.DaoSession;
import com.hitema.mysql.entities.City;
import com.hitema.mysql.interfaces.Dao;

import java.util.List;

public class CityDao extends DaoSession implements Dao<City, Long> {

    @Override
    public void save(City entity) {
        try{
            City city = new City();
            city.setCity(city.getCity());
            city.setLastUpdate(java.time.LocalDateTime.now());
            getCurrentSession().save(city);
        }catch (Exception e){
            System.out.println("Erreur lors de l'insertion");
        }
    }


    @Override
    public City get(Long id) {
        try{
            return getCurrentSession().get(City.class, id);
        }catch(Exception e){
            System.out.println("Erreur lors de la récupération: " +e);
            return null;
        }
    }

    @Override
    public List<City> getAll() {
        return null;
    }


    @Override
    public void update(Long id, String name) {

    }

    @Override
    public void delete(Long t) {

    }
}
