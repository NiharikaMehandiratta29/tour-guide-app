package com.example.android.tourguideapp;

public class Tour {

    private String mTitle;
    private String mSummary;
    private int mDescription;
    private int mImage;

    public Tour(String title, String summary, int description, int image) {
        mTitle = title;
        mSummary = summary;
        mDescription = description;
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSummary() {
        return mSummary;
    }
    public  int getDescription(){
        return mDescription;
    }

    public int getImage(){
        return mImage;
    }
}
