package com.AdviceForParents.advice;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class relationship extends AppCompatActivity {

    @BindView(R.id.rvRelationship)
    RecyclerView rvRelationship;

    private String relationship_list[]={
            "1. Методика изучения родительских установок",
            "2. Подростки о родителях",
            "3. Анализ семейных взаимоотношений",
            "4. Родителей оценивают дети",
            "5. Анализ семейной тревоги",
            "6. Тест-опросник удовлетворенности браком",
            "7. Тест-опросник родительского отношения",
            "8. Шкала диалогичности межличностных отношений",
            "9. Понимание, эмоциональное притяжение, авторитетность",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationship);

        //настройка ButterKnife
        ButterKnife.bind(this);

        //добавление стрелки "Вверх"
        ActionBar actionBar=getSupportActionBar();
        Objects.requireNonNull(actionBar).setDisplayHomeAsUpEnabled(true);

        //формирование списка для RecyclerView
        ConvertArrayToList convertArrayToList=new ConvertArrayToList(relationship_list, relationship_list.length);
        ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList=convertArrayToList.getNameOfArticleAndTestList();
        rvRelationship.setAdapter(new NameOfArticleAndTestAdapter(this, nameOfArticleAndTestList));
        rvRelationship.setLayoutManager(new LinearLayoutManager(this));
        rvRelationship.addItemDecoration(new DividerItemDecoration(rvRelationship.getContext(), DividerItemDecoration.VERTICAL));
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.relationship_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.relationship:
                Intent intent = new Intent(this, about_relationship.class);
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
