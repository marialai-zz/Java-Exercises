// Given an array of strings of dates in the format "1st Oct 1968",
// return an array of strings of reformatted dates in the form "1968-10-01"

import java.util.*;

static String[] reformatDate(String[] dates) {

    String[] formattedDates = new String[dates.length];
    
    Map<String, String> months = new HashMap<String, String>();
    months.put("Jan", "01");
    months.put("Feb", "02");
    months.put("Mar", "03");
    months.put("Apr", "04");
    months.put("May", "05");
    months.put("Jun", "06");
    months.put("Jul", "07");
    months.put("Aug", "08");
    months.put("Sep", "09");
    months.put("Oct", "10");
    months.put("Nov", "11");
    months.put("Dec", "12");
    
    for (int i = 0; i < dates.length; i++) {
        int index = dates[i].indexOf("th");
        if (index == -1) {
            index = dates[i].indexOf("nd");
            if (index == -1) {
                index = dates[i].indexOf("rd");
                if (index == -1) {
                    index = dates[i].indexOf("st");
                }
            }
        }
        
        String day = dates[i].substring(0, index);
        String mon = dates[i].substring(index+3, index+6);
        String year = dates[i].substring(index+7);
        
        if (day.length() != 2) {
            day = "0" + day;
        }
        
        formattedDates[i] = year + "-" + months.get(mon) + "-" + day;
    }
    
    return formattedDates;
}