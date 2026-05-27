package com.mca;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "MS-Dhoni")
public class CSK {
	int n;
	public CSK(@Value(value = "7") int n) {
		this.n = n;
	}
	
	public void show() {
		System.out.println("CSK win 2026 IPL");
	}
}
