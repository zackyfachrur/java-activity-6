// Tulis definisi method hitungVokal di bawah.
// Hanya tulis definisi method. Jangan tulis program lengkap.

public static int hitungVokal(String angka1) {
    if (angka1 == null) {
        return 0;
    }

    int jumlahVokal = 0; 
    
    String teksKecil = angka1.toLowerCase();

    for (int i = 0; i < teksKecil.length(); i++) {
        char karakter = teksKecil.charAt(i);

        if (karakter == 'a' || karakter == 'i' || karakter == 'u' || karakter == 'e' || karakter == 'o') {
            jumlahVokal++; 
        }
    }
    
    return jumlahVokal;
}


// [1] Tulis definisi method firstDigit di bawah.
public static int firstDigit(int n) {
    n = Math.abs(n);
    while (n >= 10) {
        n = n / 10;
    }
    return n;
}



// [2] Tulis definisi method lastDigit di bawah.
public static int lastDigit(int n) {
    return Math.abs(n % 10);
}


// [3] Tulis definisi method banyakDigit di bawah.
public static int banyakDigit(int n) {
    if (n == 0) {
        return 1;
    }
    return Integer.toString(Math.abs(n)).length();
}





// -----------------------------------------------------------
import java.util.Scanner;

/*
    Program ini menghitung PresentValue
*/
public class Deposito 
{
    // Tuliskan method hitungPresentValue di bawah comment ini.
   public static double hitungPresentValue(double futureValue, double bungaTahunan, int tahun) {
        return futureValue / Math.pow(1 + bungaTahunan, tahun);
    }




    /**************************************                                 
        !!!JANGAN UBAH KODE DI BAWAH!!!
    ***************************************/
    public static void main(String[] args)
    {
        double futureVal, bunga, presentVal; 
        int jangkaWaktu;
        
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print("Nilai future yang Anda harapkan: ");
        futureVal = keyboard.nextDouble();
    
        System.out.print("Bunga tahunan: ");
        bunga = keyboard.nextDouble();
    
        System.out.print("Jangka waktu (tahun): ");
        jangkaWaktu = keyboard.nextInt();
    
        presentVal = hitungPresentValue(futureVal, bunga, jangkaWaktu);
        System.out.printf("Anda harus mendepositokan sejumlah: Rp.%,.2f\n", presentVal);
    }
}


// --------------------------------------------------------------
import java.util.Scanner;

public class NilaiUjian 
{
    // Tuliskan definisi-definisi method yang diperlukan di bawah comment ini.
     public static double hitungRatarata(double n1, double n2, double n3, double n4, double n5) {
            return (n1 + n2 + n3 + n4 + n5) / 5.0;
    }

    public static char tentukanGrade(double nilai) {
        if (nilai >= 90) {
            return 'A';
        } else if (nilai >= 80) {
            return 'B';
        } else if (nilai >= 70) {
            return 'C';
        } else if (nilai >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }




    
    /****************************************
     *  !!! JANGAN UBAH KODE DI BAWAH !!!   *
     ****************************************/
    public static void main(String[] args)
    {
        double nilai1;
        double nilai2;
        double nilai3;
        double nilai4;
        double nilai5;
        double ratarata;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian ke-1: ");
        nilai1 = keyboard.nextDouble();
        
        System.out.print("Masukkan nilai ujian ke-2: ");
        nilai2 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-3: ");
        nilai3 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-4: ");
        nilai4 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-5: ");
        nilai5 = keyboard.nextDouble();

        ratarata = hitungRatarata(nilai1, nilai2, nilai3, nilai4, nilai5);

        System.out.println("Rata-rata nilai ujian = " + ratarata);
        System.out.println("Grade Anda = " + tentukanGrade(ratarata));

    }
}
