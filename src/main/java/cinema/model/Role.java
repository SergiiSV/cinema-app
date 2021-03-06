package cinema.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private RoleName name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName roleName) {
        this.name = roleName;
    }

    public enum RoleName {
        ADMIN("ADMIN"),
        USER("USER");

        private String roleName;

        RoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleName() {
            return roleName;
        }

        public static RoleName getRoleName(String role) {
            for (RoleName name : RoleName.values()) {
                if (name.getRoleName().equals(role)) {
                    return name;
                }
            }
            return null;
        }
    }
}
