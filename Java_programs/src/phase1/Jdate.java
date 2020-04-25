package phase1;

import java.util.Date;

public class Jdate {
	
	@SuppressWarnings("deprecation")
	public static void convertDate(){
				
	    Date dt = new Date();
	    int mt=dt.getMonth();
	    int dte=dt.getDate();
	    int yr=dt.getYear();
	    
	    int currentYear = 1900+yr;
	    int TotalDays = 0;
	    
	    if(mt==0){
	    	TotalDays = dte;
	    }
	    else if(mt==1){
	    	TotalDays = dte+29;
	    }
	    else if(mt==2){
	    	TotalDays = dte+60;
	    }
	    else if(mt==3){
	    	TotalDays = dte+90;
	    }
	    else if(mt==4){
	    	TotalDays = dte+121;
	    }
	    else if(mt==5){
	    	TotalDays = dte+151;
	    }
	    else if(mt==6){
	    	TotalDays = dte+182;
	    }
	    else if(mt==7){
	    	TotalDays = dte+213;
	    }
	    else if(mt==8){
	    	TotalDays = dte+243;
	    }
	    else if(mt==9){
	    	TotalDays = dte+274;
	    }
	    else if(mt==10){
	    	TotalDays = dte+304;
	    }
	    else if(mt==11){
	    	TotalDays = dte+335;
	    }
	    
	    String convertedYear = Integer.toString(currentYear);
	    String cYear = convertedYear.substring(2);
	    String convertedDays = Integer.toString(TotalDays);
	    String partialDCN1 = cYear+convertedDays;
	    
	    System.out.println("DCN1: "+partialDCN1);
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convertDate();
	}
}