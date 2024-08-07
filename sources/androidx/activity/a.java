package androidx.activity;

import androidx.activity.ComponentActivity;
import f.f;
import g.a;

/* compiled from: ComponentActivity */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0108a f298b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.a f299c;

    public a(ComponentActivity.a aVar, int i10, a.C0108a aVar2) {
        this.f299c = aVar;
        this.f297a = i10;
        this.f298b = aVar2;
    }

    public final void run() {
        f.a<O> aVar;
        ComponentActivity.a aVar2 = this.f299c;
        int i10 = this.f297a;
        T t10 = this.f298b.f10213a;
        String str = (String) aVar2.f9503a.get(Integer.valueOf(i10));
        if (str != null) {
            f.a aVar3 = (f.a) aVar2.f9507e.get(str);
            if (aVar3 == null || (aVar = aVar3.f9510a) == null) {
                aVar2.f9509g.remove(str);
                aVar2.f9508f.put(str, t10);
            } else if (aVar2.f9506d.remove(str)) {
                aVar.b(t10);
            }
        }
    }
}
