public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

public void mudarCanal (int novoCanal){
    canal = novoCanal;
}

public void aumentararCanal(){
    canal++;
}

public void diminuirCanal(){
    canal--;
}

public void aumentarVolume(){
    volume++;
}

public void diminuirVolume(){
    volume--;
}

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    
}

