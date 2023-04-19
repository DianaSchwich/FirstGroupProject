package GroupProjectArrays;
//Write a Java program to print the first 10 numbers of Fibonacci series.
//It is a sequence of numbers in which each number after the first 2 is the sum of the two preceding ones
//example: 0, 1, 1 (0+1), 2(1+1), 3 (1+2), 5(2+3), 8(3+5), 13 (5+8), 21 (8+13), 34(13+21)
public class Fibonacci {
    public static void main(String[] args) {



    int[] f= new int[10];

    f[0]=0;
    f[1]=1;
    for(int i =2; i<10; i++){
        f[i]=f[i-1]+f[i-2];
        System.out.println(f[i]+" ");


    }
}}
