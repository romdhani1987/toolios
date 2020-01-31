package fr.romdhani.aymen.toolios.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aromdhani
 */
public class User implements Serializable {
    private String fName ;
    private String lName ;
    private String login ;
    private String email ;
    private String passWord;
    private User header ;
    private List<UserFunction> functionList ;
    private List<UserResponsabilty> responsabiltyList ;

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

    public User getHeader() {
        return header;
    }

    public void setHeader(User header) {
        this.header = header;
    }

    public List<UserFunction> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<UserFunction> functionList) {
        this.functionList = functionList;
    }

    public List<UserResponsabilty> getResponsabiltyList() {
        return responsabiltyList;
    }

    public void setResponsabiltyList(List<UserResponsabilty> responsabiltyList) {
        this.responsabiltyList = responsabiltyList;
    }
}
