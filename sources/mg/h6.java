package mg;

import android.widget.TextView;
import com.vpa.daugia.module.home.data.model.News;
import e2.c;
import j7.a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import n0.l;
import qh.b;
import ze.d;

/* compiled from: ItemNewsHomeBindingImpl */
public final class h6 extends g6 {
    public final TextView A;
    public final TextView B;
    public long C = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6(d2.e r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = d2.l.o(r10, r11, r0, r1, r1)
            r2 = 0
            r2 = r0[r2]
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.C = r2
            android.widget.LinearLayout r10 = r9.f21084w
            r10.setTag(r1)
            r10 = 3
            r10 = r0[r10]
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.A = r10
            r10.setTag(r1)
            r10 = 4
            r10 = r0[r10]
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.B = r10
            r10.setTag(r1)
            android.widget.ImageView r10 = r9.f21085x
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f21086y
            r10.setTag(r1)
            int r10 = androidx.databinding.library.R$id.dataBinding
            r11.setTag(r10, r9)
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h6.<init>(d2.e, android.view.View):void");
    }

    public final void h() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        News news;
        String str5;
        synchronized (this) {
            j10 = this.C;
            this.C = 0;
        }
        b bVar = this.f21087z;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i10 != 0) {
            if (bVar != null) {
                Long publishedAt = bVar.f22755a.getPublishedAt();
                if (publishedAt != null) {
                    str4 = l.h(publishedAt.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
                    if (str4 == null) {
                        str4 = "";
                    }
                } else {
                    str4 = null;
                }
                news = bVar.f22755a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a.f11713u);
                String thumbnailUrl = bVar.f22755a.getThumbnailUrl();
                if (thumbnailUrl != null) {
                    str5 = yk.l.b1("/", thumbnailUrl);
                } else {
                    str5 = null;
                }
                sb2.append(str5);
                str2 = sb2.toString();
            } else {
                str4 = null;
                news = null;
                str2 = null;
            }
            if (news != null) {
                str = news.getSummary();
                str3 = news.getTitle();
            } else {
                str3 = null;
                str = null;
            }
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i10 != 0) {
            c.d(this.A, str);
            c.d(this.B, str4);
            d.a(this.f21085x, str2, (String) null, true);
            c.d(this.f21086y, str3);
        }
    }

    public final boolean k() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.C = 2;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        return false;
    }

    public final void v(b bVar) {
        this.f21087z = bVar;
        synchronized (this) {
            this.C |= 1;
        }
        f(3);
        t();
    }
}
