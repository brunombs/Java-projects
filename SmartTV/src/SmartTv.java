public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume= 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        if (volume >= 100) {
            System.out.println("Volume máximo");
        } else {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        }
    }

    public void abaixarVolume(){
        volume--;
        System.out.println("Volume abaixado para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
