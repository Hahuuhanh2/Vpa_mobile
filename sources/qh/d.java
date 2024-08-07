package qh;

import android.content.Context;
import android.support.v4.media.a;
import com.vpa.daugia.module.home.data.api.response.Plate;
import sk.j;

/* compiled from: PlateItemState.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22757a;

    /* renamed from: b  reason: collision with root package name */
    public final Plate f22758b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22759c = true;

    public d(Context context, Plate plate) {
        j.f(plate, "item");
        this.f22757a = context;
        this.f22758b = plate;
    }

    public final String a() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        String bks = this.f22758b.getBks();
        String str3 = null;
        if (bks != null) {
            str = bks.substring(0, 3);
            j.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(10);
        String bks2 = this.f22758b.getBks();
        if (bks2 != null) {
            str2 = bks2.substring(3, 6);
            j.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append('.');
        String bks3 = this.f22758b.getBks();
        if (bks3 != null) {
            str3 = bks3.substring(6);
            j.e(str3, "this as java.lang.String).substring(startIndex)");
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f22757a, dVar.f22757a) && j.a(this.f22758b, dVar.f22758b) && this.f22759c == dVar.f22759c;
    }

    public final int hashCode() {
        int hashCode = (this.f22758b.hashCode() + (this.f22757a.hashCode() * 31)) * 31;
        boolean z10 = this.f22759c;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder q10 = a.q("PlateItemState(context=");
        q10.append(this.f22757a);
        q10.append(", item=");
        q10.append(this.f22758b);
        q10.append(", onClick=");
        q10.append(this.f22759c);
        q10.append(')');
        return q10.toString();
    }
}
