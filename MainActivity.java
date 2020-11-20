package com.example.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private RadioGroup fanlar;
private RadioButton tanlanganFan;
private Button javobl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test();
    }
    public void Test(){
        javobl=(Button) findViewById(R.id.button);
        fanlar=(RadioGroup) findViewById(R.id.fan);
        javobl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tanlanganJavob=fanlar.getCheckedRadioButtonId();
                tanlanganFan=(RadioButton)findViewById(tanlanganJavob);
                if (tanlanganFan==null){
                    Toast.makeText(MainActivity.this,R.string.tanlang,Toast.LENGTH_SHORT).show();
                }
                else
                Toast.makeText(MainActivity.this,tanlanganFan.getText(),Toast.LENGTH_SHORT).show();
                if (tanlanganJavob ==R.id.radioButton4)
                    Toast.makeText(MainActivity.this,R.string.togriJavob,Toast.LENGTH_SHORT).show();
                if (tanlanganJavob ==R.id.radioButton3)
                    Toast.makeText(MainActivity.this,R.string.togriJavob,Toast.LENGTH_SHORT).show();
                if (tanlanganJavob ==R.id.radioButton2)
                    Toast.makeText(MainActivity.this,R.string.notogrijavob,Toast.LENGTH_SHORT).show();
                if (tanlanganJavob ==R.id.radioButton)
                    Toast.makeText(MainActivity.this,R.string.notogrijavob,Toast.LENGTH_SHORT).show();
            }
        });
    }
}