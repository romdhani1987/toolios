package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aromdhani
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fName ;
    private String lName ;
    private String login ;
    private String email ;
    private String passWord;
    private Adress adress;
    private Group group;
    private List<User> contactList;
    private List<UserFunction> functionList ;
    private List<UserResponsabilty> responsibilityList;

    public List<User> getContactList() {
        return contactList;
    }

    public void setContactList(List<User> contactList) {
        this.contactList = contactList;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public User() {
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User(String fName, String lName, String login, String email, String passWord) {
        this.fName = fName;
        this.lName = lName;
        this.login = login;
        this.email = email;
        this.passWord = passWord;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

     public List<UserFunction> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<UserFunction> functionList) {
        this.functionList = functionList;
    }

    public List<UserResponsabilty> getResponsibilityList() {
        return responsibilityList;
    }

    public void setResponsibilityList(List<UserResponsabilty> responsabilityList) {
        this.responsibilityList = responsabilityList;
    }
}
