package by.htp.rentalservice.entity;

public class Draw implements Formatter{
	
	private int borderLength;
	
	private DataOnTenantAndLease data = new DataOnTenantAndLease();
	
	public String drawingATableWithData(String ss, String s) {
		String outTableLine = "";
		for (int i = 0; i < data.getEquipments().length; i++) {
			if (data.getEquipments()[i] != null) {
				outTableLine = String.format("||  %s |  %s |  %s |  %s |  %s |  %s |  %s |  " + s + ": %s |  %s |  %s ||", 
						formatTable(data.getEquipments()[i].getClass().getName().substring(39), 15), 
						formatTable(data.getEquipments()[i].getTitle(), 30), 
						formatTable(data.getEquipments()[i].getWeight(), 10), 
						formatTable(data.getEquipments()[i].getPrice(), 10), 
						formatTable(data.getEquipments()[i].getSize().toString(), 35), 
						formatTable(data.getEquipments()[i].getColor(), 10), 
						formatTable(data.getEquipments()[i].getCategory(), 10), 
						formatTable(ss, 15), 
						formatTable(data.getEquipments()[i].getQuantity(), 6),
						rentedAccessoryOrNot ());
				System.out.println(outTableLine);
				//System.out.print("___________________________________________________________________________________________________________________________________");
				//System.out.println("_________________________________________________________________________________________________________________________________");
			}
		}
		borderLength = outTableLine.length();
		
		tableBorders();
		
		return outTableLine;
	}
	private String rentedAccessoryOrNot () {
		if (data.getEquipments()[0].isWithAccess()) {
			return "YES            ";
		} 
		return "NO                 ";
	}
	
	private String tableBorders() {
		
		String border = "";
		for (int i = 0; i < borderLength; i++) {
			border += "_";
		}
		System.out.println(border);
		return border;
	}
	
}
