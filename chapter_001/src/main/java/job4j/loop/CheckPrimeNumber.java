package job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean rsl = true;
        if (number < 2) {
            return false;
        } else {
            for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                    rsl = false;
                    break;
                }
            }
            return rsl;
        }
    }

    public static int calc(int finish) {
        int rsl = 0;
        for (int index = 0; index <= finish; index++) {
            if (check(index)) {
                rsl++;
            }
        }
        return rsl;
    }
}
