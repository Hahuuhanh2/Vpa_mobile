package a2;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.h0;

/* compiled from: CursorFilter */
public final class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f75a;

    /* compiled from: CursorFilter */
    public interface a {
    }

    public b(a aVar) {
        this.f75a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return ((h0) this.f75a).d((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            a2.b$a r0 = r3.f75a
            androidx.appcompat.widget.h0 r0 = (androidx.appcompat.widget.h0) r0
            if (r4 != 0) goto L_0x0009
            java.lang.String r4 = ""
            goto L_0x0010
        L_0x0009:
            r0.getClass()
            java.lang.String r4 = r4.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f1116r
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x002e
            androidx.appcompat.widget.SearchView r1 = r0.f1116r
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x002e
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f1117s     // Catch:{ RuntimeException -> 0x002e }
            android.database.Cursor r4 = r0.h(r1, r4)     // Catch:{ RuntimeException -> 0x002e }
            if (r4 == 0) goto L_0x002e
            r4.getCount()     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r4 = r2
        L_0x002f:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r4 == 0) goto L_0x003f
            int r1 = r4.getCount()
            r0.count = r1
            r0.values = r4
            goto L_0x0044
        L_0x003f:
            r4 = 0
            r0.count = r4
            r0.values = r2
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f75a;
        Cursor cursor = ((a) aVar).f68c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((h0) aVar).c((Cursor) obj);
        }
    }
}
