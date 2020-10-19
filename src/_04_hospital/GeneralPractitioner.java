package _04_hospital;

public class GeneralPractitioner extends Doctor{
	public boolean performsSurgery() {
		
		return false;
	}
	
	public boolean makesHouseCalls() {
		
		return true;
	}
	public void doMedicine() {
		for (Patient patient : assignedPatients) {
			patient.checkPulse();
			patient.feelsCaredFor();
		}
	}
}
