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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView txv_4_8 = findViewById(R.id.txv_4_8);
        TextView txv_4_10 = findViewById(R.id.txv_4_10);
        TextView txv_5_12 = findViewById(R.id.txv_5_12);
        TextView txv_mastermind = findViewById(R.id.txv_mastermind);

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
            MyDialog myDialog = new MyDialog(HomePage.this);
            myDialog.Homepage_dialog();
        }
        return true;
    }
}