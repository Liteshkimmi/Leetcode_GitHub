import java.util.Arrays;

public class ReverseIntegers1DArray
{
    public static void main(String[] args)
    {
        // INPUT arr = [1,2,3,4]
        // OUTPUT arr = [4,3,2,1]
        ReverseIntegers1DArray reverse = new ReverseIntegers1DArray();
        reverse.reverseArray();
    }
    public void reverseArray ()
    {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        for(int i=0;i<(num.length/2); i++)
        {
           temp = num[i];
           num[i] = num [(num.length-1)-i];
           num [(num.length -1)-i] = temp;

           System.out.println(Arrays.toString(num));
        }
    }
}
