package GroupProjectArrays;
// Maximum and minimum number in the array?
public class MaxMin {
    public static void main(String[] args) {
        int []group= {50,100,1,5};
        int max=group[0];
        int min=group[0];


        for (int i = 0; i < group.length; i++) {
            if (group[i] > max) {
                max = group[i];
            } else if (group[i] < min) {
                min = group[i];
            }
        }

        System.out.println("The max number in the array is " + max);
        System.out.println("The min number in the array is " + min);



    }
}
