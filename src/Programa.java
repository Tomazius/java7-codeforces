import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        int w = skaitytuvas.nextInt();

        System.out.println(konvertuojaYesirNo(arSkaiciusLyginis(w)));

    }

    public static boolean arSkaiciusLyginis(int x){
        return x % 2 == 0 && x > 2;
    }
    
    public static String konvertuojaYesirNo(boolean b){
        if (b){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
