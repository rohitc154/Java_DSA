public class FirstLastOccur {

    // Time-Complexity : O(n)
    // public static void main(String[] args) {
    // int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
    // int first = -1;
    // int last = -1;
    // int target = 6;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target && first == -1) {
    // first = i;
    // last = i;
    // }
    // if (arr[i] == target && first != -1)
    // last = i;
    // }
    // System.out.println(first + " " + last);
    // }

    // Time Complexity : log(n)
    static int findFirst(int[] arr, int target, int len) {
        int low = 0;
        int high = len - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    static int findLast(int[] arr, int target, int len) {
        int low = 0;
        int high = len - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    static int[] result() {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int firstIndex = findFirst(nums, 7, nums.length);
        if (firstIndex == -1)
            return new int[] { -1, -1 };
        int lastIndex = findLast(nums, 7, nums.length);
        return new int[] { firstIndex, lastIndex };
    }

    public static void main(String[] args) {
        int[] sol = result();
        System.out.println(sol[0]);
        System.out.println(sol[1]);
    }
}
