package ua;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import sa.b;
import sa.c;
import sa.d;
import sa.e;

/* compiled from: JsonValueObjectEncoderContext */
public final class f implements d, sa.f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15416a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f15417b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, c<?>> f15418c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f15419d;

    /* renamed from: e  reason: collision with root package name */
    public final c<Object> f15420e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15421f;

    public f(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f15417b = new JsonWriter(writer);
        this.f15418c = hashMap;
        this.f15419d = hashMap2;
        this.f15420e = aVar;
        this.f15421f = z10;
    }

    public final f a(Object obj) {
        if (obj == null) {
            this.f15417b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f15417b.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    c();
                    this.f15417b.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                this.f15417b.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        this.f15417b.value((long) iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j10 = jArr[i10];
                        c();
                        this.f15417b.value(j10);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        this.f15417b.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        this.f15417b.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        a(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        a(objArr[i10]);
                        i10++;
                    }
                }
                this.f15417b.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f15417b.beginArray();
                for (Object a10 : (Collection) obj) {
                    a(a10);
                }
                this.f15417b.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f15417b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                this.f15417b.endObject();
                return this;
            } else {
                c cVar = this.f15418c.get(obj.getClass());
                if (cVar != null) {
                    this.f15417b.beginObject();
                    cVar.encode(obj, this);
                    this.f15417b.endObject();
                    return this;
                }
                e eVar = this.f15419d.get(obj.getClass());
                if (eVar != null) {
                    eVar.encode(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof g) {
                        int a11 = ((g) obj).a();
                        c();
                        this.f15417b.value((long) a11);
                    } else {
                        String name = ((Enum) obj).name();
                        c();
                        this.f15417b.value(name);
                    }
                    return this;
                } else {
                    c<Object> cVar2 = this.f15420e;
                    this.f15417b.beginObject();
                    cVar2.encode(obj, this);
                    this.f15417b.endObject();
                    return this;
                }
            }
        }
    }

    public final d add(b bVar, double d10) {
        String str = bVar.f14700a;
        c();
        this.f15417b.name(str);
        c();
        this.f15417b.value(d10);
        return this;
    }

    public final f b(Object obj, String str) {
        if (!this.f15421f) {
            c();
            this.f15417b.name(str);
            if (obj != null) {
                return a(obj);
            }
            this.f15417b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            c();
            this.f15417b.name(str);
            return a(obj);
        }
    }

    public final void c() {
        if (!this.f15416a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    public final d add(b bVar, int i10) {
        String str = bVar.f14700a;
        c();
        this.f15417b.name(str);
        c();
        this.f15417b.value((long) i10);
        return this;
    }

    public final d add(b bVar, long j10) {
        String str = bVar.f14700a;
        c();
        this.f15417b.name(str);
        c();
        this.f15417b.value(j10);
        return this;
    }

    public final d add(b bVar, Object obj) {
        return b(obj, bVar.f14700a);
    }

    public final d add(b bVar, boolean z10) {
        String str = bVar.f14700a;
        c();
        this.f15417b.name(str);
        c();
        this.f15417b.value(z10);
        return this;
    }

    public final sa.f add(String str) {
        c();
        this.f15417b.value(str);
        return this;
    }

    public final sa.f add(boolean z10) {
        c();
        this.f15417b.value(z10);
        return this;
    }
}
