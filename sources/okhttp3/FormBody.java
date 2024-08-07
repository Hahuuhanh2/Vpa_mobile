package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ll.f;
import ll.h;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: FormBody.kt */
public final class FormBody extends RequestBody {

    /* renamed from: d  reason: collision with root package name */
    public static final MediaType f21989d = MediaType.Companion.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f21990b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f21991c;

    /* compiled from: FormBody.kt */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f21992a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f21993b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f21994c = new ArrayList();
    }

    /* compiled from: FormBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
        MediaType.f22026e.getClass();
    }

    public FormBody(ArrayList arrayList, ArrayList arrayList2) {
        j.f(arrayList, "encodedNames");
        j.f(arrayList2, "encodedValues");
        this.f21990b = Util.x(arrayList);
        this.f21991c = Util.x(arrayList2);
    }

    public final long a() {
        return d((h) null, true);
    }

    public final MediaType b() {
        return f21989d;
    }

    public final void c(h hVar) {
        d(hVar, false);
    }

    public final long d(h hVar, boolean z10) {
        f fVar;
        if (z10) {
            fVar = new f();
        } else {
            j.c(hVar);
            fVar = hVar.a();
        }
        int size = this.f21990b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                fVar.g0(38);
            }
            fVar.w0(this.f21990b.get(i10));
            fVar.g0(61);
            fVar.w0(this.f21991c.get(i10));
        }
        if (!z10) {
            return 0;
        }
        long j10 = fVar.f20878b;
        fVar.q();
        return j10;
    }
}
