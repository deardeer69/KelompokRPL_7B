import java.util.*;



public class gameOnline{
	public static void main(String[] args) {
		


		System.out.println("~~~~~~~~~~~~~~~(`WELCOME`)~~~~~~~~~~~~~~~");
		System.out.println ("\tProgram TopUp Game Online");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");

		System.out.println("\t\tSelamat Datang Di TT (TyaTopup)");

		Scanner scan = new Scanner(System.in);

		int pilih,pesan = 0,pesan1;
		int pesan2,pesan3;
		int tot,p1;
		int itung1 =0,itung2=0,itung3=0;
		String nama = "",noHp ="",tgl="";


		do{
					System.out.println("Menu Utama :");
					System.out.println("1. catat pemesanan");
					System.out.println("2. daftar Game");
					System.out.println("3. cetak pesanan");
					System.out.println("4. keluar");

					System.out.print("pilihan menu :" +" ");
					pilih = scan.nextInt();
					System.out.println("");

					switch (pilih) {
						case 1:
							do{
							System.out.print("Nama pemesan :"+" ");
							nama = scan.next();
							}while(nama.isEmpty());
							do{
							System.out.print("No.telp :" +" ");
							noHp = scan.next();
							}while(noHp.isEmpty());
							System.out.print("Tanggal Pesanan :" +" ");
							tgl = scan.next();
							int lo = Integer.parseInt(tgl.substring(0,2));
							int li = Integer.parseInt(tgl.substring(3,5));
							int lu = Integer.parseInt(tgl.substring(6,9));
							while(lo > 32 || li > 13 || lu >2018){
								System.out.println("Data infalid");
								System.out.print("Tanggal Pesanan :" +" ");
								tgl = scan.next();
							}	
							System.out.println("");

							case 2:
							int lul;
								do{
								System.out.println("");
								System.out.println("1. Free Fire");
								System.out.println("2. Mobile Legend");
								System.out.println("3. PUBG Mobile");
								System.out.println("4. Kembali");
								System.out.println("");
								System.out.print("pilihan menu :" +" ");
								lul = scan.nextInt();
								System.out.println("");

								
								System.out.println("");
								if (lul == 4) {
									break;
								}else if (lul == 1) {
									System.out.println("Free Fire");
									System.out.println("1.50     Rp. 15.000");
									System.out.println("2.100    Rp. 40.000");
									System.out.println("3.1000   Rp. 90.000");
									System.out.println("4.50000  RP. 100.000");
									System.out.println("5.Kembali kemenu sebelumnya");
									System.out.print("pesanan :"+" ");
									pesan = scan.nextInt();
									while(pesan >5 || pesan <1){
									System.out.println("");
									System.out.println("perintah tidak di kenal");
									System.out.println("Free Fire");
									System.out.println("1.50     Rp. 15.000");
									System.out.println("2.100    Rp. 40.000");
									System.out.println("3.1000   Rp. 90.000");
									System.out.println("4.50000  RP. 100.000");
									System.out.println("5.Kembali kemenu sebelumnya");
									System.out.print("pesanan :"+" ");
									pesan = scan.nextInt();
									} if (pesan ==5){
										break;
									}
									System.out.print("jumlah pesanan :"+" ");
									itung1 = scan.nextInt();
									System.out.print("Kembali Kemenu Sebelumnya (Y/T) ?"+" ");
									String back = scan.next();
									while(!back.equals("y") && !back.equals("Y") && !back.equals("t") && !back.equals("T")){
									System.out.println("");
									System.out.println("Perintah TIdak di kenal");
									System.out.println("");
									System.out.print("Kembali Kemenu Sebelumnya (Y/T) ?"+" ");
									back = scan.next();
									}
								}else if (lul == 2) {
									System.out.println("Mobile Legend");
									System.out.println("1.50     Rp. 15.000");
									System.out.println("2.100    Rp. 40.000");
									System.out.println("3.1000   Rp. 90.000");
									System.out.println("4.50000  RP. 100.000");
									System.out.println("5.Kembali kemenu sebelumnya");
									System.out.print("pesanan :"+" ");
									pesan1 = scan.nextInt();
									while(pesan1 >5 || pesan1 <1){
									System.out.println("");
									System.out.println("perintah tidak di kenal");
									System.out.println("Mobile Legend");
									System.out.println("1.50     Rp. 15.000");
									System.out.println("2.100    Rp. 40.000");
									System.out.println("3.1000   Rp. 90.000");
									System.out.println("4.50000  RP. 100.000");
									System.out.println("5.Kembali kemenu sebelumnya");
									System.out.print("pesanan :"+" ");
									pesan1 = scan.nextInt();
									} if (pesan1 ==5){
										break;
									}
									System.out.print("jumlah pesanan :"+" ");
									itung2 = scan.nextInt();
									System.out.print("Kembali Kemenu Sebelumnya (Y/T) ?"+" ");
									String back1 = scan.next();
									while(!back1.equals("y") && !back1.equals("Y") && !back1.equals("t") && !back1.equals("T")){
									System.out.println("");
									System.out.println("Perintah TIdak di kenal");
									System.out.println("");
									System.out.print("Kembali Kemenu Sebelumnya (Y/T) ?"+" ");
									back1 = scan.next();
									}
								}else if (lul == 3) {
									System.out.println("PUBG Mobile");
									System.out.println("1.50     Rp. 15.000");
									System.out.println("2.100    Rp. 40.000");
									System.out.println("3.1000   Rp. 90.000");
									System.out.println("4.50000  RP. 100.000");
									System.out.println("5.Kembali kemenu sebelumnya");
									System.out.print("pesanan :"+" ");
									pesan3 = scan.nextInt();
									while(pesan3 >5 || pesan3 <1){
									System.out.println("");
									System.out.println("perintah tidak di kenal");
									System.out.println("Free Fire");
									System.out.println("1.50     Rp. 15.000");
									System.out.println("2.100    Rp. 40.000");
									System.out.println("3.1000   Rp. 90.000");
									System.out.println("4.50000  RP. 100.000");
									System.out.println("5.Kembali kemenu sebelumnya");
									System.out.print("pesanan :"+" ");
									pesan3 = scan.nextInt();
									} if (pesan3 ==5){
										break;
									}
									System.out.print("jumlah pesanan :"+" ");
									itung3 = scan.nextInt();
									System.out.print("Kembali Kemenu Sebelumnya (Y/T) ?"+" ");
									String back3 = scan.next();
									while(!back3.equals("y") && !back3.equals("Y") && !back3.equals("t") && !back3.equals("T")){
									System.out.println("");
									System.out.println("Perintah TIdak di kenal");
									System.out.println("");
									System.out.print("Kembali Kemenu Sebelumnya (Y/T) ?"+" ");
									back3 = scan.next();
									}
								}
							}// punya do lul
							while(lul !=4);

							case 3:

								String queen = tgl.substring(3,5);
								String $i ="";
								switch(queen){
									case "01": $i ="Januari" ; break; case "07": $i ="JULI"     ;  break; 
									case "02": $i ="Februari"; break; case "08": $i ="Agustus"  ;  break; 
									case "03": $i ="Maret"   ; break; case "09": $i ="September";  break; 
									case "04": $i ="April"   ; break; case "10": $i ="Oktober"  ;  break; 
									case "05": $i ="Mei"     ; break; case "11": $i ="November" ;  break; 
									case "06": $i ="Juni"    ; break; case "12": $i ="Desember" ;  break;

								}

								System.out.println("Nama pemesan :"+" "+nama);
								System.out.println("No.telp :" +" "+noHp);
								System.out.println("Tanggal Pesanan :" +" "+tgl.substring(0,2)+"-"+$i+"-"+tgl.substring(6,10));
								System.out.println("Game :");
								switch (pesan) {
									case 1:
									p1= 15000;
									tot = p1*itung1;
									System.out.println("1. 50"+" "+pesan+" "+"x Rp 15.000 = Rp"+tot);
									case 2:
									p1= 40000;
									tot = p1*itung1;
									System.out.println("1. 50"+" "+pesan+" "+"x Rp 15.000 = Rp"+tot);
									case 3:
									p1= 90000;
									tot = p1*itung1;
									System.out.println("1. 50"+" "+pesan+" "+"x Rp 15.000 = Rp"+tot);
									case 4:
									p1= 100000;
									tot = p1*itung1;
									System.out.println("1. 50"+" "+pesan+" "+"x Rp 15.000 = Rp"+tot);
								}


								/*

								lanjutin aja buat case yang si pesan1 sama pesan3 sama ko sama swicth case yang di atas


								####Semangat xixixi####
								*/
								
					}

		}while (pilih !=4);
		System.out.println("Terima kasih");
	}
}