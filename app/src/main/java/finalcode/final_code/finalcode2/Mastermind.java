package finalcode.final_code.finalcode2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mastermind extends AppCompatActivity {
    private static final String TAG = "Mastermind";
    private TextView M_L1_1,M_L1_2,M_L1_3,M_L1_4,M_L1_5,M_L1_6,M_L1_7,M_L1_8,M_L2_1,M_L2_2,M_L2_3,M_L2_4,M_L2_5,M_L2_6,M_L2_7,M_L2_8,
            M_L3_1,M_L3_2,M_L3_3,M_L3_4,M_L3_5,M_L3_6,M_L3_7,M_L3_8,M_L4_1,M_L4_2,M_L4_3,M_L4_4,M_L4_5,M_L4_6,M_L4_7,M_L4_8,M_L5_1,M_L5_2,M_L5_3,M_L5_4,M_L5_5,M_L5_6,M_L5_7,M_L5_8,
            M_L6_1,M_L6_2,M_L6_3,M_L6_4,M_L6_5,M_L6_6,M_L6_7,M_L6_8,M_L7_1,M_L7_2,M_L7_3,M_L7_4,M_L7_5,M_L7_6,M_L7_7,M_L7_8,M_L8_1,M_L8_2,M_L8_3,M_L8_4,M_L8_5,M_L8_6,M_L8_7,M_L8_8,
            M_green,M_blue,M_purple,M_pink,M_red,M_orange,M_yellow,M_darkblue,M_L0_1,M_L0_2,M_L0_3,M_L0_4,ok,backspace;
    private final List<Integer> resultList = new ArrayList<>();
    private List<Integer> randomNumList = new ArrayList<>();
    private final MyDialog myDialog = new MyDialog(Mastermind.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mastermind);

        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string.mastermind);

        findId();
        colorButton();
    }
    private void findId()
    {
        M_L0_1 = findViewById(R.id.M_L0_1);
        M_L0_2 = findViewById(R.id.M_L0_2);
        M_L0_3 = findViewById(R.id.M_L0_3);
        M_L0_4 = findViewById(R.id.M_L0_4);
        M_L1_1 = findViewById(R.id.M_L1_1);
        M_L1_2 = findViewById(R.id.M_L1_2);
        M_L1_3 = findViewById(R.id.M_L1_3);
        M_L1_4 = findViewById(R.id.M_L1_4);
        M_L1_5 = findViewById(R.id.M_L1_5);
        M_L1_6 = findViewById(R.id.M_L1_6);
        M_L1_7 = findViewById(R.id.M_L1_7);
        M_L1_8 = findViewById(R.id.M_L1_8);
        M_L2_1 = findViewById(R.id.M_L2_1);
        M_L2_2 = findViewById(R.id.M_L2_2);
        M_L2_3 = findViewById(R.id.M_L2_3);
        M_L2_4 = findViewById(R.id.M_L2_4);
        M_L2_5 = findViewById(R.id.M_L2_5);
        M_L2_6 = findViewById(R.id.M_L2_6);
        M_L2_7 = findViewById(R.id.M_L2_7);
        M_L2_8 = findViewById(R.id.M_L2_8);
        M_L3_1 = findViewById(R.id.M_L3_1);
        M_L3_2 = findViewById(R.id.M_L3_2);
        M_L3_3 = findViewById(R.id.M_L3_3);
        M_L3_4 = findViewById(R.id.M_L3_4);
        M_L3_5 = findViewById(R.id.M_L3_5);
        M_L3_6 = findViewById(R.id.M_L3_6);
        M_L3_7 = findViewById(R.id.M_L3_7);
        M_L3_8 = findViewById(R.id.M_L3_8);
        M_L4_1 = findViewById(R.id.M_L4_1);
        M_L4_2 = findViewById(R.id.M_L4_2);
        M_L4_3 = findViewById(R.id.M_L4_3);
        M_L4_4 = findViewById(R.id.M_L4_4);
        M_L4_5 = findViewById(R.id.M_L4_5);
        M_L4_6 = findViewById(R.id.M_L4_6);
        M_L4_7 = findViewById(R.id.M_L4_7);
        M_L4_8 = findViewById(R.id.M_L4_8);
        M_L5_1 = findViewById(R.id.M_L5_1);
        M_L5_2 = findViewById(R.id.M_L5_2);
        M_L5_3 = findViewById(R.id.M_L5_3);
        M_L5_4 = findViewById(R.id.M_L5_4);
        M_L5_5 = findViewById(R.id.M_L5_5);
        M_L5_6 = findViewById(R.id.M_L5_6);
        M_L5_7 = findViewById(R.id.M_L5_7);
        M_L5_8 = findViewById(R.id.M_L5_8);
        M_L6_1 = findViewById(R.id.M_L6_1);
        M_L6_2 = findViewById(R.id.M_L6_2);
        M_L6_3 = findViewById(R.id.M_L6_3);
        M_L6_4 = findViewById(R.id.M_L6_4);
        M_L6_5 = findViewById(R.id.M_L6_5);
        M_L6_6 = findViewById(R.id.M_L6_6);
        M_L6_7 = findViewById(R.id.M_L6_7);
        M_L6_8 = findViewById(R.id.M_L6_8);
        M_L7_1 = findViewById(R.id.M_L7_1);
        M_L7_2 = findViewById(R.id.M_L7_2);
        M_L7_3 = findViewById(R.id.M_L7_3);
        M_L7_4 = findViewById(R.id.M_L7_4);
        M_L7_5 = findViewById(R.id.M_L7_5);
        M_L7_6 = findViewById(R.id.M_L7_6);
        M_L7_7 = findViewById(R.id.M_L7_7);
        M_L7_8 = findViewById(R.id.M_L7_8);
        M_L8_1 = findViewById(R.id.M_L8_1);
        M_L8_2 = findViewById(R.id.M_L8_2);
        M_L8_3 = findViewById(R.id.M_L8_3);
        M_L8_4 = findViewById(R.id.M_L8_4);
        M_L8_5 = findViewById(R.id.M_L8_5);
        M_L8_6 = findViewById(R.id.M_L8_6);
        M_L8_7 = findViewById(R.id.M_L8_7);
        M_L8_8 = findViewById(R.id.M_L8_8);
        M_green = findViewById(R.id.M_green);
        M_blue = findViewById(R.id.M_blue);
        M_purple = findViewById(R.id.M_purple);
        M_pink = findViewById(R.id.M_pink);
        M_red = findViewById(R.id.M_red);
        M_orange = findViewById(R.id.M_orange);
        M_yellow = findViewById(R.id.M_yellow);
        M_darkblue = findViewById(R.id.M_darkblue);
        ok = findViewById(R.id.M_ok);
        backspace = findViewById(R.id.M_backspace);
    }
    private void colorButton()
    {
        final Drawable green = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_green);
        final Drawable blue = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_blue);
        final Drawable purple = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_purple);
        final Drawable pink = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_pink);
        final Drawable red = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_red);
        final Drawable orange = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_orange);
        final Drawable darkblue = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_darkblue);
        final Drawable yellow = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_yellow);
        final Drawable result_red = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_result_red);
        final Drawable result_green = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_result_green);
        final Drawable result_x = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_result_whit);
        final Drawable M = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_1);
        final Drawable M2 = AppCompatResources.getDrawable(Mastermind.this,R.drawable.mastermind_2);

        randomNumber();

        M_L0_1.setBackground(M);
        M_L0_2.setBackground(M);
        M_L0_3.setBackground(M);
        M_L0_4.setBackground(M);
        M_L1_1.setBackground(M);
        M_L2_1.setBackground(M);
        M_L3_1.setBackground(M);
        M_L4_1.setBackground(M);
        M_L5_1.setBackground(M);
        M_L6_1.setBackground(M);
        M_L7_1.setBackground(M);
        M_L8_1.setBackground(M);
        M_L1_5.setBackground(M2);
        M_L2_5.setBackground(M2);
        M_L3_5.setBackground(M2);
        M_L4_5.setBackground(M2);
        M_L5_5.setBackground(M2);
        M_L6_5.setBackground(M2);
        M_L7_5.setBackground(M2);
        M_L8_5.setBackground(M2);

        String Max_4_colors = getString(R.string.Max_4_colors);
        M_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(green);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(green);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(green);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(green);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(blue);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(blue);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(blue);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(blue);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(purple);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(purple);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(purple);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(purple);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(pink);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(pink);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(pink);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(pink);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(red);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(red);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(red);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(red);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(orange);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(orange);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(orange);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(orange);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(yellow);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(yellow);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(yellow);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(yellow);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        M_darkblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(darkblue);
                }
                else if(!M_L0_1.getBackground().equals(M) && M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(darkblue);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(darkblue);
                }
                else if(!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(darkblue);
                }
                else
                {
                    Toast.makeText(Mastermind.this, Max_4_colors, Toast.LENGTH_SHORT).show();
                }
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!M_L0_4.getBackground().equals(M))
                {
                    M_L0_4.setBackground(M);
                }
                else if(M_L0_4.getBackground().equals(M) && !M_L0_3.getBackground().equals(M))
                {
                    M_L0_3.setBackground(M);
                }
                else if(M_L0_4.getBackground().equals(M) && M_L0_3.getBackground().equals(M) && !M_L0_2.getBackground().equals(M))
                {
                    M_L0_2.setBackground(M);
                }
                else if(M_L0_4.getBackground().equals(M) && M_L0_3.getBackground().equals(M) && M_L0_2.getBackground().equals(M) && !M_L0_1.getBackground().equals(M))
                {
                    M_L0_1.setBackground(M);
                }
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!M_L0_1.getBackground().equals(M) && !M_L0_2.getBackground().equals(M) && !M_L0_3.getBackground().equals(M) && !M_L0_4.getBackground().equals(M)) {
                    if (M_L0_1.getBackground().equals(green)) {
                        resultList.add(1);
                    } else if (M_L0_1.getBackground().equals(blue)) {
                        resultList.add(2);
                    } else if (M_L0_1.getBackground().equals(purple)) {
                        resultList.add(3);
                    } else if (M_L0_1.getBackground().equals(yellow)) {
                        resultList.add(4);
                    } else if (M_L0_1.getBackground().equals(pink)) {
                        resultList.add(5);
                    } else if (M_L0_1.getBackground().equals(red)) {
                        resultList.add(6);
                    } else if (M_L0_1.getBackground().equals(orange)){
                        resultList.add(7);
                    } else if (M_L0_1.getBackground().equals(darkblue)){
                        resultList.add(8);
                    }

                    if (M_L0_2.getBackground().equals(green)) {
                        resultList.add(1);
                    } else if (M_L0_2.getBackground().equals(blue)) {
                        resultList.add(2);
                    } else if (M_L0_2.getBackground().equals(purple)) {
                        resultList.add(3);
                    } else if (M_L0_2.getBackground().equals(yellow)) {
                        resultList.add(4);
                    } else if (M_L0_2.getBackground().equals(pink)) {
                        resultList.add(5);
                    } else if (M_L0_2.getBackground().equals(red)) {
                        resultList.add(6);
                    } else if (M_L0_2.getBackground().equals(orange)){
                        resultList.add(7);
                    } else if (M_L0_2.getBackground().equals(darkblue)){
                        resultList.add(8);
                    }

                    if (M_L0_3.getBackground().equals(green)) {
                        resultList.add(1);
                    } else if (M_L0_3.getBackground().equals(blue)) {
                        resultList.add(2);
                    } else if (M_L0_3.getBackground().equals(purple)) {
                        resultList.add(3);
                    } else if (M_L0_3.getBackground().equals(yellow)) {
                        resultList.add(4);
                    } else if (M_L0_3.getBackground().equals(pink)) {
                        resultList.add(5);
                    } else if (M_L0_3.getBackground().equals(red)) {
                        resultList.add(6);
                    } else if (M_L0_3.getBackground().equals(orange)){
                        resultList.add(7);
                    } else if (M_L0_3.getBackground().equals(darkblue)){
                        resultList.add(8);
                    }

                    if (M_L0_4.getBackground().equals(green)) {
                        resultList.add(1);
                    } else if (M_L0_4.getBackground().equals(blue)) {
                        resultList.add(2);
                    } else if (M_L0_4.getBackground().equals(purple)) {
                        resultList.add(3);
                    } else if (M_L0_4.getBackground().equals(yellow)) {
                        resultList.add(4);
                    } else if (M_L0_4.getBackground().equals(pink)) {
                        resultList.add(5);
                    } else if (M_L0_4.getBackground().equals(red)) {
                        resultList.add(6);
                    } else if (M_L0_4.getBackground().equals(orange)){
                        resultList.add(7);
                    } else if (M_L0_4.getBackground().equals(darkblue)){
                        resultList.add(8);
                    }

                    //Log.d(TAG, "resultList..." + resultList.get(0) + resultList.get(1) + resultList.get(2) + resultList.get(3));

                    int Num1 = resultList.get(0);
                    int Num2 = resultList.get(1);
                    int Num3 = resultList.get(2);
                    int Num4 = resultList.get(3);

                    if (Num1 == Num2 || Num1 == Num3 || Num1 == Num4 || Num2 == Num3 || Num2 == Num4 || Num3 == Num4) {
                        String toast = getResources().getString(R.string.cannot_input_same_colors);
                        Toast.makeText(Mastermind.this, toast, Toast.LENGTH_SHORT).show();
                        resultList.clear();
                    } else {
                        if (randomNumList.size() > 0) {
                            Game game = new Game(randomNumList,resultList);
                            int a = game.getA();
                            int b = game.getB();
                            boolean win = game.isWin();
                            resultList.clear();
                            if (M_L1_1.getBackground().equals(M)) {
                                M_L1_1.setBackground(M_L0_1.getBackground());
                                M_L1_2.setBackground(M_L0_2.getBackground());
                                M_L1_3.setBackground(M_L0_3.getBackground());
                                M_L1_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && M_L2_1.getBackground().equals(M)) {
                                M_L2_1.setBackground(M_L0_1.getBackground());
                                M_L2_2.setBackground(M_L0_2.getBackground());
                                M_L2_3.setBackground(M_L0_3.getBackground());
                                M_L2_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && !M_L2_1.getBackground().equals(M) && M_L3_1.getBackground().equals(M)) {
                                M_L3_1.setBackground(M_L0_1.getBackground());
                                M_L3_2.setBackground(M_L0_2.getBackground());
                                M_L3_3.setBackground(M_L0_3.getBackground());
                                M_L3_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && !M_L2_1.getBackground().equals(M) && !M_L3_1.getBackground().equals(M) && M_L4_1.getBackground().equals(M)) {
                                M_L4_1.setBackground(M_L0_1.getBackground());
                                M_L4_2.setBackground(M_L0_2.getBackground());
                                M_L4_3.setBackground(M_L0_3.getBackground());
                                M_L4_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && !M_L2_1.getBackground().equals(M) && !M_L3_1.getBackground().equals(M) && !M_L4_1.getBackground().equals(M) && M_L5_1.getBackground().equals(M)) {
                                M_L5_1.setBackground(M_L0_1.getBackground());
                                M_L5_2.setBackground(M_L0_2.getBackground());
                                M_L5_3.setBackground(M_L0_3.getBackground());
                                M_L5_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && !M_L2_1.getBackground().equals(M) && !M_L3_1.getBackground().equals(M) && !M_L4_1.getBackground().equals(M) && !M_L5_1.getBackground().equals(M) && M_L6_1.getBackground().equals(M)) {
                                M_L6_1.setBackground(M_L0_1.getBackground());
                                M_L6_2.setBackground(M_L0_2.getBackground());
                                M_L6_3.setBackground(M_L0_3.getBackground());
                                M_L6_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && !M_L2_1.getBackground().equals(M) && !M_L3_1.getBackground().equals(M) && !M_L4_1.getBackground().equals(M) && !M_L5_1.getBackground().equals(M) && !M_L6_1.getBackground().equals(M) && M_L7_1.getBackground().equals(M)) {
                                M_L7_1.setBackground(M_L0_1.getBackground());
                                M_L7_2.setBackground(M_L0_2.getBackground());
                                M_L7_3.setBackground(M_L0_3.getBackground());
                                M_L7_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            } else if (!M_L1_1.getBackground().equals(M) && !M_L2_1.getBackground().equals(M) && !M_L3_1.getBackground().equals(M) && !M_L4_1.getBackground().equals(M) && !M_L5_1.getBackground().equals(M) && !M_L6_1.getBackground().equals(M) && !M_L7_1.getBackground().equals(M) && M_L8_1.getBackground().equals(M)) {
                                M_L8_1.setBackground(M_L0_1.getBackground());
                                M_L8_2.setBackground(M_L0_2.getBackground());
                                M_L8_3.setBackground(M_L0_3.getBackground());
                                M_L8_4.setBackground(M_L0_4.getBackground());
                                M_L0_1.setBackground(M);
                                M_L0_2.setBackground(M);
                                M_L0_3.setBackground(M);
                                M_L0_4.setBackground(M);
                            }

                            if (a == 0 & b == 4) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_red);
                                    M_L1_6.setBackground(result_red);
                                    M_L1_7.setBackground(result_red);
                                    M_L1_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_red);
                                    M_L2_6.setBackground(result_red);
                                    M_L2_7.setBackground(result_red);
                                    M_L2_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_red);
                                    M_L3_6.setBackground(result_red);
                                    M_L3_7.setBackground(result_red);
                                    M_L3_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_red);
                                    M_L4_6.setBackground(result_red);
                                    M_L4_7.setBackground(result_red);
                                    M_L4_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_red);
                                    M_L5_6.setBackground(result_red);
                                    M_L5_7.setBackground(result_red);
                                    M_L5_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_red);
                                    M_L6_6.setBackground(result_red);
                                    M_L6_7.setBackground(result_red);
                                    M_L6_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_red);
                                    M_L7_6.setBackground(result_red);
                                    M_L7_7.setBackground(result_red);
                                    M_L7_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_red);
                                    M_L8_6.setBackground(result_red);
                                    M_L8_7.setBackground(result_red);
                                    M_L8_8.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 0 & b == 3) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_red);
                                    M_L1_6.setBackground(result_red);
                                    M_L1_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_red);
                                    M_L2_6.setBackground(result_red);
                                    M_L2_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_red);
                                    M_L3_6.setBackground(result_red);
                                    M_L3_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_red);
                                    M_L4_6.setBackground(result_red);
                                    M_L4_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_red);
                                    M_L5_6.setBackground(result_red);
                                    M_L5_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_red);
                                    M_L6_6.setBackground(result_red);
                                    M_L6_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_red);
                                    M_L7_6.setBackground(result_red);
                                    M_L7_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_red);
                                    M_L8_6.setBackground(result_red);
                                    M_L8_7.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 0 & b == 2) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_red);
                                    M_L1_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_red);
                                    M_L2_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_red);
                                    M_L3_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_red);
                                    M_L4_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_red);
                                    M_L5_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_red);
                                    M_L6_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_red);
                                    M_L7_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_red);
                                    M_L8_6.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 0 & b == 1) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 0 & b == 0) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_x);
                                    M_L1_6.setBackground(result_x);
                                    M_L1_7.setBackground(result_x);
                                    M_L1_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_x);
                                    M_L2_6.setBackground(result_x);
                                    M_L2_7.setBackground(result_x);
                                    M_L2_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_x);
                                    M_L3_6.setBackground(result_x);
                                    M_L3_7.setBackground(result_x);
                                    M_L3_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_x);
                                    M_L4_6.setBackground(result_x);
                                    M_L4_7.setBackground(result_x);
                                    M_L4_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_x);
                                    M_L5_6.setBackground(result_x);
                                    M_L5_7.setBackground(result_x);
                                    M_L5_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_x);
                                    M_L6_6.setBackground(result_x);
                                    M_L6_7.setBackground(result_x);
                                    M_L6_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_x);
                                    M_L7_6.setBackground(result_x);
                                    M_L7_7.setBackground(result_x);
                                    M_L7_8.setBackground(result_x);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_x);
                                    M_L8_6.setBackground(result_x);
                                    M_L8_7.setBackground(result_x);
                                    M_L8_8.setBackground(result_x);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            }
                            if (a == 1 && b == 3) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_red);
                                    M_L1_7.setBackground(result_red);
                                    M_L1_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_red);
                                    M_L2_7.setBackground(result_red);
                                    M_L2_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_red);
                                    M_L3_7.setBackground(result_red);
                                    M_L3_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_red);
                                    M_L4_7.setBackground(result_red);
                                    M_L4_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_red);
                                    M_L5_7.setBackground(result_red);
                                    M_L5_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_red);
                                    M_L6_7.setBackground(result_red);
                                    M_L6_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_red);
                                    M_L7_7.setBackground(result_red);
                                    M_L7_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_red);
                                    M_L8_7.setBackground(result_red);
                                    M_L8_8.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 1 && b == 2) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_red);
                                    M_L1_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_red);
                                    M_L2_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_red);
                                    M_L3_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_red);
                                    M_L4_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_red);
                                    M_L5_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_red);
                                    M_L6_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_red);
                                    M_L7_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_red);
                                    M_L8_7.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 1 && b == 1) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 1 && b == 0) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            }
                            if (a == 2 && b == 2) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_green);
                                    M_L1_7.setBackground(result_red);
                                    M_L1_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_green);
                                    M_L2_7.setBackground(result_red);
                                    M_L2_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_green);
                                    M_L3_7.setBackground(result_red);
                                    M_L3_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_green);
                                    M_L4_7.setBackground(result_red);
                                    M_L4_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_green);
                                    M_L5_7.setBackground(result_red);
                                    M_L5_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_green);
                                    M_L6_7.setBackground(result_red);
                                    M_L6_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_green);
                                    M_L7_7.setBackground(result_red);
                                    M_L7_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_green);
                                    M_L8_7.setBackground(result_red);
                                    M_L8_8.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 2 && b == 1) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_green);
                                    M_L1_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_green);
                                    M_L2_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_green);
                                    M_L3_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_green);
                                    M_L4_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_green);
                                    M_L5_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_green);
                                    M_L6_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_green);
                                    M_L7_7.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_green);
                                    M_L8_7.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 2 && b == 0) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_green);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            }
                            if (a == 3 && b == 1) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_green);
                                    M_L1_7.setBackground(result_green);
                                    M_L1_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_green);
                                    M_L2_7.setBackground(result_green);
                                    M_L2_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_green);
                                    M_L3_7.setBackground(result_green);
                                    M_L3_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_green);
                                    M_L4_7.setBackground(result_green);
                                    M_L4_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_green);
                                    M_L5_7.setBackground(result_green);
                                    M_L5_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_green);
                                    M_L6_7.setBackground(result_green);
                                    M_L6_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_green);
                                    M_L7_7.setBackground(result_green);
                                    M_L7_8.setBackground(result_red);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_green);
                                    M_L8_7.setBackground(result_green);
                                    M_L8_8.setBackground(result_red);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            } else if (a == 3 && b == 0) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_green);
                                    M_L1_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_green);
                                    M_L2_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_green);
                                    M_L3_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_green);
                                    M_L4_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_green);
                                    M_L5_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_green);
                                    M_L6_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_green);
                                    M_L7_7.setBackground(result_green);
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_green);
                                    M_L8_7.setBackground(result_green);
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            }
                            if (a == 4) {
                                if (M_L1_5.getBackground().equals(M2)) {
                                    M_L1_5.setBackground(result_green);
                                    M_L1_6.setBackground(result_green);
                                    M_L1_7.setBackground(result_green);
                                    M_L1_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && M_L2_5.getBackground().equals(M2)) {
                                    M_L2_5.setBackground(result_green);
                                    M_L2_6.setBackground(result_green);
                                    M_L2_7.setBackground(result_green);
                                    M_L2_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && M_L3_5.getBackground().equals(M2)) {
                                    M_L3_5.setBackground(result_green);
                                    M_L3_6.setBackground(result_green);
                                    M_L3_7.setBackground(result_green);
                                    M_L3_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && M_L4_5.getBackground().equals(M2)) {
                                    M_L4_5.setBackground(result_green);
                                    M_L4_6.setBackground(result_green);
                                    M_L4_7.setBackground(result_green);
                                    M_L4_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2)) {
                                    M_L5_5.setBackground(result_green);
                                    M_L5_6.setBackground(result_green);
                                    M_L5_7.setBackground(result_green);
                                    M_L5_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && M_L6_5.getBackground().equals(M2)) {
                                    M_L6_5.setBackground(result_green);
                                    M_L6_6.setBackground(result_green);
                                    M_L6_7.setBackground(result_green);
                                    M_L6_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && !M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && M_L7_5.getBackground().equals(M2)) {
                                    M_L7_5.setBackground(result_green);
                                    M_L7_6.setBackground(result_green);
                                    M_L7_7.setBackground(result_green);
                                    M_L7_8.setBackground(result_green);
                                    myDialog.dialog();
                                } else if (!M_L1_5.getBackground().equals(M2) && !M_L2_5.getBackground().equals(M2) && !M_L3_5.getBackground().equals(M2) && !M_L4_5.getBackground().equals(M2) && M_L5_5.getBackground().equals(M2) && !M_L6_5.getBackground().equals(M2) && !M_L7_5.getBackground().equals(M2) && M_L8_5.getBackground().equals(M2)) {
                                    M_L8_5.setBackground(result_green);
                                    M_L8_6.setBackground(result_green);
                                    M_L8_7.setBackground(result_green);
                                    M_L8_8.setBackground(result_green);
                                    myDialog.dialog();
                                }
                            }
                            if (!M_L8_1.getBackground().equals(M)) {
                                if (win) {
                                    myDialog.dialog();
                                } else {
                                    myDialog.Mastermind_dialog_lose(randomNumList);
                                }
                            }
                        }
                    }
                }
                else
                {
                    String toast = getResources().getString(R.string.please_insert_4_colors);
                    Toast.makeText(Mastermind.this, toast, Toast.LENGTH_SHORT).show();
                }
            }
        });
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

    private void randomNumber()
    {
        randomNumList = Game.list(8,4);

        Log.d(TAG,"arr....."+randomNumList.get(0)+randomNumList.get(1)+randomNumList.get(2)+randomNumList.get(3));
    }

    @Override
    public void onBackPressed() {
        myDialog.dialog_backPress();
    }

    @Override
    protected void onUserLeaveHint() {
        myDialog.dialog_leaveHint();
    }
}