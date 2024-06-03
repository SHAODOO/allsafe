package infosecadventures.allsafe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        string password = "flag{this_is_a_fake_flag}";
        super.onCreate(savedInstanceState);
        startActivity(getIntent().getParcelableExtra("extra_intent"));
    }
}