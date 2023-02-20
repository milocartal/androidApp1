package crtl.nationale88.app1;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MonLayout extends LinearLayout implements View.OnClickListener {

    Button btn;

    TextView txt;

    int cpt;

    public MonLayout(Context context) {
        super(context);
        setOrientation(VERTICAL);

        btn = new Button(context);
        txt = new TextView(context);
        cpt = 0;

        btn.setText("+");
        txt.setText("0");

        btn.setOnClickListener(this);

        addView(btn);
        addView(txt);
    }

    @Override
    public void onClick(View view) {
        cpt++;
        txt.setText(Integer.toString(cpt));
    }
}
