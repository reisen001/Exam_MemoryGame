package com.example.memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int stage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------------------------------------------------------//
        Button game = (Button)findViewById(R.id.button_game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stage=5;
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("stage",stage);

                startActivity(intent);
            }
        });
        //----------------------------------------------------------//
        Button rule = (Button)findViewById(R.id.button_rule);
        rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("遊戲介紹")  ;                   //設定視窗標
                builder.setIcon(R.mipmap.ic_launcher_round);	        //設定對話視窗圖示
                builder.setMessage("記住關卡中出現的圖案樣式，層數越高記憶起來越困難，來試著挑戰看看自己能記憶到什麼程度吧!") ;           //設定顯示的文字
                builder.setPositiveButton("OK!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                builder.show();
            }
        });
        //----------------------------------------------------------//
        Button exit = (Button)findViewById(R.id.button_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Message")  ;                   //設定視窗標
                builder.setIcon(R.mipmap.ic_launcher_round);	        //設定對話視窗圖示
                builder.setMessage("確定要離開嗎?") ;           //設定顯示的文字
                builder.setPositiveButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                builder.show();
            }
        });
    }
}
