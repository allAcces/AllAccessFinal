package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.City;

@Component
public interface CityRepository  extends JpaRepository<City,Integer>
{

}
