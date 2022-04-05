package eksperimen1;

public class inputData {
    String nama, NIK;
    double nilaiTulis, nilaiCoding, nilaiWawancara;

    public inputData(String NIK, String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        this.NIK = NIK;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
}