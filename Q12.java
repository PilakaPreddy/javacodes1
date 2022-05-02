package insempaper;
class Product{
    public double computeGST(){
        return 0.50;
    }

}
class ElectronicAppliance extends Product{
    private int cost;

    public ElectronicAppliance(int cost) {
        this.cost = cost;
    }

    
    public double computeGST() {
        return 0.28*cost;
    }
}
class Furniture extends Product{
    private int cost;

    public Furniture(int cost) {
        this.cost = cost;
    }

    
    public double computeGST() {
        return 0.12*cost;
    }
}
public class Q12 {
    public static void main(String[] args) {
        Furniture f=new Furniture(10);
        ElectronicAppliance e1=new ElectronicAppliance(22);
        System.out.println(e1.computeGST());
        System.out.println(f.computeGST());
    }


}
