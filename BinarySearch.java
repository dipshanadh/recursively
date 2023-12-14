public class BinarySearch {
  public static void main(String[] args) {
    int[] input = {-1, 0, 1, 4, 7, 9};

    System.out.print("Found in index: ");
    System.out.print(binarySearch(input, 0, input.length - 1, 4));
  }

  public static int binarySearch(int [] A, int left, int right, int x) {
    if (left > right)
      return -1;

    int mid = (left + right) / 2;

    if (x < A[mid])
      return binarySearch(A, left, mid - 1, x);

    else if (x > A[mid])
      return binarySearch(A, mid + 1, right, x);
    
    else
      return mid;
  }
}
