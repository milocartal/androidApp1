package crtl.nationale88.app1;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MonLayout extends LinearLayout implements View.OnClickListener {

    Button btn;
    Button btn2;

    TextView txt;

    int cpt;

    final int BTN_PLUS = 0;
    final int BTN_MOIN = 1;

    int min = 65;
    int max = 125;

    public MonLayout(Context context) {
        super(context);
        setOrientation(VERTICAL);

        btn = new Button(context);
        btn2 = new Button(context);
        txt = new TextView(context);
        cpt = 65;

        btn.setText("+");
        btn2.setText("-");

        btn.setId(BTN_PLUS);
        btn2.setId(BTN_MOIN);
        txt.setText(Integer.toString(cpt));

        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);

        addView(btn);
        addView(txt);
        addView(btn2);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case 0:
                if (cpt<max)
                    cpt++;
                break;
            case 1:
                if (cpt>min)
                    cpt--;
                break;
        }
        txt.setText(Integer.toString(cpt));
    }
}
