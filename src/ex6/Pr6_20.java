package ex6;

public class Pr6_20 {
    static int[] shuffle(int[] arr){

        for (int i = 0; i<arr.length; i++){
            int j = (int)(Math.random()*arr.length);

            int tmp = arr[i]; // arr1 tmp
            arr[i] = arr[j]; // arr[j] = arr[i] 크기만 참조
            arr[j] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] results = shuffle(original);
        System.out.println(java.util.Arrays.toString(results));


    }
}
