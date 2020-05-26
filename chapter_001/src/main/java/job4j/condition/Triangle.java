package job4j.condition;

public class Triangle {

    public static boolean check(double ab, double ac, double bc) {
        boolean result = false;
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            result = true;
        }
        return result;
    }
}
