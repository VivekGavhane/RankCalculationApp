package com.gavhane.b.vivek.rankingcalculationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button b1;
    TextView t1;
    int e11,e22,e33,e44,e55;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);

        b1 = (Button)findViewById(R.id.button);

        t1 = (TextView) findViewById(R.id.textView6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e11 = Integer.parseInt(e1.getText().toString());
                e22 = Integer.parseInt(e2.getText().toString());
                e33 = Integer.parseInt(e3.getText().toString());
                e44 = Integer.parseInt(e4.getText().toString());
                e55 = Integer.parseInt(e5.getText().toString());

                int arr[] = {e11,e22,e33,e44,e55};

                sort_numbers_ascending(arr,5);

                t1.setText("1st rank has marks="+arr[4]+ "\n"+
                        "2nd rank has marks="+arr[3]+ "\n"+
                        "3rd rank has marks="+arr[2]+ "\n"+
                        "4th rank has marks="+arr[1]+ "\n"+
                        "5th rank has marks="+arr[0]);

            }
        });

    }

    public void sort_numbers_ascending(int number[], int count)
    {
        int temp, i, j, k;
        for (j = 0; j < count; ++j)
        {
            for (k = j + 1; k < count; ++k)
            {
                if (number[j] > number[k])
                {
                    temp = number[j];
                    number[j] = number[k];
                    number[k] = temp;
                }
            }
        }

       // printf("Numbers in ascending order:\n");
        //for (i = 0; i < count; ++i)
            //printf("%d\n", number[i]);
    }
}
