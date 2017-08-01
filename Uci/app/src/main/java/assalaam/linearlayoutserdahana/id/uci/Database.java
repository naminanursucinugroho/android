package assalaam.linearlayoutserdahana.id.uci;

import java.util.ArrayList;
import java.util.Objects;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class Database extends Activity {
    DatabaseManager dm;
    EditText nama, hobi;
    Button addBtn;
    TableLayout tabel14data;//tabel for data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        dm = new DatabaseManager(this);
        tabel14data = (TableLayout) findViewById(R.id.tabel_data);
        nama = (EditText) findViewById(R.id.inNama);
        hobi = (EditText) findViewById(R.id.inHobi);
        addBtn = (Button) findViewById(R.id.btnAdd);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpKamuta();
            }
            });
        updateTable();
    }

    protected void simpKamuta() {
        try{
            dm.addRow(nama.getText().toString(),hobi.getText().toString());
            Toast.makeText(getBaseContext(), nama.getText().toString() + ", berhasil disimpan",
                    Toast.LENGTH_SHORT).show();
            updateTable();
            kosongkanField();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getBaseContext(), "gagal simpan, " +
            e.toString(),Toast.LENGTH_LONG).show();
        }
    }
    protected void kosongkanField() {
        nama.setText("");
        hobi.setText("");
    }
    protected void updateTable () {
        while (tabel14data.getChildCount() > 1) {
            tabel14data.removeViewAt(1);
        }
        ArrayList<ArrayList<Objects>> data = dm.ambilSemuaBaris();

        for (int posisi = 0; posisi < data.size(); posisi++) {
            TableRow tabelBaris = new TableRow(this);
        }
    }

}
