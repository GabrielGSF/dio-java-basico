package apps;
public class FacebookMessenger extends ServicoMensagemInstantaneo {

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Facebook");    
    }

}
