package com.spring.dog.impl;

import com.spring.dog.service.DogService;

public class DogServiceImpl implements DogService {
	private DogInfoDao ddao;
	
	
	//�����ڸ� �̿���  ddao ����
	public DogServiceImpl(DogInfoDao ddao) {
		super();
		this.ddao = ddao;
	}

	//getter, setter�� �̿��� ddao ����
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
