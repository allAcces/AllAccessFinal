package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


import com.all.access.model.Feedback;

@Component
public interface FeedbackRepository extends JpaRepository<Feedback,Integer> 
{
	
}
