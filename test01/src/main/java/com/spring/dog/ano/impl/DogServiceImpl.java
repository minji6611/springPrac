package com.spring.dog.ano.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dog.ano.service.DogService;


@Service("dogService")
public class DogServiceImpl implements DogService {
	@Autowired
	private DogInfoDao ddao;
	

	//getter, setter를 이용한 ddao 주입
	public DogInfoDao getDdao() {
		return ddao;
	}
	public void setDdao(DogInfoDao ddao) {
		this.ddao = ddao;
	}



	@Override
	public void insertDogInfo(DogDo ddo) {
		// TODO Auto-generated method stub
		ddao.insertDogInfo(ddo);
	}
	
	
}
