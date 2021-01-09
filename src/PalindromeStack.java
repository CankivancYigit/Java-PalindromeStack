
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cankıvanç
 */
public class PalindromeStack {
//palindrome kelime iki taraftan da okunuşu ve yazılışı aynı olan kelimelere denir. örneğin kasaylabalyasak

    public static void main(String[] args) {
        System.out.print("Bir cümle girin : ");
        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();
        Stack<Character> stack = new <Character>Stack();

        for (int i = 0; i < cumle.length() / 2; i++) {
            stack.push(cumle.charAt(i));
        }

        if (palindromeMu(stack, cumle)) {
            System.out.println("Cümle palindrome");
        } else {
            System.out.println("Cümle Palindrome değil");
        }

    }

    public static boolean palindromeMu(Stack stack, String cumle) {

        for (int i = cumle.length() / 2 + 1; i < cumle.length(); i++) {

            if (cumle.charAt(i) != (char) stack.pop()) {

                return false;
            }

        }

        return true;
    }
}

