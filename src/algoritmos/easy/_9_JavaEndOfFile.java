package algoritmos.easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class _9_JavaEndOfFile {
    // o nome da classe estará como Solution
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while(scanner.hasNextLine()){
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
    }
}
