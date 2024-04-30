public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.printf("TV ligada: %b\n",smartTv.ligada);
        System.out.printf("Canal atual: %d\n",smartTv.canal);
        System.out.printf("Volume atual: %d\n",smartTv.volume);
    }
}
