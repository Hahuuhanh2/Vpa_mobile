package ne;

import android.media.MediaPlayer;
import com.luck.picture.lib.widget.MediaPlayerView;

/* compiled from: MediaPlayerEngine */
public final class b implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaPlayerView f13589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f13590b;

    public b(d dVar, MediaPlayerView mediaPlayerView) {
        this.f13590b = dVar;
        this.f13589a = mediaPlayerView;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.reset();
        for (int i10 = 0; i10 < this.f13590b.f13592a.size(); i10++) {
            this.f13590b.f13592a.get(i10).b();
        }
        MediaPlayerView mediaPlayerView = this.f13589a;
        mediaPlayerView.f8141b.getHolder().setFormat(-1);
        mediaPlayerView.f8141b.getHolder().setFormat(-2);
    }
}
