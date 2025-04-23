package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.InquiryForm;
import com.example.demo.service.InquiryService;

@Controller
public class InruiryController {
	
	//問い合わせ処理クラス
	@Autowired InquiryService inquiryService;
	
	@GetMapping("/InquiryForom")
	public String inputForm(@ModelAttribute InquiryForm forData,Model model) {
		
	model.addAttribute("formData", new InquiryForm());
		
	return "InquiryForm";
	}
	
	@PostMapping("/InquiryResult")
	public String Result(@ModelAttribute InquiryForm formData, Model model) {
		
		
	//問い合わせ処理の実施
	inquiryService.doInquiryEntry(formData);
	model.addAttribute("formData", formData);
	return "InquiryResult";
	}

	}
