package com.citi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
private static final String DATE_FORMAT= "yyyyMMdd";


//API to get last 6 days.

private String dateBeforeLast6Days()
{
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.MONTH, 6);
	Date date = cal.getTime();
	DateFormat df = new SimpleDateFormat(DATE_FORMAT);
	return df.format(date);
}
	

}
