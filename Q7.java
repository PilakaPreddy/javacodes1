package insempaper;
class twoDPoint
{
  public int a,b;
  public twoDPoint(int a, int b) {
    // TODO Auto-generated constructor stub
    this.a=a;
    this.b=b;
  }
  
  public void display()
  {
    System.out.println(" "+a +" " + b);
  }
  
}
public class Q7 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    twoDPoint p1= new twoDPoint(7,3);
    p1.display();

  }

}
