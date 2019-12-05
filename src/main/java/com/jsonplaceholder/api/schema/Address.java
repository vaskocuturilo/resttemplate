package com.jsonplaceholder.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class Address.
 */
@Generated("com.robohorse.robopojogenerator")
public class Address {

    @JsonProperty("zipcode")
    private String zipcode;

    @JsonProperty("geo")
    private Geo geo;

    @JsonProperty("suite")
    private String suite;

    @JsonProperty("city")
    private String city;

    @JsonProperty("street")
    private String street;

    /**
     * Set zipcode.
     *
     * @param zipcode the zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * Get zipcode string.
     *
     * @return the string
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Set geo.
     *
     * @param geo the geo
     */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    /**
     * Get geo geo.
     *
     * @return the geo
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     * Set suite.
     *
     * @param suite the suite
     */
    public void setSuite(String suite) {
        this.suite = suite;
    }

    /**
     * Get suite string.
     *
     * @return the string
     */
    public String getSuite() {
        return suite;
    }

    /**
     * Set city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get city string.
     *
     * @return the string
     */
    public String getCity() {
        return city;
    }

    /**
     * Set street.
     *
     * @param street the street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Get street string.
     *
     * @return the string
     */
    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return
                "Address{" +
                        "zipcode = '" + zipcode + '\'' +
                        ",geo = '" + geo + '\'' +
                        ",suite = '" + suite + '\'' +
                        ",city = '" + city + '\'' +
                        ",street = '" + street + '\'' +
                        "}";
    }
}