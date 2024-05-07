package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.print.attribute.TextSyntax;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       
        //selecaoCandidatos();
        //imprimirSelecionados();
        
        String[] candidatos = {"FELIPE", "MARCIA", "JÚLIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JÚLIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.printf("O candidato de nº %d é o %s\n", indice+1, candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JÚLIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato(a) %s solicitou esse valor de salário: %.2f\n", candidato, salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.printf("O candidato(a) %s foi selecionado para a valga\n", candidato);
                candidatosSelecionados ++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }else{
            if(salarioBase == salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
            }else{
                System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
            }

        }

    }
}
