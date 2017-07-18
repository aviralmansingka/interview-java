import java.util.*;

class BinarySearch {

    int[] data;

    public BinarySearch(int[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        BinarySearch s = new BinarySearch(arr);

        System.out.println(s.search(1));
        System.out.println(s.search(3));
        System.out.println(s.search(6));
    }

    public boolean search(int num) {
        int start = 0;
        int end = data.length-1;

        int mid;
        while (start < end) {
            mid = (start + end) / 2;

            if (this.data[mid] > num) {
                end = mid - 1;
            } else if (this.data[mid] < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
