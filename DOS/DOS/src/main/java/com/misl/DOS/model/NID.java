package com.misl.DOS.model;
import javax.persistence.*;

@Entity
@Table(name = "usersNID")
public class NID {

    private long id;
    private long idN;
    private long userID;
    private String name;
    private String fatherName;
    private String motherName;
    private String dateOfBirth;
    private String filePath;

    public NID() {

    }

    public NID(long idN,String name, String fatherName,String motherName,String dateOfBirth) {
        this.name=name;
        this.fatherName = fatherName;
        this.motherName= motherName;
        this.dateOfBirth=dateOfBirth;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "idN", nullable = false)
    public long getIdN() {
        return idN;
    }
    public void setIdN(long idN) {
        this.idN = idN;
    }
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "userID", nullable = false)
    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "fatherName", nullable = false)
    public String getfatherName() {
        return fatherName;
    }
    public void setfatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Column(name = "motherName", nullable = false)
    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Column(name = "dateOfBirth", nullable = false)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "filePath", nullable = true)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "UserNid [id=" + id + ", NID Number=" + idN +", User Id="+ userID + ", Name=" + name + ", father's " +
                "Name=" + fatherName + ", Mother's name=" + motherName + ", Date Of Birth =" + dateOfBirth+"]";
    }
}
