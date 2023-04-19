package GroupProjectArrays;
//Create an array of integer values.
//After the array is created, calculate the sum of all stored elements in that array
public class SumEverything {
    public static void main(String[] args) {
        int[] group={5,2,1,10,3};

        int sum=0;

        for(int i=0; i<5; i++){
        sum+=group[i];
        }
        System.out.println(sum);
    }}


