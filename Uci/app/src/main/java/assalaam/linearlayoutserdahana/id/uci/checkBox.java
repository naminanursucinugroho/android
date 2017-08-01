package assalaam.linearlayoutserdahana.id.uci;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class checkBox extends Activity implements OnCheckedChangeListener {

    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb = (CheckBox) findViewById(R.id.activity_check_box);
        cb.setOnCheckedChangeListener(this);
    }

    private void setOnCheckedChangeListener(checkBox checkBox) {
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isCheked) {
        if (isCheked) {
            cb.setText("CheckBox ini : Dicentang!");
        } else {
            cb.setText("CheckBox ini : Tidak Dicentang!");
        }
    }


}