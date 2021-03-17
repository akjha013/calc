package com.example.mycalculator;



import org.springframework.stereotype.Service;
@Service
public class CalculatorService {
	//private double numA,numB;

//	void setNums(double numberA, double numberB) {
//		this.numA = numberA;
//		this.numB = numberB;
//	}
//	
//	double getNumA()  {
//		return numA;
//	}
//	double getNumB() {
//		return numB;
//	}
	
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
