package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.States;

@Component
public interface StatesRepository extends JpaRepository<States,String>
{

}
