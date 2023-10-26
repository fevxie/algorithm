package algorithm.sorting;

/*
* 选择排序
* */
public class SelectSort {
    public int[] selectSort(int[] nums){
        for(int i=0;i<nums.length-1; i++) {
            int minIndex = i;
            int min = nums[minIndex];
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex]=nums[i];
            nums[i] = min;
        }
        return nums;
    }
}
