package com.calculator30.domain;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

import com.calculator30.R;


public enum Theme {

    THEME_ONE("One", R.string.theme_one, R.drawable.first_pic, R.style.Theme_Calculator30_Version2, "one"),
    THEME_TWO("Two", R.string.theme_two, R.drawable.scnd_pic, R.style.Theme_Calculator30_Version3, "two"),
    THEME_THREE("Three", R.string.theme_three, R.drawable.thrd_pic, R.style.Theme_Calculator30_Version4, "three"),
    THEME_FOUR("Four", R.string.theme_four, R.drawable.forth_pic, R.style.Theme_Calculator30, "four");

    @StringRes
    private final int title;
    @DrawableRes
    private final int img;
    @StyleRes
    private final int theme;

    private final String key;

    Theme(String two, int title, int img, int theme, String key) {
        this.title = title;
        this.img = img;
        this.theme = theme;
        this.key = key;
    }

    public int getTitle() {
        return title;
    }

    public int getImg() {
        return img;
    }

    public int getTheme() {
        return theme;
    }

    public String getKey() {
        return key;
    }
}
