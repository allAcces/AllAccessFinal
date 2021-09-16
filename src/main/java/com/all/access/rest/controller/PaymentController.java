package com.all.access.rest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.all.access.model.Payment;
import com.all.access.repository.PaymentRepository;

@RestController
@RequestMapping("Payment")
public class PaymentController 
{
	@Autowired
	PaymentRepository paymentRepository; 
	@GetMapping("displayAllPayment")
	public List<Payment> displayAllPayment()
	{
		return paymentRepository.findAll();
	}
	
	
	@PostMapping("insertNewPayment")
	public String savePayment(@RequestBody Payment payment)
	{
		paymentRepository.save(payment);
		return "New Payment Inserted";
	}
	
	
	@GetMapping("fetchOne/{paymentId}")
	public Optional<Payment> displayPaymentById(@PathVariable String paymentId)
	{
		return paymentRepository.findById(paymentId);
	}
	
	@PutMapping("/update/{paymentAmount}")
	Payment update(@PathVariable int paymentAmount,@RequestBody Payment payment)
	{
		payment.setPaymentAmount(paymentAmount);
		return payment;
	}
	
	
	@DeleteMapping("/delete/{paymentId}")
	String deletePayment(@PathVariable String paymentId)
	{
		System.out.println(paymentId);
		return "Payment With id "+paymentId+" Deleted";
	}
}