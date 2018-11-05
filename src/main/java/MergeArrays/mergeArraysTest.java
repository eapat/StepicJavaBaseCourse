package MergeArrays;

public class mergeArraysTest {



    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7,9,11,13,15,17,19};
        int[] arr2 = {6,8,10,11,12,14,16,18,20};
        int[] arr3 = mergeArrays(arr1,arr2);
        for (int a: arr3
             ) {
            System.out.print(a+" ");
        }
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] mergedArr = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k<mergedArr.length;k++) {
            if (i == a1.length) {
                mergedArr[k] = a2[j];
                j++;
            } else if (j == a2.length) {
                mergedArr[k] = a1[i];
                i++;
            } else {
                mergedArr[k] = (a1[i] < a2[j] ? a1[i++] : a2[j++]);
            }
        }
        return mergedArr; // your implementation here
    }
}
