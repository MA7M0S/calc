package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText Fname,Sname;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fname=findViewById(R.id.Fname);
        Sname=findViewById(R.id.Sname);
        res=findViewById(R.id.res);
    }
    public void plus(View view) {

        if(!(Fname.getText().toString().isEmpty()|| Sname.getText().toString().isEmpty())){
            double x1=Double.parseDouble(Fname.getText().toString()),x2=Double.parseDouble(Sname.getText().toString());
            res.setText(String.valueOf(x1+x2));
        }
        Fname.setText("");
        Sname.setText("");
    }

    public void minus(View view) {

        if(!(Fname.getText().toString().isEmpty()|| Sname.getText().toString().isEmpty())){
            double x1=Double.parseDouble(Fname.getText().toString()),x2=Double.parseDouble(Sname.getText().toString());
            res.setText(String.valueOf(x1-x2));
        }
        Fname.setText("");
        Sname.setText("");
    }

    public void divide(View view) {

        if(!(Fname.getText().toString().isEmpty()|| Sname.getText().toString().isEmpty())){
            double x1=Double.parseDouble(Fname.getText().toString()),x2=Double.parseDouble(Sname.getText().toString());
            if(x2==0)
                Toast.makeText(this, "The second number shouldn't be 0", Toast.LENGTH_SHORT).show();
            else
                res.setText(String.valueOf(x1/x2));
        }
        Fname.setText("");
        Sname.setText("");
    }

    public void multiply(View view) {

        if(!(Fname.getText().toString().isEmpty()|| Sname.getText().toString().isEmpty())){
            double x1=Double.parseDouble(Fname.getText().toString()),x2=Double.parseDouble(Sname.getText().toString());
            res.setText(String.valueOf(x1*x2));
        }
        Fname.setText("");
        Sname.setText("");
    }
}