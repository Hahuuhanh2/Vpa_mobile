package zc;

import android.media.MediaPlayer;

/* compiled from: BeepManager */
public final class d implements MediaPlayer.OnErrorListener {
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        int i12 = e.f17963c;
        mediaPlayer.stop();
        mediaPlayer.release();
        return true;
    }
}
