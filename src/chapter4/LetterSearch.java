package chapter4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Loop break
 */
public class LetterSearch {
    public static void main(String args[]){
//      Get Text
        System.out.println("Enter the text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

//        Search text A

        boolean letterFound = false;

        for (int i = 0; i<text.length();i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contains the letter A or a");
                   }
        else {
            System.out.println("Text does not contain A or a");
        }
    }
}
