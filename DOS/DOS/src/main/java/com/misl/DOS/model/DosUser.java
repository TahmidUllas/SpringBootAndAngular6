package com.misl.DOS.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class DosUser {

    private long id;
    private String name;
    private String emailId;

    public DosUser() {

    }

    public DosUser(String name, String emailId) {
        this.name=name;
        this.emailId = emailId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "email", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", Name=" + name + ", emailId=" + emailId + "]";
    }

}