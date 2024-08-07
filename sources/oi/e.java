package oi;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class e implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f21815a;

    public e(FilterActivity filterActivity) {
        this.f21815a = filterActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new d(str, this.f21815a), 300);
    }

    public final void b() {
    }
}
