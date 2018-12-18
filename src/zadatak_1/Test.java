package zadatak_1;

import java.util.Scanner;

public class Test {
	
	static Scanner input=new Scanner(System.in);
	
	public static void install(Mobitel mob) {
		System.out.println("Ime aplikacije koju zelite instalirati?");
		String name=input.nextLine();
		mob.instalirajAplikaciju(name);
	}
	
	public static void uninstall(Mobitel mob) {
		System.out.println("Ime aplikacije koju zelite uninstalirati?");
		String name=input.nextLine();
		mob.obrisiAplikaciju(name);
		System.out.println("checkpiont");
	}
	
	public static void ubaciSDKarticu(Mobitel mob) {
		System.out.println("Kolicina memorije SD kartice");
		int memory=input.nextInt();
		mob.ubaciSDKarticu(memory);
	}

	public static void main(String[] args) {
		Mobitel mob=new Mobitel("Samsung", "S12", 300, 429, 6, 128, 4567123);
		
		int odabir=0;
		
		do {
			System.out.println("Izaberite opciju!");
			System.out.println("1. ispisi specifikacije\n2. instaliraj aplikaciju\n3. obrisi aplikaciju\n4. ispisi instalirane aplikacije\n5. ubaci SD karticu\n6. izlaz");
			odabir=input.nextInt();
			switch (odabir) {
			case 1 : System.out.println(mob.ispisiSpecifikaciju()); break;
			case 2 : install(mob); break;
			case 3 : uninstall(mob); break;
			case 4 : mob.ispisiInstaliraneAplikacije(); break;
			case 5 : ubaciSDKarticu(mob);
			}
		}while(odabir!=6);
		
		input.close();
	}

}
