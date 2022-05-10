package program;
import entities.Porta;
import java.util.Scanner;

public class MainPorta {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Porta porta = new Porta(true, null, 0, 0, 0);
		
			System.out.println("Crie uma porta...");
			System.out.println();
			
			System.out.print("Insira a altura da porta (cm): ");
			porta.dimensaoX = sc.nextDouble();
			System.out.println();
			System.out.print("Insira a largura da porta (cm): ");
			porta.dimensaoY = sc.nextDouble();
			System.out.println();
			System.out.print("Insira a profundidade da porta (cm): ");
			porta.dimensaoZ = sc.nextDouble();
			System.out.println();
			
			while (true) {
			System.out.print("O que deseja fazer?\n1 - pintar a porta\n2 - Abrir a porta\n3- Fechar a porta\n4- verficar se a porta está aberta\n5 - Relatório da porta\n6 - Encerrar aplicação\n>>> ");
			char res = sc.next().charAt(0);
			System.out.println();
			
			if (res == '1') {
				System.out.print("Insira a cor para pintar a porta: ");
				sc.nextLine();
				porta.cor = sc.next();
				porta.pinta(porta.cor);
				System.out.println();
			}
			else if (res == '2') {
				porta.abre();
				System.out.println();
			}
			else if (res == '3') {
				porta.fecha();
				System.out.println();
			}
			else if (res == '4') {
				System.out.println(porta.estaAberta());
				System.out.println();
			}
			else if (res == '5') {
				System.out.println("A porta criada possui:\n" + porta.dimensaoX + "cm de altura;\n" + porta.dimensaoY + "cm de largura;\n" + porta.dimensaoZ + "cm de grossura;\nEstá pintada na cor " + porta.cor + ";\n" + porta.estaAberta() + ".");
				System.out.println();
			}
			else if (res == '6') {
				System.out.println("Encerrando o programa...");
				break;
			}
			else {
				System.out.println("Valor inválido, insira novamente...");
				System.out.println();
				continue;
			}
		}
	sc.close();
	}
}
