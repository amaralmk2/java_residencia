package exercicio02_aula;

public class MediaPonderada {
	
	float nota1, nota2, nota3, p1, p2, p3;
	
	public void MediaPonderada(float _nota1, float nota_2, float nota_3, float _p1, float _p2, float _p3){
		this.nota1 = _nota1;
		this.nota2 = _nota2;
		this.nota3 = _nota3;
		this.p1 = _p1;
		this.p2 = _p2;
		this.p3 = _p3;
	}
	
	public float tirarMedia(float nota1, float nota2, float nota3, float p1, float p2, float p3) {
		
		float aux1, aux2, aux3, soma;
		
		aux1 = nota1 * p1;
		aux2 = nota2 * p2;
		aux3 = nota3 * p3;
		
		soma = aux1+aux2+aux3;
		
		return (nota1+nota2+nota3)/ soma;
		
	}

}
