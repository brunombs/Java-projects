public class Usuario {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(45);
        System.out.println("Canal escolhido: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal anterior: " + smartTv.canal-- + " Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal anterior: " + smartTv.canal++ + " Canal atual: " + smartTv.canal);

        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Ligado?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Ligado?: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.abaixarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}