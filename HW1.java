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

/*
     * @author : Ali Çağan Tanrıverdi
     * Date: 05.02.2025
     * Methods for finding and printing the minimum and the maximum integer in the given array.
     */
    public static void minimumElement ( int[] nums )
    {
        int minValue = nums[0];
        for ( int i = 1 ; i < nums.length ; i++ )
        {
            if ( minValue > nums[i] )
            {
                minValue = nums[i];
            } 
        }
        System.out.println("The minimum value in the array is: " + minValue);
    }

    public static void maximumElement ( int[] nums )
    {
        int maxValue = nums[0];
        for ( int i = 1 ; i < nums.length ; i++ )
        {
            if ( maxValue < nums[i] )
            {
                maxValue = nums[i];
            }
        }
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    /*
     * author: Kaan Uz
     * Date: 05.02.2025
     * Method for finding the average of the array and printing how each element of the array differs from the average.
     */
    public static void differenceFromAverage(int[] nums)
    {
        int sum = 0, average = 0;

        if(nums.length > 0)
        {
            for(int i = 0; i < nums.length; i++)
            {
                sum += nums[i];
            }
            
            average = sum / nums.length;
            System.out.print("The difference between average and each element of the array:");

            for(int k = 0; k < nums.length; k++)
            {
                System.out.print(" " + (nums[k] - average));
            }
        }
        else
        {
            System.out.println("Array is empty!");
        }
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
