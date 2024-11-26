public class Smartv {
    
    boolean tvLigada = false;
    int volume = 25;
    int canal = 1;

    public void ligarTv () {
        tvLigada = true;
    }

    public void desligarTv() {
        tvLigada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }
}
