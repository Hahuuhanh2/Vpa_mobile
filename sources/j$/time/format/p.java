package j$.time.format;

import j$.time.chrono.o;
import j$.util.function.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f18172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f18173b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f18174c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f18175d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f18176e;

    public /* synthetic */ p(q qVar, x xVar, long j10, int i10, int i11) {
        this.f18172a = qVar;
        this.f18173b = xVar;
        this.f18174c = j10;
        this.f18175d = i10;
        this.f18176e = i11;
    }

    public final void accept(Object obj) {
        o oVar = (o) obj;
        this.f18172a.d(this.f18173b, this.f18174c, this.f18175d, this.f18176e);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
