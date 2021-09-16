package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.SubCategory;

@Component
public interface SubCategoryRepository extends JpaRepository<SubCategory,Integer>
{

}
