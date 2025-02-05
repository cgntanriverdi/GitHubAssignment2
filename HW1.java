import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW1
{
    private static int[] nums;
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();
    // Task B (Main) - Baran Elkansu
    public static void main(String [] args)
    {

    }
    /*
     * author : Ali Batu Sarıca
     * Date: 05.02.2025
     * Method for creating a randomized array in the range [0,100]
     */
    public static void createRandomArray()
    {
        System.out.println("Enter array size: ");
        int size = input.nextInt();
        nums = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(101);
        }

        System.out.println("A randomized array of size " + size + " has been created.  ");
    }

    // Çağan Tanrıverdi
    public static void taskC()
    {
        
    }

    // Kaan Uz
    public static void taskD()
    {

    }

    /*
     * author : Eren Gürbüz
     * Date: 05.02.2025
     * Method for calculating and printing the sum of elements at even and odd indexes
     */
    public static void SumOfElements ( int [] nums)
    {
        int oddSum = 0 , evenSum = 0 ;
        for ( int i = 0 ; i < nums.length ; i++) {
            if ( i % 2 == 0) {
                evenSum +=  nums [i];
            }
            else {
                oddSum += nums [i] ;
            }
        } 
        System.out.println("Sum of the elements at even indexes: " + evenSum);
        System.out.println("Sum of the elements at odd indexes: " + oddSum);
    }
}
