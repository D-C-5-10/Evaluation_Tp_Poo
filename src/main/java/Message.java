public class Message implements Destinataire {
    protected Utilisateur auteur;
    protected Destinataire destinaire;
    protected String texte;

    public Utilisateur getAuteur() {
        return auteur;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public Destinataire getDestinaire() {
        return destinaire;
    }


    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    @Override
    public void setDestinaire(Canal c) {

    }
}
