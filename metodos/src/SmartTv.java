public class SmartTv {
    boolean estatus = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarEstatus(String comando) {
        if (comando == "on") {
            estatus = true;
        }
        if (comando == "off") {
            estatus = false;
        }
    }

    public void trocarCanal(int canalNovo) {
        canal = canalNovo;
    }

    public void mudarCanal(String comando) {
        if (comando == ">") {
            canal++;
        }
        if (comando == "<") {
            canal--;
        }
    }

    public void mudarVolume(String comando) {
        if (comando == "+") {
            volume++;
        }
        if (comando == "-") {
            volume--;
        }
    }
}
