package com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired 
	@Qualifier("heart2")
	private Heart h;
	 
	    // Annotation
	     public void setHeart(Heart heart)
	    {
	        this.h = heart;
	    }
	 
	    // Method
	    // Calling method of Heart class
	    public void startPumping() { h.pump(); }
	    public void showBeat() {System.out.println(h.getHeartBeat());}
}
