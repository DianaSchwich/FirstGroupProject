package GroupProjectArrays;

//Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/ print the even number only.
public class EvenNumbers {
    public static void main(String[] args) {
        int[][] group = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 8, 1}};

        int counter = 0;
        for (int i = 0; i < group.length; i++) {
            for (int j = 0; j < group[i].length; j++) {
                if (group[i][j] % 2 == 0) {
                    System.out.println(group[i][j]);
                }

            }
        }
    }
}



