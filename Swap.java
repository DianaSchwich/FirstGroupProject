package GroupProjectArrays;
//write a program to swap 2 numbers without a temporary varialble?
public class Swap {
    public static void main(String[] args) {


        int x=10;
        int y=20;
        System.out.println("before swapping:");
        System.out.println("x="+x);
        System.out.println("y"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping:");
        System.out.println("x="+x);
        System.out.println("y="+y);



    }
}
