package com.all.access.model;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "Payment")
	public class Payment  implements Serializable {

		@Id
		private int paymentID;
		@Column
		private int paymentAmount;
		private Date paymentDate;
		private Date paymentDueDate;
		
		
		public Payment(int paymentID, int paymentAmount, Date paymentDate, Date paymentDueDate) {
			super();
			this.paymentID = paymentID;
			this.paymentAmount = paymentAmount;
			this.paymentDate = paymentDate;
			this.paymentDueDate = paymentDueDate;
		}


		public int getPaymentID() {
			return paymentID;
		}


		public void setPaymentID(int paymentID) {
			this.paymentID = paymentID;
		}


		public int getPaymentAmount() {
			return paymentAmount;
		}


		public void setPaymentAmount(int paymentAmount) {
			this.paymentAmount = paymentAmount;
		}


		public Date getPaymentDate() {
			return paymentDate;
		}


		public void setPaymentDate(Date paymentDate) {
			this.paymentDate = paymentDate;
		}


		public Date getPaymentDueDate() {
			return paymentDueDate;
		}


		public void setPaymentDueDate(Date paymentDueDate) {
			this.paymentDueDate = paymentDueDate;
		}


}

