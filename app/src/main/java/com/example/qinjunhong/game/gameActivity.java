package com.example.qinjunhong.game;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    String[]animals={"bear","bird","cat","pig","rhino","tiger","wolf"};
    int[]animalsnum={R.drawable.bear,
    R.drawable.bird,
    R.drawable.cat,
    R.drawable.pig,
    R.drawable.rhino,
    R.drawable.tiger,
    R.drawable.wolf};
    int[]imagenum={
            R.id.imageView,
            R.id.imageView2,
            R.id.imageView3,
            R.id.imageView4,
    };
    public void btnimg1(View view){
        int i,temp;
        ImageView animal= (ImageView) findViewById(R.id.imageView);
       //获取图源
        Drawable.ConstantState t1 =animal.getDrawable().getConstantState();
        TextView str=((TextView) findViewById(R.id.textView));
        for(i=0,temp=0;i<animals.length;i++)
        {
            if(animals[i].equals(str.getText()))
                temp = i;
        }

        Drawable.ConstantState t2=ContextCompat.getDrawable(this,animalsnum[temp]).getConstantState();
        //比较
        if(t1.equals(t2)){
            int rannum=(int)(Math.random()*6);
            ((TextView) findViewById(R.id.textView)).setText(animals[rannum]);
            int ranimg=(int)(Math.random()*3);

            ((ImageView) findViewById(imagenum[ranimg])).setImageResource(animalsnum[rannum]);
            for(int j=0;j<imagenum.length;j++){
                if(j!=ranimg)
                {
                    rannum=(int)(Math.random()*6);

                    ((ImageView) findViewById(imagenum[j])).setImageResource(animalsnum[rannum]);
                }
            }
        }
        else{
            Intent intent = new Intent(gameActivity.this, finishActivity.class);
            startActivity(intent);
            gameActivity.this.finish();
        }
    }
    public void btnimg2(View view){
        int i,temp;
        ImageView animal= (ImageView) findViewById(R.id.imageView2);
        //获取图源
        Drawable.ConstantState t1 =animal.getDrawable().getConstantState();
        TextView str=((TextView) findViewById(R.id.textView));
        for(i=0,temp=0;i<animals.length;i++)
        {
            if(animals[i].equals(str.getText()))
                temp = i;
        }
        Drawable.ConstantState t2=ContextCompat.getDrawable(this,animalsnum[temp]).getConstantState();
        //比较
        if(t1.equals(t2)){
            int rannum=(int)(Math.random()*6);
            ((TextView) findViewById(R.id.textView)).setText(animals[rannum]);
            int ranimg=(int)(Math.random()*3);
            ((ImageView) findViewById(imagenum[ranimg])).setImageResource(animalsnum[rannum]);
            for(int j=0;j<imagenum.length;j++){
                if(j!=ranimg)
                {
                    rannum=(int)(Math.random()*6);
                    ((ImageView) findViewById(imagenum[j])).setImageResource(animalsnum[rannum]);
                }
            }
        }
        else{
            Intent intent = new Intent(gameActivity.this, finishActivity.class);
            startActivity(intent);
            gameActivity.this.finish();
        }

    }
    public void btnimg3(View view){
        int i,temp;
        ImageView animal= (ImageView) findViewById(R.id.imageView3);
        //获取图源
        Drawable.ConstantState t1 =animal.getDrawable().getConstantState();
        TextView str=((TextView) findViewById(R.id.textView));
        for(i=0,temp=0;i<animals.length;i++)
        {
            if(animals[i].equals(str.getText()))
                temp = i;
        }
        Drawable.ConstantState t2=ContextCompat.getDrawable(this,animalsnum[temp]).getConstantState();
        //比较
        if(t1.equals(t2)){
            int rannum=(int)(Math.random()*6);
            ((TextView) findViewById(R.id.textView)).setText(animals[rannum]);
            int ranimg=(int)(Math.random()*3);
            ((ImageView) findViewById(imagenum[ranimg])).setImageResource(animalsnum[rannum]);
            for(int j=0;j<imagenum.length;j++){
                if(j!=ranimg)
                {
                    rannum=(int)(Math.random()*6);
                    ((ImageView) findViewById(imagenum[j])).setImageResource(animalsnum[rannum]);
                }
            }
        }
        else{
            Intent intent = new Intent(gameActivity.this, finishActivity.class);
            startActivity(intent);
            gameActivity.this.finish();
        }

    }
    public void btnimg4(View view){
        int i,temp;
        ImageView animal= (ImageView) findViewById(R.id.imageView4);
        //获取图源
        Drawable.ConstantState t1 =animal.getDrawable().getConstantState();
        TextView str=((TextView) findViewById(R.id.textView));
        for(i=0,temp=0;i<animals.length;i++)
        {
            if(animals[i].equals(str.getText()))
                temp = i;
        }
        Drawable.ConstantState t2=ContextCompat.getDrawable(this,animalsnum[temp]).getConstantState();
        //比较
        if(t1.equals(t2)){
            int rannum=(int)(Math.random()*6);
            ((TextView) findViewById(R.id.textView)).setText(animals[rannum]);
            int ranimg=(int)(Math.random()*3);
            ((ImageView) findViewById(imagenum[ranimg])).setImageResource(animalsnum[rannum]);
            for(int j=0;j<imagenum.length;j++){
                if(j!=ranimg)
                {
                    rannum=(int)(Math.random()*6);
                    ((ImageView) findViewById(imagenum[j])).setImageResource(animalsnum[rannum]);
                }
            }
        }
        else{
            Intent intent = new Intent(gameActivity.this, finishActivity.class);
            startActivity(intent);
            gameActivity.this.finish();
        }

    }

}
