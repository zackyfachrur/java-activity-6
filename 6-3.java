// Nomor 3

// Tulis definisi method smallest di bawah.

 public static double smallest(double angka1, double angka2, double angka3) {
        double terkecil = angka1;

        if (angka2 < terkecil) {
            terkecil = angka2;
        }

        if (angka3 < terkecil) {
            terkecil = angka3;
        }

        return terkecil;
    }

// Nomor 4

// Tulis definisi method semuaBerbeda di bawah.

public static boolean semuaBerbeda(double angka1,double angka2,double angka3) {
    return angka1 != angka2 && angka2 != angka3 && angka1 != angka3;
}

// Nomor 5

// Tulis definisi method getNama di bawah.

public static String getNama() {
    Scanner input = new Scanner(System.in);
    String nama = input.nextLine();
    System.out.print("Masukkan nama Anda: ");
    return nama;
}
