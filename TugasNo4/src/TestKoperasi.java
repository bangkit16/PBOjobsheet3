import java.util.Scanner;

public class TestKoperasi{
    public static void main(String[] args){
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\n Masukan Jumlah pinjaman : ");
        int pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        System.out.println("\n Masukan Jumlah pinjaman : ");
        int angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
