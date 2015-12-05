package nyc.c4q.ramonaharrison.oauth2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * Write a demo app that:
 *
 * 1. connects to the SoundCloud HTTP API using OAuth2
 * 2. queries your playlists and displays in a ListView
 * 3. when a row is selected in the ListView, a detail screen appears for the selected playlist
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
