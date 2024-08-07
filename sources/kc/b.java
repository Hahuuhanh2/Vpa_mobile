package kc;

import com.google.android.gms.internal.mlkit_common.zzaa;
import com.google.android.gms.internal.mlkit_common.zzz;
import java.util.Arrays;
import java.util.EnumMap;
import mc.a;
import y6.i;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumMap f12459a;

    static {
        Class<a> cls = a.class;
        new EnumMap(cls);
        f12459a = new EnumMap(cls);
    }

    public static String a() {
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f12459a.get((Object) null)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        if (!i.a((Object) null, (Object) null) || !i.a((Object) null, (Object) null) || !i.a((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null});
    }

    public final String toString() {
        zzz zzb = zzaa.zzb("RemoteModel");
        zzb.zza("modelName", (Object) null);
        zzb.zza("baseModel", (Object) null);
        zzb.zza("modelType", (Object) null);
        return zzb.toString();
    }
}
