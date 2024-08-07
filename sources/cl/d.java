package cl;

import al.k;
import ek.i;
import p3.l0;
import rk.l;
import u9.b;

/* compiled from: BufferedChannel.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final j<Object> f19232a = new j(-1, (j) null, (a) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f19233b = l0.O0("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19234c = l0.O0("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final b f19235d = new b("BUFFERED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final b f19236e = new b("SHOULD_BUFFER", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final b f19237f = new b("S_RESUMING_BY_RCV", 1);

    /* renamed from: g  reason: collision with root package name */
    public static final b f19238g = new b("RESUMING_BY_EB", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final b f19239h = new b("POISONED", 1);

    /* renamed from: i  reason: collision with root package name */
    public static final b f19240i = new b("DONE_RCV", 1);

    /* renamed from: j  reason: collision with root package name */
    public static final b f19241j = new b("INTERRUPTED_SEND", 1);

    /* renamed from: k  reason: collision with root package name */
    public static final b f19242k = new b("INTERRUPTED_RCV", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final b f19243l = new b("CHANNEL_CLOSED", 1);

    /* renamed from: m  reason: collision with root package name */
    public static final b f19244m = new b("SUSPEND", 1);

    /* renamed from: n  reason: collision with root package name */
    public static final b f19245n = new b("SUSPEND_NO_WAITER", 1);

    /* renamed from: o  reason: collision with root package name */
    public static final b f19246o = new b("FAILED", 1);

    /* renamed from: p  reason: collision with root package name */
    public static final b f19247p = new b("NO_RECEIVE_RESULT", 1);

    /* renamed from: q  reason: collision with root package name */
    public static final b f19248q = new b("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r  reason: collision with root package name */
    public static final b f19249r = new b("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s  reason: collision with root package name */
    public static final b f19250s = new b("NO_CLOSE_CAUSE", 1);

    public static final <T> boolean a(k<? super T> kVar, T t10, l<? super Throwable, i> lVar) {
        b f10 = kVar.f(t10, lVar);
        if (f10 == null) {
            return false;
        }
        kVar.n(f10);
        return true;
    }
}
