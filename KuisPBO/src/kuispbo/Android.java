package kuisPBO;

public class Android extends InputData implements Penentuan{

    public Android(String NIK, String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        super(NIK, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }
    
    public void inputNilaiTulis(double nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public void inputNilaiCoding(double nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public void inputNilaiWawancara(double nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }
     
    @Override
    public double hitungNilaiTotal() {
       return (0.2 * super.nilaiTulis) + (0.5 * super.nilaiCoding) + (0.3 * super.nilaiWawancara);
    }

    @Override
    public String penentuanKelolosan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Android\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Android\n";
    }
}