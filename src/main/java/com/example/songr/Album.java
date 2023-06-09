package com.example.songr;

public class Album {
    private String imageUrl;
    private String title;
    private String artist;
    private int songCount;
    private int length;

    public Album(String imageUrl, String title, String artist, int songCount, int length) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Album{" +
                "imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", length=" + length +
                '}';
    }

}
