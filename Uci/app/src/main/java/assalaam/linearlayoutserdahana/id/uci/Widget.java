package assalaam.linearlayoutserdahana.id.uci;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Widget extends ListActivity {

    TextView Widget;
    String[] pilihan = {
            "Merbabu","Merapi","Lawu","Rijani","Sumbing",
            "Sindoro","Krakatau","Selat Sunda","Selat Bali",
            "Selat Malaka","Kalimatan","Sulawesi","Jawa"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.
                simple_list_item_single_choice,
                pilihan));
        Widget = (TextView) findViewById(R.id.yangDipilih);
    }
    public void onListItemClick(ListView parent, View v,int position, long id) {
        Widget.setText(pilihan[position]);
    }
}
