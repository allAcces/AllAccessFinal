package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.Area;

@Component
public interface AreaRepository extends JpaRepository<Area,String>
{

}