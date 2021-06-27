package tr.com.tandempartner.tandem.constant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralResponse implements Serializable {

	
	
	private boolean isSuccessfull;
	
	private String message;
	
	private List<Object> elements;

	public GeneralResponse(boolean isSuccessfull, String message,Object data) {
		super();
		this.isSuccessfull = isSuccessfull;
		this.message = message;
		this.elements= new ArrayList<Object>();
		this.elements.add(data);
	}
	

	public GeneralResponse(boolean isSuccessfull, String message) {
		super();
		this.isSuccessfull = isSuccessfull;
		this.message = message;
	
	}
	
	
	
	
	
	
}
