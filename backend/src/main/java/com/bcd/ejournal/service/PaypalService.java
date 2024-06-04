package com.bcd.ejournal.service;

import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

public interface PaypalService {
	
 public Payment createPayment(
			double total,
			String currency,
			String method,
			String intent,
			String description,
			String cancelUrl,
			String successUrl) throws PayPalRESTException;
	public Payment executePayment(String paymentId, String payerId) throws PayPalRESTException;
}
