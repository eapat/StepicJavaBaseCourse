package Palindrome;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // создание объекта класса Scanner
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        System.out.println(isPalindrome(string));
    }


    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        StringBuilder backOrder = new StringBuilder();
        String straightOrder = (text.toLowerCase()).replaceAll("[^a-zA-Z0-9]","");
        backOrder.append(straightOrder);
        backOrder.reverse();
        return (straightOrder.equals(backOrder.toString()));
    }


}
