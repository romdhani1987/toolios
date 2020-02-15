package fr.romdhani.aymen.toolios.utils;

import fr.romdhani.aymen.toolios.core.orm.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "org.postgresql.Driver");
                settings.put(Environment.URL, "jdbc:postgresql://127.0.0.1:5432/toolios_db");
                settings.put(Environment.USER, "postgres");
                settings.put(Environment.PASS, "postgres");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "create-drop");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(ActionImprovement.class);
                configuration.addAnnotatedClass(ActionPurchase.class);
                configuration.addAnnotatedClass(Activity.class);
                configuration.addAnnotatedClass(Address.class);
                configuration.addAnnotatedClass(Anomaly.class);
                configuration.addAnnotatedClass(Article.class);
                configuration.addAnnotatedClass(ArticleCategory.class);
                configuration.addAnnotatedClass(Company.class);
                configuration.addAnnotatedClass(GroupActivity.class);
                configuration.addAnnotatedClass(Machine.class);
                configuration.addAnnotatedClass(MachineLocation.class);
                configuration.addAnnotatedClass(MachineType.class);
                configuration.addAnnotatedClass(Project.class);
                configuration.addAnnotatedClass(ProviderAccount.class);
                configuration.addAnnotatedClass(Purchase.class);
                configuration.addAnnotatedClass(Request.class);
                configuration.addAnnotatedClass(Response.class);
                configuration.addAnnotatedClass(SimpleUserAccount.class);
                configuration.addAnnotatedClass(SupervisorAccount.class);
                configuration.addAnnotatedClass(UserAccount.class);
                configuration.addAnnotatedClass(UserAction.class);
                configuration.addAnnotatedClass(UserFunction.class);
                configuration.addAnnotatedClass(UserGroup.class);
                configuration.addAnnotatedClass(UserOrder.class);
                configuration.addAnnotatedClass(UserResponsibility.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}

