package com.example.lak.midsempapers;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView papers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        papers=(ListView) findViewById(R.id.Paperlist);

        Bundle extras = getIntent().getExtras();
        String Sname = extras.getString("SubName").toString();

        setTitle(Sname);

        final String [] paperlist;

        final ArrayAdapter<String> papername;

        if(Sname.equals("Computer_Graphics")){
            paperlist=getResources().getStringArray(R.array.Computer_Grahpics);
            papername=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paperlist);
            papers.setAdapter(papername);
            papers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                                    String text = papername.getItem(position);
                                                    Intent I=new Intent(getApplicationContext(),Main3Activity.class);
                                                    I.putExtra("PaperName",text);
                                                    startActivity(I);

                                                }
                                            }
            );
        }
        else if(Sname.equals("Algorithms")){
            paperlist=getResources().getStringArray(R.array.Algorithms);
            papername=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paperlist);
            papers.setAdapter(papername);
            papers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                                  String text = papername.getItem(position);
                                                  Intent I=new Intent(getApplicationContext(),Main3Activity.class);
                                                  I.putExtra("PaperName",text);
                                                  startActivity(I);

                                              }
                                          }
            );
        }
        else if(Sname.equals("Java")){
            paperlist=getResources().getStringArray(R.array.Java);
            papername=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paperlist);
            papers.setAdapter(papername);
            papers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                                  String text = papername.getItem(position);
                                                  Intent I=new Intent(getApplicationContext(),Main3Activity.class);
                                                  I.putExtra("PaperName",text);
                                                  startActivity(I);

                                              }
                                          }
            );
        }
        else if(Sname.equals("Systems_Prog.")){
            paperlist=getResources().getStringArray(R.array.Systems_Prog);
            papername=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paperlist);
            papers.setAdapter(papername);
            papers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                                  String text = papername.getItem(position);
                                                  Intent I=new Intent(getApplicationContext(),Main3Activity.class);
                                                  I.putExtra("PaperName",text);
                                                  startActivity(I);

                                              }
                                          }
            );
        }
        else if(Sname.equals("Darshan_PDFs")){
            paperlist=getResources().getStringArray(R.array.Darshan_PDFs);
            papername=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paperlist);
            papers.setAdapter(papername);
            papers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                                                  String text = papername.getItem(position);
                                                  Intent I=new Intent(getApplicationContext(),Main4Activity.class);
                                                  I.putExtra("PaperName",text);
                                                  startActivity(I);

                                              }
                                          }
            );
        }


    }
}
