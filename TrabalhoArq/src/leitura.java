import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class leitura {

	public static void main(String[] args) {
		try {
		Scanner ler = new Scanner(new FileReader("c:\\arquivo.txt")).useDelimiter(" ");
		while (ler.hasNext()) {
			String intruc = ler.next();
			String regist1 = ler.next();
			String regist2 = ler.next();
			String regist3 = ler.next();
			
			System.out.println(intruc);
			System.out.println(regist1);
			System.out.println(regist2);
			System.out.println(regist3);
		
		}
		ler.close();
		}catch(IOException e){
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}	
		}
		
		
		
	}