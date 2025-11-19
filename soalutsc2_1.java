import java.util.Scanner;

public class soalutsc2_1 {
    
    
    public static void main(String[] args) {

        double jmlproyek, tarifproyek, bonusrevisi, biayalanggananapp, biayainternet, pendapatankotor, totalpendapatankotor, biayaoperasional, biayaplatform, pendapatanbersih;
        Scanner go = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Proyek yang telah diselesaikan:");
        jmlproyek = go.nextDouble();
        System.out.print("Masukkan Tarif per Proyek:");
        tarifproyek = go.nextDouble();
        System.out.print("Masukkan Bonus:");
        bonusrevisi = go.nextDouble();
        System.out.print("Masukkan Biaya Langganan:");
        biayalanggananapp = go.nextDouble();
        System.out.print("Masukkan Biaya Internet:");
        biayainternet = go.nextDouble();

        pendapatankotor = jmlproyek * tarifproyek;
        biayaplatform = pendapatankotor * 0.12;
        totalpendapatankotor = pendapatankotor - biayaplatform;
        biayaoperasional = biayainternet + biayalanggananapp;
        pendapatanbersih = totalpendapatankotor - biayaoperasional + bonusrevisi;

        System.out.println("Total Pendapatan Kotor Anda: " + totalpendapatankotor);
        System.out.println("Total Pendapatan Bersih Anda: "+ pendapatanbersih);
        
    }
    
}