package GroupProjectArrays;
//Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.
public class EvenOdd {
    public static void main(String[] args) {
        int[][] group = {
                {1, 4, 3, 9, 2},
                { 4, 7, 8, 11}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < group.length; i++) {
            for (int j = 0; j < group[i].length; j++) {
                if (group[i][j] % 2 == 0) {
                    sumEven += group[i][j];
                } else if (group[i][j] % 2 != 0) {
                    sumOdd += group[i][j];

                }
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }}
