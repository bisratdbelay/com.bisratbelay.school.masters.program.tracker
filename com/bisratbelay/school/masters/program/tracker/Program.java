package com.bisratbelay.school.masters.program.tracker;

import java.util.Date;

public class Program {
	
	String programName;
	String schoolName;
	double tuition;
	boolean online;
	double fee;
	Date timestamp;
	
	
	public Program() {
		this.programName="0";
		this.schoolName="0";
		this.tuition=0.00;
		this.online=false;
		this.fee=0.00;
		this.timestamp=new Date();
	}
	
	public Program(String programName, String schoolName, double tuition, boolean online, double fee, Date timestamp) {
		this.programName=programName;
		this.schoolName=schoolName;
		this.tuition=tuition;
		this.online=online;
		this.fee=fee;
		this.timestamp=timestamp;
	}
}
