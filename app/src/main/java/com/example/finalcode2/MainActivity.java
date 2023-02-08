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
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView _1,_2,_3,_4,_5,_6,_7,_8,_9,_0,C,OK,txv1,txv2,txv3,txv4,
            L1_1,L1_2,L1_3,L1_4,L1_A,L1_B,L2_1,L2_2,L2_3,L2_4,L2_A,L2_B,L3_1,L3_2,L3_3,L3_4,L3_A,L3_B,L4_1,L4_2,L4_3,L4_4,L4_A,L4_B,
            L5_1,L5_2,L5_3,L5_4,L5_A,L5_B,L6_1,L6_2,L6_3,L6_4,L6_A,L6_B,L7_1,L7_2,L7_3,L7_4,L7_A,L7_B,L8_1,L8_2,L8_3,L8_4,L8_A,L8_B,answer;
    private Button again,home,L_again,L_home,finish,stay;
    private final List<Integer> resultList = new ArrayList<>();
    private List<Integer> randomNumList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string._4_unique_numbers_and_8_chances);

        FindId();
        NumberButton();
        randomNumber();
        OK.setOnClickListener(v -> okButton());
    }
    private void FindId()
    {
        txv1 = findViewById(R.id.txv1);
        txv2 = findViewById(R.id.txv2);
        txv3 = findViewById(R.id.txv3);
        txv4 = findViewById(R.id.txv4);
        _0 = findViewById(R.id._0);
        _1 = findViewById(R.id._1);
        _2 = findViewById(R.id._2);
        _3 = findViewById(R.id._3);
        _4 = findViewById(R.id._4);
        _5 = findViewById(R.id._5);
        _6 = findViewById(R.id._6);
        _7 = findViewById(R.id._7);
        _8 = findViewById(R.id._8);
        _9 = findViewById(R.id._9);
        C = findViewById(R.id.C);
        OK = findViewById(R.id.OK);
        L1_1 = findViewById(R.id.L1_1);
        L1_2 = findViewById(R.id.L1_2);
        L1_3 = findViewById(R.id.L1_3);
        L1_4 = findViewById(R.id.L1_4);
        L1_A = findViewById(R.id.L1_A);
        L1_B = findViewById(R.id.L1_B);
        L2_1 = findViewById(R.id.L2_1);
        L2_2 = findViewById(R.id.L2_2);
        L2_3 = findViewById(R.id.L2_3);
        L2_4 = findViewById(R.id.L2_4);
        L2_A = findViewById(R.id.L2_A);
        L2_B = findViewById(R.id.L2_B);
        L3_1 = findViewById(R.id.L3_1);
        L3_2 = findViewById(R.id.L3_2);
        L3_3 = findViewById(R.id.L3_3);
        L3_4 = findViewById(R.id.L3_4);
        L3_A = findViewById(R.id.L3_A);
        L3_B = findViewById(R.id.L3_B);
        L4_1 = findViewById(R.id.L4_1);
        L4_2 = findViewById(R.id.L4_2);
        L4_3 = findViewById(R.id.L4_3);
        L4_4 = findViewById(R.id.L4_4);
        L4_A = findViewById(R.id.L4_A);
        L4_B = findViewById(R.id.L4_B);
        L5_1 = findViewById(R.id.L5_1);
        L5_2 = findViewById(R.id.L5_2);
        L5_3 = findViewById(R.id.L5_3);
        L5_4 = findViewById(R.id.L5_4);
        L5_A = findViewById(R.id.L5_A);
        L5_B = findViewById(R.id.L5_B);
        L6_1 = findViewById(R.id.L6_1);
        L6_2 = findViewById(R.id.L6_2);
        L6_3 = findViewById(R.id.L6_3);
        L6_4 = findViewById(R.id.L6_4);
        L6_A = findViewById(R.id.L6_A);
        L6_B = findViewById(R.id.L6_B);
        L7_1 = findViewById(R.id.L7_1);
        L7_2 = findViewById(R.id.L7_2);
        L7_3 = findViewById(R.id.L7_3);
        L7_4 = findViewById(R.id.L7_4);
        L7_A = findViewById(R.id.L7_A);
        L7_B = findViewById(R.id.L7_B);
        L8_1 = findViewById(R.id.L8_1);
        L8_2 = findViewById(R.id.L8_2);
        L8_3 = findViewById(R.id.L8_3);
        L8_4 = findViewById(R.id.L8_4);
        L8_A = findViewById(R.id.L8_A);
        L8_B = findViewById(R.id.L8_B);
    }
    private void NumberButton()
    {
        _0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("0");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("0");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("0");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("0");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("1");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("1");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("1");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("1");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("2");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("2");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("2");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("2");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("3");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("3");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("3");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("3");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("4");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("4");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("4");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("4");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("5");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("5");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("5");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("5");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("6");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("6");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("6");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("6");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("7");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("7");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("7");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("7");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("8");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("8");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("8");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("8");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        _9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txv1.getText().equals(""))
                {
                    txv1.setText("9");
                }
                else if (!txv1.getText().equals("") && txv2.getText().equals(""))
                {
                    txv2.setText("9");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && txv3.getText().equals(""))
                {
                    txv3.setText("9");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && txv4.getText().equals(""))
                {
                    txv4.setText("9");
                }
                else if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Max 4 Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txv4.getText().equals(""))
                {
                    txv4.setText("");
                }
                else if(txv4.getText().equals("") && !txv3.getText().equals(""))
                {
                    txv3.setText("");
                }
                else if(txv4.getText().equals("") && txv3.getText().equals("") && !txv2.getText().equals(""))
                {
                    txv2.setText("");
                }
                else if(txv4.getText().equals("") && txv3.getText().equals("") && txv2.getText().equals("") && !txv1.getText().equals(""))
                {
                    txv1.setText("");
                }
                else if(txv4.getText().equals("") && txv3.getText().equals("") && txv2.getText().equals("") && txv1.getText().equals(""))
                {

                }
            }
        });
    }
    private void randomNumber()
    {
        randomNumList = Game.list(9,4);

        Log.d(TAG,"arr....."+randomNumList.get(0)+randomNumList.get(1)+randomNumList.get(2)+randomNumList.get(3));
    }
    private void okButton()
    {
        if(!txv1.getText().equals("") && !txv2.getText().equals("") && !txv3.getText().equals("") && !txv4.getText().equals("")) {
            int Num1 = Integer.parseInt(txv1.getText().toString());
            int Num2 = Integer.parseInt(txv2.getText().toString());
            int Num3 = Integer.parseInt(txv3.getText().toString());
            int Num4 = Integer.parseInt(txv4.getText().toString());

            if (Num1 == Num2 || Num1 == Num3 || Num1 == Num4 || Num2 == Num3 || Num2 == Num4 || Num3 == Num4) {
                String toast = getResources().getString(R.string.cannot_input_same_numbers);
                Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
            } else {
                resultList.add(Num1);
                resultList.add(Num2);
                resultList.add(Num3);
                resultList.add(Num4);

                if (randomNumList.size() > 0) {

                    Game game = new Game(randomNumList,resultList);
                    int a = game.getA();
                    int b = game.getB();
                    boolean win = game.isWin();

                    String A = String.valueOf(a) + "A";
                    String B = String.valueOf(b) + "B";

                    if (L1_1.getText().equals("")) {
                        L1_1.setText(String.valueOf(Num1));
                        L1_2.setText(String.valueOf(Num2));
                        L1_3.setText(String.valueOf(Num3));
                        L1_4.setText(String.valueOf(Num4));
                        L1_A.setText(A);
                        L1_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && L2_1.getText().equals("")) {
                        L2_1.setText(String.valueOf(Num1));
                        L2_2.setText(String.valueOf(Num2));
                        L2_3.setText(String.valueOf(Num3));
                        L2_4.setText(String.valueOf(Num4));
                        L2_A.setText(A);
                        L2_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && !L2_1.getText().equals("") && L3_1.getText().equals("")) {
                        L3_1.setText(String.valueOf(Num1));
                        L3_2.setText(String.valueOf(Num2));
                        L3_3.setText(String.valueOf(Num3));
                        L3_4.setText(String.valueOf(Num4));
                        L3_A.setText(A);
                        L3_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && !L2_1.getText().equals("") && !L3_1.getText().equals("") && L4_1.getText().equals("")) {
                        L4_1.setText(String.valueOf(Num1));
                        L4_2.setText(String.valueOf(Num2));
                        L4_3.setText(String.valueOf(Num3));
                        L4_4.setText(String.valueOf(Num4));
                        L4_A.setText(A);
                        L4_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && !L2_1.getText().equals("") && !L3_1.getText().equals("") && !L4_1.getText().equals("") && L5_1.getText().equals("")) {
                        L5_1.setText(String.valueOf(Num1));
                        L5_2.setText(String.valueOf(Num2));
                        L5_3.setText(String.valueOf(Num3));
                        L5_4.setText(String.valueOf(Num4));
                        L5_A.setText(A);
                        L5_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && !L2_1.getText().equals("") && !L3_1.getText().equals("") && !L4_1.getText().equals("") && !L5_1.getText().equals("") && L6_1.getText().equals("")) {
                        L6_1.setText(String.valueOf(Num1));
                        L6_2.setText(String.valueOf(Num2));
                        L6_3.setText(String.valueOf(Num3));
                        L6_4.setText(String.valueOf(Num4));
                        L6_A.setText(A);
                        L6_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && !L2_1.getText().equals("") && !L3_1.getText().equals("") && !L4_1.getText().equals("") && !L5_1.getText().equals("") && !L6_1.getText().equals("") && L7_1.getText().equals("")) {
                        L7_1.setText(String.valueOf(Num1));
                        L7_2.setText(String.valueOf(Num2));
                        L7_3.setText(String.valueOf(Num3));
                        L7_4.setText(String.valueOf(Num4));
                        L7_A.setText(A);
                        L7_B.setText(B);
                        if (win) {
                            dialog();
                        }
                        resultList.clear();
                    } else if (!L1_1.getText().equals("") && !L2_1.getText().equals("") && !L3_1.getText().equals("") && !L4_1.getText().equals("") && !L5_1.getText().equals("") && !L6_1.getText().equals("") && !L7_1.getText().equals("") && L8_1.getText().equals("")) {
                        L8_1.setText(String.valueOf(Num1));
                        L8_2.setText(String.valueOf(Num2));
                        L8_3.setText(String.valueOf(Num3));
                        L8_4.setText(String.valueOf(Num4));
                        L8_A.setText(A);
                        L8_B.setText(B);
                        if (win) {
                            dialog();
                        } else {
                            dialog_lose();
                        }
                        resultList.clear();
                    }
                }
            }
            txv1.setText("");
            txv2.setText("");
            txv3.setText("");
            txv4.setText("");
        }
        else
        {
            String toast = getResources().getString(R.string.please_insert_4_numbers);
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
    }
    private void dialog()
    {
        Dialog dialog = new Dialog(MainActivity.this);
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
                Intent intent = new Intent(MainActivity.this,HomePage.class);
                startActivity(intent);
            }
        });

        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    private void dialog_lose()
    {
        Dialog dialog = new Dialog(MainActivity.this);
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
                Intent intent = new Intent(MainActivity.this,HomePage.class);
                startActivity(intent);
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    private void dialog_backPress()
    {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.back_pressed);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.WRAP_CONTENT;

        finish = dialog.findViewById(R.id.finish);
        stay = dialog.findViewById(R.id.stay);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menu.findItem(R.menu.refresh);
        getMenuInflater().inflate(R.menu.refresh,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.refresh)
        {
            recreate();
        }
        else if(item.getItemId() == R.id.back)
        {
            onBackPressed();
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        dialog_backPress();
    }
}