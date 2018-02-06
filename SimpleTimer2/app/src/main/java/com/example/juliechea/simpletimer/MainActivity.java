package com.example.juliechea.simpletimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private MyCountDownTimer countDownTimer;
    private long timeElapsed;
    private boolean timerHasStarted = false;
    private Button startB;
    private TextView text;
    private TextView timeElapsedView;
    private final long startTime = 50 * 1000;
    private final long interval = 1 * 1000;

    // onCreate()
    startB = (Button) this.findViewById(R.id.button);
startB.setOnClickListener(this);

    text = (TextView) this.findViewById(R.id.timer);
    timeElapsedView = (TextView) this.findViewById(R.id.timeElapsed);
    countDownTimer = new MyCountDownTimer(startTime, interval);
text.setText(text.getText() + String.valueOf(startTime));


    @Override
    public void onClick(View view) {

    }

    //onClick():
            if(!timerHasStarted) {
        countDownTimer.start();
        timerHasStarted = true;
        startB.setText("Start");
    } else {
        countDownTimer.cancel();
        timerHasStarted = false;
        startB.setText("Reset");
    }
}
