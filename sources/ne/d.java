package ne;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.MediaPlayerView;
import com.luck.picture.lib.widget.a;
import ge.h;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import ke.b;

/* compiled from: MediaPlayerEngine */
public final class d implements e<MediaPlayerView> {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<qe.d> f13592a = new CopyOnWriteArrayList<>();

    public final void a(h.e eVar) {
        if (!this.f13592a.contains(eVar)) {
            this.f13592a.add(eVar);
        }
    }

    public final void b(View view) {
        MediaPlayerView mediaPlayerView = (MediaPlayerView) view;
        MediaPlayer mediaPlayer = mediaPlayerView.f8140a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayerView.f8140a.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            mediaPlayerView.f8140a.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
            mediaPlayerView.f8140a.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            mediaPlayerView.f8140a = null;
        }
    }

    public final boolean c(View view) {
        MediaPlayer mediaPlayer = ((MediaPlayerView) view).getMediaPlayer();
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void d(View view) {
        MediaPlayer mediaPlayer = ((MediaPlayerView) view).getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public final void e(View view) {
        MediaPlayerView mediaPlayerView = (MediaPlayerView) view;
        if (mediaPlayerView.f8140a == null) {
            mediaPlayerView.f8140a = new MediaPlayer();
        }
        mediaPlayerView.f8140a.setOnVideoSizeChangedListener(new a(mediaPlayerView));
        MediaPlayer mediaPlayer = mediaPlayerView.f8140a;
        mediaPlayer.setOnPreparedListener(new a(this));
        mediaPlayer.setOnCompletionListener(new b(this, mediaPlayerView));
        mediaPlayer.setOnErrorListener(new c(this));
    }

    public final void f(View view) {
        MediaPlayerView mediaPlayerView = (MediaPlayerView) view;
        MediaPlayer mediaPlayer = mediaPlayerView.f8140a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayerView.f8140a.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            mediaPlayerView.f8140a.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
            mediaPlayerView.f8140a.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            mediaPlayerView.f8140a = null;
        }
    }

    public final void g(View view) {
        MediaPlayer mediaPlayer = ((MediaPlayerView) view).getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public final void h(View view, LocalMedia localMedia) {
        MediaPlayerView mediaPlayerView = (MediaPlayerView) view;
        String a10 = localMedia.a();
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        mediaPlayerView.getSurfaceView().setZOrderOnTop(j7.a.X(a10));
        b.a().b().getClass();
        mediaPlayer.setLooping(false);
        try {
            if (j7.a.S(a10)) {
                mediaPlayerView.f8140a.setDataSource(mediaPlayerView.getContext(), Uri.parse(a10));
            } else {
                mediaPlayerView.f8140a.setDataSource(a10);
            }
            mediaPlayerView.f8140a.prepareAsync();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void i(h.e eVar) {
        if (eVar != null) {
            this.f13592a.remove(eVar);
        } else {
            this.f13592a.clear();
        }
    }
}
