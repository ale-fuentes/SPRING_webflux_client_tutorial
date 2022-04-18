package com.alefuuuu.webfluxclienttutorial.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alefuuuu.webfluxclienttutorial.domain.Bill;

@Service
public class ClientBillService {

	public List<Bill> searchAll(){
		RestTemplate template = new RestTemplate();
		Bill[] bills = template.getForObject("http://localhost:8080/bill", Bill[].class);
		List<Bill> list = Arrays.asList(bills);
		return list;
	}
}
