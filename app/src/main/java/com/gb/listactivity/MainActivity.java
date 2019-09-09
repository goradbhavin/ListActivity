package com.gb.listactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String stringArray[] = {"Audi","Benz","BMW","Ford","Honda","Toyoto","Breza"};

    ListView listView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ListActivity");
        listView = getListView();
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_row,R.id.txtItemName,stringArray);
        listView.setAdapter(arrayAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        String selectedItem = (String) getListView().getItemAtPosition(position);
        Toast.makeText(this,selectedItem,Toast.LENGTH_LONG).show();
    }
}
