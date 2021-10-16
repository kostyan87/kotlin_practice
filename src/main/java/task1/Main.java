package task1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter text (At the end, you need to press ctrl + d):");
        StringBuilder s = getTextFromConsole();
        System.out.print("Enter page width: ");
        int pageWidth = new Scanner(System.in).nextInt();
        System.out.print("Enter type of aligment ('l', 'r' or 'c'):");
        Aligment aligment = getAligmentFromConsole();

//        System.out.println(s);
//        System.out.println(pageWidth);
//        System.out.println(aligment);
    }

    public static StringBuilder getTextFromConsole() {
        StringBuilder s = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        boolean hasNextLine = true;
        while(hasNextLine)
        {
            String line = scan.nextLine();
            s.append(line).append("\n");
            hasNextLine = !line.equals("/");
        }
        return s;
    }

    public static Aligment getAligmentFromConsole() {
        Scanner scan = new Scanner(System.in);
        Aligment aligment = Aligment.LEFT;
        char c = scan.findInLine(".").charAt(0);
        switch (c) {
            case 'l':
                return aligment;
            case 'r':
                return Aligment.RIGHT;
            case 'c':
                return Aligment.CENTER;
        }
        return aligment;
    }
}
