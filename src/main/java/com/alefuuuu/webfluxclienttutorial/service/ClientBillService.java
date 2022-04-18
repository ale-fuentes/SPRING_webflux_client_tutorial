package com.alefuuuu.webfluxclienttutorial.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.alefuuuu.webfluxclienttutorial.domain.Bill;

import reactor.core.publisher.Flux;

@Service
public class ClientBillService {

	public Flux<Bill> searchAll(){
		
		WebClient client = WebClient.create("http://localhost:8080/bill");
		Flux<Bill> bills=client.get().retrieve().bodyToFlux(Bill.class);
		Flux<Bill> bills1=client.get().retrieve().bodyToFlux(Bill.class);
		Flux<Bill> bills2=client.get().retrieve().bodyToFlux(Bill.class);
		
		Flux<Bill> all=Flux.merge(bills, bills1, bills2);
		System.out.println(all);
		return all;
	}
}
