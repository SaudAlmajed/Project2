package com.example.saudalmajed.project2;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;

        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int FirstTeam =0;
    private int secondTeam =0;

    private TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView1=((TextView)findViewById(R.id.textViewF));
        textView2=((TextView)findViewById(R.id.textViewS));



    }public void plusf1(View view){
        FirstTeam=FirstTeam+1;
        textView1.setText(""+FirstTeam);

    }

    public void plusf2(View view){
        FirstTeam=FirstTeam+2;
        textView1.setText(""+FirstTeam);}

    public void plusf3(View view){ FirstTeam=FirstTeam+3;
        textView1.setText(""+FirstTeam);}




    public void pluss1(View view){

        secondTeam=secondTeam+1;
        textView2.setText(""+secondTeam);
}
    public void pluss2(View view){secondTeam=secondTeam+2;
        textView2.setText(""+secondTeam);
    }
    public void pluss3(View view){ secondTeam=secondTeam+3;
        textView2.setText(""+secondTeam);}



    public void reset(View view){
        FirstTeam=0;
        secondTeam=0;
        textView2.setText(""+secondTeam);
        textView1.setText(""+FirstTeam);

    }






}



