package application;
import aparelho.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone meuIPhone = new IPhone();
        
        // Reprodutor Musical
        meuIPhone.tocarMusica("Iron_Maiden1.mp3");
        meuIPhone.pausarMusica();
        meuIPhone.pararMusica();
        
        // Aparelho Telefônico
        meuIPhone.ligar("1234567897");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Navegador na Internet
        meuIPhone.exibirPagina("https://www.dio.me/");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
