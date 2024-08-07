package qj;

import io.github.g00fy2.quickie.content.CalendarDateTimeParcelable;
import oc.a;

/* compiled from: BarcodeExtensions.kt */
public final class a {
    public static final CalendarDateTimeParcelable a(a.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15 = -1;
        if (bVar != null) {
            i10 = bVar.f13822c;
        } else {
            i10 = -1;
        }
        if (bVar != null) {
            i11 = bVar.f13823d;
        } else {
            i11 = -1;
        }
        if (bVar != null) {
            i12 = bVar.f13824e;
        } else {
            i12 = -1;
        }
        if (bVar != null) {
            i13 = bVar.f13821b;
        } else {
            i13 = -1;
        }
        if (bVar != null) {
            i14 = bVar.f13825f;
        } else {
            i14 = -1;
        }
        if (bVar != null) {
            i15 = bVar.f13820a;
        }
        int i16 = i15;
        if (bVar != null) {
            z10 = bVar.f13826g;
        } else {
            z10 = false;
        }
        return new CalendarDateTimeParcelable(i10, i11, i12, i13, i14, i16, z10);
    }
}
