package assalaam.linearlayoutserdahana.id.uci;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Intent1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Button next = (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), Intent2.class);
               startActivityForResult(myIntent, 0);
            }
        });
    }

}
