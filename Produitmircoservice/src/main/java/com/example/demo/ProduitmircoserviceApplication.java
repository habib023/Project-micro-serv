package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProduitmircoserviceApplication {

	public static void main(String[] args) {
		
		ApplicationContext	ctx= SpringApplication.run(ProduitmircoserviceApplication.class, args);
		
		Iproduitreposotory produitrepository=ctx.getBean(Iproduitreposotory.class);
		Stream.of("A","B","C").forEach(s->produitrepository.save(new Produit(s)));
		produitrepository.findAll().forEach(s->System.out.println(s.getDesinaiation()));
		
	}
	
}
