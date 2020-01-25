package pl.sda.academy.intermediate.WarmUp2;

public class WarmUp2 {
    public static void main(String[] args) {

        int suma;
        String[] array = new String[]{"abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz"};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {

            temp = temp + array[i].length();
        }
        System.out.println(temp);

    }
}
