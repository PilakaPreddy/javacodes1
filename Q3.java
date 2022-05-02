 
package insempaper;
import java.util.Scanner;
class students
{
  private int id;
  private String name;
  private long mobile;
  public int getID() {
    return this.id;
  }
  public void setID(int id) {
    this.id = id;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public long getMobile() {
    return this.mobile;
  }
  public void setMobile(long mobile) {
    this.mobile = mobile;
  }
 
 
}
public class Q3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    students s1=new students();
    Scanner SC=new Scanner(System.in);
    System.out.println("enter data");
    s1.setID(SC.nextInt());
    s1.setName(SC.next());
    s1.setMobile(SC.nextLong());
    System.out.println("id= " + s1.getID());
    System.out.println("name= " + s1.getName());
    System.out.println("mobile= " + s1.getMobile());

  }

}
