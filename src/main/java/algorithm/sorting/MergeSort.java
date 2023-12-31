package algorithm.sorting;
/*
* 归并排序(Merge-Sort)
* */
public class MergeSort {
    public void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        sort(arr, 0, arr.length-1, temp);
    }

    public void sort(int[] arr, int left, int right, int[] temp){
        if(left < right){
            int mid = (left + right)/2;
            sort(arr, left, mid, temp);
            sort(arr, mid +1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while (i<mid){
            temp[t++] = arr[i++];
        }
        while (j<=right){
            temp[t++] = arr[j++];
        }
        t=0;
        while (left<=right){
            arr[left++] = temp[t++];
        }
    }
}
