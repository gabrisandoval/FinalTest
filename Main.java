public class Main {
public static void main(String[] args) {
    Email email = new Email("Mirko", "Master in pannacotta");
    SMS sms = new SMS("Mirko", "Master in coding");
    NotificaApp app = new NotificaApp("Mirko", "Master in Teaching");


    email.invia();
    sms.invia();
    app.invia();

}
}
