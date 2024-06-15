public class LargestRepeatedElement {

    static int largestRepeatedElement(int arr[]) {

        int maxCount = 0;
        int max = -1;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            }
            if (count > maxCount) {
                max = arr[i];
                maxCount = count;
                count = 0;
            }
        }

        return max;
    }

    static void largestRepeatedElement2(int arr[]) {
        int maxCount = 0;
        int count = 1;
        int repeated = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    repeated = arr[i];
                }

                count = 1;
            }

        }
        System.out.println(repeated);

    }

    static int smallestRepeatedElement3(int arr[]) {
        int minCount = Integer.MAX_VALUE; 
        int count = 1;
        int repeated = -1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            } else {
                if (minCount > count && count >= 2) { 
                    repeated = arr[i];
                    minCount = count;
                }
                count = 1;
            }
        }

        if (minCount > count && count >= 2) {
            repeated = arr[arr.length - 1];
            minCount = count;
        }

        System.out.println(repeated + " -> " + minCount);

        return repeated;
    }

    public static void main(String[] args) {

        int arr[] = { 5,5,3,3,2,1 };

        // System.out.println(largestRepeatedElement(arr));
        // largestRepeatedElement2(arr);
        // System.out.println(smallestRepeatedElement3(arr));
        int z=5;
        z+=++z+z++;
        System.out.println(z);

    }
}
