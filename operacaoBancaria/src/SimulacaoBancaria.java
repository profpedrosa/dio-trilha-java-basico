import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 


            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Encerrar");
                  
            int opcao = sc.nextInt();
            
            if (opcao == 0) {
              System.out.println("Programa encerrado.");
              break; // Sai do loop
          }
            
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
        switch(opcao){
        
           case 1:
             System.out.println("Informe o valor do depósito: " );
             saldo += sc.nextDouble();
             System.out.printf("Saldo atual: %.1f\n", saldo);
             break;
             
             case 2:
               System.out.println("Informe o valor do saque: " );
               double saque = sc.nextDouble();
               if(saque > saldo){
                 System.out.println("Saldo insuficiente.");
                break;
               }else{
                saldo-=saque;
                System.out.printf("Saldo atual: %.1f \n", saldo);
               }
               break;
               
               case 3:
                 System.out.printf("Saldo atual: %.2f \n", saldo);
               break;
              // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
            
        }
        sc.close();
    }
    
}