package com.pink.anubasketball.model;

import java.io.Serializable;
import java.util.Date;

public class CompetitionManager implements Serializable {
    /**
     * CREATE TABLE `anubasketball`.`competition_manager`( 
     * pk_id int auto_increment,
     * gmt_create date not null, 
     * gmt_modified date not null, 
     * uk_username varchar(20) not null unique, 
     * password varchar(20) not null, 
     * first_name varchar(20),
     * last_name varchar(20),
     * primary key (pk_id));
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private Date createTime;
    private Date modifiedTime;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getModifiedTime() {
        return modifiedTime;
    }
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
   
}
