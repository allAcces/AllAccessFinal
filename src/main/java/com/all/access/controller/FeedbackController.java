package com.all.access.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.all.access.model.Feedback;
import com.all.access.repository.FeedbackRepository;



@Controller
public class FeedbackController {

	@RequestMapping("feedbackForm")
	public String showFeedbackForm()
	{
		return "feedbackForm";
	}
	
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@PostMapping("feedbacksaveurl")
	public ModelAndView saveFeedback(@ModelAttribute Feedback feedback)
	{
		if(feedbackRepository.save(feedback) != null)
		{
			return new ModelAndView("feedbackForm","FeedbackInsertSuccessMsg","New Feedback Inserted Successfully");
		}
		return null;
	}
	

	
	@GetMapping("viewallfeedback")
	public ModelAndView displayAllFeedback()
	{
		ModelAndView feedbackView = null;
		List<Feedback> feedbackList = feedbackRepository.findAll();
		if(!feedbackList.isEmpty())
		{
			feedbackView = new ModelAndView("viewallfeedback","feedbackListKey",feedbackList);
		}
		return feedbackView;
	}
	
}
