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

public class articles extends AppCompatActivity {

    @BindView(R.id.rvArticles)
    RecyclerView rvArticles;

    private String articles_list[]={
            "1.  Оказание родителями психологоческой поддержки детям и подросткам",
            "2.  Причины возникновения проблем у ребёнка (социальные, семейные)",
            "3.  Рекомендации родителям тревожных детей",
            "4.  Рекомендации родителям детей, проявляющих агрессию",
            "5.  Рекомендации родителям гиперактивных детей",
            "6.  Правила эффективного общения родителей с детьми",
            "7.  Как помочь ребёнку и себе преодолеть негативные эмоции",
            "8.  Если ребёнок ворует...",
            "9.  Советы психолога родителям первоклассников",
            "10. Аутичные дети",
            "11. О самостоятельности детей",
            "12. Мы идём в пятый класс",
            "13. Как привить ребёнку любовь к чтению",
            "14. Что делать, если ребёнок говорит неправду?",
            "15. Как обеспечить психологическую безопасность ребёнка",
            "16. Что делать, если ребёнок взял чужую вещь?",
            "17. Что делать, если ребёнок ленится?",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        //настройка ButterKnife
        ButterKnife.bind(this);

        //добавление стрелки "Вверх"
        ActionBar actionBar=getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        //формирование списка для RecyclerView
        ConvertArrayToList convertArrayToList=new ConvertArrayToList(articles_list, articles_list.length);
        ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList=convertArrayToList.getNameOfArticleAndTestList();
        rvArticles.setAdapter(new NameOfArticleAndTestAdapter(this, nameOfArticleAndTestList));
        rvArticles.setLayoutManager(new LinearLayoutManager(this));
        rvArticles.addItemDecoration(new DividerItemDecoration(rvArticles.getContext(), DividerItemDecoration.VERTICAL));
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
