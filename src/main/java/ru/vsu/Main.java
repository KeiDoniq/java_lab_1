package ru.vsu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Container was tested.\n");

        Container test = new Container();
        System.out.println(test);

        test.add(0);
        test.add(1);
        System.out.println(test);
        test.add(2);
        test.add(3);
        System.out.println(test);

        test.removeByElement(3);
        System.out.println(test);

        test.removeByElement(10);
        System.out.println(test);
        test.removeByElement(0);
        System.out.println(test);
        test.removeByElement(2);
        System.out.println(test);
        test.removeByElement(1);
        System.out.println(test);


        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        System.out.println(test);
        for (int i = 0; i < test.getSize(); ++i)
            System.out.println(test.getElementAt(i));

        test.removeAtPosition(3);
        System.out.println(test);
        test.removeAtPosition(3);
        System.out.println(test);
        test.removeAtPosition(0);
        System.out.println(test);
        for (int i = 0; i < test.getSize(); ++i)
            System.out.println(test.getElementAt(i));

        test.removeAtPosition(0);
        System.out.println(test);
        test.removeAtPosition(0);
        System.out.println(test);
        test.removeAtPosition(3);
        System.out.println(test);
        test.removeAtPosition(3);
        System.out.println(test);
        test.removeAtPosition(0);
        System.out.println(test);
        test.removeAtPosition(0);
        System.out.println(test);
        test.removeAtPosition(0);
        System.out.println(test);
    }
}