package com.alefuuuu.webfluxclienttutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alefuuuu.webfluxclienttutorial.domain.Bill;

@Controller
public class ClientBillController {

	@Autowired
	ClientBillService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Bill> listBill = new ArrayList<Bill>();
		listBill.addAll(service.searchAll());
		listBill.addAll(service.searchAll());
		listBill.addAll(service.searchAll());
		
		model.addAttribute("listBill", listBill);
		return "listBill";
	}
}
