package zc;

import android.media.MediaPlayer;

/* compiled from: BeepManager */
public final class c implements MediaPlayer.OnCompletionListener {
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
