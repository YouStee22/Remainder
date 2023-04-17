package Allegro;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Thank you for your purchase " + user.getName());
    }
}
