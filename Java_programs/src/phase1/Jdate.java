package phase1;

import java.util.Date;
import java.util.Random;

public class Jdate {
	
	@SuppressWarnings("deprecation")
	public static void convertDate(){
				
	    Date dt = new Date();
	    int mt=dt.getMonth();
	    int dte=dt.getDate();
	    int yr=dt.getYear();	    
	    
	    int currentYear = 1900+yr;
	    int TotalDays = 0;
	    String month = "";
	    
	    if(mt==0){
	    	TotalDays = dte;
	    	month = "January";
	    }
	    else if(mt==1){
	    	TotalDays = dte+29;
	    	month = "Febuary";
	    }
	    else if(mt==2){
	    	TotalDays = dte+60;
	    	month = "March";
	    }
	    else if(mt==3){
	    	TotalDays = dte+90;
	    	month = "April";
	    }
	    else if(mt==4){
	    	TotalDays = dte+121;
	    	month = "May";
	    }
	    else if(mt==5){
	    	TotalDays = dte+151;
	    	month = "June";
	    }
	    else if(mt==6){
	    	TotalDays = dte+182;
	    	month = "July";
	    }
	    else if(mt==7){
	    	TotalDays = dte+213;
	    	month = "August";
	    }
	    else if(mt==8){
	    	TotalDays = dte+243;
	    	month = "September";
	    }
	    else if(mt==9){
	    	TotalDays = dte+274;
	    	month = "October";
	    }
	    else if(mt==10){
	    	TotalDays = dte+304;
	    	month = "November";
	    }
	    else if(mt==11){
	    	TotalDays = dte+335;
	    	month = "December";
	    }
	    
	    String convertedYear = Integer.toString(currentYear);
	    String cYear = convertedYear.substring(2);
	    String convertedDays = Integer.toString(TotalDays);
	    
	    Random rd = new Random();
		int num = rd.nextInt(999999);
		String rNum = Integer.toString(num);
	    
		String DCN = cYear+convertedDays+rNum;
	    System.out.println("Applicable DCN for " + dte + "-" + month + "-" + currentYear + ": " + DCN);
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convertDate();
	}
}