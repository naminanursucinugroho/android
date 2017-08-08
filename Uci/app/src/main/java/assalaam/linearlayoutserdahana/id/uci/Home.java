package assalaam.linearlayoutserdahana.id.uci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button Linear = (Button) findViewById(R.id.Linear);
        Linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(),
                        LinearLayout.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button Kotak = (Button) findViewById(R.id.Kotak);
        Kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(),
                        KotakDialog.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Relative = (Button) findViewById(R.id.Relative);
        Relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(),
                        RelativeActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Autocomplete = (Button) findViewById(R.id.Autocomplete);
        Autocomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button Tabel = (Button) findViewById(R.id.Tabel);
        Tabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Table.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button Widget = (Button) findViewById(R.id.Widget);
        Widget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Widget.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button Picker = (Button) findViewById(R.id.Picker);
        Picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Picker.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button radio = (Button) findViewById(R.id.radio);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), radioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button check = (Button) findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button intent1 = (Button) findViewById(R.id.intent1);
        intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Intent1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button intent2 = (Button) findViewById(R.id.intent2);
        intent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Intent2.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button image = (Button) findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), ImageView.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button background = (Button) findViewById(R.id.background);
        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), ServiceBackground.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button audio = (Button) findViewById(R.id.audio);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), PlayingAudio.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button calculator = (Button) findViewById(R.id.Calculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Calculator.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button web = (Button) findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Web.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

}
