package Trabajo;

public class Mano_GSA {

	private String Color_GSA;
	private int Garra_GSA;
	
	public String getColor_GSA() {
		return Color_GSA;
	}
	public void setColor_GSA(String color_GSA) {
		Color_GSA = color_GSA;
	}
	public int getGarra_GSA() {
		return Garra_GSA;
	}
	public void setGarra_GSA(int garra_GSA) {
		Garra_GSA = garra_GSA;
	}
	
	public void Apretar_GSA() {
		System.out.println("El robot empezó a apretar");
	}
}
