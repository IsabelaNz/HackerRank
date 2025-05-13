package algoritmos.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class _06_JavaLoops1 {
    // o nome da classe estará como public class Solution

    public class Solution {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            for(int i = 1; i < 11; i++) {
                System.out.println(x + " x " + i + " = " + x*i);
            }

        }
    }
}
