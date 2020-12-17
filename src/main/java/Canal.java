import java.util.*;
import Exception.*;
public class Canal implements Comparable<Canal> {
    protected Map<Role, List<Utilisateur>> mapping_role_utilisateurs;
    protected Integer ordre;
    protected List<Webhook> webhooks;
    protected String nom;
    protected Map<Role,List<Habilitation>> mapping_role_habilitations;
    protected List<Message> historiques;

    public Canal() {
        mapping_role_utilisateurs = new HashMap<Role, List<Utilisateur>>();
        mapping_role_habilitations = new HashMap<Role,List<Habilitation>>();
        webhooks = new ArrayList<Webhook>();
    }

    public void ecrireMessage(Utilisateur U , Message M) throws ActionNonAutoriseeException{
        Collection<List<Utilisateur>> list= new ArrayList<>();
        Collection<List<Habilitation>> list2= new ArrayList<>();
        list = mapping_role_utilisateurs.values();
        if(list.size() == 0){
         throw new ActionNonAutoriseeException("action n'est pas autorisé");
        }
        list2 = mapping_role_habilitations.values();
        for (int i = 0; i < list2.size(); i++) {

        }

    }

    @Override
    public int compareTo(Canal o) {
        return nom.compareTo(o.nom);
    }

    public Map<Role, List<Utilisateur>> getMapping_role_utilisateurs() {
        return mapping_role_utilisateurs;
    }

    public Map<Role, List<Habilitation>> getMapping_role_habilitations() {
        return mapping_role_habilitations;
    }

    public List<Message> getHistoriques() {
        List<Message> A = new ArrayList<Message>();
        return A;
    }
}
