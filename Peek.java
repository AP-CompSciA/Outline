public class Peek {
    public static void at(Object... values) {

        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println(values[values.length - 1]);
    }
}
