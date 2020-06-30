public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
  
        for(int k=1; k < numbers.length; k++){
          for(int l=1; l < numbers.length; l++){
            if(target == (numbers[k]+numbers[l])){
              return new int[] {k,l};         
            }
          }
        }
        return null;
    }
}