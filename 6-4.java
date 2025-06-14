// Nomor 1
public static double readDouble(String prompt)
{
    // Tuliskan kode method readDouble di bawah comment ini.
    
    Scanner input = new Scanner(System.in);
    System.out.print(prompt + " ");
    
    Double hasil = input.nextDouble();
    
    return hasil;
    
    
}

// Nomor 2
// Modifikasi method di bawah sehingga dapat digunakan untuk berbagai
// nilai saldo awal dan berbagai nilai bunga.
    public static double balance(double saldoAwal, double bunga, int jangkaWaktu) {
        
        return saldoAwal * Math.pow(1 + bunga, jangkaWaktu);
    }
