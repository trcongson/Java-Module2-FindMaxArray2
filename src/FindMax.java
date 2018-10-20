public class FindMax {
    public static void main(String[] args) {
        int [][] arr = {
                {4,5,12,54,34},
                {12,53,23,2,78},
                {45,2,67,8,47},
        };
         int max = arr[0][0];
         int index1 = 0, index2 =0;

         for (int i =0; i<arr.length; i++){
             for (int j =0; j<arr.length;j++){
                 if (max<arr[i][j]){
                     max = arr[i][j];
                     index1 = i;
                     index2 = j;
                 }
             }
         }
        System.out.println("Max: " + max + " tại vị trí ["+index1+"]["+index2+"]");
    }
}
