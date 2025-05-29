package algoritmos.easy;

import java.util.Scanner;

public class _10_JavaStaticInitializerBlock {
    // o nome da classe estará como Solution

    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static boolean flag = true;

    static {
        try {
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}