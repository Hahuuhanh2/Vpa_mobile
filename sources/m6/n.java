package m6;

import android.database.Cursor;
import i6.f;
import m6.o;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f13163a;

    public /* synthetic */ n(long j10) {
        this.f13163a = j10;
    }

    public final Object apply(Object obj) {
        long j10 = this.f13163a;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new f(cursor.getLong(0), j10);
    }
}
