package fr.romdhani.aymen.toolios.core.orm;

import javax.persistence.*;
import java.util.Set;

/**
 * @author aromdhani
 */

@Entity
@Table(name = "article_category")
public class ArticleCategory {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    // bi-directional many-to-one association to Document
    @OneToMany(mappedBy = "articleCategory")
    private Set<Article> articles;

    public ArticleCategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "ArticleCategory{" +
                "id=" + id +
                ", articles=" + articles +
                '}';
    }
}
