package com.example.d8m12y21;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.d8m12y21.R;

import java.util.Random;

/**
 * @author		Harel Leibovich
 * @version	1.0 (current version number of program)
 * @since		27/11/2021 (the date of the package the class was added)
 * AlertDialog
 */

public class MainActivity extends AppCompatActivity {
    Button bat,bat2,bat3,bat4,bat5;
    LinearLayout ll;
    AlertDialog.Builder adb;

    int[]colors = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW};
    int place;
    int lastPlace = -1;
    Random ran = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.back);

    }
    /**
     * only text
     * <p>
     */

    public void but1(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("First Button: only text");
        adb.setMessage("hi!");

        AlertDialog ad = adb.create();
        ad.show();
    }
    /**
     * text and icon
     * <p>
     */

    public void but2(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Second Button: text and icon");
        adb.setMessage("batz");


        AlertDialog ad = adb.create();
        ad.show();
    }
    /**
     * text, icon and cancel button
     * <p>
     */
    public void but3(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Third Button: text, icon and button");
        adb.setMessage("one button =>");
        adb.setCancelable(false);
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }
    /**
     * text, icon, cancel button, random background color button
     * <p>
     */
    public void but4(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Fourth Button: text, icon and 2 buttons");
        adb.setMessage("two buttons =>");

        adb.setCancelable(false);
        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                place = ran.nextInt(4);
                while(place == lastPlace){
                    place = ran.nextInt(4);
                }
                lastPlace = place;
                ll.setBackgroundColor(colors[place]);
            }
        });
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();

    }
    /**
     * text, icon, cancel button, random background color button, reset background color button
     * <p>
     */

    public void bat5(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Fifth Button: text, icon and 3 buttons");
        adb.setMessage("buttons =>");
        adb.setCancelable(false);
        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                place = ran.nextInt(4);
                while(place == lastPlace){
                    place = ran.nextInt(4);
                }
                lastPlace = place;
                ll.setBackgroundColor(colors[place]);
            }
        });
        adb.setNeutralButton("reset to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }
    /**
     * create the menu.
     * <p>
     *
     */

}