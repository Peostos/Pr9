package com.example.pr9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.jp, R.string.japan, R.string.japanJP));
        list.add(new DataFlags(R.drawable.nz, R.string.asia, R.string.asiaNZ));
        list.add(new DataFlags(R.drawable.us, R.string.northamerica, R.string.northamericaUS));
        list.add(new DataFlags(R.drawable.bo, R.string.bloivia, R.string.bloiviaBO));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);

    }

}
