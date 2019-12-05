package com.jsonplaceholder.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class User.
 */
@Generated("com.robohorse.robopojogenerator")
public class User {

    @JsonProperty("website")
    private String website;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("name")
    private String name;

    @JsonProperty("company")
    private Company company;

    @JsonProperty("id")
    private int id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("username")
    private String username;

    /**
     * Set website.
     *
     * @param website the website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Get website string.
     *
     * @return the string
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Set address.
     *
     * @param address the address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Get address address.
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get phone string.
     *
     * @return the string
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName() {
        return name;
    }

    /**
     * Set company.
     *
     * @param company the company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * Get company company.
     *
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get id int.
     *
     * @return the int
     */
    public int getId() {
        return id;
    }

    /**
     * Set email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get email string.
     *
     * @return the string
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get username string.
     *
     * @return the string
     */
    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return
                "User{" +
                        "website = '" + website + '\'' +
                        ",address = '" + address + '\'' +
                        ",phone = '" + phone + '\'' +
                        ",name = '" + name + '\'' +
                        ",company = '" + company + '\'' +
                        ",id = '" + id + '\'' +
                        ",email = '" + email + '\'' +
                        ",username = '" + username + '\'' +
                        "}";
    }
}