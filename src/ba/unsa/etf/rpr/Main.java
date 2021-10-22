package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    private static int SumaCifara(int n){
        int suma=0;
        int br=0;
        while(n!=0){
            br=n%10;
            suma=suma+br;
            n=n/10;
        }
        if(suma<0){
            suma=suma*(-1);
        }
        return suma;
    }

    public static void main(String[] args) {
	    int n=0;
	    Scanner in = new Scanner(System.in);
        System.out.println("Unesi n");
        n=in.nextInt();
        System.out.println("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=0;i<n;i++){
            if(i%SumaCifara(i)==0){
                System.out.println(i + " ");
            }
        }
    }
}
