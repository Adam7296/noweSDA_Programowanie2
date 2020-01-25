package pl.sda.academy.intermediate.basic.Basic1Arrays;

public class Arrays {
    public static void main(String[] args) {

        initXYZArray();
    }

    public static void initXYZArray() {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                System.out.print(array[i] + " ");
            }
        }
    }
}

