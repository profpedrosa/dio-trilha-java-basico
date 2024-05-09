import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        double saldo = sc.nextDouble(); 
        double saque = sc.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saque <= saldo){
            System.out.println("Transacao realizada com sucesso.");
        }

            // Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        else if(saque <= saldo + limiteChequeEspecial && saldo + limiteChequeEspecial - saque <= limiteChequeEspecial){
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }else{

                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        

// Fechamos o objeto Scanner para liberar os recursos:
        sc.close(); 
    }
}