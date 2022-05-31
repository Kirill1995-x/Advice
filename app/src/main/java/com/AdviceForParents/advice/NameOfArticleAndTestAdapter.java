package com.AdviceForParents.advice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class NameOfArticleAndTestAdapter extends RecyclerView.Adapter<NameOfArticleAndTestAdapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList;
    private Typeface typeface;
    private Context context;
    private Intent intent;
    SharedPreferences sharedPreferences;

    private String first_array_for_tests[]={"https://psytests.org/luscher/index.html",
                                            "https://psytests.org/projective/figures-run.html",
                                            "https://psytests.org/projective/tuf.html",
                                            "https://psytests.org/cattell/16pfA.html",
                                            "https://psytests.org/mmpi/minimult.html",
                                            "https://psytests.org/personal/ito.html",
                                            "https://psytests.org/leonhard/sm88.html",
                                            "https://psytests.org/eysenck/mpi.html",
                                            "https://psytests.org/emotional/hall.html",
                                            "https://psytests.org/emotional/impulse.html",
                                            "https://psytests.org/psystate/eyespsy.html",
                                            "https://psytests.org/psystate/san.html",
                                            "https://psytests.org/boyko/psystateA.html",
                                            "https://psytests.org/szondi/szondi.html"};

    private String second_array_for_tests[]={"https://psytests.org/family/pari.html",
                                            "https://psytests.org/family/adorM.html",
                                            "https://psytests.org/family/asvA.html",
                                            "https://psytests.org/family/rod.html",
                                            "https://psytests.org/family/ast.html",
                                            "https://psytests.org/family/oub.html",
                                            "https://psytests.org/family/oro.html",
                                            "https://psytests.org/family/dialduh.html",
                                            "https://psytests.org/family/pea.html"};

    public NameOfArticleAndTestAdapter(Context context, ArrayList<NameOfArticleAndTest> nameOfArticleAndTestList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.nameOfArticleAndTestList = nameOfArticleAndTestList;
        this.context = context;
        typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int position) {
        NameOfArticleAndTest nameOfArticleAndTest = nameOfArticleAndTestList.get(position);
        viewHolder.tvTextOrTest.setText(nameOfArticleAndTest.getNameOfArticleAndTest());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences=context.getSharedPreferences(NameOfArticleAndTest.APP_PREFERENCES, Context.MODE_PRIVATE);
                String name_of_button=sharedPreferences.getString("name_of_button","");
                if(name_of_button!=null) {
                    if (name_of_button.equals("age_features")) {
                        intent = new Intent(context, age_features_list.class);
                        intent.putExtra("title", viewHolder.getAdapterPosition());
                        context.startActivity(intent);
                    } else if (name_of_button.equals("articles")) {
                        intent=new Intent(context, articles_list.class);
                        intent.putExtra("title", viewHolder.getAdapterPosition());
                        context.startActivity(intent);
                    } else if (name_of_button.equals("testParents")) {
                        switch (viewHolder.getAdapterPosition())
                        {
                            case 0:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[0]));
                                context.startActivity(intent);
                                break;
                            case 1:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[1]));
                                context.startActivity(intent);
                                break;
                            case 2:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[2]));
                                context.startActivity(intent);
                                break;
                            case 3:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[3]));
                                context.startActivity(intent);
                                break;
                            case 4:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[4]));
                                context.startActivity(intent);
                                break;
                            case 5:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[5]));
                                context.startActivity(intent);
                                break;
                            case 6:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[6]));
                                context.startActivity(intent);
                                break;
                            case 7:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[7]));
                                context.startActivity(intent);
                                break;
                            case 8:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[8]));
                                context.startActivity(intent);
                                break;
                            case 9:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[9]));
                                context.startActivity(intent);
                                break;
                            case 10:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[10]));
                                context.startActivity(intent);
                                break;
                            case 11:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[11]));
                                context.startActivity(intent);
                                break;
                            case 12:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[12]));
                                context.startActivity(intent);
                                break;
                            case 13:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(first_array_for_tests[13]));
                                context.startActivity(intent);
                                break;
                        }
                    } else if (name_of_button.equals("relationship")) {
                        switch (viewHolder.getAdapterPosition()) {
                            case 0:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[0]));
                                context.startActivity(intent);
                                break;
                            case 1:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[1]));
                                context.startActivity(intent);
                                break;
                            case 2:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[2]));
                                context.startActivity(intent);
                                break;
                            case 3:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[3]));
                                context.startActivity(intent);
                                break;
                            case 4:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[4]));
                                context.startActivity(intent);
                                break;
                            case 5:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[5]));
                                context.startActivity(intent);
                                break;
                            case 6:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[6]));
                                context.startActivity(intent);
                                break;
                            case 7:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[7]));
                                context.startActivity(intent);
                                break;
                            case 8:
                                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(second_array_for_tests[8]));
                                context.startActivity(intent);
                                break;
                        }
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameOfArticleAndTestList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTextOrTest;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTextOrTest=itemView.findViewById(R.id.text_or_test);
            if(tvTextOrTest!=null)
            {
                tvTextOrTest.setTypeface(typeface);
            }
        }
    }
}
