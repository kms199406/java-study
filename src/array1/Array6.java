package array1;

public class Array6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        for (int i = 0; i < arr.length; i++) {
            int Arr = arr[i];
            System.out.println(Arr);
        }

        //향상된 for 문, for - each문 실무에서 제일 많이 쓰인다.
        for (int Arr : arr) {
            System.out.println(Arr);
        }
    }
}
