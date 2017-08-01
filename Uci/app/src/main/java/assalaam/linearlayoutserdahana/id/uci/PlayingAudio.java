package assalaam.linearlayoutserdahana.id.uci;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

public class PlayingAudio extends Activity {

    ImageButton mainkan;
    TextView keterangan;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        keterangan=(TextView)findViewById(R.id.ket);
        keterangan.setText("Silakan klik tombol play");

        mainkan=(ImageButton) findViewById(R.id.putarMusik);
        mainkan.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0){
                mainkan.setEnabled(false);
                keterangan.setText("Tombol play tidak aktif");
                go();
            }
        });
    }
    public void go() {
        mp=MediaPlayer.create(PlayingAudio.this, R.raw.kautsar);
    try{
            mp.prepare();
        }catch (IllegalStateException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            public void onCompletion(MediaPlayer arg0) {
            mainkan.setEnabled(true);
                keterangan.setText("silakan Klik tombol play");
            }
        });
    }

}
