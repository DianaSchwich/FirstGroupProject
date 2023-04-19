package GroupProjectArrays;
//Create a program that uses an array to store a list of temperatures for a week,
// and then uses a loop to find the highest and lowest temperature for the week.
public class HigestLowestTemperature {
    public static void main(String[] args) {


    int[]temp= {40,58,69,90,88,57,70};
    int high=temp[0];
    int low=temp[0];


    for(int i=0; i<temp.length; i++){
         if(temp[i]>high) {
             high = temp[i];
         }
         else if (temp[i]<low) {
             low = temp[i];
         }
         }
        System.out.println("The highest temperature is"+high);
        System.out.println("The lowest temperature is"+low);
    }
    }






