import java.util.*;
abstract class Marks{
    float marksICP,marksDSA;
    float percentage;
      abstract  float  getPercentage();
}
class CSE extends Marks{
    float algoDesign;
    CSE( float marksICP, float marksDSA,float algoDesign){
        this.marksDSA=marksDSA;
        this.marksICP=marksICP;
        this.algoDesign=algoDesign;
    }
    @Override
     float getPercentage() {
        percentage=(marksICP+marksDSA+algoDesign)/3;
        return percentage;
    }
}
class NonCSE extends Marks {
    float enggMechanics;
    NonCSE(float marksICP, float marksDSA, float enggMechanics){
        this.marksDSA=marksDSA;
        this.marksICP=marksICP;
        this.enggMechanics=enggMechanics;

    }
    @Override
     float getPercentage() {
        percentage=(marksICP+marksDSA+enggMechanics)/3;
        return percentage;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter marks of ICP,DSA,AlgoDesign for CSE student:");
        Marks obj1=new CSE(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.print("Enter marks  of ICP,DSA,Engineering Mechanics for NonCSE student:");
        Marks obj=new NonCSE( sc.nextFloat(),sc.nextFloat(), sc.nextFloat());
        System.out.println("Percentage of CSE Student "+obj1.getPercentage());
        System.out.println("Percentage of non cse student "+obj.getPercentage());



    }
}
