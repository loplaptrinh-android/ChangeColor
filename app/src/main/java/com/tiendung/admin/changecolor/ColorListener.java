package com.tiendung.admin.changecolor;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Admin on 4/23/2015.
 */
public class ColorListener implements View.OnClickListener {

    int color;
    TextView view;

    public ColorListener(int color, TextView view) { /** pass value */
        this.color = color;
        this.view = view;
    }

    public void onClick(View v) {
        view.setBackgroundColor(color);
    }
}