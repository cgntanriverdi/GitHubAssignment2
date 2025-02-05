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
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while(cont)
        {
            System.out.println("Options: ");
            System.out.println("1.Create a/another array");
            System.out.println("2.Find the difference between each element and the average of the array");
            System.out.println("3.Find the minimum value of the array");
            System.out.println("4.Find the maximum value of the array");
            System.out.println("5.Find the sum of elements at even and odd indexes");
            System.out.println("6.Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();sc.nextLine();

            switch(choice)
            {
                case 1:
                    createRandomArray();
                    break;
                case 2:
                    if(nums!=null)
                    {
                        differenceFromAverage(nums);
                    }
                    else 
                    {
                        System.out.println("Please create an array first.");
                    }
                    break;
                case 3:
                    if(nums!=null)
                    {
                        minimumElement(nums);
                    }
                    else 
                    {
                        System.out.println("Please create an array first.");
                    }
                    break;
                case 4:
                    if(nums!=null)
                    {
                        maximumElement(nums);
                    }
                    else 
                    {
                        System.out.println("Please create an array first.");
                    }
                    break;
                case 5:
                    if(nums!=null)
                    {
                        SumOfElements(nums);
                    }
                    else 
                    {
                        System.out.println("Please create an array first.");
                    }
                    break;
                case 6:
                    cont=false;
                    break;
                default:
                    System.out.println("Please enter a proper choice.");
                    break;

                
            }
        }
        
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
        if(size>0)
        {
            nums = new int[size];

            for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(101);
            }

            System.out.println("A randomized array of size " + size + " has been created.  ");
        }
        else
        {
            System.out.println("An array's size can not be zero or negative, please enter a proper size.");
        }
        
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
            System.out.println();
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
