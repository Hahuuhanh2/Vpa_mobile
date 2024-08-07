package l2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.i;
import r2.l;

/* compiled from: EmojiCompatInitializer */
public final class c implements r2.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f12632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f12633b;

    public c(EmojiCompatInitializer emojiCompatInitializer, i iVar) {
        this.f12633b = emojiCompatInitializer;
        this.f12632a = iVar;
    }

    public final void onDestroy(l lVar) {
    }

    public final void onPause(l lVar) {
    }

    public final void onResume(l lVar) {
        Handler handler;
        this.f12633b.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new EmojiCompatInitializer.c(), 500);
        this.f12632a.c(this);
    }

    public final void onStart(l lVar) {
    }

    public final void onStop(l lVar) {
    }

    public final void v(l lVar) {
    }
}
