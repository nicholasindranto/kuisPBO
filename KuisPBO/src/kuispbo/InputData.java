package kuispbo;

public class InputData {
    String nama, NIK;
    double nilaiTulis, nilaiCoding, nilaiWawancara;

    public InputData(String NIK, String nama, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        this.NIK = NIK;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
}