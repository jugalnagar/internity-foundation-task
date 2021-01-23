package com.nagar;

import org.springframework.stereotype.Service;

@Service
public class CylinderService {
	
	public void calculateAreaAndVolume(Cylinder cylinder) {
		double area = 2*3.14*cylinder.getRadius()*cylinder.getHeight();
		double volume = 3.14*cylinder.getRadius()*cylinder.getRadius()*cylinder.getHeight();
		cylinder.setArea(area);
		cylinder.setVolume(volume);
	}

}
