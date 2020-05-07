package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.OperationModel;
import com.example.service.CalculatorService;

@Controller
@RequestMapping(value = {"/calculator"})

public class CalculatorController {
	@Autowired
	CalculatorService service;
	@Autowired
	OperationModel operationModel;
	@GetMapping
	public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }
	@PostMapping(params="add")
	 public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", service.add(operationModel));
        return "calculator";
    }
	
	@PostMapping(params="subtract")
    public String subtract(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", service.subtract(operationModel));
        return "calculator";
    }

	@PostMapping(params="multiply")
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", service.multiply(operationModel));
        return "calculator";
    }

	@PostMapping(params="divide")
    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", service.divide(operationModel));
        return "calculator";
    }

    

	@PostMapping(params="sqrt")
    public String sqrt(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", service.sqrt(operationModel));
        return "calculator";
    }

	@PostMapping(params="power")
    public String power(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", service.power(operationModel));
        return "calculator";
    }

   

	@PostMapping(params="clear")
    public String clearSimple(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  service.clear(operationModel));
        model.addAttribute("result", 0);
        return "calculator";
    }

    

}
