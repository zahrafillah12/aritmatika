import java.util.Scanner;

public class aritmatikaw {
    public static void main(String[] args) {
        int awal, akhir, beda;
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Masukkan angka awal");
        awal=s.nextInt();
         System.out.println("Masukkan batas akhir");
        akhir=s.nextInt();
         System.out.println("Masukkan batas beda");
        beda=s.nextInt();

        i = awal;
        while (i <= akhir) {
            System.out.println("Masukkan hasil ");
            i +=beda;

            
        }
    }

    
    }
    
