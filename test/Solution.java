import java.util.Arrays;
public class Solution {
    public static int[] solution(int[] arr, int target, int left, int right) {
        if(arr == null || arr.length == 0) return new int[]{-1, -1};

        if(left > right) return new int[]{-1, -1};
        int mid = (left+right)/2;

        if(arr[mid] < target) return solution(arr, target, mid+1, right);
        else if(arr[mid] > target) return solution(arr, target, left, right-1);
        else    {
            int[] leftRange = solution(arr, target, left, mid-1);
            int[] rightRange = solution(arr, target, mid+1, right);
            int leftEnd = (leftRange[0] == -1 ? mid : leftRange[0]);
            int rightEnd = (rightRange[1] == -1 ? mid : rightRange[1]);
            return new int[]{leftEnd, rightEnd};
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,8,8,8,9}, 8, 0, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,8,8,8,9}, 8, 0, 5)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,8,8,8,9}, 8, 0, 6)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,8,8,8,9}, 8, 0, 7)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5,8,8,9}, 8, 0, 7)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5,6,8,9}, 8, 0, 7)));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,8,8,8,9}, 7, 0, 7)));
    }
}
