public class search_rotated_array_duplicates {
    class Solution {
        public boolean search(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
    
                if (nums[mid] == target) {
                    return true;
                }
    
                // If the left and mid elements are equal, we need to skip the duplicates
                if (nums[start] == nums[mid]) {
                    start++;
                }
                // If the right and mid elements are equal, we need to skip the duplicates
                else if (nums[end] == nums[mid]) {
                    end--;
                }
                // If the left half is sorted
                else if (nums[start] <= nums[mid]) {
                    // If the target is in the left half
                    if (nums[start] <= target && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                // If the right half is sorted
                else {
                    // If the target is in the right half
                    if (nums[mid] < target && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
    
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
    
}
