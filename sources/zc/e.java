package zc;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.google.zxing.client.android.R$raw;
import java.io.IOException;

/* compiled from: BeepManager */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f17963c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17964a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17965b = true;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f17964a = activity.getApplicationContext();
    }

    public final void a() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new c());
        mediaPlayer.setOnErrorListener(new d());
        try {
            openRawResourceFd = this.f17964a.getResources().openRawResourceFd(R$raw.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException unused) {
            mediaPlayer.release();
        } catch (Throwable th2) {
            openRawResourceFd.close();
            throw th2;
        }
    }
}
