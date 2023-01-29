public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }

    public void disminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;        
    }

    public void aumentarVolumen(){
        volume++;        
    }

    public void disminuirVolumen(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}