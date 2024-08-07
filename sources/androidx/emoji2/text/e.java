package androidx.emoji2.text;

import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer */
public final class e extends d.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.h f2397a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2398b;

    public e(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2397a = hVar;
        this.f2398b = threadPoolExecutor;
    }

    public final void a(Throwable th2) {
        try {
            this.f2397a.a(th2);
        } finally {
            this.f2398b.shutdown();
        }
    }

    public final void b(h hVar) {
        try {
            this.f2397a.b(hVar);
        } finally {
            this.f2398b.shutdown();
        }
    }
}
