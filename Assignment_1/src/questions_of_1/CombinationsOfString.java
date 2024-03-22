package questions_of_1;

public class CombinationsOfString {
    public static void main(String[] args) {
        String st="carbon";

        for(int i=0;i<st.length();i++)
            for(int j=0;j<st.length();j++)
                if(i!=j)
                for (int k=0;k<st.length();k++)
                    if(k!=i&&k!=j)
                    for(int l=0;l<st.length();l++)
                        if(l!=k&&l!=j&&l!=i)
                        for (int m=0;m<st.length();m++)
                            if(m!=l&&m!=k&&m!=j&&m!=i)
                            for (int n=0;n<st.length();n++)
                                if(n!=m&&n!=l&&n!=k&&n!=j&&n!=i)
                                    System.out.println(""+st.charAt(i)+st.charAt(j)+st.charAt(k)+st.charAt(l)
                                            +st.charAt(m)+st.charAt(n));


    }
}
