package com.xyh.domain;

public class Playitems {
    private Integer id;

    private String playproject;

    private String introduce;

    private Integer playtime;

    private String picture;

    private String coordinate;

    private Integer people;

    private String fitpeople;

    private Integer stidegre;

    private Integer fire;

    private Integer lineup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayproject() {
        return playproject;
    }

    public void setPlayproject(String playproject) {
        this.playproject = playproject == null ? null : playproject.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public String getFitpeople() {
        return fitpeople;
    }

    public void setFitpeople(String fitpeople) {
        this.fitpeople = fitpeople == null ? null : fitpeople.trim();
    }

    public Integer getStidegre() {
        return stidegre;
    }

    public void setStidegre(Integer stidegre) {
        this.stidegre = stidegre;
    }

    public Integer getFire() {
        return fire;
    }

    public void setFire(Integer fire) {
        this.fire = fire;
    }

    public Integer getLineup() {
        return lineup;
    }

    public void setLineup(Integer lineup) {
        this.lineup = lineup;
    }
}