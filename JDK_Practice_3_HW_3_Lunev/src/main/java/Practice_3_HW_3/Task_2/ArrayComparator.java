package Practice_3_HW_3.Task_2;

/**
 * 2.
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
 * и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
 * элементы одного типа по парно по индексам.
 */

import java.util.Objects;

public class ArrayComparator {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println(compareArrays(array1, array2));

        String[] strArray1 = {"hello", "world"};
        String[] strArray2 = {"hello", "world"};
        System.out.println(compareArrays(strArray1, strArray2));

        Double[] doubleArray1 = {1.1, 2.2, 3.3};
        Double[] doubleArray2 = {1.1, 2.2, 3.4};
        System.out.println(compareArrays(doubleArray1, doubleArray2));
    }
}

