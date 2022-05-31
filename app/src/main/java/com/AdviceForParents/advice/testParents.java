package com.AdviceForParents.advice;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class testParents extends AppCompatActivity {

    @BindView(R.id.rvTestParents)
    RecyclerView rvTestParents;

    private String personality_list[]={
            "1. Цветовой тест Люшера",
            "2. Конструктивный рисунок человека из геометрических форм",
            "3. Тест юмористических фраз",
            "4. Тест Кеттелла/Форма А",
            "5. Сокращенный тест Мини-Мульт",
            "6. Индивидуально-типологический опросник",
            "7. Опросник Шмишека",
            "8. Личностный опросник Айзенка",
            "9. Тест эмоционального интеллекта Холла",
            "10. Исследование уровня импульсивности",
            "11. Тест самооценки психических состояний Айзенка",
            "12. Самочувствие, активность, настроение",
            "13. Экспресс-диагностика психических состояний",
            "14. Тест Сонди",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //настройка ButterKnife
        ButterKnife.bind(this);

        //добавление стрелки "Вверх"
        ActionBar actionBar=getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        //формирование списка для RecyclerView
        ConvertArrayToList convertArrayToList=new ConvertArrayToList(personality_list, personality_list.length);
        ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList=convertArrayToList.getNameOfArticleAndTestList();
        rvTestParents.setAdapter(new NameOfArticleAndTestAdapter(this, nameOfArticleAndTestList));
        rvTestParents.setLayoutManager(new LinearLayoutManager(this));
        rvTestParents.addItemDecoration(new DividerItemDecoration(rvTestParents.getContext(), DividerItemDecoration.VERTICAL));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.test_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.test_menu:
                Intent intent=new Intent(this, about_test.class);
                startActivity(intent);
                return true;
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
