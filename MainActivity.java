package com.inba.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String s1[],s2[];
    RecyclerView recyclerView;
    int images[]={R.drawable.one,R.drawable.redmi,R.drawable.sam,R.drawable.oppo,
            R.drawable.vivo,R.drawable.honor,R.drawable.moto1,
            R.drawable.lenovo, R.drawable.nokia,R.drawable.apple,R.drawable.bb};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.mobiles);
        s2=getResources().getStringArray(R.array.description);

        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
