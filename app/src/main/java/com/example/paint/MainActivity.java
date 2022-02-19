package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyCanvas myCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get id from draw
        myCanvas=(MyCanvas)findViewById(R.id.myCanvas);
    }
    //write clear method
    public void onClear(View view){
        myCanvas.clearCanvas();
    }
}