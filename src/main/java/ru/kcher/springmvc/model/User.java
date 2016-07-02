package ru.kcher.springmvc.model;

import javax.persistence.Entity;

@Entity(name = "user_")
public class User extends BaseEntity {
    private String login;
    private String password;
    private String fio;
    private String sex;
    private Integer age;

    public User() {
    }

    public User(String login, String password, String fio, String sex, Integer age) {
        this.login = login;
        this.password = password;
        this.fio = fio;
        this.sex = sex;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + getId() +
                ", login=" + login +
                ", password=" + password +
                ", fio=" + fio +
                ", sex=" + sex +
                ", age=" + age + ']';
    }
}
