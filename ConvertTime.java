
/*Tubby a Third Class Student has given a Assignment on Time Chapter by his class teacher.
Tubby is supposed to change the time given in AM/PM Format to 24 Hours Format. 
Help Tubby Solve the Problem 
  
The Maths teacher gave him the time in the following Format - HH:MM:SS:AM/PM
   
Assume all HH,MM,SS are in the valid range only 
  
Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
       
Assume all input times are valid */
import java.util.*;

public class ConvertTime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(solve(s));
        sc.close();
    }

    public static String solve(String s) {
        String ampm[] = s.split(":");
        int hh = Integer.parseInt(ampm[0]);
        int mm = Integer.parseInt(ampm[1]);
        int ss = Integer.parseInt(ampm[2]);
        String ap = ampm[3];
        if (ap.equals("PM") && hh != 12) {
            hh += 12;
        } else if (ap.equals("AM") && hh == 12) {
            hh = 0;
        }
        return String.format("%02d:%02d:%02d", hh, mm, ss);

    }
}