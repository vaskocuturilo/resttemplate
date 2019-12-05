package com.jsonplaceholder.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class Geo.
 */
@Generated("com.robohorse.robopojogenerator")
public class Geo {

    @JsonProperty("lng")
    private String lng;

    @JsonProperty("lat")
    private String lat;

    /**
     * Set lng.
     *
     * @param lng the lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * Get lng string.
     *
     * @return the string
     */
    public String getLng() {
        return lng;
    }

    /**
     * Set lat.
     *
     * @param lat the lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * Get lat string.
     *
     * @return the string
     */
    public String getLat() {
        return lat;
    }

    @Override
    public String toString() {
        return
                "Geo{" +
                        "lng = '" + lng + '\'' +
                        ",lat = '" + lat + '\'' +
                        "}";
    }
}