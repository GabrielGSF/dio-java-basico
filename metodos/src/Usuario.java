public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Estatus Atual:" + smartTv.estatus);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual ? :" + smartTv.volume);

        System.out.println("-------------------------");
    
        smartTv.mudarEstatus("on");
        System.out.println("Estatus Mudou -> Estatus Atual: " + smartTv.estatus);

        smartTv.mudarEstatus("off");
        System.out.println("Estatus Mudou -> Estatus Atual: " + smartTv.estatus);

        smartTv.mudarEstatus("on");
        System.out.println("Estatus Mudou -> Estatus Atual: " + smartTv.estatus);

        smartTv.trocarCanal(40);
        System.out.println("Novo Canal -> Canal Atual:" + smartTv.canal);

        smartTv.mudarCanal("<");
        System.out.println("Canal Abaixou -> Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(">");
        System.out.println("Canal Aumentou -> Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(">");
        System.out.println("Canal Aumentou -> Canal Atual: " + smartTv.canal);

        smartTv.mudarVolume("-");
        System.out.println("Volume Abaixou -> Canal Atual: " + smartTv.volume);

        smartTv.mudarVolume("+");
        System.out.println("Volume Aumentou -> Canal Atual: " + smartTv.volume);

        smartTv.mudarVolume("+");
        System.out.println("Volume Aumentou -> Canal Atual: " + smartTv.volume);
    }
}
