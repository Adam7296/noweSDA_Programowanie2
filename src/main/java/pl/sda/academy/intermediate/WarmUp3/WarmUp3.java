package pl.sda.academy.intermediate.WarmUp3;

public class WarmUp3 {
    public static void main(String[] args) {
        int i;

        int[] array = new int[]{-2, 3, 1, 23, -9, 0, 12, 6, -4};
        int tempMax = array[0];
        int tempMin = array[0];

        for (i = 0; i < array.length; i++) {
            if (array[i] > tempMax) {
                tempMax = array[i];
            }
        }
        System.out.println(tempMax);

        for (i = 0; i < array.length; i++) {
            if (array[i] < tempMin) {
                tempMin = array[i];
            }
        }
        System.out.println(tempMin);

    }


}


