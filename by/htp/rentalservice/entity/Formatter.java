package by.htp.rentalservice.entity;

public interface Formatter {
	
	default String formatTable(Object obj, int length) {	
		String string = String.valueOf(obj); 
		for (int i = string.length(); i < length; i++) {			
			string += " "; 			
		}		
		return string;	
	}
}
