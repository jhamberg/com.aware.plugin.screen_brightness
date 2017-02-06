package com.aware.plugin.screen_brightness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.aware.utils.IContextCard;

public class ContextCard implements IContextCard {

    //Constructor used to instantiate this card
    public ContextCard() {}

    @Override
    public View getContextCard(Context context) {
        //Load card layout
        View card = LayoutInflater.from(context).inflate(R.layout.card, null);
        TextView text = (TextView) card.findViewById(R.id.hello);

        text.setText("Under construction");

        //Initialize UI elements from the card
        //Set data on the UI

        //Return the card to AWARE/apps

        return card;
    }
}