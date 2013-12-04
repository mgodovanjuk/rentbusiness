package com.rentbusiness.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by Mykhailo_Hodovaniuk on 12/2/13.
 */
@Embeddable
public class UserDescription implements Serializable {
    private String companyName;
    private String phone;
    private String contactPersonName;
    @Embedded
    private Address address;
    private String details;

    public UserDescription() {
    }

    public UserDescription(String companyName, String phone, String contactPersonName, Address address, String details) {
        this.companyName = companyName;
        this.phone = phone;
        this.contactPersonName = contactPersonName;
        this.address = address;
        this.details = details;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
