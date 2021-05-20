package tr.com.tandempartner.tandem.constant;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralResponse implements Serializable {

	
	
	private boolean isSuccessfull;
	
	private String message;
	
	private Object data;
	
	
	
}
