//Week 12 In_lab-1  
//done for a single string, implement it for n string objects
package labweek12codes;
import java.util.*;

public class wk12 {

  public static void main(String[] args) {
    String s=new String();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the date in mm/dd/yy format");
    s=sc.next();
    String m=s.substring(0, 2);
    //System.out.println(s);
    //System.out.println(m);
    String d=s.substring(3, 5);
    //System.out.println(d);
    String y=s.substring(6, 8);
    //System.out.println(y);
    String date =new String();
    int dd=Integer.parseInt(d);
    int mm=Integer.parseInt(m);
    if(dd>=1 && dd<=31)
      date=d+"th";
    else
    {
      System.out.println("Invalid day");
      System.exit(0);
    }
    
    switch(mm)
    {
    case 1:
      date=date+" January";
      break;
    case 2:
      date=date+" February";
      break;
    case 3:
      date=date+" March";
      break;
    case 4:
      date=date+" April";
      break;
    case 5:
      date=date+" May";
      break;
    case 6:
      date=date+" June";
      break;
    case 7:
      date=date+" July";
      break;
    case 8:
      date=date+" August";
      break;
    case 9:
      date=date+" September";
      break;
    case 10:
      date=date+" October";
      break;
    case 11:
      date=date+" November";
      break;
    case 12:
      date=date+" December";
      break;
    default:
    {
      System.out.println("Invalid Month");
      System.exit(0);
    }
    }
    System.out.println(date+" 19"+y);
    sc.close();
  }
}