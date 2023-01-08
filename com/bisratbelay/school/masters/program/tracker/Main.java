package com.bisratbelay.school.masters.program.tracker;

import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------initialize variables------------------
		String fileName="masters_program_list.csv";
		String filepath=""; //if a filepath is desired
		
		//-----------initialize array objects-------------
		
		Applicant[] arrAppl = new Applicant[] {new Applicant("Bisrat", "Belay", "")};
		Program[] arrProgram = new Program[] {new Program()};
		
		//-------record user input-----------
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter programName: ");
		arrProgram[0].programName = scanner1.nextLine();
		
		System.out.println("Enter schoolName: ");
		arrProgram[0].schoolName = scanner1.nextLine();
		
		System.out.println("Enter tuition: ");
		arrProgram[0].tuition = scanner1.nextDouble();
		
		System.out.println("Enter online: ");
		arrProgram[0].online = scanner1.nextBoolean();
		
		System.out.println("Enter fee: ");
		arrProgram[0].fee = scanner1.nextDouble();
		
		arrProgram[0].timestamp = new Date();
		
		scanner1.close();
		
		//-----create new file---------//
		try {
				File newFile = new File(fileName);
				      if (newFile.createNewFile()) {
				        System.out.println("\nFile created: " + newFile.getName());
				      } else {
				        System.out.println("\nFile already exists.");
				      }
			} catch (IOException e) {
			System.out.println("\nError has occurred.");
			e.printStackTrace();
			}
		//----------write to new file---------------//
		
		try {
				  FileWriter newWriter = new FileWriter(fileName, true);
				      for(Program i: arrProgram) {
				    	  newWriter.write("\n" + arrAppl[0].firstName + " " + arrAppl[0].lastName + ", " + i.programName + ", " + i.schoolName + ", " + i.tuition + ", " + i.online  + ", " + i.fee + ", " + new  Date());
				      }
				      newWriter.close();
				      System.out.println("\nWrote to the file.");
			} catch (IOException e) {
				      System.out.println("\nError has occurred.");
				      e.printStackTrace();
			}
		
	}

}