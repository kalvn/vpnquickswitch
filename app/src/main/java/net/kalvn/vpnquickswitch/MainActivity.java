package net.kalvn.vpnquickswitch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("VPN Quick Switch");
        setActionBar(toolbar);
    }
}
