
public class SmartTv {
    boolean estatus = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarEstatus(String comando) {
        if (comando == "on") {
            estatus = true;
            System.out.println("Estatus Mudou -> Estatus Atual: " + estatus);
        }
        if (comando == "off") {
            estatus = false;
            System.out.println("Estatus Mudou -> Estatus Atual: " + estatus);
        }
    }

    public void trocarCanal(int canalNovo) {
        canal = canalNovo;
        System.out.println("Novo Canal -> Canal Atual:" + canal);
    }

    public void mudarCanal(String comando) {
        if (comando == ">") {
            canal++;
            System.out.println("Canal Aumentou -> Canal Atual: " + canal);
        }
        if (comando == "<") {
            canal--;
            System.out.println("Canal Abaixou -> Canal Atual: " + canal);
        }
    }

    public void mudarVolume(String comando) {
        if (comando == "+") {
            volume++;
            System.out.println("Volume Aumentou -> Volume Atual: " + volume);
        }
        if (comando == "-") {
            volume--;
            System.out.println("Volume Abaixou -> Volume Atual: " + volume);
        }
    }
}
