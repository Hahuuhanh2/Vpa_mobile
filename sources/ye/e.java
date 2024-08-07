package ye;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.base.ui.a;
import com.ots.base.utils.customview.EmptyView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimerTask;
import mg.e2;
import sk.j;
import yk.c;

/* compiled from: SearchViewExtensions.kt */
public final class e extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17728a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.ots.base.ui.a f17729b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17730a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ com.ots.base.ui.a f17731b;

        public a(com.ots.base.ui.a aVar, String str) {
            this.f17730a = str;
            this.f17731b = aVar;
        }

        public final void run() {
            EmptyView emptyView;
            int i10;
            int i11;
            boolean z10;
            String str = this.f17730a;
            if (str == null) {
                str = "";
            }
            this.f17731b.getClass();
            this.f17731b.E0.clear();
            Locale locale = Locale.getDefault();
            j.e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String a10 = new c("\\s\\s+").a(lowerCase);
            int length = a10.length() - 1;
            int i12 = 0;
            int i13 = 0;
            boolean z11 = false;
            while (i13 <= length) {
                if (!z11) {
                    i11 = i13;
                } else {
                    i11 = length;
                }
                if (j.h(a10.charAt(i11), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i13++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = a10.subSequence(i13, length + 1).toString();
            if (!j.a(lowerCase, "")) {
                ArrayList r02 = this.f17731b.E0;
                Object collect = Collection.EL.stream(this.f17731b.f8243z0).filter(new a.d(new a.b(obj))).collect(Collectors.toList());
                j.d(collect, "null cannot be cast to non-null type java.util.ArrayList<com.ots.core.base.model.SelectionItem>");
                r02.addAll((ArrayList) collect);
            } else {
                this.f17731b.E0.addAll(this.f17731b.F0);
            }
            this.f17731b.u0().A(this.f17731b.E0);
            e2 v02 = this.f17731b.v0();
            RecyclerView recyclerView = null;
            if (v02 != null) {
                emptyView = v02.f21038w;
            } else {
                emptyView = null;
            }
            if (emptyView != null) {
                if (this.f17731b.E0.isEmpty()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                emptyView.setVisibility(i10);
            }
            e2 v03 = this.f17731b.v0();
            if (v03 != null) {
                recyclerView = v03.f21039x;
            }
            if (recyclerView != null) {
                if (!(!this.f17731b.E0.isEmpty())) {
                    i12 = 8;
                }
                recyclerView.setVisibility(i12);
            }
        }
    }

    public e(com.ots.base.ui.a aVar, String str) {
        this.f17728a = str;
        this.f17729b = aVar;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f17729b, this.f17728a));
    }
}
