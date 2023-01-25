package com.example.finalcode2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
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

public class game2 extends AppCompatActivity {
    private static final String TAG = "game2";
    private TextView G2_1,G2_2,G2_3,G2_4,G2_5,G2_6,G2_7,G2_8,G2_9,G2_0,G2_C,G2_OK,G2_txv1,G2_txv2,G2_txv3,G2_txv4,
            G2_L1_1,G2_L1_2,G2_L1_3,G2_L1_4,G2_L1_A,G2_L1_B,G2_L2_1,G2_L2_2,G2_L2_3,G2_L2_4,G2_L2_A,G2_L2_B,G2_L3_1,G2_L3_2,G2_L3_3,G2_L3_4,G2_L3_A,G2_L3_B,G2_L4_1,G2_L4_2,G2_L4_3,G2_L4_4,G2_L4_A,G2_L4_B,
            G2_L5_1,G2_L5_2,G2_L5_3,G2_L5_4,G2_L5_A,G2_L5_B,G2_L6_1,G2_L6_2,G2_L6_3,G2_L6_4,G2_L6_A,G2_L6_B,G2_L7_1,G2_L7_2,G2_L7_3,G2_L7_4,G2_L7_A,G2_L7_B,G2_L8_1,G2_L8_2,G2_L8_3,G2_L8_4,G2_L8_A,G2_L8_B,
            G2_L9_1,G2_L9_2,G2_L9_3,G2_L9_4,G2_L9_A,G2_L9_B,G2_L10_1,G2_L10_2,G2_L10_3,G2_L10_4,G2_L10_A,G2_L10_B,answer;
    private Button again,home,L_again,L_home;
    private final List<Integer> resultList = new ArrayList<>();
    private final List<Integer> randomNumList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string._4_unique_numbers_and_10_chances);

        findId();
        NumberButton();
        randomNumber();
        G2_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okButton();
            }
        });
    }
    private void findId()
    {
        G2_txv1 = findViewById(R.id.G2_txv1);
        G2_txv2 = findViewById(R.id.G2_txv2);
        G2_txv3 = findViewById(R.id.G2_txv3);
        G2_txv4 = findViewById(R.id.G2_txv4);
        G2_0 = findViewById(R.id.G2_0);
        G2_1 = findViewById(R.id.G2_1);
        G2_2 = findViewById(R.id.G2_2);
        G2_3 = findViewById(R.id.G2_3);
        G2_4 = findViewById(R.id.G2_4);
        G2_5 = findViewById(R.id.G2_5);
        G2_6 = findViewById(R.id.G2_6);
        G2_7 = findViewById(R.id.G2_7);
        G2_8 = findViewById(R.id.G2_8);
        G2_9 = findViewById(R.id.G2_9);
        G2_C = findViewById(R.id.G2_C);
        G2_OK = findViewById(R.id.G2_OK);
        G2_L1_1 = findViewById(R.id.G2_L1_1);
        G2_L1_2 = findViewById(R.id.G2_L1_2);
        G2_L1_3 = findViewById(R.id.G2_L1_3);
        G2_L1_4 = findViewById(R.id.G2_L1_4);
        G2_L1_A = findViewById(R.id.G2_L1_A);
        G2_L1_B = findViewById(R.id.G2_L1_B);
        G2_L2_1 = findViewById(R.id.G2_L2_1);
        G2_L2_2 = findViewById(R.id.G2_L2_2);
        G2_L2_3 = findViewById(R.id.G2_L2_3);
        G2_L2_4 = findViewById(R.id.G2_L2_4);
        G2_L2_A = findViewById(R.id.G2_L2_A);
        G2_L2_B = findViewById(R.id.G2_L2_B);
        G2_L3_1 = findViewById(R.id.G2_L3_1);
        G2_L3_2 = findViewById(R.id.G2_L3_2);
        G2_L3_3 = findViewById(R.id.G2_L3_3);
        G2_L3_4 = findViewById(R.id.G2_L3_4);
        G2_L3_A = findViewById(R.id.G2_L3_A);
        G2_L3_B = findViewById(R.id.G2_L3_B);
        G2_L4_1 = findViewById(R.id.G2_L4_1);
        G2_L4_2 = findViewById(R.id.G2_L4_2);
        G2_L4_3 = findViewById(R.id.G2_L4_3);
        G2_L4_4 = findViewById(R.id.G2_L4_4);
        G2_L4_A = findViewById(R.id.G2_L4_A);
        G2_L4_B = findViewById(R.id.G2_L4_B);
        G2_L5_1 = findViewById(R.id.G2_L5_1);
        G2_L5_2 = findViewById(R.id.G2_L5_2);
        G2_L5_3 = findViewById(R.id.G2_L5_3);
        G2_L5_4 = findViewById(R.id.G2_L5_4);
        G2_L5_A = findViewById(R.id.G2_L5_A);
        G2_L5_B = findViewById(R.id.G2_L5_B);
        G2_L6_1 = findViewById(R.id.G2_L6_1);
        G2_L6_2 = findViewById(R.id.G2_L6_2);
        G2_L6_3 = findViewById(R.id.G2_L6_3);
        G2_L6_4 = findViewById(R.id.G2_L6_4);
        G2_L6_A = findViewById(R.id.G2_L6_A);
        G2_L6_B = findViewById(R.id.G2_L6_B);
        G2_L7_1 = findViewById(R.id.G2_L7_1);
        G2_L7_2 = findViewById(R.id.G2_L7_2);
        G2_L7_3 = findViewById(R.id.G2_L7_3);
        G2_L7_4 = findViewById(R.id.G2_L7_4);
        G2_L7_A = findViewById(R.id.G2_L7_A);
        G2_L7_B = findViewById(R.id.G2_L7_B);
        G2_L8_1 = findViewById(R.id.G2_L8_1);
        G2_L8_2 = findViewById(R.id.G2_L8_2);
        G2_L8_3 = findViewById(R.id.G2_L8_3);
        G2_L8_4 = findViewById(R.id.G2_L8_4);
        G2_L8_A = findViewById(R.id.G2_L8_A);
        G2_L8_B = findViewById(R.id.G2_L8_B);
        G2_L9_1 = findViewById(R.id.G2_L9_1);
        G2_L9_2 = findViewById(R.id.G2_L9_2);
        G2_L9_3 = findViewById(R.id.G2_L9_3);
        G2_L9_4 = findViewById(R.id.G2_L9_4);
        G2_L9_A = findViewById(R.id.G2_L9_A);
        G2_L9_B = findViewById(R.id.G2_L9_B);
        G2_L10_1 = findViewById(R.id.G2_L10_1);
        G2_L10_2 = findViewById(R.id.G2_L10_2);
        G2_L10_3 = findViewById(R.id.G2_L10_3);
        G2_L10_4 = findViewById(R.id.G2_L10_4);
        G2_L10_A = findViewById(R.id.G2_L10_A);
        G2_L10_B = findViewById(R.id.G2_L10_B);
    }
    private void NumberButton()
    {
        G2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("0");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("0");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("0");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("0");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("1");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("1");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("1");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("1");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("2");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("2");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("2");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("2");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("3");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("3");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("3");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("3");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("4");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("4");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("4");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("4");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("5");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("5");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("5");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("5");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("6");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("6");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("6");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("6");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("7");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("7");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("7");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("7");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("8");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("8");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("8");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("8");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("9");
                }
                else if (!G2_txv1.getText().equals("") && G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("9");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("9");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("9");
                }
                else if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals(""))
                {
                    Toast.makeText(game2.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        G2_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!G2_txv4.getText().equals(""))
                {
                    G2_txv4.setText("");
                }
                else if(G2_txv4.getText().equals("") && !G2_txv3.getText().equals(""))
                {
                    G2_txv3.setText("");
                }
                else if(G2_txv4.getText().equals("") && G2_txv3.getText().equals("") && !G2_txv2.getText().equals(""))
                {
                    G2_txv2.setText("");
                }
                else if(G2_txv4.getText().equals("") && G2_txv3.getText().equals("") && G2_txv2.getText().equals("") && !G2_txv1.getText().equals(""))
                {
                    G2_txv1.setText("");
                }
                else if(G2_txv4.getText().equals("") && G2_txv3.getText().equals("") && G2_txv2.getText().equals("") && G2_txv1.getText().equals(""))
                {

                }
            }
        });
    }
    private void randomNumber()
    {
        int[] num = new int[9];

        for(int i = 0 ; i<num.length ; i++)
        {
            num[i] = i + 1;
        }

        int[] arr = new int[4];
        int n;

        for(int i=0 ; i< arr.length ; i++)
        {
            n = (int) (Math.random()*(9-i));
            arr[i] = num[n];
            for(int j = n; j < num.length-1 ; j++)
            {
                num[j] = num[j+1];
            }
        }
        randomNumList.add(arr[0]);
        randomNumList.add(arr[1]);
        randomNumList.add(arr[2]);
        randomNumList.add(arr[3]);

        Log.d(TAG,"arr....."+arr[0]+arr[1]+arr[2]+arr[3]);
    }
    private void okButton()
    {
        if(!G2_txv1.getText().equals("") && !G2_txv2.getText().equals("") && !G2_txv3.getText().equals("") && !G2_txv4.getText().equals("")) {
            int Num1 = Integer.parseInt(G2_txv1.getText().toString());
            int Num2 = Integer.parseInt(G2_txv2.getText().toString());
            int Num3 = Integer.parseInt(G2_txv3.getText().toString());
            int Num4 = Integer.parseInt(G2_txv4.getText().toString());

            if (Num1 == Num2 || Num1 == Num3 || Num1 == Num4 || Num2 == Num3 || Num2 == Num4 || Num3 == Num4) {
                Toast.makeText(this, "can not input same number", Toast.LENGTH_SHORT).show();
            } else {
                resultList.add(Num1);
                resultList.add(Num2);
                resultList.add(Num3);
                resultList.add(Num4);

                if (randomNumList.size() > 0) {
                    boolean win = false;

                    int a = 0, b = 0;

                    for (int i = 0; i < 4; i++) {
                        if (resultList.get(i) == randomNumList.get(i)) {
                            a++;
                        } else {
                            for (int j = 0; j < 4; j++) {
                                if (resultList.get(i) == randomNumList.get(j)) {
                                    b++;
                                }
                            }
                        }
                    }
                    if (a == 4) {
                        win = true;
                    }
                    AlertDialog.Builder dialog = new AlertDialog.Builder(game2.this);
                    if (G2_L1_1.getText().equals("")) {
                        G2_L1_1.setText(String.valueOf(Num1));
                        G2_L1_2.setText(String.valueOf(Num2));
                        G2_L1_3.setText(String.valueOf(Num3));
                        G2_L1_4.setText(String.valueOf(Num4));
                        G2_L1_A.setText(String.valueOf(a) + "A");
                        G2_L1_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && G2_L2_1.getText().equals("")) {
                        G2_L2_1.setText(String.valueOf(Num1));
                        G2_L2_2.setText(String.valueOf(Num2));
                        G2_L2_3.setText(String.valueOf(Num3));
                        G2_L2_4.setText(String.valueOf(Num4));
                        G2_L2_A.setText(String.valueOf(a) + "A");
                        G2_L2_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && G2_L3_1.getText().equals("")) {
                        G2_L3_1.setText(String.valueOf(Num1));
                        G2_L3_2.setText(String.valueOf(Num2));
                        G2_L3_3.setText(String.valueOf(Num3));
                        G2_L3_4.setText(String.valueOf(Num4));
                        G2_L3_A.setText(String.valueOf(a) + "A");
                        G2_L3_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && G2_L4_1.getText().equals("")) {
                        G2_L4_1.setText(String.valueOf(Num1));
                        G2_L4_2.setText(String.valueOf(Num2));
                        G2_L4_3.setText(String.valueOf(Num3));
                        G2_L4_4.setText(String.valueOf(Num4));
                        G2_L4_A.setText(String.valueOf(a) + "A");
                        G2_L4_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && !G2_L4_1.getText().equals("") && G2_L5_1.getText().equals("")) {
                        G2_L5_1.setText(String.valueOf(Num1));
                        G2_L5_2.setText(String.valueOf(Num2));
                        G2_L5_3.setText(String.valueOf(Num3));
                        G2_L5_4.setText(String.valueOf(Num4));
                        G2_L5_A.setText(String.valueOf(a) + "A");
                        G2_L5_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && !G2_L4_1.getText().equals("") && !G2_L5_1.getText().equals("") && G2_L6_1.getText().equals("")) {
                        G2_L6_1.setText(String.valueOf(Num1));
                        G2_L6_2.setText(String.valueOf(Num2));
                        G2_L6_3.setText(String.valueOf(Num3));
                        G2_L6_4.setText(String.valueOf(Num4));
                        G2_L6_A.setText(String.valueOf(a) + "A");
                        G2_L6_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && !G2_L4_1.getText().equals("") && !G2_L5_1.getText().equals("") && !G2_L6_1.getText().equals("") && G2_L7_1.getText().equals("")) {
                        G2_L7_1.setText(String.valueOf(Num1));
                        G2_L7_2.setText(String.valueOf(Num2));
                        G2_L7_3.setText(String.valueOf(Num3));
                        G2_L7_4.setText(String.valueOf(Num4));
                        G2_L7_A.setText(String.valueOf(a) + "A");
                        G2_L7_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && !G2_L4_1.getText().equals("") && !G2_L5_1.getText().equals("") && !G2_L6_1.getText().equals("") && !G2_L7_1.getText().equals("") && G2_L8_1.getText().equals("")) {
                        G2_L8_1.setText(String.valueOf(Num1));
                        G2_L8_2.setText(String.valueOf(Num2));
                        G2_L8_3.setText(String.valueOf(Num3));
                        G2_L8_4.setText(String.valueOf(Num4));
                        G2_L8_A.setText(String.valueOf(a) + "A");
                        G2_L8_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && !G2_L4_1.getText().equals("") && !G2_L5_1.getText().equals("") && !G2_L6_1.getText().equals("") && !G2_L7_1.getText().equals("") && !G2_L8_1.getText().equals("") && G2_L9_1.getText().equals("")) {
                        G2_L9_1.setText(String.valueOf(Num1));
                        G2_L9_2.setText(String.valueOf(Num2));
                        G2_L9_3.setText(String.valueOf(Num3));
                        G2_L9_4.setText(String.valueOf(Num4));
                        G2_L9_A.setText(String.valueOf(a) + "A");
                        G2_L9_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!G2_L1_1.getText().equals("") && !G2_L2_1.getText().equals("") && !G2_L3_1.getText().equals("") && !G2_L4_1.getText().equals("") && !G2_L5_1.getText().equals("") && !G2_L6_1.getText().equals("") && !G2_L7_1.getText().equals("") && !G2_L8_1.getText().equals("") && !G2_L9_1.getText().equals("") && G2_L10_1.getText().equals("")) {
                        G2_L10_1.setText(String.valueOf(Num1));
                        G2_L10_2.setText(String.valueOf(Num2));
                        G2_L10_3.setText(String.valueOf(Num3));
                        G2_L10_4.setText(String.valueOf(Num4));
                        G2_L10_A.setText(String.valueOf(a) + "A");
                        G2_L10_B.setText(String.valueOf(b) + "B");
                        if (win) {
                            dialog();
                        } else {
                            dialog_lose();
                        }
                        resultList.clear();
                    }
                }
            }
            G2_txv1.setText("");
            G2_txv2.setText("");
            G2_txv3.setText("");
            G2_txv4.setText("");
        }
        else
        {
            Toast.makeText(this, "please insert 4 numbers", Toast.LENGTH_SHORT).show();
        }
    }
    private void dialog()
    {
        Dialog dialog = new Dialog(game2.this);
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
                Intent intent = new Intent(game2.this,HomePage.class);
                startActivity(intent);
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    private void dialog_lose()
    {
        Dialog dialog = new Dialog(game2.this);
        dialog.setContentView(R.layout.dialog_lose);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.WRAP_CONTENT;

        L_again = dialog.findViewById(R.id.L_again);
        L_home = dialog.findViewById(R.id.L_home);
        answer = dialog.findViewById(R.id.answer);

        String text = "Answer: "+randomNumList.get(0)+""+randomNumList.get(1)+""+randomNumList.get(2)+""+randomNumList.get(3);
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
                Intent intent = new Intent(game2.this,HomePage.class);
                startActivity(intent);
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
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
        return true;
    }
}