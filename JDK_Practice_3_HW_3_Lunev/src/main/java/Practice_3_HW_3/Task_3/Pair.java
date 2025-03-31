package Practice_3_HW_3.Task_3;

/**
 * 3.
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 */

public class Pair <T,U> {
    private T t;
    private U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getFirst() {
        return t;
    }

    public U getSecond() {
        return u;
    }

    @Override
    public String toString() {
        return "Pair {" + "first = " + t + ", second = " + u + '}';
    }

    // Пример использования
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(1, "Hi");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }
}
