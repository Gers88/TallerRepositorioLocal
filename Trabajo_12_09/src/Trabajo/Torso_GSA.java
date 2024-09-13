package Trabajo;

public class Torso_GSA {
	
	private String Forma_GSA;
	public String getForma_GSA() {
		return Forma_GSA;
	}
	public void setForma_GSA(String forma_GSA) {
		Forma_GSA = forma_GSA;
	}
	public String getColor_GSA() {
		return Color_GSA;
	}
	public void setColor_GSA(String color_GSA) {
		Color_GSA = color_GSA;
	}
	private String Color_GSA;
	
	public void Girar_GSA() {
		System.out.println("El robot comenzó a girar su torso");
	}

}
