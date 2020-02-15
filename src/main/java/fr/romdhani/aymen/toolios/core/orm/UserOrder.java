package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "user_order")
public class UserOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "quantity")
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    private Article article;

    // bi-directional many-to-many association
    @ManyToMany(mappedBy = "userOrdersSet")
    private Set<ActionPurchase> ActionPurchaseSet;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Set<ActionPurchase> getActionPurchaseSet() {
        return ActionPurchaseSet;
    }

    public void setActionPurchaseSet(Set<ActionPurchase> actionPurchaseSet) {
        ActionPurchaseSet = actionPurchaseSet;
    }

    public UserOrder() {
    }

}
