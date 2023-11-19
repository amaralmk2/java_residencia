package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	private String nome, email, nacionalidade;
	private int qtdePostagem, pontuacao;
	private ArrayList<String> Postagens;
	
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getQtdePostagem() {
		return qtdePostagem;
	}

	public int getPontuacao() {
		return pontuacao;
	}
	public void adicionaPostagem(String post) {
		this.Postagens.add(post);
		this.qtdePostagem++;
	}
	
	public void listarPostagens() {
		System.out.println("Postagens de " + this.nome + ": ");
		//System.out.println(this.Postagens);
		for(int i = 0; i < this.getQtdePostagem(); i++) {
			System.out.println(this.Postagens.get(i));
		}
	}
	
	public Cliente(String nome, String email, String nacionalidade){
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.qtdePostagem = 0;
		this.pontuacao = 0;
		Postagens = new ArrayList<String>();
	}

	public void alteraPontuacao(int delta) {
		this.pontuacao += delta;
		if(this.pontuacao < 0)
		{
			this.pontuacao = 0;
		}
	}

	public static void main(String[] args) {
		String nome, email, nacionalidade, postagem, sn;
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		do {
			System.out.println("Digite nome:");
			nome = sc.nextLine();
			System.out.println("Digite email:");
			email = sc.nextLine();
			System.out.println("Digite nacionalidade:");
			nacionalidade = sc.nextLine();
			
			Cliente cliente = new Cliente(nome, email, nacionalidade);
			listaCliente.add(cliente);
			
			System.out.println("Deseja inserir mais clientes? (sim, nao) :");
			sn = sc.nextLine();
			System.out.println(sn);
			
		} while (sn.equals("sim"));
		
		/*
		String nome, email, nacionalidade, postagem;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nome:");
		nome = sc.nextLine();
		System.out.println("Digite email:");
		email = sc.nextLine();
		System.out.println("Digite nacionalidade:");
		nacionalidade = sc.nextLine();
		
		Cliente cliente = new Cliente(nome, email, nacionalidade);
		System.out.println("Digite uma postagem:");
		postagem = sc.nextLine();
		cliente.adicionaPostagem(postagem);
		cliente.listarPostagens();
		System.out.println(cliente.getQtdePostagem());
		
		System.out.println(cliente.getPontuacao());
		cliente.alteraPontuacao(-10);
		System.out.println(cliente.getPontuacao());
		cliente.alteraPontuacao(25);
		System.out.println(cliente.getPontuacao());
		*/
	}
	
}
