package sg.edu.rp.c347.demoexplicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class HeroStatsActivity extends AppCompatActivity {
    TextView tvName,tvStrength,tvTechnicalProwess;
    Button btnLike,btnDislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_stats);

        //get the intent
        Intent i = getIntent();
        //get the hero obj first activity put in Intent
        Hero hero = (Hero)i.getSerializableExtra("hero");

        tvName = (TextView)findViewById(R.id.textViewName);
        tvStrength = (TextView)findViewById(R.id.textViewStrength);
        tvTechnicalProwess = (TextView)findViewById(R.id.textViewTechnicalProwess);
        //use getters of Hero object to get the attributes
        tvName.setText(hero.getName());
        tvStrength.setText("Strength: "+hero.getStrength());
        tvTechnicalProwess.setText("Technical: "+hero.getTechnicalProwess());
    }

}
