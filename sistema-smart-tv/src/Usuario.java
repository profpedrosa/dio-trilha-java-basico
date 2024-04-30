public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.printf("TV ligada? %b\n",smartTv.ligada);
        System.out.printf("Canal atual: %d\n",smartTv.canal);
        System.out.printf("Volume atual: %d\n",smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.printf("Volume atual: %d\n",smartTv.volume);

        System.out.printf("Canal atual: %d\n",smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.printf("Canal atual: %d\n",smartTv.canal);

        smartTv.ligar();
        System.out.printf("Novo status -> TV ligada? %b\n",smartTv.ligada);

        smartTv.desligar();
        System.out.printf("Novo status -> TV ligada? %b\n",smartTv.ligada);


    }
}
