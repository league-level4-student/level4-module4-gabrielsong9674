package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}

	public void assignPatientsToDoctors() {
		for(Doctor doctor : doctors) {
			
		}
	}
}