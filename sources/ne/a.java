package ne;

import android.media.MediaPlayer;

/* compiled from: MediaPlayerEngine */
public final class a implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f13588a;

    public a(d dVar) {
        this.f13588a = dVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        for (int i10 = 0; i10 < this.f13588a.f13592a.size(); i10++) {
            this.f13588a.f13592a.get(i10).a();
        }
    }
}
