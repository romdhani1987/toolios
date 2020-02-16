package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "action_purchase")
public class ActionPurchase extends UserAction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    // bi-directional many-to-many association
    @ManyToMany
    @JoinTable(name = "action_purchase_order_map", joinColumns = { @JoinColumn(name = "action_purchase_id") }, inverseJoinColumns = { @JoinColumn(name = "user_order_id") })
    private Set<UserOrder> userOrdersSet;

    public ActionPurchase() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Set<UserOrder> getUserOrdersSet() {
        return userOrdersSet;
    }

    public void setUserOrdersSet(Set<UserOrder> userOrdersSet) {
        this.userOrdersSet = userOrdersSet;
    }

    @Override
    public String toString() {
        return "ActionPurchase{" +
                "id=" + id +
                ", userOrdersSet=" + userOrdersSet +
                '}';
    }
}
