package GroupProjectArrays;
//Write a java program to find the second-largest number in the array?
public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers = {1, 9, 11, 100};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest= largest;
                largest= numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
