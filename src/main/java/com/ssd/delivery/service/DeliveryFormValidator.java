package com.ssd.delivery.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ssd.delivery.domain.DeliveryDTO;

@Component
public class DeliveryFormValidator implements Validator {
	
	public boolean supports(Class<?> clazz) {
		return DeliveryDTO.class.isAssignableFrom(clazz);
	}
 
	public void validate(Object obj, Errors errors) {

		DeliveryDTO delivery = (DeliveryDTO)obj; 

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address1", "ADDRESS1_REQUIRED", "Departure point is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address2", "ADDRESS2_REQUIRED", "Destination is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "serviceDate", "SERVICE_DATE_REQUIRED", "Service Date is required.");
		
		if (!Pattern.matches("^\\d{4}\\/(0[1-9]|1[012])\\/(0[1-9]|[12][0-9]|3[01])$", delivery.getServiceDate()) && !delivery.getServiceDate().equals(""))
			errors.rejectValue("serviceDate", "SERVICE_DATE_PATTERN_WRONG", "Service Date pattern is wrong.");
	}
}
