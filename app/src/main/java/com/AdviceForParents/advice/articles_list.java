package com.AdviceForParents.advice;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class articles_list extends AppCompatActivity {

    @BindView(R.id.webview)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_list);

        //настройка ButterKnife
        ButterKnife.bind(this);

        //добавление стрелки "Вверх"
        ActionBar actionBar=getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        //получаем строку и формируем имя ресурса
        String resName = "m" + intent.getIntExtra("title",0);
        //читаем текстовый файл из ресурсов по имени
        readRawTextFile readText = new readRawTextFile(this, getResources().getIdentifier(resName, "raw", "com.AdviceForParents.advice"));
        webView.loadDataWithBaseURL("file:///android_asset/", readText.getTextFromText(), "text/html", "UTF-8", null);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
