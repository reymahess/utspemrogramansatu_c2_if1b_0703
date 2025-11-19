import java.util.Scanner;

public class soalutsc2_2 {
    
    
    public static void main(String[] args) {
        double jmlproyek, tarifproyek, bonusrevisi, biayalanggananapp, biayainternet, pendapatankotor, totalpendapatankotor, biayaoperasional, biayaplatform, pendapatanbersihbulanan, pendapatanpertahun, totalpotonganplatformsetahun;
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

        System.out.println("MENU UTAMA");
        System.out.println("Pilih Proses Yang ingin Dijalankan (1/2/3/4)");
        System.out.println("1. Hitung Pendapatan Bersih Perbulan");
        System.out.println("2. Hitung Pendapatan Bersih Pertahun");
        System.out.println("3. Tampilkan Total Potongan Platform Setahun");
        System.out.println("4. Keluar");
        int pilihan = go.nextInt();
        pendapatankotor = jmlproyek * tarifproyek;
        biayaplatform = pendapatankotor * 0.12;
        totalpendapatankotor = pendapatankotor - biayaplatform;
        biayaoperasional = biayainternet + biayalanggananapp;
        pendapatanbersihbulanan = totalpendapatankotor - biayaoperasional + bonusrevisi;
        
        String ulangiprogram = null;
        do {
            
       
        switch (pilihan) {
            case 1:
                if (pendapatanbersihbulanan < biayaoperasional) {
                    System.out.println("Pendapatan Terlalu Rendah");
                }else {
                    System.out.println("Pendapatan Bersih PerBulan Anda:" + pendapatanbersihbulanan);
                }
                break;
            case 2:
                pendapatanpertahun = pendapatanbersihbulanan * 12;
                if (pendapatanbersihbulanan < biayaoperasional) {
                    System.out.println("Pendaptan terlalu rendah");
                } else{
                    System.out.println("Pendapatan Bersih Setahun Anda :"+ pendapatanpertahun);
                }
            case 3:
                totalpotonganplatformsetahun = biayaplatform * 12;
                System.out.println("Total Potongan Platform Setahun:" +totalpotonganplatformsetahun);
            case 4:
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                break;

            
        } 
        System.out.print("Apakah Anda Ingin Mengulangi Program? (YA/TIDAK): ");
        ulangiprogram = go.next();
        
        }while (ulangiprogram.equals("YA"));
        System.out.println("Progam Selesai");
    
        
    }
    
}