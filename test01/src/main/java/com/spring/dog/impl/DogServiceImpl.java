package com.spring.dog.impl;

import com.spring.dog.service.DogService;

public class DogServiceImpl implements DogService {
	private DogInfoDao ddao;
	
	
	//생성자를 이용한  ddao 주입
	public DogServiceImpl(DogInfoDao ddao) {
		super();
		this.ddao = ddao;
	}

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
