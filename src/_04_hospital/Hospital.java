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

	public void assignPatientsToDoctors() throws DoctorFullException {
		for(Doctor doctor : doctors) {
			for(Patient patient : patients) {
				while(doctor.getPatients().size() < 3) {
					doctor.assignPatient(patient);
				}
			}
		}
		
	}
}


/*
for(Patient patient : patients) {
if(count == 0) {
	doctors.get(0).assignPatient(patient);
	count ++;
}
else if(count == 1) {
	doctors.get(1).assignPatient(patient);

	count++;
}
else if(count == 2) {
	doctors.get(2).assignPatient(patient);
	count = 0;
}

}*/
