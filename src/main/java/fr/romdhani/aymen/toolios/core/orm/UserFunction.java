package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;

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

  }


