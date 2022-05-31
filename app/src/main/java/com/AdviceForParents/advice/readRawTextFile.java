package com.AdviceForParents.advice;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class readRawTextFile
{
    private Context context;
    private int idOfResource;

    public readRawTextFile(Context context, int idOfResource)
    {
        this.context=context;
        this.idOfResource=idOfResource;
    }

    public String getTextFromText()
    {
        InputStream inputStream = context.getResources().openRawResource(idOfResource);

        InputStreamReader inputReader = new InputStreamReader(inputStream);
        BufferedReader buffReader = new BufferedReader(inputReader);
        String line;
        StringBuilder builder = new StringBuilder();

        try {
            while (( line = buffReader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
        } catch (IOException e) {
            return null;
        }
        return builder.toString();
    }
}
