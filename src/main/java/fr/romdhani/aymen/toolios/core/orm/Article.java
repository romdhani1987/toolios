package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author aromdhani
 */
@Entity
@Table(name = "article")
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String  description;

    @Column(name = "price_ht")
    private Double priceHt;

    @Column(name = "price_ttc")
    private Double  priceTtc;

    @ManyToOne
    @JoinColumn(name = "provider_account_id", referencedColumnName = "id")
    private ProviderAccount  providerAccount;

    @ManyToOne
    @JoinColumn(name = "article_category_id", referencedColumnName = "id")
    private ArticleCategory articleCategory;

    @Column(name = "serialized_properties")
    private String serializedProperties;

    // bi-directional many-to-one association to Document
    @OneToMany(mappedBy = "article")
    private Set<UserOrder> ordersSet;

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPriceHt() {
        return priceHt;
    }

    public void setPriceHt(Double priceHt) {
        this.priceHt = priceHt;
    }

    public Double getPriceTtc() {
        return priceTtc;
    }

    public void setPriceTtc(Double priceTtc) {
        this.priceTtc = priceTtc;
    }

    public ProviderAccount getProviderAccount() {
        return providerAccount;
    }

    public void setProviderAccount(ProviderAccount providerAccount) {
        this.providerAccount = providerAccount;
    }

    public ArticleCategory getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(ArticleCategory articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getSerializedProperties() {
        return serializedProperties;
    }

    public void setSerializedProperties(String serializedProperties) {
        this.serializedProperties = serializedProperties;
    }

    public Set<UserOrder> getOrdersSet() {
        return ordersSet;
    }

    public void setOrdersSet(Set<UserOrder> ordersSet) {
        this.ordersSet = ordersSet;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priceHt=" + priceHt +
                ", priceTtc=" + priceTtc +
                ", providerAccount=" + providerAccount +
                ", articleCategory=" + articleCategory +
                ", serializedProperties='" + serializedProperties + '\'' +
                ", ordersSet=" + ordersSet +
                '}';
    }
}
