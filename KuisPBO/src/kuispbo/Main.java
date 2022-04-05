package eksperimen1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try{
            int coba = 1;
            do{
                Scanner input = new Scanner(System.in);
                System.out.println("Pilih Divisi : ");
                System.out.println("1. Andoid Development");
                System.out.println("2. Web Development");
                System.out.print("Pilih : ");
                int menu = input.nextInt();

                switch(menu){
                    case 1:
                    {
                        Scanner inputKalimat = new Scanner(System.in).useDelimiter("\n");
                        System.out.print("\n\nMasukkan NIK Anda\t\t: ");
                        String NIK = input.next();
                        System.out.print("Masukkan nama Anda\t\t: ");
                        String nama = inputKalimat.next();
                        System.out.print("Masukkan tes tulis Anda\t\t: ");
                        double tulis = input.nextDouble();
                        System.out.print("Masukkan tes coding Anda\t: ");
                        double coding = input.nextDouble();
                        System.out.print("Masukkan tes wawancara Anda\t: ");
                        double wawancara = input.nextDouble();
                        
                        Android android = new Android(NIK, nama, tulis, coding, wawancara);
                        int ulang = 1;
                        do{
                            System.out.println("\n\nMenu : ");
                            System.out.println("1. Edit");
                            System.out.println("2. Tampil");
                            System.out.println("3. Exit");
                            System.out.print("Pilih : ");
                            int submenu = input.nextInt();

                            switch(submenu){
                                case 1:
                                    System.out.print("Masukkan tes tulis Anda\t\t: ");
                                    android.inputNilaiTulis(input.nextDouble());
                                    System.out.print("Masukkan tes coding Anda\t: ");
                                    android.inputNilaiCoding(input.nextDouble());
                                    System.out.print("Masukkan tes wawancara Anda\t: ");
                                    android.inputNilaiWawancara(input.nextDouble());
                                    break;
                                case 2:
                                    System.out.println("Nilai Akhir : " + android.hitungNilaiTotal());
                                    System.out.println("Keterangan : " + android.penentuanKelolosan());
                                    break;
                                case 3:
                                    ulang = 0;
                                    break;
                                default:
                                    System.out.println("Input Anda salah, silahkan coba lagi!");
                            }
                        } while(ulang != 0);
                        coba = 0;
                        break;
                    }
                    case 2:
                    {
                        Scanner inputKalimat = new Scanner(System.in).useDelimiter("\n");
                        System.out.print("\n\nMasukkan NIK Anda\t\t: ");
                        String NIK = input.next();
                        System.out.print("Masukkan nama Anda\t\t: ");
                        String nama = inputKalimat.next();
                        System.out.print("Masukkan tes tulis Anda\t\t: ");
                        double tulis = input.nextDouble();
                        System.out.print("Masukkan tes coding Anda\t: ");
                        double coding = input.nextDouble();
                        System.out.print("Masukkan tes wawancara Anda\t: ");
                        double wawancara = input.nextDouble();
                        
                        Web web = new Web(NIK, nama, tulis, coding, wawancara);
                        int ulang = 1;
                        do{
                            System.out.println("\n\nMenu : ");
                            System.out.println("1. Edit");
                            System.out.println("2. Tampil");
                            System.out.println("3. Exit");
                            System.out.print("Pilih : ");
                            int submenu = input.nextInt();

                            switch(submenu){
                                case 1:
                                    System.out.print("Masukkan tes tulis Anda\t\t: ");
                                    web.inputNilaiTulis(input.nextDouble());
                                    System.out.print("Masukkan tes coding Anda\t: ");
                                    web.inputNilaiCoding(input.nextDouble());
                                    System.out.print("Masukkan tes wawancara Anda\t: ");
                                    web.inputNilaiWawancara(input.nextDouble());
                                    break;
                                case 2:
                                    System.out.println("Nilai Akhir : " + web.hitungNilaiTotal());
                                    System.out.println("Keterangan : " + web.penentuanKelolosan());
                                    break;
                                case 3:
                                    ulang = 0;
                                    break;
                                default:
                                    System.out.println("Input Anda salah, silahkan coba lagi!");
                            }
                        } while(ulang != 0);
                        coba = 0;
                        break;
                    }
                    default:
                        System.out.println("Input Anda salah, silahkan coba lagi!");
                }
            }while(coba != 0);
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}