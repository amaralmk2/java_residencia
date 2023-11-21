package exercicio_pratico1;

import java.time.LocalDate;
import java.time.Period;

public class cliente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public cliente(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        mostrarDataNascimento();
        System.out.println("Idade: " + calcularIdade() + " anos");
    }

    public void mostrarDataNascimento() {
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }
    
    public static void main(String[] args) {
        cliente clienteExemplo = new cliente("alexandre", "amaral", "1993-02-11");
        clienteExemplo.mostrarDados();
        
    }
}