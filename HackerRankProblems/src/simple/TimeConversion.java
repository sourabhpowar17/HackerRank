package simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s) {
        // Complete this function
		 String time = "";

		    SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssaa");

		    SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

		    try {
			time=	date24Format.format(date12Format.parse(s)).toString();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return time;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        in.close();
	}

}
