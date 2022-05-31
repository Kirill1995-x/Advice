package com.AdviceForParents.advice;

import java.util.ArrayList;

public class ConvertArrayToList
{
    String [] array_with_title;
    int size_of_array;
    ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList;

    public ConvertArrayToList(String[] array_with_title, int size_of_array) {
        this.array_with_title = array_with_title;
        this.size_of_array=size_of_array;
    }

    public ArrayList<NameOfArticleAndTest> getNameOfArticleAndTestList()
    {
        nameOfArticleAndTestList=new ArrayList<NameOfArticleAndTest>();
        for(int i=0; i<size_of_array; i++)
        {
            nameOfArticleAndTestList.add(new NameOfArticleAndTest(array_with_title[i]));
        }
        return nameOfArticleAndTestList;
    }
}
