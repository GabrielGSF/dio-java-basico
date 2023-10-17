package apps;
public abstract class ServicoMensagemInstantaneo {
    
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    //Métodos privados visiveis somente a classe
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a Internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
    
}
