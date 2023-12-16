import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] nums = new int[] {4, 1, 3, 2, 0, -1, 7, 10, 9, 20};
    
    mergeSort(nums, 0, nums.length - 1);

    System.out.println(Arrays.toString(nums));
  }

  public static void mergeSort(int[] nums, int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;

      mergeSort(nums, start, mid);
      mergeSort(nums, mid + 1, end);

      merge(nums, start, mid, end);
    }
  }

  public static void merge(int[] nums, int start, int mid, int end) {
      int temp[] = new int[end - start + 1];

      int l1 = start, l2 = mid + 1, k = 0;

      while (l1 <= mid && l2 <= end)
        if (nums[l1] < nums[l2])
          temp[k++] = nums[l1++];
        else
          temp[k++] = nums[l2++];

      while (l1 <= mid)
        temp[k++] = nums[l1++];

      while (l2 <= end)
        temp[k++] = nums[l2++];

      for (k = start; k <= end; ++k)
        nums[k] = temp[k - start];
  }
}
