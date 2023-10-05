package LinkedListPackage;

import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
/**
 * LList Class's Purpose:
 * - accept inputted integers 
 * - store input in linked list
 * - sort linked list in ascending order
 * @author Maggie Mulhall
 * @version 1.0.0
 * @since Week 4 of CSC6301
*/
public class LList{
/**
 * Main Class's Purpose:
 * - entry point of program
 * @param args default parameter for main (not used)
*/
public static void main(String args[]) {
    LinkedList<Integer> MaggiesList = new LinkedList<>();
    //Get and store validated inputted values
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEnter 5 whole numbers (hit enter in between each): ");
            for(int i=0; i<5; i++){
                int num = scanner.nextInt();
                MaggiesList.add(num);
            }
            //Sort and display linked list
            Collections.sort(MaggiesList);
            System.out.println(MaggiesList);
        }catch (Exception e) {
            System.out.println("Something went wrong.");
   }
}}
 