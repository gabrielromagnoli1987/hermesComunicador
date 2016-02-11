package com.romagnoli.gabriel.hermes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class AjustesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
