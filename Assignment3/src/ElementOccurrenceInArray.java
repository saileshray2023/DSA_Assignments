public class ElementOccurrenceInArray {
    public static <T> int count(T[] array,T item) {
        int c=0;
        for (T t : array) {
            if (t.equals(item))
                c++;
        }
        return c;
    }
    public static void main(String[] args) {

        Integer[] iArr = {1,2,3,4,1,2,1};
        Boolean[] bArr = {true,false,false,true};
        String[] sArr = {"abc","bcd","cde","def","abc","efg","abc"};
        System.out.println(ElementOccurrenceInArray.count(iArr,1));
        System.out.println(ElementOccurrenceInArray.count(bArr,false));
        System.out.println(ElementOccurrenceInArray.count(sArr,"abc"));




    }}
