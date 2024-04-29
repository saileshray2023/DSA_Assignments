public class ArrayPrintingGeneric {
    public static < E > void printArray( E[] inputArray){
        for(E v:inputArray){
            System.out.print(v+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] iArr={1,2,3,4};
        Float [] fArr={5.6f,2.3f,1.5f};
        String []sArr={"Ben","Stokes","Kane","Hary"};
        ArrayPrintingGeneric.printArray(iArr);
        ArrayPrintingGeneric.printArray(fArr);
        ArrayPrintingGeneric.printArray(sArr);
    }
}

