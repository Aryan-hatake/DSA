public class SearchRotatedSortedArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;

        if(nums.length == 1) {
            int ans = nums[0] == target ? 0 : -1;
            System.out.println(ans +" "+ 0);
        };
        int pivotIdx = nums.length-1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                pivotIdx = i+1;
            }
        }

        if(target >= nums[0] &&  target <= nums[pivotIdx-1]){
            int ans =  binarySearch(0,pivotIdx-1,target,nums);
            System.out.println(ans+" "+1);
        }
        else if( target <= nums[nums.length-1]) {
            int ans =  binarySearch(pivotIdx,nums.length-1,target,nums);
            System.out.println(ans+" "+2);
        }



    }

    static int binarySearch(int left,int right,int target,int[] nums){
        if(left>right) return -1;
        if(nums[left] == target) return left;

        int mid = (right-left)+left/2;

        if(mid < left || mid > right) return -1;
        if(target > nums[mid]) return binarySearch(mid+1,right,target,nums);
        else if(target < nums[mid]) return binarySearch(left,mid-1,target,nums);
        return mid;
    }
}