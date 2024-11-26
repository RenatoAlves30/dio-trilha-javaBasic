public class Controle {
    public static void main(String[] args) {
        
        Smartv smarTv = new Smartv();

        System.out.println(smarTv.tvLigada);
        smarTv.ligarTv();
        System.out.println(smarTv.tvLigada);

        System.out.println(smarTv.volume);
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        System.out.println(smarTv.volume);
        smarTv.diminuirVolume();
        System.out.println(smarTv.volume);

        System.out.println(smarTv.canal);

        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        System.out.println(smarTv.canal);

        smarTv.diminuirCanal();
        System.out.println(smarTv.canal);

        smarTv.escolherCanal(10);
        System.out.println(smarTv.canal);
    }
}
