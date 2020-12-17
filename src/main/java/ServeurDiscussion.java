import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServeurDiscussion {
    protected Map<Role, List<Utilisateur>> mapping_role_utilisateurs;
    protected List<Canal> canaux;
    protected String nom;
    protected Map<Role, List<Habilitation>> mapping_role_habilitations;

    public ServeurDiscussion() {
        mapping_role_utilisateurs = new HashMap<Role, List<Utilisateur>>();
        mapping_role_habilitations = new HashMap<Role,List<Habilitation>>();
    }
}
