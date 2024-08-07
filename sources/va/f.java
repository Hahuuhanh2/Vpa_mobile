package va;

import com.google.firebase.encoders.EncodingException;
import f0.b0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import sa.b;
import sa.c;
import sa.d;
import sa.e;

/* compiled from: ProtobufDataEncoderContext */
public final class f implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f16123f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final b f16124g = new b("key", b0.z(b0.x(d.class, new a(1))));

    /* renamed from: h  reason: collision with root package name */
    public static final b f16125h = new b("value", b0.z(b0.x(d.class, new a(2))));

    /* renamed from: i  reason: collision with root package name */
    public static final e f16126i = new e();

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f16127a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, c<?>> f16128b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f16129c;

    /* renamed from: d  reason: collision with root package name */
    public final c<Object> f16130d;

    /* renamed from: e  reason: collision with root package name */
    public final i f16131e = new i(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, c cVar) {
        this.f16127a = byteArrayOutputStream;
        this.f16128b = map;
        this.f16129c = map2;
        this.f16130d = cVar;
    }

    public static int e(b bVar) {
        d dVar = (d) bVar.a(d.class);
        if (dVar != null) {
            return ((a) dVar).f16119a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final f a(b bVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            f((e(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f16123f);
            f(bytes.length);
            this.f16127a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object a10 : (Collection) obj) {
                a(bVar, a10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry d10 : ((Map) obj).entrySet()) {
                d(f16126i, bVar, d10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            b(bVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                f((e(bVar) << 3) | 5);
                this.f16127a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z10 || longValue != 0) {
                d dVar = (d) bVar.a(d.class);
                if (dVar != null) {
                    f(((a) dVar).f16119a << 3);
                    g(longValue);
                } else {
                    throw new EncodingException("Field has no @Protobuf config");
                }
            }
            return this;
        } else if (obj instanceof Boolean) {
            c(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            f((e(bVar) << 3) | 2);
            f(bArr.length);
            this.f16127a.write(bArr);
            return this;
        } else {
            c cVar = this.f16128b.get(obj.getClass());
            if (cVar != null) {
                d(cVar, bVar, obj, z10);
                return this;
            }
            e eVar = this.f16129c.get(obj.getClass());
            if (eVar != null) {
                i iVar = this.f16131e;
                iVar.f16136a = false;
                iVar.f16138c = bVar;
                iVar.f16137b = z10;
                eVar.encode(obj, iVar);
                return this;
            } else if (obj instanceof c) {
                c(bVar, ((c) obj).a(), true);
                return this;
            } else if (obj instanceof Enum) {
                c(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                d(this.f16130d, bVar, obj, z10);
                return this;
            }
        }
    }

    public final d add(b bVar, Object obj) {
        a(bVar, obj, true);
        return this;
    }

    public final void b(b bVar, double d10, boolean z10) {
        if (!z10 || d10 != 0.0d) {
            f((e(bVar) << 3) | 1);
            this.f16127a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
        }
    }

    public final void c(b bVar, int i10, boolean z10) {
        if (!z10 || i10 != 0) {
            d dVar = (d) bVar.a(d.class);
            if (dVar != null) {
                f(((a) dVar).f16119a << 3);
                f(i10);
                return;
            }
            throw new EncodingException("Field has no @Protobuf config");
        }
    }

    public final void d(c cVar, b bVar, Object obj, boolean z10) {
        OutputStream outputStream;
        b bVar2 = new b();
        try {
            outputStream = this.f16127a;
            this.f16127a = bVar2;
            cVar.encode(obj, this);
            this.f16127a = outputStream;
            long j10 = bVar2.f16120a;
            bVar2.close();
            if (!z10 || j10 != 0) {
                f((e(bVar) << 3) | 2);
                g(j10);
                cVar.encode(obj, this);
            }
        } catch (Throwable th2) {
            try {
                bVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void f(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f16127a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f16127a.write(i10 & 127);
    }

    public final void g(long j10) {
        while ((-128 & j10) != 0) {
            this.f16127a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f16127a.write(((int) j10) & 127);
    }

    public final d add(b bVar, double d10) {
        b(bVar, d10, true);
        return this;
    }

    public final d add(b bVar, int i10) {
        c(bVar, i10, true);
        return this;
    }

    public final d add(b bVar, boolean z10) {
        c(bVar, z10 ? 1 : 0, true);
        return this;
    }

    public final d add(b bVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) bVar.a(d.class);
            if (dVar != null) {
                f(((a) dVar).f16119a << 3);
                g(j10);
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
        return this;
    }
}
