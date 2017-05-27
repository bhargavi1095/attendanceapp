package com.metro.bhargavisriram.impresent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bhargavi on 23-04-2017.
 */

public class trying extends Activity {
    Spinner spin;
    ListView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trying);
        spin = (Spinner) findViewById(R.id.spinner);
        list=(ListView)findViewById(R.id.listview) ;

        //  spin.setOnItemClickListener(trying.this);
        List<String> cate = new ArrayList<String>();
        cate.add("one");
        cate.add("two");
        cate.add("three");
        cate.add("four");
        ArrayAdapter<String> data = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cate);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(data);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();

                Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
