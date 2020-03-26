import java.io.*;
import java.util.Scanner;

public class leitura {
	
	public static void escreve(String instruc, String regist1, String regist2, String regist3 ){
	    try {

	    	FileWriter resultado = new FileWriter("c:\\resultado.txt");
	    	PrintWriter gravaArq = new PrintWriter(resultado);
	    	
	    	gravaArq.printf(instruc);
	    	gravaArq.close();
	    	
	    	
	    }catch(IOException e){
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}
	
	public static void interpreta(String instruc, String regist1, String regist2, String regist3 ){
		
		switch(instruc.toLowerCase()){ 
		/*INICIO DAS INSTRUCOES ARITMETICAS*/
            case "add": 
            	
            	instruc = "100000";
    			break;
    			
            case "addi": 
            	instruc = "001000"; 
                break; 
                
            case "sub": 
                instruc = "100010"; 
                break; 
                
            case "mult": 
                instruc = "011000"; 
                break; 
                
            case "div": 
                instruc = "011010"; 
                break; 
                
            case "neg": 
                instruc = "000000"; 
                break; 
                /*FIM DAS INSTRUCOES ARITMETICAS*/
                /*INICIO DAS INSTRUCOES LOGICAS*/

            case "and": 
                instruc = "100100"; 
                break; 
                
            case "andi": 
                instruc = "001000"; 
                break;
                
            case "or": 
                instruc = "100101"; 
                break;
                
            case "ori": 
                instruc = "001101"; 
                break; 
                
            case "xor": 
                instruc = "100110"; 
                break; 
                
            case "nor": 
                instruc = "100111"; 
                break; 
                
            case "slt": 
                instruc = "101010"; 
                break; 
                
            case "slti": 
                instruc = "001010"; 
                break; 
                
                /*FIM DAS INSTRUCOES LOGICAS*/
                /*INICIO DAS INSTRUCOES DESLOCAMENTO*/
                
            case "sll": 
                instruc = "000000"; 
                break; 
                
            case "slr": 
                instruc = "000010"; 
                break; 
                
                /*FIM DAS INSTRUCOES DESLOCAMENTO*/
                /*INICIO DAS INSTRUCOES ACESSO MEM*/
                
            case "lw": 
                instruc = "100011"; 
                break; 
                
            case "sw": 
                instruc = "101011"; 
                break; 
                
                /*FIM DAS INSTRUCOES ACESSO MEM*/
                /*INICIO DAS INSTRUCOES DESVIO COND*/
            case "beq": 
                instruc = "000100"; 
                break; 
                
            case "bnq": 
                instruc = "000000"; 
                break;
                
                /*FIM DAS INSTRUCOES DESVIO COND*/
                /*INICIO DAS INSTRUCOES DESVIO INCOND*/
                
            case "j": 
                instruc = "000010"; 
                break; 
                
            case "jr": 
                instruc = "001000"; 
                break; 
                
            case "jal": 
                instruc = "000011";
               
                break; 
                
                /*FIM DAS INSTRUCOES DESVIO COND*/
                /*OUTRAS*/
                
            case "nop": 
                instruc = "000000"; 
                
                break; 
                
            default: 
                System.out.println("instru��o nao conhecida"); 
        } 
		
		System.out.println(instruc);

		/*if(instruc.equalsIgnoreCase("add")) {
			instruc = "000000";
			System.out.println(instruc);
		}
		
		
		
		
		
		escreve(instruc, regist1, regist2, regist3);*/
	}
	
	
	
	
	public static void main(String[] args) {
		String instruc = null, regist1 = null, regist2 = null, regist3 = null;
		
		try {
			Scanner scanner = new Scanner(new FileReader("c:\\arquivo.txt"));
			Scanner ler = scanner.useDelimiter(" ");
			while (ler.hasNext()) {
				instruc = ler.next();
				regist1 = ler.next();
				regist2 = ler.next();
				regist3 = ler.next();
			
				System.out.println(instruc);
				System.out.println(regist1);
				System.out.println(regist2);
				System.out.println(regist3);
				
			}
			ler.close();
			scanner.close();
			}catch(IOException e){
				System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			}

		interpreta(instruc, regist1, regist2, regist3);
	}	
	}

