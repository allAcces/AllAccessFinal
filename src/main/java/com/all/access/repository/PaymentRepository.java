package com.all.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.all.access.model.Payment;


@Component
public interface PaymentRepository extends JpaRepository<Payment,String>
{

}