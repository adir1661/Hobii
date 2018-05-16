package com.hobii.model.entitiy;

/**
 * Created by Adir on 5/16/2018.
 */

public class User {
    public String id;
    public String email;
    public String name;
    public String phone;
    public String image;
    public long prestige;
    public long score;

    public User(String name, long score) {
        this.name =name;
        this.score = score;
    }

    public User(User other) {
        this.id = other.id;
        this.email = other.email;
        this.name = other.name;
        this.phone = other.phone;
        this.image = other.image;
        this.prestige = other.prestige;
        this.score = other.score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getPrestige() {
        return prestige;
    }

    public void setPrestige(long prestige) {
        this.prestige = prestige;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}
