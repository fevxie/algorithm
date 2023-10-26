import Sorting.BubbleSort;
import Sorting.SelectSort;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class SortTest {
    @Test
    public void bubbleSortTest(){
        int[] nums = generateIntArray();
        BubbleSort bubbleSort = new BubbleSort();
        Instant startTime = Instant.now();
        int[] res = bubbleSort.bubbleSort(nums);
        System.out.println(Arrays.toString(res));
        Instant endTime = Instant.now();
        System.out.println("共耗时:"+ Duration.between(startTime,endTime).toMillis() + "毫秒");
    }

    @Test
    public void selectSortTest(){
        int[] nums = generateIntArray();
        SelectSort selectSort = new SelectSort();
        Instant startTime = Instant.now();
        int[] res = selectSort.selectSort(nums);
        System.out.println(Arrays.toString(res));
        Instant endTime = Instant.now();
        System.out.println("共耗时:"+ Duration.between(startTime,endTime).toMillis() + "毫秒");
    }

    private int[] generateIntArray(){
        int max = 8000;
        int[] nums = new int[max];
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*max);
        }

        return nums;
    }


}
