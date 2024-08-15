package senhaValidacao;

import java.util.Scanner;

public class ValidarSenha {
	public static void main(String[] args) {
		// System.out.println("olá mundo");

		Scanner scan = new Scanner(System.in);

		String senha = "gbm123@", senhaDg = "";
		int t = 0;
		
		  do {
				t++;
				System.out.println("Digite a senha:");
				senhaDg = scan.nextLine();
				if (senhaDg.equals(senha)) {
					System.out.println("Acesso permitido");

				} else {
					if (!senha.equals(senhaDg) && t == 3) {
						System.out.println("Senha bloqueada");
					} else {
						System.out.println("Senha incorreta, tente novamente");
					}
				}

			} while (t < 3); 
		  
		  /*	
		   
		    Solução utilizando For
		   
		for (t = 0; t < 3; t++) {

			System.out.println("Digite sua senha: ");
			senhaDg = scan.nextLine();

			if (senhaDg.equals(senha) && t <= 3) {
				System.out.println("Você entrou");
				break;
			} else {
				if (!senhaDg.equals(senha) && t == 3) {
					System.out.println("Senha incorreta, tente de novo");
					
				} else {
					System.out.println(" senha bloqueada! ");

				}
			}
		}
 
		*/

	}
}
