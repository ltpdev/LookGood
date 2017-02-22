package com.example.asus_.lookgoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.asus_.lookgoods.R.id.btn_search;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText edtCompany;
    private EditText edtNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button = (Button) findViewById(btn_search);
        edtCompany = (EditText) findViewById(R.id.edt_company);
        edtNum = (EditText) findViewById(R.id.edt_num);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String com = edtCompany.getText().toString().trim();
                String num = edtNum.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,ShowInfoActivity.class);
                intent.putExtra("company",com);
                intent.putExtra("num",num);
                startActivity(intent);
            }
        });
    }
}
