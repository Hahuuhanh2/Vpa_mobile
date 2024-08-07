package ne;

import android.media.MediaPlayer;

/* compiled from: MediaPlayerEngine */
public final class c implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f13591a;

    public c(d dVar) {
        this.f13591a = dVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        for (int i12 = 0; i12 < this.f13591a.f13592a.size(); i12++) {
            this.f13591a.f13592a.get(i12).c();
        }
        return false;
    }
}
