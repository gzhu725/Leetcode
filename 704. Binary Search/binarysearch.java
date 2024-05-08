class binarysearch {
    public int search(int[] nums, int target) {
        //this is the iterative approach. 
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int cur = nums[mid];
            if(cur < target) low = mid + 1;
            else if(cur > target) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}
//binarysearch s = new binarysearch();
//int[] nums = {-1,0,1,4,5};
//System.out.println(s.search(nums, 4));
//iterative approach