class sorted_and_rotated {
    public static int main(String[]) {
        
        int unsortedDetected = 0;
        
        int nums= {3,4,5,1,2};

        for(int i =1; i<nums.length;i++){
               if(nums[i]<nums[i-1]){
                  unsortedDetected++;
               }
        }

        if(unsortedDetected > 1) return false;

        if(unsortedDetected == 1 && nums[0] < nums[nums.length-1]) return false;

        return true;
    }
}