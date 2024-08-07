import java.util.*;

public class learning {

    public static void main(String[] args) {
        System.out.println("Just a rough java learning file\n");
        System.out.println("hello");
        System.out.println("\t\"hello\"");
        System.out.println("hello\n");
        System.out.println("i am trying");

        // variables

        int x;
        x = 123;
        byte y = 13;
        char c;
        c = 'a';
        float z = 3.14f;
        boolean isit = true;
        String s = "it is java string";

        System.out.println("My number is " + x + " " + c + " " + y);

        // swapping variables
        // simple old temp technique of cpp

        Scanner newScanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = newScanner.nextLine();
        System.out.print("What is your age: ");
        int age = newScanner.nextInt();
        newScanner.nextLine();
        System.out.print("What is your word: ");
        String word = newScanner.nextLine();
        System.out.print("What is your mark: ");
        float mark = newScanner.nextFloat();
        System.out.print("What is your percent: ");
        double percent = newScanner.nextDouble();
        System.out.println("Your name is " + name + " and your age is " + age +
                " " + word + " " + mark + " " + percent);
        // arithmetic expressions
        newScanner.nextLine();
        int friends = 10;
        friends += 2;
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\ntell me friend num: ");
        friends += scanner2.nextInt();
        System.out.println("friends num is " + friends);
        newScanner.close();
        scanner2.close();
    }
}
