package eksperimen1;

public class Web extends inputData implements Penentuan {

    public Web(String NIK, String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
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
       return (0.4 * super.nilaiTulis) + (0.35 * super.nilaiCoding) + (0.25 * super.nilaiWawancara);
    }
    
    @Override
    public String penentuanKelolosan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Web\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Web\n";
    }
}