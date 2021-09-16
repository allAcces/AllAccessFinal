package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.Category;

@Component
public interface CategoryRepository extends JpaRepository<Category,String>
{

}