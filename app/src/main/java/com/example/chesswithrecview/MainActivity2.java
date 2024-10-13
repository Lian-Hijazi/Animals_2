package com.example.chesswithrecview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView d;

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String index=intent.getStringExtra("ItemId");
        d=findViewById(R.id.details);
        d.setText(index);
        int imgId=getIntent().getIntExtra("imgId",0);
        img=findViewById(R.id.img);
        img.setImageDrawable(ContextCompat.getDrawable(this,imgId));

    }

    public void back(View view)
    {Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

}