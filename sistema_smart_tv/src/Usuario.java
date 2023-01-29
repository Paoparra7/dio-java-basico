public class Usuario {
    public static void main(String[] args) throws Exception {
        
       
        SmartTv smartTv = new SmartTv();
                                   
        System.out.println("TV encencida?: " + smartTv.ligada);
        
        smartTv.ligar();
        System.out.println("Despues de prender > TV encencida?: " + smartTv.ligada);
        
        System.out.println("Volumen actual: " + smartTv.volume);
        smartTv.aumentarVolumen();
        System.out.println("Despues de subir volumen > Volumen Actual es: " + smartTv.volume);

        smartTv.disminuirVolumen();
        smartTv.disminuirVolumen();
        smartTv.disminuirVolumen();
        smartTv.aumentarVolumen();
        System.out.println("Despues bajar y subir volumen > Volumen Actual es: " + smartTv.volume);

        System.out.println("Canal actual: " + smartTv.canal);
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Despues de aumentar dos veces el canal: " + smartTv.canal);

        smartTv.disminuirCanal();
        System.out.println("Despues de disminuir canal: " + smartTv.canal);

        smartTv.mudarCanal(7);
        System.out.println("Canal actual despues de cambiarlo manualmente es: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Despues de apagar > TV encencida?: " + smartTv.ligada);

        
    }
}
