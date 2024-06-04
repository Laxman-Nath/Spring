package com.qualifier;

public class Heart {
	private int heartBeat;
	public void pump() {
        System.out.println("Heart is Pumping");
    }
	public int getHeartBeat() {
		return heartBeat;
	}
	public void setHeartBeat(int heartBeat) {
		this.heartBeat = heartBeat;
	}
}
