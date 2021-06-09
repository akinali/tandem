package tr.com.tandempartner.tandem.service;

public class ExistUserEmailException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "User email exist in system..";
	}

}
