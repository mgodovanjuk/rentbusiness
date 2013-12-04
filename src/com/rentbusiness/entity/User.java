package com.rentbusiness.entity;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Created by Mykhailo_Hodovaniuk on 12/2/13.
 */
@Entity
@Table(name = "\"User\"")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "user_id_seq_gen")
    @SequenceGenerator(name = "user_id_seq_gen", sequenceName = "user_id_seq")
    private Long id;
    @Column
    private String email;
    @Column
    private String password;

    @OneToOne(mappedBy = "user")
    private UserDescription userDescription;

    public User(){

    }

    public User(String email, String password, UserDescription userDescription) {
        this.email = email;
        this.password = password;
        this.userDescription = userDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDescription getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(UserDescription userDescription) {
        this.userDescription = userDescription;
    }
}
