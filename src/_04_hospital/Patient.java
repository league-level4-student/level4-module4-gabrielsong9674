package _04_hospital;

public class Patient {
	public boolean cared;
	public boolean feelsCaredFor() {
		if(cared) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void checkPulse() {
		cared = true;
	}
}
