package com.AdviceForParents.advice;

public class NameOfArticleAndTest
{
    private String nameOfArticleAndTest;
    static final String APP_PREFERENCES="name_for_shared_preferences";

    public NameOfArticleAndTest(String nameOfArticleAndTest)
    {
        this.nameOfArticleAndTest = nameOfArticleAndTest;
    }

    public String getNameOfArticleAndTest() {
        return nameOfArticleAndTest;
    }

    public void setNameOfArticleAndTest(String nameOfArticleAndTest) {
        this.nameOfArticleAndTest = nameOfArticleAndTest;
    }
}
