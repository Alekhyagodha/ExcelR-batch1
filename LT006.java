package LT001;

public class LT006 {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0; 
            }
    
            int k = 0;
            for (int x = 1; x < nums.length; x++) {
                if (nums[x] != nums[k]) { 
                    k++; 
                    nums[k] = nums[x]; 
                }
            }
            return k + 1; 
        }
    
        public static void main(String[] args) {
            LT006 LT006 = new LT006();
            
           
            int[] nums = {1, 1, 2, 2, 3, 4, 4};
            
            
            System.out.println("Array before removing duplicates: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            
            int newLength = LT006.removeDuplicates(nums);
            
            
            System.out.println("Array after removing duplicates: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            
           
            System.out.println("New length: " + newLength);
        }
    }
    

