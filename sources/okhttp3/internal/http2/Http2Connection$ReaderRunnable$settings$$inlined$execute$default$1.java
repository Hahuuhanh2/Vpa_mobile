package okhttp3.internal.http2;

import ek.i;
import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;
import sk.j;
import sk.r;

/* compiled from: TaskQueue.kt */
public final class Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection.ReaderRunnable f22430e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f22431f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Settings f22432g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(String str, Http2Connection.ReaderRunnable readerRunnable, Settings settings) {
        super(str, true);
        this.f22430e = readerRunnable;
        this.f22432g = settings;
    }

    public final long a() {
        int i10;
        long a10;
        int i11;
        Http2Stream[] http2StreamArr;
        boolean z10;
        Http2Connection.ReaderRunnable readerRunnable = this.f22430e;
        boolean z11 = this.f22431f;
        T t10 = this.f22432g;
        readerRunnable.getClass();
        j.f(t10, "settings");
        r rVar = new r();
        Http2Connection http2Connection = Http2Connection.this;
        synchronized (http2Connection.F) {
            synchronized (http2Connection) {
                try {
                    Settings settings = http2Connection.f22422z;
                    if (!z11) {
                        T settings2 = new Settings();
                        j.f(settings, "other");
                        int i12 = 0;
                        while (true) {
                            boolean z12 = true;
                            if (i12 >= 10) {
                                break;
                            }
                            if (((1 << i12) & settings.f22529a) == 0) {
                                z12 = false;
                            }
                            if (z12) {
                                settings2.b(i12, settings.f22530b[i12]);
                            }
                            i12++;
                        }
                        for (int i13 = 0; i13 < 10; i13++) {
                            if (((1 << i13) & t10.f22529a) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                settings2.b(i13, t10.f22530b[i13]);
                            }
                        }
                        t10 = settings2;
                    }
                    rVar.f22931a = t10;
                    a10 = ((long) t10.a()) - ((long) settings.a());
                    i11 = (a10 > 0 ? 1 : (a10 == 0 ? 0 : -1));
                    if (i11 != 0) {
                        if (!http2Connection.f22406c.isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection.f22406c.values().toArray(new Http2Stream[0]);
                            Settings settings3 = (Settings) rVar.f22931a;
                            j.f(settings3, "<set-?>");
                            http2Connection.f22422z = settings3;
                            http2Connection.f22414r.c(new Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(http2Connection.f22407d + " onSettings", http2Connection, rVar), 0);
                            i iVar = i.f20112a;
                        }
                    }
                    http2StreamArr = null;
                    Settings settings32 = (Settings) rVar.f22931a;
                    j.f(settings32, "<set-?>");
                    http2Connection.f22422z = settings32;
                    http2Connection.f22414r.c(new Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(http2Connection.f22407d + " onSettings", http2Connection, rVar), 0);
                    i iVar2 = i.f20112a;
                } finally {
                }
            }
            try {
                http2Connection.F.d((Settings) rVar.f22931a);
            } catch (IOException e10) {
                http2Connection.h(e10);
            }
            i iVar3 = i.f20112a;
        }
        if (http2StreamArr == null) {
            return -1;
        }
        for (Http2Stream http2Stream : http2StreamArr) {
            synchronized (http2Stream) {
                http2Stream.f22493f += a10;
                if (i11 > 0) {
                    http2Stream.notifyAll();
                }
                i iVar4 = i.f20112a;
            }
        }
        return -1;
    }
}
