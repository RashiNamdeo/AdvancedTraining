import java.util.HashMap;
import java.util.Map;
 
class Main
{
    // Function to find the frequency of each element in a sorted array
    public static void findFrequency(int[] nums, int left, int right,
                                    Map<Integer, Integer> freq)
    {
        if (left > right) {
            return;
        }
 
        // if every element in subarray nums[left…right] is equal,
        // then increment the element's count by `n`
        if (nums[left] == nums[right])
        {
            Integer count = freq.get(nums[left]);
            if (count == null) {
                count = 0;
            }
 
            freq.put(nums[left], count + (right - left + 1));
            return;
        }
 
        int mid = (left + right)/2;
 
        // divide the array into left and right subarray and recur
        findFrequency(nums, left, mid, freq);
        findFrequency(nums, mid + 1, right, freq);
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9 };
 
        // find the frequency of each array element and store it in a map
        Map<Integer, Integer> freq = new HashMap<>();
        findFrequency(nums, 0, nums.length - 1, freq);
 
        System.out.println(freq);
    }
}
