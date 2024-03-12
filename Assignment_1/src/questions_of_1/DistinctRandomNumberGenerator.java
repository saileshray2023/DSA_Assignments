package questions_of_1;

import java.util.ArrayList;

public class DistinctRandomNumberGenerator {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=(int)(100*Math.random()+1);
        arr.add(n);
        while (arr.size()<20){
            int m=(int)(100*Math.random()+1);
            if(! arr.contains(m)){


                arr.add(m);
                System.out.print(m+" ");
               // System.out.println();

            }


        }




    }
}
