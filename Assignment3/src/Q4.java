class Box<T>{
    T var1;
    Box(T i){
        var1=i;
    }
    void setInstance(T i) {
        var1=i;
    }
    //method for var1 of type T
       T getInstance() {
        return var1;
    }
    void display() {
        System.out.println(var1);
    }
}
public class Q4 {
    public static void main(String[] args) {
        //Bit 'a' of question
        Box<String> box1,box2;
        box1= new Box<>("Hello");
        box2=box1;
        System.out.println("box1:");
        box1.display();
        System.out.println("box2:");
        box2.display();
        box1.setInstance("Hi");
        System.out.println("box1:");
        box1.display();
        System.out.println("box2:");
        box2.display();


       // Bit 'b' of question
        Box<Integer> box3,box4;
        box3=new Box<>(5);
        box4=box3;
        System.out.println("box3:");
        box3.display();
        System.out.println("box4:");
        box4.display();
        box3.setInstance(6);
        System.out.println("box3:");
        box3.display();
        System.out.println("box4:");
        box4.display();

        //Bit 'c' of question
        Box<Object> obj1,obj2;
        obj1= new Box<>("Sail");
        obj2=obj1;
        System.out.print("obj1:");obj1.display();
        System.out.print("obj2:");obj2.display();
        obj1.setInstance(5);
        System.out.print("obj1:");
        obj1.display();
        System.out.print("obj2:");obj2.display();





    }
}
