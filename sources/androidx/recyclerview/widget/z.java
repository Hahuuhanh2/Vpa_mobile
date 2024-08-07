package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final b f3309a;

    /* renamed from: b  reason: collision with root package name */
    public a f3310b = new a();

    /* compiled from: ViewBoundsCheck */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3311a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f3312b;

        /* renamed from: c  reason: collision with root package name */
        public int f3313c;

        /* renamed from: d  reason: collision with root package name */
        public int f3314d;

        /* renamed from: e  reason: collision with root package name */
        public int f3315e;

        public final boolean a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f3311a;
            int i14 = 2;
            if ((i13 & 7) != 0) {
                int i15 = this.f3314d;
                int i16 = this.f3312b;
                if (i15 > i16) {
                    i12 = 1;
                } else if (i15 == i16) {
                    i12 = 2;
                } else {
                    i12 = 4;
                }
                if (((i12 << 0) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 112) != 0) {
                int i17 = this.f3314d;
                int i18 = this.f3313c;
                if (i17 > i18) {
                    i11 = 1;
                } else if (i17 == i18) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                if (((i11 << 4) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 1792) != 0) {
                int i19 = this.f3315e;
                int i20 = this.f3312b;
                if (i19 > i20) {
                    i10 = 1;
                } else if (i19 == i20) {
                    i10 = 2;
                } else {
                    i10 = 4;
                }
                if (((i10 << 8) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 28672) != 0) {
                int i21 = this.f3315e;
                int i22 = this.f3313c;
                if (i21 > i22) {
                    i14 = 1;
                } else if (i21 != i22) {
                    i14 = 4;
                }
                if ((i13 & (i14 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public z(b bVar) {
        this.f3309a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        int b10 = this.f3309a.b();
        int c10 = this.f3309a.c();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View d10 = this.f3309a.d(i10);
            int a10 = this.f3309a.a(d10);
            int e10 = this.f3309a.e(d10);
            a aVar = this.f3310b;
            aVar.f3312b = b10;
            aVar.f3313c = c10;
            aVar.f3314d = a10;
            aVar.f3315e = e10;
            if (i12 != 0) {
                aVar.f3311a = i12 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f3310b;
                aVar2.f3311a = i13 | 0;
                if (aVar2.a()) {
                    view = d10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        a aVar = this.f3310b;
        int b10 = this.f3309a.b();
        int c10 = this.f3309a.c();
        int a10 = this.f3309a.a(view);
        int e10 = this.f3309a.e(view);
        aVar.f3312b = b10;
        aVar.f3313c = c10;
        aVar.f3314d = a10;
        aVar.f3315e = e10;
        a aVar2 = this.f3310b;
        aVar2.f3311a = 24579 | 0;
        return aVar2.a();
    }
}
