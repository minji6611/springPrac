package com.spring.dog.ano.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dog.ano.impl.DogDo;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("dogSettings.xml");
//		
//		DogService dService = (DogService) context.getBean("dogService");
//		DogDo ddo1 = (DogDo) context.getBean("dogDo1");
//		DogDo ddo2 = (DogDo) context.getBean("dogDo2");
//		
//		dService.insertDogInfo(ddo1);
//		dService.insertDogInfo(ddo2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("anoDogSettings.xml");
		DogService dService = (DogService) context.getBean("dogService");
		DogDo dogDo = (DogDo) context.getBean("dogDo");

		
		dogDo.setName("°»¾óÁã");
		dogDo.setSpecies("Ä¡¿Í¿Í");
		dogDo.setColor("ÇÏ¾á");
		
		dService.insertDogInfo(dogDo);
		
	}

}
