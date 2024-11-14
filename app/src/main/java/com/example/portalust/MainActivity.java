package com.example.portalust;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imageSipedar(View view) {
        Intent intent = new Intent(MainActivity.this,sipedar.class);
        startActivity(intent);

    }

    public void imagePortal(View view) {
        Intent intent = new Intent(MainActivity.this,portal.class);
        startActivity(intent);
    }

    public void imageJournal(View view) {
        Intent intent = new Intent(MainActivity.this,journal.class);
        startActivity(intent);
    }

    public void imageSiakad(View view) {
        Intent intent = new Intent(MainActivity.this,siakad.class);
        startActivity(intent);
    }

    public void imageSejarah(View view) {
        Intent intent = new Intent(MainActivity.this,sejarah.class);
        startActivity(intent);
    }

    public void imageBy(View view) {
        Intent intent = new Intent(MainActivity.this,by.class);
        startActivity(intent);
    }

}