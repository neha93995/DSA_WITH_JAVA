package Arrays;
public class Q10_Minimum_Number_Of_Jumps {

    // Time Complexity O(n^2)
    // space complexity O(1)
    static int minJumps(int[] arr) {

        if (arr[0] == 0) {
            return -1;
        }

        int steps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;
            int max = arr[i];

            if (arr[i] + i > arr.length) {
                steps++;
                break;
            }
            for (int j = 1; j <= arr[i]; j++) {

                if (arr[i + j] > max) {
                    max = arr[i + j];
                    index = i + j;
                }
            }
            System.out.println(i + " -> " + index);
            i = index - 1;
            steps++;

        }

        return steps;

    }

    static int minJumps2(int[] arr) {
        if (arr.length <= 1)
            return 0;

        if (arr[0] >= arr.length - 1)
            return 1;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for (int i = 1; i < arr.length; i++) {

            System.out.println("i: "+i+" maxReach: "+maxReach+" step: "+step+" jump: "+jump);
            if (i == arr.length - 1)
                return jump;

            if (arr[i] >= (arr.length - 1) - i)
                return jump + 1;

            maxReach = Math.max(maxReach, i + arr[i]);

            step--;

            if (step == 0) {

                jump++;

                if (i >= maxReach)
                    return -1;

                step = maxReach - i;
            }
        }

        return -1;
    }


    

    public static void main(String[] args) {

        // int arr[] = { 1, 4, 3, 2, 6, 7 };?
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;

        System.out.println("steps " + minJumps(arr));
        System.out.println("steps " + minJumps2(arr));

    }
}
