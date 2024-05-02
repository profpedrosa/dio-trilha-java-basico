import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.printf("Doce do valor: %.2f Adicionado no carrinho\n", valorDoce);
            mesada -= valorDoce;
            
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
