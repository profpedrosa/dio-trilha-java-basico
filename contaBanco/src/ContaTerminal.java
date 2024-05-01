import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double saldo = 237.48;

        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();
        sc.nextLine();
        
        System.out.print("Informe o seu nome: ");
        String nomeCliente= sc.nextLine();
           
        System.out.println("----------------------------------");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
