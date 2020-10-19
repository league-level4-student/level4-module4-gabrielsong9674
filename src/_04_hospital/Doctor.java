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
	public void assignPatient(Patient patient) throws DoctorFullException{
		if(assignedPatients.size() >= 3) {
			throw new DoctorFullException();
		}
		else {
			assignedPatients.add(patient);
		}

	}
	
	public ArrayList<Patient> getPatients(){
		return assignedPatients;
	}
	
	public void doMedicine() {
		for (Patient patient : assignedPatients) {
			patient.checkPulse();
			patient.feelsCaredFor();
		}
	}
}
