package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class time {

	public static void main(String[] args) {
		
//		Date date = new Date(0, 0, 0);
//		System.out.println(dateFormat.format(date));
//		
//		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Calendar cal = Calendar.getInstance();
//		System.out.println(dateFormat.format(cal.getTime()));
//		
//		DateFormat dateFormat3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date1 = new Date(0);
//		System.out.println(dateFormat.format(date));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Calendar calobj = Calendar.getInstance();
	       System.out.println(dateFormat.format(calobj.getTime()));
	       
	       Random rand = new Random();
	       for(int i =0; i<20;i++){
	       int randomnumber = rand.nextInt(900000000) + 100000;
	       System.out.println(randomnumber);
	       System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	       }
	}

}
