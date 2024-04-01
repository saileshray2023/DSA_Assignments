package questions_of_1;
public class Most_1_RowColumn {
    public static void main(String[] args) {
        int[][] ar =new int[4][4];
        int[] columnSum=new int [4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                ar[i][j]=(int)(2*Math.random()+0);
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int rowMax=0,columnMax=0,p=-1,p1=-1;
        for(int i=0;i<4;i++){
            int row=0;
            for(int j=0;j<4;j++){
                if(ar[i][j]==1){
                    row++;
                    columnSum[j]++;//Using Array calculating sum of 1 of each column
                }
            }
            if(row>rowMax){
                rowMax=row;p=i;}
        }
        //Finding  maximum 1 of each column
        for(int i=0;i<columnSum.length;i++)
            if(columnSum[i]>columnMax){
                columnMax=columnSum[i];p1=i;}


        System.out.println("First row with max 1 :"+p);
        System.out.println("First column with max 1 :"+p1);

    }
}
