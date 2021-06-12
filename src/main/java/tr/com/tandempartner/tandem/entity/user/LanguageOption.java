package tr.com.tandempartner.tandem.entity.user;

import java.io.Serializable;

public enum LanguageOption implements Serializable{
	
	EN("EN","English"),
	TR("TR","Turkish");

	LanguageOption(String code, String name) {

	}
	LanguageOption(String code) {
		 LanguageOption.valueOf(code);
	}
	
	LanguageOption getLanguageOption(String code){
		return LanguageOption.valueOf(code);
	}

}
