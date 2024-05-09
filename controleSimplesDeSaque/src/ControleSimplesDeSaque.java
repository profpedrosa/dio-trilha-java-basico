import java.util.Scanner;

public class ControleSimplesDeSaque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Qual o limite diário?");
        double limiteDiario = sc.nextDouble();

        
// Crie um loop 'for' para iterar sobre os saques:
        for(int i = 1; i != 0;){

    //Solicite ao usuário o valor do saque:
            System.out.println("Qual o valor do Saque?");
            double saque = sc.nextDouble();

            if(saque == 0){
                System.out.println("Transacoes encerradas.");
                i = 0;
                break;
            }

            if(saque < limiteDiario){
                limiteDiario -= saque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                i = 0;
            }
      

        }
      
        sc.close();
    }
}