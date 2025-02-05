import java.util.Arrays;

public class HW1
{
    // Task B (Main) - Baran Elkansu
    public static void main(String [] args)
    {

    }

    // Ali Batu Sarıca
    public static void taskA()
    {
        
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