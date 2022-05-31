package com.AdviceForParents.advice;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class age_features extends AppCompatActivity {

    @BindView(R.id.rvAgeFeatures)
    RecyclerView rvAgeFeatures;

    private String age_features_articles[]={
            "1.  Проблемы детей в зависимости от возрастных особенностей",
            "2.  Этап новорожденности",
            "3.  Ранний возраст",
            "4.  Дошкольный возраст",
            "5.  Младшие школьники",
            "6.  Подростковый возраст",
            "7.  Юношеский возраст",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_features);

        //настройка ButterKnife
        ButterKnife.bind(this);

        //добавление стрелки "Вверх" и скрытие названия
        ActionBar actionBar=getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        //формирование списка для RecyclerView
        ConvertArrayToList convertArrayToList=new ConvertArrayToList(age_features_articles, age_features_articles.length);
        ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList=convertArrayToList.getNameOfArticleAndTestList();
        rvAgeFeatures.setAdapter(new NameOfArticleAndTestAdapter(this, nameOfArticleAndTestList));
        rvAgeFeatures.setLayoutManager(new LinearLayoutManager(this));
        rvAgeFeatures.addItemDecoration(new DividerItemDecoration(rvAgeFeatures.getContext(), DividerItemDecoration.VERTICAL));
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
