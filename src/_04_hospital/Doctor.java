package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	public boolean performsSurgery() {
		
		return false;
	}
	
	public boolean makesHouseCalls() {
		
		return false;
	}
	
	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();
	public void assignPatient(Patient patient) {
		assignedPatients.add(patient);
	}
	
	public ArrayList<Patient> getPatients(){
		return assignedPatients;
	}
}
