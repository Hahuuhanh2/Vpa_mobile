package i8;

import android.graphics.Typeface;
import androidx.fragment.app.o;

/* compiled from: CancelableFontCallback */
public final class a extends o {

    /* renamed from: b  reason: collision with root package name */
    public final Typeface f11193b;

    /* renamed from: c  reason: collision with root package name */
    public final C0124a f11194c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11195d;

    /* renamed from: i8.a$a  reason: collision with other inner class name */
    /* compiled from: CancelableFontCallback */
    public interface C0124a {
        void a(Typeface typeface);
    }

    public a(C0124a aVar, Typeface typeface) {
        this.f11193b = typeface;
        this.f11194c = aVar;
    }

    public final void D(int i10) {
        Typeface typeface = this.f11193b;
        if (!this.f11195d) {
            this.f11194c.a(typeface);
        }
    }

    public final void E(Typeface typeface, boolean z10) {
        if (!this.f11195d) {
            this.f11194c.a(typeface);
        }
    }
}
