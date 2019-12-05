package com.jsonplaceholder.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The class Posts.
 */
@Generated("com.robohorse.robopojogenerator")
public class Posts {

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonProperty("userId")
    private int userId;

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
     * Set title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get title string.
     *
     * @return the string
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set body.
     *
     * @param body the body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Get body string.
     *
     * @return the string
     */
    public String getBody() {
        return body;
    }

    /**
     * Set user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Get user id int.
     *
     * @return the int
     */
    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return
                "Posts{" +
                        "id = '" + id + '\'' +
                        ",title = '" + title + '\'' +
                        ",body = '" + body + '\'' +
                        ",userId = '" + userId + '\'' +
                        "}";
    }
}