package job4j.condition;

public class AlertDivByZero {

    public static void main (String[] args) {
        div(0);
        div(2);
        div(-5);
    }

    public static void div (int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
            return;
        } if (number < 0) {
            System.out.println( "This is negative numbers");
            return;
        }   System.out.println("please, calculate");
    }
}
