package mg;

import com.ots.core.utils.customview.textview.AppTextView;
import e2.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import n0.l;
import xh.b;

/* compiled from: ItemNotifyBindingImpl */
public final class j6 extends i6 {
    public final AppTextView A;
    public long B = -1;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21132y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21133z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j6(d2.e r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = d2.l.o(r5, r6, r0, r1, r1)
            r2 = 4
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r4.<init>(r5, r6, r2)
            r2 = -1
            r4.B = r2
            android.widget.ImageView r5 = r4.f21120w
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r5.setTag(r1)
            r5 = 1
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.f21132y = r5
            r5.setTag(r1)
            r5 = 2
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.f21133z = r5
            r5.setTag(r1)
            r5 = 3
            r5 = r0[r5]
            com.ots.core.utils.customview.textview.AppTextView r5 = (com.ots.core.utils.customview.textview.AppTextView) r5
            r4.A = r5
            r5.setTag(r1)
            int r5 = androidx.databinding.library.R$id.dataBinding
            r6.setTag(r5, r4)
            r4.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j6.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        int i10;
        String str2;
        boolean z10;
        String str3;
        long j11;
        String h10;
        synchronized (this) {
            j10 = this.B;
            this.B = 0;
        }
        b bVar = this.f21121x;
        int i11 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        String str4 = null;
        if (i11 != 0) {
            if (bVar != null) {
                String title = bVar.f23477b.getTitle();
                str = "";
                if (!(bVar.f23477b.getCreatedDate() == null || (h10 = l.h(bVar.f23477b.getCreatedDate().longValue(), new SimpleDateFormat("dd/MM/yyy HH:mm", Locale.getDefault()))) == null)) {
                    str = h10;
                }
                Integer isSeen = bVar.f23477b.isSeen();
                if (isSeen != null && isSeen.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str5 = title;
                str4 = bVar.f23477b.getBody();
                str3 = str5;
            } else {
                z10 = false;
                str3 = null;
                str = null;
            }
            if (i11 != 0) {
                if (z10) {
                    j11 = 8;
                } else {
                    j11 = 4;
                }
                j10 |= j11;
            }
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            String str6 = str4;
            str4 = str3;
            str2 = str6;
        } else {
            i10 = 0;
            str2 = null;
            str = null;
        }
        if ((j10 & 3) != 0) {
            this.f21120w.setVisibility(i10);
            c.d(this.f21132y, str4);
            c.d(this.f21133z, str2);
            c.d(this.A, str);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.B = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(b bVar) {
        this.f21121x = bVar;
        synchronized (this) {
            this.B |= 1;
        }
        f(3);
        t();
    }
}
