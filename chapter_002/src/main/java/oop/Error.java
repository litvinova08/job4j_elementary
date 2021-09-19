package oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.print(" Is active? - " + active);
        System.out.print(" what is the status? = " + status);
        System.out.print(" answer: " + message);
    }

    public static void main(String[] args) {
        Error unfound = new Error();
        Error typo = new Error(true, 505, "check your spelling");
        unfound.printInfo();
        typo.printInfo();
    }
}
