package finalcode.final_code.finalcode2;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;

import java.util.List;

public class MyDialog
{
    private static final int width = WindowManager.LayoutParams.MATCH_PARENT;
    private static final int height = WindowManager.LayoutParams.WRAP_CONTENT;
    private static final int heightM = WindowManager.LayoutParams.MATCH_PARENT;
    private final Activity context;
    private Dialog dialog;

    public MyDialog(Activity context)
    {
        this.context = context;
    }

    public void dialog()
    {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog);

        Button again = dialog.findViewById(R.id.again);
        Button home = dialog.findViewById(R.id.home);

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.recreate();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.finish();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    public void dialog_lose(List<Integer> randomNumList)
    {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_lose);

        Button l_again = dialog.findViewById(R.id.L_again);
        Button l_home = dialog.findViewById(R.id.L_home);
        TextView answer = dialog.findViewById(R.id.answer);

        String Answer = context.getString(R.string.Answer);
        String text = Answer+randomNumList.get(0)+""+randomNumList.get(1)+""+randomNumList.get(2)+""+randomNumList.get(3);
        answer.setText(text);

        l_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.recreate();
            }
        });
        l_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.finish();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    public void dialog_backPress()
    {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.back_pressed);

        Button finish = dialog.findViewById(R.id.finish);
        Button stay = dialog.findViewById(R.id.stay);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.finish();
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
    public void dialog_leaveHint()
    {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.leavehint);

        Button leave_finish = dialog.findViewById(R.id.leave_finish);
        Button leave_continue = dialog.findViewById(R.id.leave_continue);

        leave_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.finish();
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
    public void Mastermind_dialog_lose(List<Integer> randomNumList)
    {
        final Drawable green = AppCompatResources.getDrawable(context,R.drawable.mastermind_green);
        final Drawable blue = AppCompatResources.getDrawable(context,R.drawable.mastermind_blue);
        final Drawable purple = AppCompatResources.getDrawable(context,R.drawable.mastermind_purple);
        final Drawable pink = AppCompatResources.getDrawable(context,R.drawable.mastermind_pink);
        final Drawable red = AppCompatResources.getDrawable(context,R.drawable.mastermind_red);
        final Drawable orange = AppCompatResources.getDrawable(context,R.drawable.mastermind_orange);
        final Drawable darkblue = AppCompatResources.getDrawable(context,R.drawable.mastermind_darkblue);
        final Drawable yellow = AppCompatResources.getDrawable(context,R.drawable.mastermind_yellow);

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_lose_masrermind);

        Button ML_again = dialog.findViewById(R.id.ML_again);
        Button ML_home = dialog.findViewById(R.id.ML_home);
        TextView M_answer1 = dialog.findViewById(R.id.M_answer1);
        TextView M_answer2 = dialog.findViewById(R.id.M_answer2);
        TextView M_answer3 = dialog.findViewById(R.id.M_answer3);
        TextView M_answer4 = dialog.findViewById(R.id.M_answer4);

        //First answer
        if(randomNumList.get(0).equals(1))
        {
            M_answer1.setBackground(green);
        }
        else if(randomNumList.get(0).equals(2))
        {
            M_answer1.setBackground(blue);
        }
        else if(randomNumList.get(0).equals(3))
        {
            M_answer1.setBackground(purple);
        }
        else if(randomNumList.get(0).equals(4))
        {
            M_answer1.setBackground(yellow);
        }
        else if(randomNumList.get(0).equals(5))
        {
            M_answer1.setBackground(pink);
        }
        else if(randomNumList.get(0).equals(6))
        {
            M_answer1.setBackground(red);
        }
        else if (randomNumList.get(0).equals(7))
        {
            M_answer1.setBackground(orange);
        }
        else if (randomNumList.get(0).equals(8))
        {
            M_answer1.setBackground(darkblue);
        }

        //Second answer
        if(randomNumList.get(1).equals(1))
        {
            M_answer2.setBackground(green);
        }
        else if(randomNumList.get(1).equals(2))
        {
            M_answer2.setBackground(blue);
        }
        else if(randomNumList.get(1).equals(3))
        {
            M_answer2.setBackground(purple);
        }
        else if(randomNumList.get(1).equals(4))
        {
            M_answer2.setBackground(yellow);
        }
        else if(randomNumList.get(1).equals(5))
        {
            M_answer2.setBackground(pink);
        }
        else if(randomNumList.get(1).equals(6))
        {
            M_answer2.setBackground(red);
        }
        else if (randomNumList.get(1).equals(7))
        {
            M_answer2.setBackground(orange);
        }
        else if (randomNumList.get(1).equals(8))
        {
            M_answer2.setBackground(darkblue);
        }

        //Third answer
        if(randomNumList.get(2).equals(1))
        {
            M_answer3.setBackground(green);
        }
        else if(randomNumList.get(2).equals(2))
        {
            M_answer3.setBackground(blue);
        }
        else if(randomNumList.get(2).equals(3))
        {
            M_answer3.setBackground(purple);
        }
        else if(randomNumList.get(2).equals(4))
        {
            M_answer3.setBackground(yellow);
        }
        else if(randomNumList.get(2).equals(5))
        {
            M_answer3.setBackground(pink);
        }
        else if(randomNumList.get(2).equals(6))
        {
            M_answer3.setBackground(red);
        }
        else if (randomNumList.get(2).equals(7))
        {
            M_answer3.setBackground(orange);
        }
        else if (randomNumList.get(2).equals(8))
        {
            M_answer3.setBackground(darkblue);
        }

        //Fourth answer
        if(randomNumList.get(3).equals(1))
        {
            M_answer4.setBackground(green);
        }
        else if(randomNumList.get(3).equals(2))
        {
            M_answer4.setBackground(blue);
        }
        else if(randomNumList.get(3).equals(3))
        {
            M_answer4.setBackground(purple);
        }
        else if(randomNumList.get(3).equals(4))
        {
            M_answer4.setBackground(yellow);
        }
        else if(randomNumList.get(3).equals(5))
        {
            M_answer4.setBackground(pink);
        }
        else if(randomNumList.get(3).equals(6))
        {
            M_answer4.setBackground(red);
        }
        else if (randomNumList.get(3).equals(7))
        {
            M_answer4.setBackground(orange);
        }
        else if (randomNumList.get(3).equals(8))
        {
            M_answer4.setBackground(darkblue);
        }

        ML_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.recreate();
            }
        });
        ML_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                context.finish();
            }
        });
        dialog.setCancelable(false);
        dialog.getWindow().setLayout(width,height);
        dialog.show();
    }
    public void Homepage_dialog()
    {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_question);

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

        dialog.getWindow().setLayout(width,heightM);
        dialog.show();
    }
}
