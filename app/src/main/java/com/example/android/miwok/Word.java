package com.example.android.miwok;

/**
 * Created by jakub on 2017-06-17.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int mAudioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
