package ru.job4j.oop;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "name: " + name + System.lineSeparator() + "body: " + body;
    }

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        System.out.println(report.generate("Annual report 2021", "To Be Continued"));
    }
}
