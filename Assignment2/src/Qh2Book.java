import java.util.Scanner;

class Book{
    String BName;int BEdition;float BPrice;
    Book(String BName,int  BEdition,float BPrice){
        this.BName=BName;
        this.BEdition=BEdition;
        this.BPrice=BPrice;}
    void display(){
        System.out.printf("%nBook Name:%s Book Edition:%d Book Price:%f",BName,BEdition,BPrice);
    }
}
public class Qh2Book {
    public static void main(String[] args) {
        Book [] arrObj=new Book[5];
        float  max=0;int p=-1;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("Enter Book Name,Edition and Price: ");
            arrObj[i]=new Book(sc.nextLine(),sc.nextInt(),sc.nextFloat());
            sc.nextLine();

        }
        for (int i=0;i<5;i++){
            //arrObj[i].display();
            if(arrObj[i].BPrice>max){
                max=arrObj[i].BPrice;
                p=i;
            }
        }
        System.out.print("Book with max price is : ");
        arrObj[p].display();
    }
}