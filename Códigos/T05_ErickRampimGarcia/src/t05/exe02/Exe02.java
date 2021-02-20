package t05.exe02;

import java.util.Scanner;
import java.io.IOException;

public class Exe02 {
    public static void main(String... args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpar tela

        Scanner sc = new Scanner(System.in);

        

        sc.close();
    }
}
