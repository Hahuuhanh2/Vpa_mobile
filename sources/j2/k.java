package j2;

import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;

/* compiled from: MapFieldSchemas */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final x f11512a;

    /* renamed from: b  reason: collision with root package name */
    public static final y f11513b = new y();

    static {
        x xVar;
        try {
            xVar = (x) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            xVar = null;
        }
        f11512a = xVar;
    }
}
