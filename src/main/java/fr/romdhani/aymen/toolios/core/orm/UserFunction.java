package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author aromdhani
 */
@Entity
@Table(name = "user_function")
public class UserFunction  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @Column(name = "name")
    private String name ;

    @OneToMany(mappedBy = "userFuntion")
    private Set<UserAccount> userAccountSet;

    public UserFunction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserAccount> getUserAccountSet() {
        return userAccountSet;
    }

    public void setUserAccountSet(Set<UserAccount> userAccountSet) {
        this.userAccountSet = userAccountSet;
    }

    @Override
    public String toString() {
        return "UserFunction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


