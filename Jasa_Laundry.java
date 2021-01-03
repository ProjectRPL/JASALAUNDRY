// 
// 
// Kelompok 7
// Melynda Putri Tri Utami (1402018131)
// Anak Anung Anindito (1402018132)
// Muhammad Akhdan Zuloski P. (1402018135)
// Siti Haswy Raudhahtul Farhah (1402018137)
// Shafira Fajriyanti (1402018138)
// 
// 
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
public class Jasa_Laundry{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                      PROGRAM JASA LAUNDRY");
        System.out.println("          ---HANYA TERSEDIA UNTUK DAERAH JADETABEK---");
		System.out.println("                     Dibuat oleh Kelompok 7");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner input = new Scanner(System.in);
        String aaa = "yes";
        String nama ="";
        String alamat ="";
        DecimalFormat digit = new DecimalFormat("0.00");
        

        System.out.println("MASUKKAN DATA DIRI ANDA");
        do {
	        System.out.print("NAMA : ");
	        nama = input.nextLine();
	        if (!nama.matches("[a-zA-Z\\s]+")) {
	              System.out.println("Masukan Yang Anda beri, Salah\n");
	            }
	    } while (!nama . matches ("[a-zA-Z\\s]+"));
        do{
            System.out.print("KOTA ASAL : ");
            String kota_Asal = input.nextLine();
            String gratisOngkir ="";
            if(kota_Asal.equalsIgnoreCase("JAKARTA PUSAT") || kota_Asal.equalsIgnoreCase("JAKARTA BARAT")
                 || kota_Asal.equalsIgnoreCase("JAKARTA TIMUR") || kota_Asal.equalsIgnoreCase("JAKARTA UTARA")
                  || kota_Asal.equalsIgnoreCase("JAKARTA SELATAN") || kota_Asal.equalsIgnoreCase("DEPOK")
                   || kota_Asal.equalsIgnoreCase("TANGGERANG SELATAN")  || kota_Asal.equalsIgnoreCase("TANGGERANG")
                    || kota_Asal.equalsIgnoreCase("BEKASI BARAT")  || kota_Asal.equalsIgnoreCase("BEKASI UTARA")
                     || kota_Asal.equalsIgnoreCase("BEKASI SELATAN") || kota_Asal.equalsIgnoreCase("BEKASI TIMUR")
                      || kota_Asal.equalsIgnoreCase("BEKASI") || kota_Asal.equalsIgnoreCase("JAKARTA")){
                gratisOngkir = "---- SELAMAT ANDA MENDAPATKAN GRATIS ONGKIR ----";
                do{
	                System.out.print("ALAMAT TEMPAT TINGGAL : ");
	                alamat = input.nextLine();
	                if (!alamat.matches("[a-zA-Z\\s]+")) {
		              System.out.println("Masukan Yang Anda beri, Salah\n");
		            }
	            } while (!alamat . matches ("[a-zA-Z\\s]+"));
                String pilihan_jenis_Paket="";
                double harga_paket=0;
                String bbb ="";
                do{ 
                    System.out.println("JENIS PAKET ");
                    System.out.println("1. Express                     >>> Rp.15.000/kg");
                    System.out.println("2. Reguler                     >>> Rp.7.000/kg");
                    System.out.print("PILIH JENIS PAKET : ");
                    String jenis_Paket = input.nextLine();
                    
                    if (jenis_Paket.equalsIgnoreCase("1")) {
                        pilihan_jenis_Paket="Express";
                        harga_paket = 15000;
                        bbb="no";
                    }else if (jenis_Paket.equalsIgnoreCase("2")) {
                        pilihan_jenis_Paket="Reguler";
                        harga_paket = 7000;
                        bbb="no";
                    }else {
                        System.out.println("-----MAAF, JENIS PAKET TIDAK TERSEDIA.-----");
                        System.out.println("-----------SILAKAN PILIH KEMBALI-----------");
                        bbb="yes";
                    }
                }while (bbb.equalsIgnoreCase("yes")); 
                
                System.out.println("");
                String yes = "y";
                String pilih_kembali = "";
                String[] macam_pakaian = new String[20];
                int a = 1;
                int b = 0;
                int harga_perpakaian=0;
                double hagra_jumlah_pakaian = 0;
                String bb = "";
                String pilihan_jenis_Pakaian="";
                do {
                    do{
                        System.out.println("JENIS PAKAIAN ");
                        System.out.println("1. Blus (Blouse)               >>> Rp.18.500/kg");
                        System.out.println("2. Jas (Jacket)                >>> Rp.72.000/kg");
                        System.out.println("3. Kemeja (Shirt)              >>> Rp.14.500/kg");
                        System.out.println("4. Rok (Skirt)                 >>> Rp.21.000/kg");
                        System.out.println("5. Mantel (Coat)               >>> RP.27.500/kg");
                        System.out.println("6. Gaun (Dress)                >>> Rp.124.000/kg");
                        System.out.println("7. Rompi (Vest)                >>> Rp.72.000/kg");
                        System.out.println("8. Celana (Pant)               >>> Rp.14.500/kg");
                        System.out.println("9. Celana Terusan (Jump Suite) >>> Rp.40.000/kg");
                        System.out.print("PILIH JENIS PAKAIAN : ");
                        String jenis_Pakaian = input.nextLine();
                        
                            switch (jenis_Pakaian) {
                                case "1":
                                    pilihan_jenis_Pakaian="Blus (Blouse)";
                                    harga_perpakaian = 18500;
                                    bb="no";
                                break;
                                case "2":
                                    pilihan_jenis_Pakaian="Jas (Jacket)";
                                    harga_perpakaian = 72000;
                                    bb="no";
                                break;
                                case "3":
                                    pilihan_jenis_Pakaian="Kemeja (Shirt)";
                                    harga_perpakaian = 14500;
                                    bb="no";
                                break;
                                case "4":
                                    pilihan_jenis_Pakaian="Rok (Skirt)";
                                    harga_perpakaian = 21000;
                                    bb="no";
                                break;
                                case "5":
                                    pilihan_jenis_Pakaian="Mantel (Coat)";
                                    harga_perpakaian = 27500;
                                    bb="no";
                                break;
                                case "6":
                                    pilihan_jenis_Pakaian="Gaun (Dress)";
                                    harga_perpakaian = 124000;
                                    bb="no";
                                break;
                                case "7":
                                    pilihan_jenis_Pakaian="Rompi (Vest)";
                                    harga_perpakaian = 72000;
                                    bb="no";
                                break;
                                case "8":
                                    pilihan_jenis_Pakaian="Celana (Pant)";
                                    harga_perpakaian = 14500;
                                    bb="no";
                                break;
                                case "9":
                                    pilihan_jenis_Pakaian="Celana Terusan (Jump Suite)";
                                    harga_perpakaian = 40000;
                                    bb="no";
                                break;
                                default:
                                System.out.println("-----MAAF, JENIS PAKAIAN TIDAK TERSEDIA.-----");
                                System.out.println("------------SILAKAN PILIH KEMBALI------------");
                                bb="yes";
                            }
                    }while (bb.equalsIgnoreCase("yes"));
                    
                        for (int i = b; i < a ; i++) {
                          macam_pakaian[i] = pilihan_jenis_Pakaian;
                          hagra_jumlah_pakaian+=harga_perpakaian;
                        }
                        System.out.println("");
                        
	                    do{
	                    	System.out.print("Pilih jenis pakaian kembali (y/n)?");
	                        pilih_kembali = input.nextLine();
		                    if (pilih_kembali.equals("y")) {
		                    	b++;
                                a++;
	                
	                        }else if(pilih_kembali.equals("n")){
                                b++;
                                a++;
	                        	break;
	                        }else{
	                        	System.out.println("Masukan Yang Anda beri, Salah\n");
	                        }
	                    }while (!pilih_kembali.equals("n") && !pilih_kembali.equals("y"));
                }
                while (pilih_kembali.equalsIgnoreCase(yes)); 
                System.out.println("");
                double berat ;
                do {
                    System.out.print("MASUKKAN BERAT PAKAIAN DALAM SATUAN (KG) : ");
                    berat = input.nextDouble();
                    input.nextLine();
                    if (berat > 200.0 || berat < 0.0) {
                          System.out.println("Berat tidak boleh lebih dari 200KG\n");
                        }
                } while (berat > 200.0 || berat < 0.0);

                String dapat_diskon = "";
                double diskon = 0;
                double harga_kiloan = 0;
                harga_kiloan = harga_paket * berat;
                if((berat) > 5){
                    diskon = (hagra_jumlah_pakaian * 10)/100;
                    diskon = hagra_jumlah_pakaian - diskon + harga_kiloan;
                    dapat_diskon = "--------- SELAMAT ANDA MENDAPATKAN DISKON 10% --------";
                }else{
                    diskon = hagra_jumlah_pakaian + harga_kiloan;
                }

                System.out.println("\n------------------------------------------------");
                System.out.println("-----------------DETAIL PESANAN-----------------");
                System.out.println("------------------------------------------------");
                System.out.println("");
                System.out.println("NAMA : "+nama);
                System.out.println("KOTA ASAL : "+kota_Asal);
                System.out.println("ALAMAT TEMPAT TINGGAL : "+alamat);
                System.out.println("JENIS PAKET : "+pilihan_jenis_Paket);
                System.out.println("JENIS PAKAIAN : ");
                for (int i = 0; i < b ; i++) {
                    System.out.println((i+1)+". "+macam_pakaian[i]);
                }
                System.out.println("BERAT PAKAIAN DALAM SATUAN (KG) : "+berat+" KG");
                System.out.println("");
                System.out.println(dapat_diskon);
                System.out.println(gratisOngkir);
                
                System.out.println("");
                System.out.println("TOTAL HARGA : Rp." + digit.format(diskon));
                System.out.println("\n------------------------------------------------");
                String lanjut_Pembayaran = "";


                do{
                	System.out.print("Lanjut ke pembayaran (y/n)?");
                    lanjut_Pembayaran = input.nextLine();
	                if (lanjut_Pembayaran.equals("y")) {
	                	System.out.println("Pilih Metode Pembayaran:");
	                    System.out.println("1. Tunai");
	                    System.out.println("2. Debit");
	                    String jenis_Pembayaran = "";

	                    do{
			                System.out.print("PILIH METODE PEMBAYARAN : ");
	                        jenis_Pembayaran = input.nextLine();
			                if (jenis_Pembayaran.matches("[a-zA-Z\\s]+")) {
				              System.out.println("Masukan Yang Anda beri, Salah\n");
				            }
			            } while (jenis_Pembayaran.matches ("[a-zA-Z\\s]+"));



	                    switch (jenis_Pembayaran) {
	                        case "1":
	                            System.out.println("SILAHKAN MELAKUKAN PEMBAYARAN MELALUI KURIR");
	                            System.out.println("-----SILAHKAN MENUNGGU BARANG DIANTAR-----");
	                             aaa = "no";
	                            break;
	                    
	                        case "2":
	                            System.out.println("PEMBAYARAN SEDANG DI PROSES---------------");
	                            System.out.println("-----SILAHKAN MENUNGGU BARANG DIANTAR-----");
	                            aaa = "no";
	                            break;
                            default:
                            System.out.println("Masukan Yang Anda beri, Salah\n");
                            break;

	                            
	                    }
		               
		            }else if(lanjut_Pembayaran.equals("n")){
		            	break;
		            }else{
		            	System.out.println("Masukan Yang Anda beri, Salah\n");
                       
	                }
	            }while (!lanjut_Pembayaran.equals("y") && !lanjut_Pembayaran.equals("n"));

                aaa = "no";
            }else{
                System.out.println("\n----------------------------------------------------");
                System.out.println("-----MAAF JASA LAUNDRY TIDAK TERSEDIA DI KOTAMU-----");
                System.out.println("----------------------------------------------------\n");
            }
        }while (aaa.equalsIgnoreCase("yes")); 
        System.out.println("");
        


    }
}
