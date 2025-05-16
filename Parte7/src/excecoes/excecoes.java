package excecoes;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class excecoes {
	
	public static void executarQuery() throws SQLException
	{
		Connection ligar = DriverManager.getConnection("jdbc://mysql://localhost:33006/basedados", "user", "password");
		Statement stmt = ligar.createStatement();
		stmt.execute("Select * from tabela");
	}
	
	public static void lerFicheiro() throws IOException
	{
		File ficheiro = new File("teste1.txt"); // ciar o objeto que contem o ficheiro
		
		FileReader leitor = new FileReader(ficheiro);
		char caractere;
		int ascii;
		 while ((ascii = leitor.read()) != -1) // Se a leitura der resultado -1 significa que o arquivo chegou ao final
		 {
                caractere = (char)ascii;	    // Faz cast do codigo ascii lido para um caractere
                System.out.print(caractere);	//  Imprime o caractere
         }
		 System.out.println();
	}
	
	public static void dividir() // Esta não precisa de ser lançado o throw no metodo 
	{
		int numerador = 10;
		int denominador = 0;
		
		int resultado = numerador / denominador;
		System.out.println("O resultado da operação é: " + resultado);
	}
	
	public static void objetoNulo() throws NullPointerException
	{
		String texto = null;
		System.out.println(texto.length());
	}
	
	public static void passarValor(String nome) throws IllegalArgumentException
	{
			System.out.println("Nome " + nome + " passado com sucesso!");
	}
	
	public static void vetores()
	{
		int[] num = {1, 2, 3};
		System.out.println(num[4]);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try
	{
		dividir();
	}
	catch(ArithmeticException e)
	{
		System.out.println("Erro de cálculo: " + e.getMessage());
	}
		
	try
	{
		lerFicheiro();
	}
	catch(IOException e)
	{
		System.out.print("Erro ao ler o ficheiro: " + e.getMessage());
		System.out.println();
	}
		
	try
	{
		executarQuery();
	}
	catch (SQLException e)
	{
		System.out.println("Erro na Query: " + e.getMessage());
	}
	
	try
	{
		vetores();
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Erro com o indice do array: " + e.getMessage());
	}

	try
	{
		objetoNulo();
	}
	catch (NullPointerException e)
	{
		System.out.println("Tentativa de aceder a um objeto nulo: " + e.getMessage());
	}
	
	try
	{
		//passarValor();
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("Método inválido: " + e.getMessage());
	}
		
	}
}
