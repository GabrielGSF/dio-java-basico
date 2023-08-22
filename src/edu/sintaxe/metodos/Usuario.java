package edu.sintaxe.metodos;
public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Estatus Atual:" + smartTv.estatus);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        System.out.println("-------------------------");
    
        smartTv.mudarEstatus("on");
        smartTv.mudarEstatus("off");
        smartTv.mudarEstatus("on");

        smartTv.trocarCanal(40);
        
        smartTv.mudarCanal("<");
        smartTv.mudarCanal(">");
        smartTv.mudarCanal(">");

        smartTv.mudarVolume("-");
        smartTv.mudarVolume("+");
        smartTv.mudarVolume("+");
   
    }
}
