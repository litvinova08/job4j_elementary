package ru.job4j.pojo;

public class Library {
    public static void print(Book[] array) {
        for (int index = 0; index < array.length; index++) {
            Book temp = array[index];
            System.out.println(temp.getName() + " - " + temp.getPages());
        }
    }

    public static void main(String[] args) {
        Book novel = new Book("Romeo & Julietta", 550);
        Book science = new Book("Maths", 240);
        Book fairtale = new Book("Kolobok", 50);
        Book kid = new Book("Kolobok", 50);
        Book clean = new Book("Clean code", 10);
        Book[] shelve = new Book[4];
        shelve[0] = novel;
        shelve[1] = science;
        shelve[2] = fairtale;
        shelve[3] = clean;
        Library.print(shelve);
        Book temp = shelve[0];
        shelve[0] = shelve[3];
        shelve[3] = temp;
        Library.print(shelve);
        for (int index = 0; index < shelve.length; index++) {
            if (shelve[index].getName().equals("Clean code")) {
                Book pr = shelve[index];
                System.out.println(pr.getName() + " - " + pr.getPages());
            }
        }
        System.out.println(fairtale.equals(kid));
    }
}
