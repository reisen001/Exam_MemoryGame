package com.example.memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main3Activity extends AppCompatActivity {
    int stage,choose=4,num,point=0,i=0;
    boolean judge;
    //int[] IntegerArray = new int[1000];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageButton up =(ImageButton)findViewById(R.id.imageButton_up);
        ImageButton down =(ImageButton)findViewById(R.id.imageButton_down);
        ImageButton left =(ImageButton)findViewById(R.id.imageButton_left);
        ImageButton right =(ImageButton)findViewById(R.id.imageButton_right);
        TextView game = (TextView)findViewById(R.id.textView_game);
        final TextView score = (TextView)findViewById(R.id.textView_score);
        //----------------------------------------------------------//
        //ArrayList<Integer> IntegerArray = (ArrayList<Integer>) getIntent().getSerializableExtra("IntegerArray");
        Intent intent = getIntent();
        Bundle bundle =  getIntent().getExtras();
        stage = getIntent().getIntExtra("stage",0);
        int[] IntegerArray = new int[stage];
        //IntegerArray = getIntent().getIntArrayExtra("IntegerArray");
        //ArrayList<Integer> IntegerArray = bundle.getIntegerArrayList("IntegerArray");
        //final int IntegerArray[] = bundle.getIntArray("IntegerArray");
        //Integer IntegerArray = bundle.getIntArray("IntegerArray",IntegerArray.length,Integer[].class);
        //----------------------------------------------------------//

        //----------------------------------------------------------//
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose =0;
                if (choose == num);
                score.setText(num);
                i++;
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose =1;
                if (choose == num);
                score.setText(num);
                i++;
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose =2;
                if (choose == num);
                score.setText(num);
                i++;
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose =3;
                if (choose == num);
                score.setText(num);
                i++;
            }
        });

        //----------------------------------------------------------//

        /*for(int i=0 ; i < stage;i++) {

            num = IntegerArray[i];
            if (choose != choose && choose == num) {
                point = point + 10;
                score.setText(IntegerArray[num]);
                choose=4;
                intent.putExtra("point", point);
                score.setText(point);
            } else {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("GAME OVER");                   //設定視窗標
                builder.setIcon(R.mipmap.ic_launcher_round);            //設定對話視窗圖示
                builder.setMessage("總得分:" + point + "分");           //設定顯示的文字
                builder.setPositiveButton("OK!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
            //----------------------------------------------------------//
            if(i==stage){
                final AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("NEXTSTAGE");                   //設定視窗標
                builder.setIcon(R.mipmap.ic_launcher_round);            //設定對話視窗圖示
                builder.setMessage("總得分:" + point + "分");           //設定顯示的文字
                stage++;
                intent.putExtra("stage",stage);
                builder.setPositiveButton("NEXT STAGE!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });
            }
        }*/
        }

    Intent intent = new Intent();


}
