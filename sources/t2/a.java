package t2;

import al.g0;
import androidx.fragment.app.o;
import androidx.lifecycle.f0;
import java.io.PrintWriter;
import r2.l;
import r2.p;
import r2.q;
import r2.v;
import r2.w;
import v0.i;

/* compiled from: LoaderManagerImpl */
public final class a extends o {

    /* renamed from: b  reason: collision with root package name */
    public final l f14799b;

    /* renamed from: c  reason: collision with root package name */
    public final b f14800c;

    /* renamed from: t2.a$a  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    public static class C0191a<D> extends p<D> {
        public final void g() {
            throw null;
        }

        public final void h() {
            throw null;
        }

        public final void i(q<? super D> qVar) {
            super.i(qVar);
        }

        public final void j(D d10) {
            super.j(d10);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(0);
            sb2.append(" : ");
            g0.w((l) null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* compiled from: LoaderManagerImpl */
    public static class b extends v {

        /* renamed from: e  reason: collision with root package name */
        public static final C0192a f14801e = new C0192a();

        /* renamed from: d  reason: collision with root package name */
        public i<C0191a> f14802d = new i<>();

        /* renamed from: t2.a$b$a  reason: collision with other inner class name */
        /* compiled from: LoaderManagerImpl */
        public static class C0192a implements f0.b {
            public final <T extends v> T a(Class<T> cls) {
                return new b();
            }

            public final v b(Class cls, s2.b bVar) {
                return a(cls);
            }
        }

        public final void b() {
            i<C0191a> iVar = this.f14802d;
            int i10 = iVar.f16011c;
            if (i10 <= 0) {
                Object[] objArr = iVar.f16010b;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                iVar.f16011c = 0;
                return;
            }
            ((C0191a) iVar.f16010b[0]).getClass();
            throw null;
        }
    }

    public a(l lVar, w wVar) {
        this.f14799b = lVar;
        this.f14800c = (b) new f0(wVar, (f0.b) b.f14801e).a(b.class);
    }

    @Deprecated
    public final void J(String str, PrintWriter printWriter) {
        b bVar = this.f14800c;
        if (bVar.f14802d.f16011c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            i<C0191a> iVar = bVar.f14802d;
            if (iVar.f16011c > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f14802d.f16009a[0]);
                printWriter.print(": ");
                printWriter.println(((C0191a) iVar.f16010b[0]).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        g0.w(this.f14799b, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
