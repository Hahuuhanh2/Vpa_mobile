package i1;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f10955a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f10956b;

    /* renamed from: c  reason: collision with root package name */
    public final a0[] f10957c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10958d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10959e = true;

    /* renamed from: f  reason: collision with root package name */
    public final int f10960f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10961g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public int f10962h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f10963i;

    /* renamed from: j  reason: collision with root package name */
    public PendingIntent f10964j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10965k;

    public m(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, a0[] a0VarArr, a0[] a0VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f10956b = iconCompat;
        if (iconCompat != null) {
            int i11 = iconCompat.f2120a;
            if ((i11 == -1 ? IconCompat.a.c(iconCompat.f2121b) : i11) == 2) {
                this.f10962h = iconCompat.c();
            }
        }
        this.f10963i = p.b(charSequence);
        this.f10964j = pendingIntent;
        this.f10955a = bundle == null ? new Bundle() : bundle;
        this.f10957c = a0VarArr;
        this.f10958d = z10;
        this.f10960f = i10;
        this.f10959e = z11;
        this.f10961g = z12;
        this.f10965k = z13;
    }

    public final IconCompat a() {
        int i10;
        if (this.f10956b == null && (i10 = this.f10962h) != 0) {
            this.f10956b = IconCompat.b((Resources) null, "", i10);
        }
        return this.f10956b;
    }
}
