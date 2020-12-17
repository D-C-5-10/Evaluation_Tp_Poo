import java.net.URL;

public class Webhook {
    private String nom;
    private String description;
    private String nomApplicationAppelante;
    private WebhookAction action;
    private URL myURL ;

    public URL getMyURL() {
        return myURL;
    }

    public void setMyURL(URL myURL) {
        this.myURL = myURL;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomApplicationAppelante() {
        return nomApplicationAppelante;
    }

    public void setNomApplicationAppelante(String nomApplicationAppelante) {
        this.nomApplicationAppelante = nomApplicationAppelante;
    }

    public WebhookAction getAction() {
        return action;
    }

    public void setAction(WebhookAction action) {
        this.action = action;
    }


}
