package Util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	

	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String completionDate1 = "21-10-2016";
		 System.out.println(completionDate1);
		 DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		 Date date = null;
		 date = (Date) df.parse(completionDate1);
		 System.out.println(date);
		 DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		 System.out.println(df1.format(date));

	}

}
