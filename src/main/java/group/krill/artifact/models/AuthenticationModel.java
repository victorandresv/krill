package group.krill.artifact.models;

import javax.persistence.*;

@Entity
@Table(name = "authentication")
public class AuthenticationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String user;
    private String pass;

    public AuthenticationModel() { }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
