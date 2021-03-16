package com.example.mycalculator;



import org.springframework.stereotype.Service;
@Service
public class CalculatorService {

	
	   public Double add(double numberA, double numberB ) {
	      return (numberA + numberB);
	   }
	   
	   public Double subtract(double numberA, double numberB ) {
		      return (numberA - numberB);
		   }
	   public Double multiply(double numberA, double numberB ) {
		      return (numberA * numberB);
		   }
	   public Double divide(double numberA, double numberB ) {
		      return (numberA / numberB);
		   }
		   
		   
}
