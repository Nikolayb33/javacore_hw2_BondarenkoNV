import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int[] a = {1, 2, 0, 0, 10};
//        System.out.println(countEvens(a));

        int[] b =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println(diffBetweenMaxMin(b));




    }
//    Написать метод, возвращающий количество чётных элементов массива.
//    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    public static int countEvens(int[] a){
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] != 0){
                b ++;
            }
        }
        return b;
    }

    //Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого
// массива.
    public static int diffBetweenMaxMin(int[] a){
        int proxy;
        int b = a.length;
//        while (b != 0){
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 1; j < a.length; j++) {
                    if (a[i] < a[j]){
                        proxy = a[j];
                        a[j] = a[i];
                        a[i] = proxy;
                        System.out.println(Arrays.toString(a));
                    }
                }
            }
//            System.out.println(Arrays.toString(a));
//            b --;
//        }


        return a[0] - a[a.length - 1];
    }

}






//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.


