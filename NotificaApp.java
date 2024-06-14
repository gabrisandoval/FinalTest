public class NotificaApp extends Notifica{

    public NotificaApp(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public void invia() {
        System.out.println("NotidicaApp inviato. Controlla il telefono");
    }

}
