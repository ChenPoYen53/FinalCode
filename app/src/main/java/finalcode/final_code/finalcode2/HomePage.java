package finalcode.final_code.finalcode2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    private TextView txv_4_8,txv_4_10,txv_5_12,txv_mastermind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        txv_4_8 = findViewById(R.id.txv_4_8);
        txv_4_10 = findViewById(R.id.txv_4_10);
        txv_5_12 = findViewById(R.id.txv_5_12);
        txv_mastermind = findViewById(R.id.txv_mastermind);

        txv_4_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        txv_4_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this,game2.class);
                startActivity(intent);
            }
        });
        txv_5_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this,game3.class);
                startActivity(intent);
            }
        });
        txv_mastermind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this,Mastermind.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.question,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.question)
        {
            dialog();
        }
        return true;
    }
    private void dialog()
    {
        Dialog dialog = new Dialog(HomePage.this);
        dialog.setContentView(R.layout.dialog_question);

        int width = WindowManager.LayoutParams.MATCH_PARENT;
        int height = WindowManager.LayoutParams.MATCH_PARENT;

        ImageView close = dialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        TextView hint = dialog.findViewById(R.id.hint);
        Button Q1 = dialog.findViewById(R.id.Q1);
        Button Q2 = dialog.findViewById(R.id.Q2);
        Button Q3 = dialog.findViewById(R.id.Q3);
        Button Q4 = dialog.findViewById(R.id.Q4);

        Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint.setText(R.string.explanation1);
            }
        });
        Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint.setText(R.string.explanation2);
            }
        });
        Q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint.setText(R.string.explanation3);
            }
        });
        Q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint.setText(R.string.explanation4);
            }
        });

        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
}