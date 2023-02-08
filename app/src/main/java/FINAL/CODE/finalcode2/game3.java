package com.example.finalcode2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationAttributes;
import android.os.Vibrator;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class game3 extends AppCompatActivity {
    private static final String TAG = "game3";
    private TextView G3_1,G3_2,G3_3,G3_4,G3_5,G3_6,G3_7,G3_8,G3_9,G3_0,G3_C,G3_OK,G3_txv1,G3_txv2,G3_txv3,G3_txv4,G3_txv5,
            G3_L1_1,G3_L1_2,G3_L1_3,G3_L1_4,G3_L1_5,G3_L1_A,G3_L1_B,G3_L2_1,G3_L2_2,G3_L2_3,G3_L2_4,G3_L2_5,G3_L2_A,G3_L2_B,G3_L3_1,G3_L3_2,G3_L3_3,G3_L3_4,G3_L3_5,G3_L3_A,G3_L3_B,G3_L4_1,G3_L4_2,G3_L4_3,G3_L4_4,G3_L4_5,G3_L4_A,G3_L4_B,
            G3_L5_1,G3_L5_2,G3_L5_3,G3_L5_4,G3_L5_5,G3_L5_A,G3_L5_B,G3_L6_1,G3_L6_2,G3_L6_3,G3_L6_4,G3_L6_5,G3_L6_A,G3_L6_B,G3_L7_1,G3_L7_2,G3_L7_3,G3_L7_4,G3_L7_5,G3_L7_A,G3_L7_B,G3_L8_1,G3_L8_2,G3_L8_3,G3_L8_4,G3_L8_5,G3_L8_A,G3_L8_B,
            G3_L9_1,G3_L9_2,G3_L9_3,G3_L9_4,G3_L9_5,G3_L9_A,G3_L9_B,G3_L10_1,G3_L10_2,G3_L10_3,G3_L10_4,G3_L10_5,G3_L10_A,G3_L10_B,G3_L11_1,G3_L11_2,G3_L11_3,G3_L11_4,G3_L11_5,G3_L11_A,G3_L11_B,G3_L12_1,G3_L12_2,G3_L12_3,G3_L12_4,G3_L12_5,G3_L12_A,G3_L12_B,answer;
    private Button again,home,L_again,L_home,finish,stay,leave_finish,leave_continue;
    private final List<Integer> resultList = new ArrayList<>();
    private List<Integer> randomNumList = new ArrayList<>();
    private Game game ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string._5_unique_numbers_and_12_chances);

        findId();
        NumberButton();
        randomNumber();
        G3_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okButton();
            }
        });
    }
    private void findId()
    {
        G3_txv1 = findViewById(R.id.G3_txv1);
        G3_txv2 = findViewById(R.id.G3_txv2);
        G3_txv3 = findViewById(R.id.G3_txv3);
        G3_txv4 = findViewById(R.id.G3_txv4);
        G3_txv5 = findViewById(R.id.G3_txv5);
        G3_0 = findViewById(R.id.G3_0);
        G3_1 = findViewById(R.id.G3_1);
        G3_2 = findViewById(R.id.G3_2);
        G3_3 = findViewById(R.id.G3_3);
        G3_4 = findViewById(R.id.G3_4);
        G3_5 = findViewById(R.id.G3_5);
        G3_6 = findViewById(R.id.G3_6);
        G3_7 = findViewById(R.id.G3_7);
        G3_8 = findViewById(R.id.G3_8);
        G3_9 = findViewById(R.id.G3_9);
        G3_C = findViewById(R.id.G3_C);
        G3_OK = findViewById(R.id.G3_OK);
        G3_L1_1 = findViewById(R.id.G3_L1_1);
        G3_L1_2 = findViewById(R.id.G3_L1_2);
        G3_L1_3 = findViewById(R.id.G3_L1_3);
        G3_L1_4 = findViewById(R.id.G3_L1_4);
        G3_L1_5 = findViewById(R.id.G3_L1_5);
        G3_L1_A = findViewById(R.id.G3_L1_A);
        G3_L1_B = findViewById(R.id.G3_L1_B);
        G3_L2_1 = findViewById(R.id.G3_L2_1);
        G3_L2_2 = findViewById(R.id.G3_L2_2);
        G3_L2_3 = findViewById(R.id.G3_L2_3);
        G3_L2_4 = findViewById(R.id.G3_L2_4);
        G3_L2_5 = findViewById(R.id.G3_L2_5);
        G3_L2_A = findViewById(R.id.G3_L2_A);
        G3_L2_B = findViewById(R.id.G3_L2_B);
        G3_L3_1 = findViewById(R.id.G3_L3_1);
        G3_L3_2 = findViewById(R.id.G3_L3_2);
        G3_L3_3 = findViewById(R.id.G3_L3_3);
        G3_L3_4 = findViewById(R.id.G3_L3_4);
        G3_L3_5 = findViewById(R.id.G3_L3_5);
        G3_L3_A = findViewById(R.id.G3_L3_A);
        G3_L3_B = findViewById(R.id.G3_L3_B);
        G3_L4_1 = findViewById(R.id.G3_L4_1);
        G3_L4_2 = findViewById(R.id.G3_L4_2);
        G3_L4_3 = findViewById(R.id.G3_L4_3);
        G3_L4_4 = findViewById(R.id.G3_L4_4);
        G3_L4_5 = findViewById(R.id.G3_L4_5);
        G3_L4_A = findViewById(R.id.G3_L4_A);
        G3_L4_B = findViewById(R.id.G3_L4_B);
        G3_L5_1 = findViewById(R.id.G3_L5_1);
        G3_L5_2 = findViewById(R.id.G3_L5_2);
        G3_L5_3 = findViewById(R.id.G3_L5_3);
        G3_L5_4 = findViewById(R.id.G3_L5_4);
        G3_L5_5 = findViewById(R.id.G3_L5_5);
        G3_L5_A = findViewById(R.id.G3_L5_A);
        G3_L5_B = findViewById(R.id.G3_L5_B);
        G3_L6_1 = findViewById(R.id.G3_L6_1);
        G3_L6_2 = findViewById(R.id.G3_L6_2);
        G3_L6_3 = findViewById(R.id.G3_L6_3);
        G3_L6_4 = findViewById(R.id.G3_L6_4);
        G3_L6_5 = findViewById(R.id.G3_L6_5);
        G3_L6_A = findViewById(R.id.G3_L6_A);
        G3_L6_B = findViewById(R.id.G3_L6_B);
        G3_L7_1 = findViewById(R.id.G3_L7_1);
        G3_L7_2 = findViewById(R.id.G3_L7_2);
        G3_L7_3 = findViewById(R.id.G3_L7_3);
        G3_L7_4 = findViewById(R.id.G3_L7_4);
        G3_L7_5 = findViewById(R.id.G3_L7_5);
        G3_L7_A = findViewById(R.id.G3_L7_A);
        G3_L7_B = findViewById(R.id.G3_L7_B);
        G3_L8_1 = findViewById(R.id.G3_L8_1);
        G3_L8_2 = findViewById(R.id.G3_L8_2);
        G3_L8_3 = findViewById(R.id.G3_L8_3);
        G3_L8_4 = findViewById(R.id.G3_L8_4);
        G3_L8_5 = findViewById(R.id.G3_L8_5);
        G3_L8_A = findViewById(R.id.G3_L8_A);
        G3_L8_B = findViewById(R.id.G3_L8_B);
        G3_L9_1 = findViewById(R.id.G3_L9_1);
        G3_L9_2 = findViewById(R.id.G3_L9_2);
        G3_L9_3 = findViewById(R.id.G3_L9_3);
        G3_L9_4 = findViewById(R.id.G3_L9_4);
        G3_L9_5 = findViewById(R.id.G3_L9_5);
        G3_L9_A = findViewById(R.id.G3_L9_A);
        G3_L9_B = findViewById(R.id.G3_L9_B);
        G3_L10_1 = findViewById(R.id.G3_L10_1);
        G3_L10_2 = findViewById(R.id.G3_L10_2);
        G3_L10_3 = findViewById(R.id.G3_L10_3);
        G3_L10_4 = findViewById(R.id.G3_L10_4);
        G3_L10_5 = findViewById(R.id.G3_L10_5);
        G3_L10_A = findViewById(R.id.G3_L10_A);
        G3_L10_B = findViewById(R.id.G3_L10_B);
        G3_L11_1 = findViewById(R.id.G3_L11_1);
        G3_L11_2 = findViewById(R.id.G3_L11_2);
        G3_L11_3 = findViewById(R.id.G3_L11_3);
        G3_L11_4 = findViewById(R.id.G3_L11_4);
        G3_L11_5 = findViewById(R.id.G3_L11_5);
        G3_L11_A = findViewById(R.id.G3_L11_A);
        G3_L11_B = findViewById(R.id.G3_L11_B);
        G3_L12_1 = findViewById(R.id.G3_L12_1);
        G3_L12_2 = findViewById(R.id.G3_L12_2);
        G3_L12_3 = findViewById(R.id.G3_L12_3);
        G3_L12_4 = findViewById(R.id.G3_L12_4);
        G3_L12_5 = findViewById(R.id.G3_L12_5);
        G3_L12_A = findViewById(R.id.G3_L12_A);
        G3_L12_B = findViewById(R.id.G3_L12_B);
    }
    private void NumberButton()
    {
        String Max_5_Num = getString(R.string.Max_5_Num);
        G3_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("0");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("0");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("0");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("0");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("0");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("1");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("1");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("1");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("1");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("1");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("2");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("2");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("2");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("2");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("2");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("3");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("3");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("3");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("3");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("3");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("4");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("4");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("4");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("4");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("4");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("5");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("5");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("5");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("5");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("5");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("6");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("6");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("6");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("6");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("6");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("7");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("7");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("7");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("7");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("7");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("8");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("8");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("8");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("8");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("8");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("9");
                }
                else if (!G3_txv1.getText().equals("") && G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("9");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("9");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("9");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("9");
                }
                else if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals(""))
                {
                    Toast.makeText(game3.this, Max_5_Num, Toast.LENGTH_SHORT).show();
                }
            }
        });
        G3_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!G3_txv5.getText().equals(""))
                {
                    G3_txv5.setText("");
                }
                else if(G3_txv5.getText().equals("") && !G3_txv4.getText().equals(""))
                {
                    G3_txv4.setText("");
                }
                else if(G3_txv5.getText().equals("") && G3_txv4.getText().equals("") && !G3_txv3.getText().equals(""))
                {
                    G3_txv3.setText("");
                }
                else if(G3_txv5.getText().equals("") && G3_txv4.getText().equals("") && G3_txv3.getText().equals("") && !G3_txv2.getText().equals(""))
                {
                    G3_txv2.setText("");
                }
                else if(G3_txv5.getText().equals("") && G3_txv4.getText().equals("") && G3_txv3.getText().equals("") && G3_txv2.getText().equals("") && !G3_txv1.getText().equals(""))
                {
                    G3_txv1.setText("");
                }
                else if(G3_txv5.getText().equals("") && G3_txv4.getText().equals("") && G3_txv3.getText().equals("") && G3_txv2.getText().equals("") && G3_txv1.getText().equals(""))
                {

                }
            }
        });
    }
    private void randomNumber()
    {
        randomNumList = Game.list(9,5);

        Log.d(TAG,"arr....."+randomNumList.get(0)+randomNumList.get(1)+randomNumList.get(2)+randomNumList.get(3)+randomNumList.get(4));
    }
    private void okButton()
    {
        if(!G3_txv1.getText().equals("") && !G3_txv2.getText().equals("") && !G3_txv3.getText().equals("") && !G3_txv4.getText().equals("") && !G3_txv5.getText().equals("")) {
            int Num1 = Integer.parseInt(G3_txv1.getText().toString());
            int Num2 = Integer.parseInt(G3_txv2.getText().toString());
            int Num3 = Integer.parseInt(G3_txv3.getText().toString());
            int Num4 = Integer.parseInt(G3_txv4.getText().toString());
            int Num5 = Integer.parseInt(G3_txv5.getText().toString());

            if (Num1 == Num2 || Num1 == Num3 || Num1 == Num4 || Num1 == Num5 || Num2 == Num3 || Num2 == Num4 || Num2 == Num5 || Num3 == Num4 || Num3 == Num5 || Num4 == Num5) {
                String toast = getResources().getString(R.string.cannot_input_same_numbers);
                Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
            } else {
                resultList.add(Num1);
                resultList.add(Num2);
                resultList.add(Num3);
                resultList.add(Num4);
                resultList.add(Num5);
                if (randomNumList.size() > 0) {
                    game = new Game(randomNumList,resultList);
                    int a = game.getA();
                    int b = game.getB();
                    boolean win = game.isWin();

                    String A = String.valueOf(a) + "A";
                    String B = String.valueOf(b) + "B";

                    if (G3_L1_1.getText().equals("")) {
                        G3_L1_1.setText(String.valueOf(Num1));
                        G3_L1_2.setText(String.valueOf(Num2));
                        G3_L1_3.setText(String.valueOf(Num3));
                        G3_L1_4.setText(String.valueOf(Num4));
                        G3_L1_5.setText(String.valueOf(Num5));
                        G3_L1_A.setText(A);
                        G3_L1_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && G3_L2_1.getText().equals("")) {
                        G3_L2_1.setText(String.valueOf(Num1));
                        G3_L2_2.setText(String.valueOf(Num2));
                        G3_L2_3.setText(String.valueOf(Num3));
                        G3_L2_4.setText(String.valueOf(Num4));
                        G3_L2_5.setText(String.valueOf(Num5));
                        G3_L2_A.setText(A);
                        G3_L2_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && G3_L3_1.getText().equals("")) {
                        G3_L3_1.setText(String.valueOf(Num1));
                        G3_L3_2.setText(String.valueOf(Num2));
                        G3_L3_3.setText(String.valueOf(Num3));
                        G3_L3_4.setText(String.valueOf(Num4));
                        G3_L3_5.setText(String.valueOf(Num5));
                        G3_L3_A.setText(A);
                        G3_L3_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && G3_L4_1.getText().equals("")) {
                        G3_L4_1.setText(String.valueOf(Num1));
                        G3_L4_2.setText(String.valueOf(Num2));
                        G3_L4_3.setText(String.valueOf(Num3));
                        G3_L4_4.setText(String.valueOf(Num4));
                        G3_L4_5.setText(String.valueOf(Num5));
                        G3_L4_A.setText(A);
                        G3_L4_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && G3_L5_1.getText().equals("")) {
                        G3_L5_1.setText(String.valueOf(Num1));
                        G3_L5_2.setText(String.valueOf(Num2));
                        G3_L5_3.setText(String.valueOf(Num3));
                        G3_L5_4.setText(String.valueOf(Num4));
                        G3_L5_5.setText(String.valueOf(Num5));
                        G3_L5_A.setText(A);
                        G3_L5_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && G3_L6_1.getText().equals("")) {
                        G3_L6_1.setText(String.valueOf(Num1));
                        G3_L6_2.setText(String.valueOf(Num2));
                        G3_L6_3.setText(String.valueOf(Num3));
                        G3_L6_4.setText(String.valueOf(Num4));
                        G3_L6_5.setText(String.valueOf(Num5));
                        G3_L6_A.setText(A);
                        G3_L6_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && !G3_L6_1.getText().equals("") && G3_L7_1.getText().equals("")) {
                        G3_L7_1.setText(String.valueOf(Num1));
                        G3_L7_2.setText(String.valueOf(Num2));
                        G3_L7_3.setText(String.valueOf(Num3));
                        G3_L7_4.setText(String.valueOf(Num4));
                        G3_L7_5.setText(String.valueOf(Num5));
                        G3_L7_A.setText(A);
                        G3_L7_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && !G3_L6_1.getText().equals("") && !G3_L7_1.getText().equals("") && G3_L8_1.getText().equals("")) {
                        G3_L8_1.setText(String.valueOf(Num1));
                        G3_L8_2.setText(String.valueOf(Num2));
                        G3_L8_3.setText(String.valueOf(Num3));
                        G3_L8_4.setText(String.valueOf(Num4));
                        G3_L8_5.setText(String.valueOf(Num5));
                        G3_L8_A.setText(A);
                        G3_L8_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && !G3_L6_1.getText().equals("") && !G3_L7_1.getText().equals("") && !G3_L8_1.getText().equals("") && G3_L9_1.getText().equals("")) {
                        G3_L9_1.setText(String.valueOf(Num1));
                        G3_L9_2.setText(String.valueOf(Num2));
                        G3_L9_3.setText(String.valueOf(Num3));
                        G3_L9_4.setText(String.valueOf(Num4));
                        G3_L9_5.setText(String.valueOf(Num5));
                        G3_L9_A.setText(A);
                        G3_L9_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && !G3_L6_1.getText().equals("") && !G3_L7_1.getText().equals("") && !G3_L8_1.getText().equals("") && !G3_L9_1.getText().equals("") && G3_L10_1.getText().equals("")) {
                        G3_L10_1.setText(String.valueOf(Num1));
                        G3_L10_2.setText(String.valueOf(Num2));
                        G3_L10_3.setText(String.valueOf(Num3));
                        G3_L10_4.setText(String.valueOf(Num4));
                        G3_L10_5.setText(String.valueOf(Num5));
                        G3_L10_A.setText(A);
                        G3_L10_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && !G3_L6_1.getText().equals("") && !G3_L7_1.getText().equals("") && !G3_L8_1.getText().equals("") && !G3_L9_1.getText().equals("") && !G3_L10_1.getText().equals("") && G3_L11_1.getText().equals("")) {
                        G3_L11_1.setText(String.valueOf(Num1));
                        G3_L11_2.setText(String.valueOf(Num2));
                        G3_L11_3.setText(String.valueOf(Num3));
                        G3_L11_4.setText(String.valueOf(Num4));
                        G3_L11_5.setText(String.valueOf(Num5));
                        G3_L11_A.setText(A);
                        G3_L11_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G3_L1_1.getText().equals("") && !G3_L2_1.getText().equals("") && !G3_L3_1.getText().equals("") && !G3_L4_1.getText().equals("") && !G3_L5_1.getText().equals("") && !G3_L6_1.getText().equals("") && !G3_L7_1.getText().equals("") && !G3_L8_1.getText().equals("") && !G3_L9_1.getText().equals("") && !G3_L10_1.getText().equals("") && !G3_L11_1.getText().equals("") && G3_L12_1.getText().equals("")) {
                        G3_L12_1.setText(String.valueOf(Num1));
                        G3_L12_2.setText(String.valueOf(Num2));
                        G3_L12_3.setText(String.valueOf(Num3));
                        G3_L12_4.setText(String.valueOf(Num4));
                        G3_L12_5.setText(String.valueOf(Num5));
                        G3_L12_A.setText(A);
                        G3_L12_B.setText(B);
                        if (win) {
                            dialog();
                        } else {
                            dialog_lose();
                        }
                        resultList.clear();
                    }
                }
            }
            G3_txv1.setText("");
            G3_txv2.setText("");
            G3_txv3.setText("");
            G3_txv4.setText("");
            G3_txv5.setText("");
        }
        else
        {
            String toast = getResources().getString(R.string.please_insert_5_numbers);
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
    }
    private void dialog()
    {
        Dialog dialog = new Dialog(game3.this);
        dialog.setContentView(R.layout.dialog);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.WRAP_CONTENT;

        again = dialog.findViewById(R.id.again);
        home = dialog.findViewById(R.id.home);

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                recreate();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    private void dialog_lose()
    {
        Dialog dialog = new Dialog(game3.this);
        dialog.setContentView(R.layout.dialog_lose);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.WRAP_CONTENT;

        L_again = dialog.findViewById(R.id.L_again);
        L_home = dialog.findViewById(R.id.L_home);
        answer = dialog.findViewById(R.id.answer);

        String text = "Answer: "+randomNumList.get(0)+""+randomNumList.get(1)+""+randomNumList.get(2)+""+randomNumList.get(3)+randomNumList.get(4);
        answer.setText(text);

        L_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                recreate();
            }
        });
        L_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    private void dialog_backPress()
    {
        Dialog dialog = new Dialog(game3.this);
        dialog.setContentView(R.layout.back_pressed);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.WRAP_CONTENT;

        finish = dialog.findViewById(R.id.finish);
        stay = dialog.findViewById(R.id.stay);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                dialog.dismiss();
            }
        });
        stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }

    private void dialog_leaveHint()
    {
        Dialog dialog = new Dialog(game3.this);
        dialog.setContentView(R.layout.leavehint);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.WRAP_CONTENT;

        leave_finish = dialog.findViewById(R.id.leave_finish);
        leave_continue = dialog.findViewById(R.id.leave_continue);

        leave_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                dialog.dismiss();
            }
        });
        leave_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        dialog_backPress();
    }

    @Override
    protected void onUserLeaveHint() {
       dialog_leaveHint();
    }

    //Menu Resources
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menu.findItem(R.menu.refresh);
        getMenuInflater().inflate(R.menu.refresh,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.refresh) {
            recreate();
        }
        else if(item.getItemId() == R.id.back)
        {
            onBackPressed();
        }
        return true;
    }
}