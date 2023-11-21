package exercicio02_aula;

public class Main {

	public static void main(String[] args) {
		
		MediaPonderada ponderada = new MediaPonderada();
		
		
		float num01 = 15, num02 = 10, num03 = 10, ps1 = 3, ps2 = 2, ps3 = 2;
		System.out.println(ponderada.tirarMedia(num01,num02,num03,ps1,ps2,ps3));

	}

}