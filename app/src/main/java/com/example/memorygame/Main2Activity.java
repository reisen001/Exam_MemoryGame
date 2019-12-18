package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    int tt=0,random,counter = 0;//設置初始秒數
    int[] imageId={R.drawable.image_up, R.drawable.image_down, R.drawable.image_left,R.drawable.image_right,R.drawable.image_non};
    int num =imageId.length;
    int stage,step,i=3,count,n;
    private Handler handler = new Handler();
    ImageView imageview;
    //int[] IntegerArray = new int[1000];
    //ArrayList<Integer> IntegerArray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //----------------------------------------------------------//
        imageview =(ImageView)findViewById(R.id.imageView);
        final TextView t1=(TextView)findViewById(R.id.textView_stage);
        TextView now = (TextView)findViewById(R.id.textView_now);
        //----------------------------------------------------------//
        //ArrayList<Integer> IntegerArray = new ArrayList<>();
        stage = getIntent().getIntExtra("stage",0);
        //----------------------------------------------------------//
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable,1000);


}


        //----------------------------------------------------------//

    //----------------------------------------------------------//
   private  Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int[] IntegerArray = new int[stage];    //設計一個int array
                counter++;
                switch (step) {
                    case 0: {
                        i--;
                        Toast.makeText(Main2Activity.this, "遊戲開始倒數：" + (i + 1), Toast.LENGTH_SHORT).show();
                        if (i == 0)
                            step = 1;
                        break;
                    }
                    case 1: {
                        if ((counter & 3) != 0)
                            break;
                        random = (int) (Math.random() * 4);
                        imageview.setImageResource(imageId[random]);
                        IntegerArray[tt] = random;              //將亂數存入int[]
                        tt++;

                        Log.e("nom", "Array" + IntegerArray[tt] + "random tt " + random + tt + " length " + IntegerArray.length);
                        step = 2;
                        break;
                    }
                    case 2: {
                        if ((counter & 3) != 0)
                            break;
                        imageview.setImageResource(imageId[4]);
                        step = 1;
                        counter = 3;
                        if (tt == stage)
                            step = 3;
                        break;
                    }
                    case 3: {
                        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                        //Bundle bundle = new Bundle();
                        intent.putExtra("stage", stage);
                        //intent.putExtra("IntegerArray",IntegerArray);
                        //intent.putExtras(bundle);
                        step = 4;
                        startActivity(intent);
                        break;
                    }
                    case 4:
                        handler.removeCallbacks(runnable);
                        Log.e("1234", "111111");
                        break;
                }
                handler.postDelayed(this, 1000);
            }

        };
    }

