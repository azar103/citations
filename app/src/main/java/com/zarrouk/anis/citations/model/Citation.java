package com.zarrouk.anis.citations.model;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by Anis Zarrouk on 08/02/2019
 */
public class Citation {

    private String quote;
    private int image;

    public Citation(String quote, int image) {
        this.quote = quote;
        this.image = image;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
