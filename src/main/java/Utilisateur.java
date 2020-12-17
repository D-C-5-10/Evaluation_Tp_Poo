import java.util.ArrayList;
import java.util.List;

public class Utilisateur implements Destinataire{
    protected List<ServeurDiscussion> serveurs;
    protected String prenom;
    protected String nom ;
    protected String login;
    protected String motDePasse;
    protected String mail;

    public Utilisateur() {
        serveurs = new ArrayList<ServeurDiscussion>();
    }

    @Override
    public void setDestinaire(Canal c) {

    }
}
