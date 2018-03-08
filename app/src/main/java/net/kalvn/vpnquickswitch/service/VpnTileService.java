package net.kalvn.vpnquickswitch.service;

        import android.annotation.TargetApi;
        import android.content.Intent;
        import android.net.Uri;
        import android.provider.Settings;
        import android.service.quicksettings.TileService;

        import static android.support.v4.app.ActivityCompat.startActivityForResult;

/**
 * Small Addition that adds in a QuickSettings tile that opens the Compose activity when clicked
 * Created by ztepps on 4/3/17.
 */

@TargetApi(24)
public class VpnTileService extends TileService {
    public VpnTileService() {
        super();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        super.onClick();

        startActivityAndCollapse(new Intent(Settings.ACTION_VPN_SETTINGS));
    }
}