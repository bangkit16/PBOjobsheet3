public class Anggota {
    private String noktp;
    private String nama;
    private int limit;
    private int pinjam;

    Anggota(String a,String b ,int c){
        noktp = a;
        nama = b;
        limit = c;
    }

    public void setNama(String n){
        nama = n;
    }
    public void setPinjam(int n){
        pinjam = n;
    }
    public void setNoKtp(String n){
        noktp = n;
    }

    public String getNama() {
        return nama;
    }
    public int getLimitPinjaman() {
        return limit;
    }
    public int getJumlahPinjaman() {
        return pinjam;
    }

    public void pinjam(int pinjam){
        if(pinjam > limit){
            System.out.println("Maaf , jumlah pinjaman melebihi");
        }else {
            this.pinjam += pinjam; 
        }
    }
    public void angsur(int angsur){
        if(angsur<(limit/10)){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }else {
            pinjam -= angsur; 
        }
    }
}
