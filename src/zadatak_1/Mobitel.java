package zadatak_1;

import java.util.Arrays;

public class Mobitel {
	
	private String proizvodjac;
	private String model;
	private int brzinaProcesora;
	private int brojJezgriProcesora;
	private int kolicinaRamMemorije;
	private int kolicinaMemorije;
	private int brojMegapikselaKamere;
	private String[] nizInstaliranihAplikacija;
	
	public Mobitel(String proizvodjac, String model, int brzinaProcesora, int brojJezgriProcesora, int kolicinaRamMemorije, int kolicinaMemorije, int brojMegapiikselaKamere) {
		this.proizvodjac=proizvodjac;
		this.model=model;
		this.brzinaProcesora=brzinaProcesora;
		this.brojJezgriProcesora=brojJezgriProcesora;
		this.kolicinaRamMemorije=kolicinaRamMemorije;
		this.kolicinaMemorije=kolicinaMemorije;
		this.brojMegapikselaKamere=brojMegapiikselaKamere;
		this.nizInstaliranihAplikacija=new String[20];
	}
	
	public String ispisiSpecifikaciju() {
		return "Mobitel [" + (proizvodjac != null ? "proizvodjac=" + proizvodjac + ", " : "")
				+ (model != null ? "model=" + model + ", " : "") + "brzinaProcesora=" + brzinaProcesora
				+ ", brojJezgriProcesora=" + brojJezgriProcesora + ", kolicinaRamMemorije=" + kolicinaRamMemorije
				+ ", kolicinaMemorije=" + kolicinaMemorije + ", brojMegapikselaKamere=" + brojMegapikselaKamere + ", "
				+ (nizInstaliranihAplikacija != null
						? "nizInstaliranihAplikacija=" + Arrays.toString(nizInstaliranihAplikacija)
						: "")
				+ "]";
	}
	
	public void instalirajAplikaciju(String imeAplikacije) {
		for(int i=0; i<nizInstaliranihAplikacija.length; i++)
			if(nizInstaliranihAplikacija[i]==null) {
				nizInstaliranihAplikacija[i]=imeAplikacije; 
				break;
			}
	}
	
	public void obrisiAplikaciju(String imeAplikacije) {
		for(int i=0; i<nizInstaliranihAplikacija.length; i++)
			if(imeAplikacije.equalsIgnoreCase(nizInstaliranihAplikacija[i])) {
				nizInstaliranihAplikacija[i]=null;
				break;
			}
	}
	
	public void ispisiInstaliraneAplikacije() {
		for (int i=0; i<nizInstaliranihAplikacija.length; i++)
			System.out.print(nizInstaliranihAplikacija[i] + " ");
	}
	
	public void ubaciSDKarticu(int kolicinaMemorije) {
		this.kolicinaMemorije+=kolicinaMemorije;
	}
	
	

}
