import java.util.*;
  class Product{
    long prodID;
    double price;
    int quantity;
    static double totalPrice;
    Product(long prodID,double price,int quantity){
        this.prodID=prodID;
        this.price=price;
        this.quantity=quantity;
        totalPrice +=price*quantity;

    }
    void display() {
        System.out.println("Product Id:"+prodID+"\tprice:"+price+"\tquantity:"+quantity);
    }

}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product []objArray=new Product[5];
        for(int i=0;i<5;i++) {
            System.out.printf("Enter product %d id :",(i+1));
            long prodID=sc.nextLong();
            System.out.printf("Enter price for product %d :",(i+1));
            double price=sc.nextDouble();
            System.out.printf("Enter the quantity of product %d ",(i+1));
            int quantity=sc.nextInt();
            objArray[i]=new Product(prodID,price,quantity);
        }
        for(int i=0;i<5;i++)
            objArray[i].display();
        System.out.println("Total Amount is:"+Product.totalPrice);

    }
}
