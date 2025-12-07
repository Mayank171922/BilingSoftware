package in.mayankproj.billingsoftware.service;

import com.razorpay.RazorpayException;

import in.mayankproj.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

   RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
} 
