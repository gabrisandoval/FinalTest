public class SMS extends Notifica{

    public SMS(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        System.out.println("SMS inviato. Controlla il telefono");
    }

}
