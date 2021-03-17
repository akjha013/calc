package com.example.mycalculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	
	
	@Autowired
	private CalculatorService calculatorService;
	
	
	@GetMapping("/add")
	public Double add(@RequestParam("a") double numberA, @RequestParam("b") double numberB ) {
		//calculatorService.setNums(numberA, numberB );
		return calculatorService.add(numberA,numberB);
		
	}
	
	@GetMapping("/subtract")
	public Double subtract(@RequestParam("a") double numberA, @RequestParam("b") double numberB ) {
	      return (numberA - numberB);
	   }
	@GetMapping("/multiply")
	public Double multiply(@RequestParam("a") double numberA, @RequestParam("b") double numberB ) {
	      return (numberA * numberB);
	   }
	@GetMapping("/divide")
	public Double divide(@RequestParam("a") double numberA, @RequestParam("b") double numberB ) {
	      return (numberA / numberB);
	   }
	     
}
