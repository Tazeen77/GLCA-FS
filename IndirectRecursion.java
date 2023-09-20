package W3D3_Recursion;

import java.util.Scanner;

public class IndirectRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();
        person1(msg);
    }

    private static void person1(String msg) {
        System.out.println("person1: " + msg);
        Scanner in = new Scanner(System.in);
        String nextMsg = in.nextLine();
        if (nextMsg.equals("stop"))
            return;
        person2(nextMsg);

    }

    private static void person2(String msg) {
        System.out.println("person2: " + msg);
        Scanner in = new Scanner(System.in);
        String nextMsg = in.nextLine();
        if (nextMsg.equals("stop"))
            return;
        person1(nextMsg);
    }

}
