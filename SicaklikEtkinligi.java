package java101;
import java.util.Scanner;

public class SicaklikEtkinligi {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scn = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz: ");
        sicaklik = scn.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(sicaklik>=5 && sicaklik<15 ){
            System.out.println("Sinema etkinliği yapabilirsiniz.");
        }else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else if(sicaklik>25){
            System.out.println("Yüzme etkinliği yapabilirsiniz.");
        }
    }
}
