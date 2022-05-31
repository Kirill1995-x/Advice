package com.AdviceForParents.advice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class main extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.age_features)
    LinearLayout age_features;
    @BindView(R.id.articles)
    LinearLayout articles;
    @BindView(R.id.personality)
    LinearLayout personality;
    @BindView(R.id.relationship)
    LinearLayout relationship;
    @BindView(R.id.about_application)
    LinearLayout about_application;
    @BindView(R.id.contacts)
    LinearLayout contacts;
    @BindView(R.id.tvAgeFeatures)
    TextView tvAgeFeatures;
    @BindView(R.id.tvArticles)
    TextView tvArticles;
    @BindView(R.id.tvPersonality)
    TextView tvPersonality;
    @BindView(R.id.tvRelationship)
    TextView tvRelationship;
    @BindView(R.id.tvAboutApp)
    TextView tvAboutApp;
    @BindView(R.id.tvContacts)
    TextView tvContacts;
    @BindView(R.id.tvTitle)
    TextView tvMainTitle;
    Intent intent;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //настройка ButterKnife
        ButterKnife.bind(this);

        //обработка нажатия на элемент
        age_features.setOnClickListener(this);
        articles.setOnClickListener(this);
        personality.setOnClickListener(this);
        relationship.setOnClickListener(this);
        about_application.setOnClickListener(this);
        contacts.setOnClickListener(this);

        //установка шрифта
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Roboto-Regular.ttf");
        tvAgeFeatures.setTypeface(myCustomFont);
        tvArticles.setTypeface(myCustomFont);
        tvPersonality.setTypeface(myCustomFont);
        tvRelationship.setTypeface(myCustomFont);
        tvAboutApp.setTypeface(myCustomFont);
        tvContacts.setTypeface(myCustomFont);
        Typeface mainCustomFont= Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        tvMainTitle.setTypeface(mainCustomFont);
    }

    @Override
    public void onClick(View v)
    {
        sharedPreferences=getSharedPreferences(NameOfArticleAndTest.APP_PREFERENCES, MODE_PRIVATE);
        editor=sharedPreferences.edit();

        switch (v.getId())
        {
            case R.id.age_features:
                editor.putString("name_of_button", "age_features");
                editor.apply();
                intent=new Intent(main.this, age_features.class);
                startActivity(intent);
                break;
            case R.id.articles:
                editor.putString("name_of_button", "articles");
                editor.apply();
                intent=new Intent(main.this, articles.class);
                startActivity(intent);
                break;
            case R.id.personality:
                editor.putString("name_of_button", "testParents");
                editor.apply();
                intent=new Intent(main.this, testParents.class);
                startActivity(intent);
                break;
            case R.id.relationship:
                editor.putString("name_of_button", "relationship");
                editor.apply();
                intent=new Intent(main.this, relationship.class);
                startActivity(intent);
                break;
            case R.id.about_application:
                intent=new Intent(main.this, about_programm.class);
                startActivity(intent);
                break;
            case R.id.contacts:
                intent=new Intent(main.this, Contacts.class);
                startActivity(intent);
        }
    }
}

