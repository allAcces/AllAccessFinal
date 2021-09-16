package com.all.access.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.all.access.model.Buyer;
import com.all.access.repository.BuyerRepository;

@Service
public class BuyerService implements BuyerServiceInterface 
{
	@Autowired
	BuyerRepository buyerRepository;
	
	@Override
	public Buyer save(Buyer buyer) {
		// TODO Auto-generated method stub
		return buyerRepository.save(buyer);
	}
	
	public Buyer findByUserNameAndPassword(String username,String password)
	{
		return buyerRepository.findByUserNameAndPassword(username, password);
	}

	@Override
	public List<Buyer> findAll() {
		// TODO Auto-generated method stub
		return buyerRepository.findAll();
	}
}

/*
 
public class AppointmentService implements AppointmentInterface {
			
	@Autowired
	AppointmentRepository appointmentRepository;
	
	
	@Override
	public Appointment save(Appointment a) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(a);
	}

	@Override
	public Appointment getById(int id) {
		// TODO Auto-generated method stub
		return appointmentRepository.getById(id);
	}

	@Override
	public void delete(Appointment a) {
		// TODO Auto-generated method stub
		 appointmentRepository.delete(a);
	}

	@Override
	public List<Appointment> findAll() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

}
 */
/*
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.hsm.entity.Appointment;
import com.hsm.service.AppointmentService;



@Controller
public class AppointmentController {
	@Autowired
	AppointmentService appointmentRepository;
	@RequestMapping("AddnewAppointment")
	String pageNew() {
		return "SaveNewAppointment";
	}
	
	
	
	
	@RequestMapping(value="saveAppointment",method=RequestMethod.POST)
	String saveAppointment(@ModelAttribute Appointment app) {
		appointmentRepository.save(app);
		return "Reception";
	}
	
	@RequestMapping("deleteAppoitment")
	String deleteA() {
		
		return "cancelAppointment";
	}
	
	
	@RequestMapping(value="DeleteAppointmentById",method=RequestMethod.POST)
	ModelAndView delAppoinment(@RequestParam("id") int id) {
	Appointment appointment=appointmentRepository.getById(id);

	ModelAndView view=null;
		if(appointment!=null) {
			appointmentRepository.delete(appointment);
		view=new ModelAndView("cancelAppointment","user","Appointment Deleted");
		}
		else {
			view =new ModelAndView("cancelAppointment","errorkey","The appointment ID is incorrect or Appointment doesn't exist");
		}
		return view;
	}
	
	
	
		@RequestMapping(value="findAppointmentById",method=RequestMethod.POST)
		ModelAndView findAppoinment(@RequestParam("id") int id) {
		Appointment appointment=appointmentRepository.getById(id);
		ModelAndView view=null;
			if(appointment!=null) {
			view=new ModelAndView("myAppointments","user",appointment);
			}
			else {
				view =new ModelAndView("Reception","errorkey","The appointment ID is incorrect");
			}
			return view;
		}
		@RequestMapping("showAllAppoitment")
		ModelAndView allAppointment() {
			List<Appointment> appointment=	appointmentRepository.findAll();
			ModelAndView view=null;
				if(appointment!=null) {
				view=new ModelAndView("DisplayAllAppointments","AllAppointment",appointment);
				}
				else {
					view =new ModelAndView("Reception","error","Appointment List is Empty");
				}
				return view;
			}
		
	}*/