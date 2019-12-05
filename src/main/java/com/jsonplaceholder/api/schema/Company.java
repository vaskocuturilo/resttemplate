package com.jsonplaceholder.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class Company.
 */
@Generated("com.robohorse.robopojogenerator")
public class Company {

    @JsonProperty("bs")
    private String bs;

    @JsonProperty("catchPhrase")
    private String catchPhrase;

    @JsonProperty("name")
    private String name;

    /**
     * Set bs.
     *
     * @param bs the bs
     */
    public void setBs(String bs) {
        this.bs = bs;
    }

    /**
     * Get bs string.
     *
     * @return the string
     */
    public String getBs() {
        return bs;
    }

    /**
     * Set catch phrase.
     *
     * @param catchPhrase the catch phrase
     */
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    /**
     * Get catch phrase string.
     *
     * @return the string
     */
    public String getCatchPhrase() {
        return catchPhrase;
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

    @Override
    public String toString() {
        return
                "Company{" +
                        "bs = '" + bs + '\'' +
                        ",catchPhrase = '" + catchPhrase + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}