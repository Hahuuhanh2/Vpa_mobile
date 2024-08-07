package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;

/* compiled from: BaseMenuPresenter */
public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public Context f562a;

    /* renamed from: b  reason: collision with root package name */
    public Context f563b;

    /* renamed from: c  reason: collision with root package name */
    public f f564c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f565d;

    /* renamed from: e  reason: collision with root package name */
    public j.a f566e;

    /* renamed from: f  reason: collision with root package name */
    public int f567f;

    /* renamed from: n  reason: collision with root package name */
    public int f568n;

    /* renamed from: o  reason: collision with root package name */
    public k f569o;

    /* renamed from: p  reason: collision with root package name */
    public int f570p;

    public a(Context context, int i10, int i11) {
        this.f562a = context;
        this.f565d = LayoutInflater.from(context);
        this.f567f = i10;
        this.f568n = i11;
    }

    public final void f(j.a aVar) {
        this.f566e = aVar;
    }

    public final boolean g(h hVar) {
        return false;
    }

    public final int getId() {
        return this.f570p;
    }

    public final boolean m(h hVar) {
        return false;
    }
}
