package com.example.shahedalwadihoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv_main);

        ArrayList<honey> honeys =new ArrayList<>();
        honeys.add(new honey(R.drawable.power1,"power"));
        honeys.add(new honey(R.drawable.orange1,"orange"));
        honeys.add(new honey(R.drawable.light1,"light"));
        honeys.add(new honey(R.drawable.orange1,"orange"));
        honeys.add(new honey(R.drawable.light1,"light"));
        honeys.add(new honey(R.drawable.dark1,"dark"));
        honeys.add(new honey(R.drawable.oak1,"oak"));
        honeys.add(new honey(R.drawable.dark1,"dark"));
        honeys.add(new honey(R.drawable.oak1,"oak"));
        honeys.add(new honey(R.drawable.power1,"power"));
        honeys.add(new honey(R.drawable.power1,"power"));
        honeys.add(new honey(R.drawable.orange1,"orange"));
        honeys.add(new honey(R.drawable.light1,"light"));
        honeys.add(new honey(R.drawable.orange1,"orange"));
        honeys.add(new honey(R.drawable.light1,"light"));
        honeys.add(new honey(R.drawable.dark1,"dark"));
        honeys.add(new honey(R.drawable.oak1,"oak"));
        honeys.add(new honey(R.drawable.dark1,"dark"));
        honeys.add(new honey(R.drawable.oak1,"oak"));
        honeys.add(new honey(R.drawable.power1,"power"));



        RceyclerViewAdapter adapter = new RceyclerViewAdapter(honeys);
        RecyclerView.LayoutManager lm = new GridLayoutManager(this,2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

    }
}