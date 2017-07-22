package com.example.saudalmajed.project2;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int FirstTeam =0;
    private int secondTeam =0;

    private TextView scoreFirstTeam,scoreSecondTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreFirstTeam=((TextView)findViewById(R.id.textViewF));
        scoreSecondTeam=((TextView)findViewById(R.id.textViewS));

    }
    public void plusf1(View view){
        FirstTeam=FirstTeam+1;
        scoreFirstTeam.setText(""+FirstTeam);
    }
    public void plusf2(View view){
        FirstTeam=FirstTeam+2;
        scoreFirstTeam.setText(""+FirstTeam);}

    public void plusf3(View view){ FirstTeam=FirstTeam+3;
        scoreFirstTeam.setText(""+FirstTeam);}
    public void pluss1(View view){

        secondTeam=secondTeam+1;
        scoreSecondTeam.setText(""+secondTeam);
}
    public void pluss2(View view){secondTeam=secondTeam+2;
        scoreSecondTeam.setText(""+secondTeam);
    }
    public void pluss3(View view){ secondTeam=secondTeam+3;
        scoreSecondTeam.setText(""+secondTeam);
    }
    public void reset(View view){
        FirstTeam=0;
        secondTeam=0;
        scoreSecondTeam.setText(""+secondTeam);
        scoreFirstTeam.setText(""+FirstTeam);
    }
}