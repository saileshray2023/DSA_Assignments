import java.util.*;
class Person2 implements IDetailInfo{
    String name;
    static int maxCount;
    Person2(String name){
        this.name=name;
    }
    public void display() {
        System.out.println("Name:"+name);
        System.out.println("Length of word:"+count());
    }
    public int count() {
        if(maxCount<name.length()) {
            maxCount=name.length();

        }
        return name.length();
    }
}
public class Q7 {
    public static void main(String[] args) {
        Person2 []arr=new Person2[5];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name OF 5 PERSONS");
        for(int i=0;i<5;i++)
            arr[i]=new Person2(sc.next());
        for(int i=0;i<5;i++)
            arr[i].display();
        System.out.println("Maximum length of name "+Person2.maxCount);




    }
}
