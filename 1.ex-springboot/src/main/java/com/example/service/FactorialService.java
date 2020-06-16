package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
	
	public int getFactrial(int num) {
		int fac=1;
		for(int i=num ; i>0;i--) {
			fac*=i;
		}
		return fac;
		
	}

}
