package com.m2i.med.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "medical", catalog = "")
public class UserEntity {
    private int id;
    private String email;
    private String roles;
    private String password;
    private String name;
    private String photouser;
    private String userResetpasstoken;
    private Timestamp userResetpassdate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "roles")
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "photouser")
    public String getPhotouser() {
        return photouser;
    }

    public void setPhotouser(String photouser) {
        this.photouser = photouser;
    }

    @Basic
    @Column(name = "user_resetpasstoken")
    public String getUserResetpasstoken() {
        return userResetpasstoken;
    }

    public void setUserResetpasstoken(String userResetpasstoken) {
        this.userResetpasstoken = userResetpasstoken;
    }

    @Basic
    @Column(name = "user_resetpassdate")
    public Timestamp getUserResetpassdate() {
        return userResetpassdate;
    }

    public void setUserResetpassdate(Timestamp userResetpassdate) {
        this.userResetpassdate = userResetpassdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && Objects.equals(email, that.email) && Objects.equals(roles, that.roles) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(photouser, that.photouser) && Objects.equals(userResetpasstoken, that.userResetpasstoken) && Objects.equals(userResetpassdate, that.userResetpassdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, roles, password, name, photouser, userResetpasstoken, userResetpassdate);
    }
}
