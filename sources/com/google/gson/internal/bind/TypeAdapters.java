package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import dc.p;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final bc.v A;
    public static final bc.v B = new bc.v() {
        public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.f10437a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new c0(cls2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final bc.v f7779a;

    /* renamed from: b  reason: collision with root package name */
    public static final bc.v f7780b;

    /* renamed from: c  reason: collision with root package name */
    public static final w f7781c = new w();

    /* renamed from: d  reason: collision with root package name */
    public static final bc.v f7782d;

    /* renamed from: e  reason: collision with root package name */
    public static final bc.v f7783e;

    /* renamed from: f  reason: collision with root package name */
    public static final bc.v f7784f;

    /* renamed from: g  reason: collision with root package name */
    public static final bc.v f7785g;

    /* renamed from: h  reason: collision with root package name */
    public static final bc.v f7786h;

    /* renamed from: i  reason: collision with root package name */
    public static final bc.v f7787i;

    /* renamed from: j  reason: collision with root package name */
    public static final bc.v f7788j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f7789k = new b();

    /* renamed from: l  reason: collision with root package name */
    public static final bc.v f7790l;

    /* renamed from: m  reason: collision with root package name */
    public static final g f7791m = new g();

    /* renamed from: n  reason: collision with root package name */
    public static final h f7792n = new h();

    /* renamed from: o  reason: collision with root package name */
    public static final i f7793o = new i();

    /* renamed from: p  reason: collision with root package name */
    public static final bc.v f7794p;

    /* renamed from: q  reason: collision with root package name */
    public static final bc.v f7795q;

    /* renamed from: r  reason: collision with root package name */
    public static final bc.v f7796r;

    /* renamed from: s  reason: collision with root package name */
    public static final bc.v f7797s;

    /* renamed from: t  reason: collision with root package name */
    public static final bc.v f7798t;

    /* renamed from: u  reason: collision with root package name */
    public static final bc.v f7799u;

    /* renamed from: v  reason: collision with root package name */
    public static final bc.v f7800v;

    /* renamed from: w  reason: collision with root package name */
    public static final bc.v f7801w;

    /* renamed from: x  reason: collision with root package name */
    public static final bc.v f7802x;

    /* renamed from: y  reason: collision with root package name */
    public static final bc.v f7803y;

    /* renamed from: z  reason: collision with root package name */
    public static final t f7804z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30  reason: invalid class name */
    class AnonymousClass30 implements bc.v {
        public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
            aVar.equals((Object) null);
            return null;
        }
    }

    public class a extends bc.u<AtomicIntegerArray> {
        public final Object a(hc.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.d();
            while (aVar.K()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.U()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException((Exception) e10);
                }
            }
            aVar.s();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        public final void b(hc.b bVar, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            bVar.h();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.N((long) atomicIntegerArray.get(i10));
            }
            bVar.s();
        }
    }

    public class a0 extends bc.u<AtomicInteger> {
        public final Object a(hc.a aVar) {
            try {
                return new AtomicInteger(aVar.U());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Exception) e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.N((long) ((AtomicInteger) obj).get());
        }
    }

    public class b extends bc.u<Number> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                return Long.valueOf(aVar.W());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Exception) e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                bVar.B();
            } else {
                bVar.N(number.longValue());
            }
        }
    }

    public class b0 extends bc.u<AtomicBoolean> {
        public final Object a(hc.a aVar) {
            return new AtomicBoolean(aVar.R());
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.W(((AtomicBoolean) obj).get());
        }
    }

    public class c extends bc.u<Number> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return Float.valueOf((float) aVar.S());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                bVar.B();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            bVar.S(number);
        }
    }

    public static final class c0<T extends Enum<T>> extends bc.u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f7817a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f7818b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f7819c = new HashMap();

        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f7820a;

            public a(Class cls) {
                this.f7820a = cls;
            }

            public final Object run() {
                Field[] declaredFields = this.f7820a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public c0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    String str = enumR.toString();
                    cc.b bVar = (cc.b) field.getAnnotation(cc.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.f7817a.put(put, enumR);
                        }
                    }
                    this.f7817a.put(name, enumR);
                    this.f7818b.put(str, enumR);
                    this.f7819c.put(enumR, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String g02 = aVar.g0();
            Enum enumR = (Enum) this.f7817a.get(g02);
            if (enumR == null) {
                return (Enum) this.f7818b.get(g02);
            }
            return enumR;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = (String) this.f7819c.get(enumR);
            }
            bVar.U(str);
        }
    }

    public class d extends bc.u<Number> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return Double.valueOf(aVar.S());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                bVar.B();
            } else {
                bVar.L(number.doubleValue());
            }
        }
    }

    public class e extends bc.u<Character> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String g02 = aVar.g0();
            if (g02.length() == 1) {
                return Character.valueOf(g02.charAt(0));
            }
            StringBuilder w9 = f0.b0.w("Expecting character, got: ", g02, "; at ");
            w9.append(aVar.E());
            throw new JsonSyntaxException(w9.toString());
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            Character ch2 = (Character) obj;
            if (ch2 == null) {
                str = null;
            } else {
                str = String.valueOf(ch2);
            }
            bVar.U(str);
        }
    }

    public class f extends bc.u<String> {
        public final Object a(hc.a aVar) {
            int k02 = aVar.k0();
            if (k02 == 9) {
                aVar.d0();
                return null;
            } else if (k02 == 8) {
                return Boolean.toString(aVar.R());
            } else {
                return aVar.g0();
            }
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.U((String) obj);
        }
    }

    public class g extends bc.u<BigDecimal> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String g02 = aVar.g0();
            try {
                return new BigDecimal(g02);
            } catch (NumberFormatException e10) {
                StringBuilder w9 = f0.b0.w("Failed parsing '", g02, "' as BigDecimal; at path ");
                w9.append(aVar.E());
                throw new JsonSyntaxException(w9.toString(), e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.S((BigDecimal) obj);
        }
    }

    public class h extends bc.u<BigInteger> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String g02 = aVar.g0();
            try {
                return new BigInteger(g02);
            } catch (NumberFormatException e10) {
                StringBuilder w9 = f0.b0.w("Failed parsing '", g02, "' as BigInteger; at path ");
                w9.append(aVar.E());
                throw new JsonSyntaxException(w9.toString(), e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.S((BigInteger) obj);
        }
    }

    public class i extends bc.u<dc.o> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return new dc.o(aVar.g0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.S((dc.o) obj);
        }
    }

    public class j extends bc.u<StringBuilder> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return new StringBuilder(aVar.g0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            StringBuilder sb2 = (StringBuilder) obj;
            if (sb2 == null) {
                str = null;
            } else {
                str = sb2.toString();
            }
            bVar.U(str);
        }
    }

    public class k extends bc.u<Class> {
        public final Object a(hc.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final void b(hc.b bVar, Object obj) {
            StringBuilder q10 = android.support.v4.media.a.q("Attempted to serialize java.lang.Class: ");
            q10.append(((Class) obj).getName());
            q10.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(q10.toString());
        }
    }

    public class l extends bc.u<StringBuffer> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return new StringBuffer(aVar.g0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            StringBuffer stringBuffer = (StringBuffer) obj;
            if (stringBuffer == null) {
                str = null;
            } else {
                str = stringBuffer.toString();
            }
            bVar.U(str);
        }
    }

    public class m extends bc.u<URL> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
            } else {
                String g02 = aVar.g0();
                if (!"null".equals(g02)) {
                    return new URL(g02);
                }
            }
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            URL url = (URL) obj;
            if (url == null) {
                str = null;
            } else {
                str = url.toExternalForm();
            }
            bVar.U(str);
        }
    }

    public class n extends bc.u<URI> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
            } else {
                try {
                    String g02 = aVar.g0();
                    if (!"null".equals(g02)) {
                        return new URI(g02);
                    }
                } catch (URISyntaxException e10) {
                    throw new JsonIOException((Exception) e10);
                }
            }
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            URI uri = (URI) obj;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toASCIIString();
            }
            bVar.U(str);
        }
    }

    public class o extends bc.u<InetAddress> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return InetAddress.getByName(aVar.g0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            InetAddress inetAddress = (InetAddress) obj;
            if (inetAddress == null) {
                str = null;
            } else {
                str = inetAddress.getHostAddress();
            }
            bVar.U(str);
        }
    }

    public class p extends bc.u<UUID> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String g02 = aVar.g0();
            try {
                return UUID.fromString(g02);
            } catch (IllegalArgumentException e10) {
                StringBuilder w9 = f0.b0.w("Failed parsing '", g02, "' as UUID; at path ");
                w9.append(aVar.E());
                throw new JsonSyntaxException(w9.toString(), e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            UUID uuid = (UUID) obj;
            if (uuid == null) {
                str = null;
            } else {
                str = uuid.toString();
            }
            bVar.U(str);
        }
    }

    public class q extends bc.u<Currency> {
        public final Object a(hc.a aVar) {
            String g02 = aVar.g0();
            try {
                return Currency.getInstance(g02);
            } catch (IllegalArgumentException e10) {
                StringBuilder w9 = f0.b0.w("Failed parsing '", g02, "' as Currency; at path ");
                w9.append(aVar.E());
                throw new JsonSyntaxException(w9.toString(), e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.U(((Currency) obj).getCurrencyCode());
        }
    }

    public class r extends bc.u<Calendar> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            aVar.h();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.k0() != 4) {
                String a02 = aVar.a0();
                int U = aVar.U();
                if ("year".equals(a02)) {
                    i10 = U;
                } else if ("month".equals(a02)) {
                    i11 = U;
                } else if ("dayOfMonth".equals(a02)) {
                    i12 = U;
                } else if ("hourOfDay".equals(a02)) {
                    i13 = U;
                } else if ("minute".equals(a02)) {
                    i14 = U;
                } else if ("second".equals(a02)) {
                    i15 = U;
                }
            }
            aVar.v();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        public final void b(hc.b bVar, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                bVar.B();
                return;
            }
            bVar.i();
            bVar.x("year");
            bVar.N((long) calendar.get(1));
            bVar.x("month");
            bVar.N((long) calendar.get(2));
            bVar.x("dayOfMonth");
            bVar.N((long) calendar.get(5));
            bVar.x("hourOfDay");
            bVar.N((long) calendar.get(11));
            bVar.x("minute");
            bVar.N((long) calendar.get(12));
            bVar.x("second");
            bVar.N((long) calendar.get(13));
            bVar.v();
        }
    }

    public class s extends bc.u<Locale> {
        public final Object a(hc.a aVar) {
            String str;
            String str2;
            String str3 = null;
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.g0(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            Locale locale = (Locale) obj;
            if (locale == null) {
                str = null;
            } else {
                str = locale.toString();
            }
            bVar.U(str);
        }
    }

    public class t extends bc.u<bc.l> {
        public static bc.l c(hc.a aVar, int i10) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 == 5) {
                    return new bc.o(aVar.g0());
                }
                if (i11 == 6) {
                    return new bc.o((Number) new dc.o(aVar.g0()));
                }
                if (i11 == 7) {
                    return new bc.o(Boolean.valueOf(aVar.R()));
                }
                if (i11 == 8) {
                    aVar.d0();
                    return bc.m.f4160a;
                }
                StringBuilder q10 = android.support.v4.media.a.q("Unexpected token: ");
                q10.append(f0.b0.F(i10));
                throw new IllegalStateException(q10.toString());
            }
            throw null;
        }

        public static bc.l d(hc.a aVar, int i10) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 == 0) {
                    aVar.d();
                    return new bc.j();
                } else if (i11 != 2) {
                    return null;
                } else {
                    aVar.h();
                    return new bc.n();
                }
            } else {
                throw null;
            }
        }

        public static void e(bc.l lVar, hc.b bVar) {
            boolean z10;
            if (lVar == null || (lVar instanceof bc.m)) {
                bVar.B();
            } else if (lVar instanceof bc.o) {
                bc.o i10 = lVar.i();
                Serializable serializable = i10.f4162a;
                if (serializable instanceof Number) {
                    bVar.S(i10.n());
                } else if (serializable instanceof Boolean) {
                    bVar.W(i10.m());
                } else {
                    bVar.U(i10.l());
                }
            } else {
                boolean z11 = lVar instanceof bc.j;
                if (z11) {
                    bVar.h();
                    if (z11) {
                        Iterator<bc.l> it = ((bc.j) lVar).iterator();
                        while (it.hasNext()) {
                            e(it.next(), bVar);
                        }
                        bVar.s();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + lVar);
                } else if (lVar instanceof bc.n) {
                    bVar.i();
                    dc.p pVar = dc.p.this;
                    p.e<K, V> eVar = pVar.f8918f.f8930d;
                    int i11 = pVar.f8917e;
                    while (true) {
                        p.e<K, V> eVar2 = pVar.f8918f;
                        if (eVar != eVar2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            bVar.v();
                            return;
                        } else if (eVar == eVar2) {
                            throw new NoSuchElementException();
                        } else if (pVar.f8917e == i11) {
                            p.e<K, V> eVar3 = eVar.f8930d;
                            bVar.x((String) eVar.f8932f);
                            e((bc.l) eVar.f8934o, bVar);
                            eVar = eVar3;
                        } else {
                            throw new ConcurrentModificationException();
                        }
                    }
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q("Couldn't write ");
                    q10.append(lVar.getClass());
                    throw new IllegalArgumentException(q10.toString());
                }
            }
        }

        public final Object a(hc.a aVar) {
            boolean z10;
            bc.l lVar;
            bc.l lVar2;
            if (aVar instanceof b) {
                b bVar = (b) aVar;
                int k02 = bVar.k0();
                if (k02 == 5 || k02 == 2 || k02 == 4 || k02 == 10) {
                    StringBuilder q10 = android.support.v4.media.a.q("Unexpected ");
                    q10.append(f0.b0.F(k02));
                    q10.append(" when reading a JsonElement.");
                    throw new IllegalStateException(q10.toString());
                }
                bc.l lVar3 = (bc.l) bVar.F0();
                bVar.v0();
                return lVar3;
            }
            int k03 = aVar.k0();
            bc.l d10 = d(aVar, k03);
            if (d10 == null) {
                return c(aVar, k03);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.K()) {
                    String str = null;
                    if (d10 instanceof bc.n) {
                        str = aVar.a0();
                    }
                    int k04 = aVar.k0();
                    bc.l d11 = d(aVar, k04);
                    if (d11 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (d11 == null) {
                        d11 = c(aVar, k04);
                    }
                    if (d10 instanceof bc.j) {
                        bc.j jVar = (bc.j) d10;
                        if (d11 == null) {
                            jVar.getClass();
                            lVar2 = bc.m.f4160a;
                        } else {
                            lVar2 = d11;
                        }
                        jVar.f4159a.add(lVar2);
                    } else {
                        dc.p<String, bc.l> pVar = ((bc.n) d10).f4161a;
                        if (d11 == null) {
                            lVar = bc.m.f4160a;
                        } else {
                            lVar = d11;
                        }
                        pVar.put(str, lVar);
                    }
                    if (z10) {
                        arrayDeque.addLast(d10);
                        d10 = d11;
                    }
                } else {
                    if (d10 instanceof bc.j) {
                        aVar.s();
                    } else {
                        aVar.v();
                    }
                    if (arrayDeque.isEmpty()) {
                        return d10;
                    }
                    d10 = (bc.l) arrayDeque.removeLast();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void b(hc.b bVar, Object obj) {
            e((bc.l) obj, bVar);
        }
    }

    public class u extends bc.u<BitSet> {
        public final Object a(hc.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.d();
            int k02 = aVar.k0();
            int i10 = 0;
            while (k02 != 2) {
                int g2 = v.v.g(k02);
                boolean z10 = true;
                if (g2 == 5 || g2 == 6) {
                    int U = aVar.U();
                    if (U == 0) {
                        z10 = false;
                    } else if (U != 1) {
                        StringBuilder l10 = n0.l.l("Invalid bitset value ", U, ", expected 0 or 1; at path ");
                        l10.append(aVar.E());
                        throw new JsonSyntaxException(l10.toString());
                    }
                } else if (g2 == 7) {
                    z10 = aVar.R();
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q("Invalid bitset value type: ");
                    q10.append(f0.b0.F(k02));
                    q10.append("; at path ");
                    q10.append(aVar.z());
                    throw new JsonSyntaxException(q10.toString());
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                k02 = aVar.k0();
            }
            aVar.s();
            return bitSet;
        }

        public final void b(hc.b bVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            bVar.h();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.N(bitSet.get(i10) ? 1 : 0);
            }
            bVar.s();
        }
    }

    public class v extends bc.u<Boolean> {
        public final Object a(hc.a aVar) {
            int k02 = aVar.k0();
            if (k02 == 9) {
                aVar.d0();
                return null;
            } else if (k02 == 6) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.g0()));
            } else {
                return Boolean.valueOf(aVar.R());
            }
        }

        public final void b(hc.b bVar, Object obj) {
            bVar.R((Boolean) obj);
        }
    }

    public class w extends bc.u<Boolean> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() != 9) {
                return Boolean.valueOf(aVar.g0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hc.b bVar, Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            bVar.U(str);
        }
    }

    public class x extends bc.u<Number> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                int U = aVar.U();
                if (U <= 255 && U >= -128) {
                    return Byte.valueOf((byte) U);
                }
                StringBuilder l10 = n0.l.l("Lossy conversion from ", U, " to byte; at path ");
                l10.append(aVar.E());
                throw new JsonSyntaxException(l10.toString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Exception) e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                bVar.B();
            } else {
                bVar.N((long) number.byteValue());
            }
        }
    }

    public class y extends bc.u<Number> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                int U = aVar.U();
                if (U <= 65535 && U >= -32768) {
                    return Short.valueOf((short) U);
                }
                StringBuilder l10 = n0.l.l("Lossy conversion from ", U, " to short; at path ");
                l10.append(aVar.E());
                throw new JsonSyntaxException(l10.toString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Exception) e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                bVar.B();
            } else {
                bVar.N((long) number.shortValue());
            }
        }
    }

    public class z extends bc.u<Number> {
        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.U());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Exception) e10);
            }
        }

        public final void b(hc.b bVar, Object obj) {
            Number number = (Number) obj;
            if (number == null) {
                bVar.B();
            } else {
                bVar.N((long) number.intValue());
            }
        }
    }

    static {
        final bc.t tVar = new bc.t(new k());
        final Class<Class> cls = Class.class;
        f7779a = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final bc.t tVar2 = new bc.t(new u());
        final Class<BitSet> cls2 = BitSet.class;
        f7780b = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final v vVar = new v();
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        f7782d = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r2.getName());
                q10.append("+");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r3);
                q10.append("]");
                return q10.toString();
            }
        };
        final x xVar = new x();
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        f7783e = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r2.getName());
                q10.append("+");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r3);
                q10.append("]");
                return q10.toString();
            }
        };
        final y yVar = new y();
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        f7784f = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r2.getName());
                q10.append("+");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r3);
                q10.append("]");
                return q10.toString();
            }
        };
        final z zVar = new z();
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        f7785g = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r2.getName());
                q10.append("+");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r3);
                q10.append("]");
                return q10.toString();
            }
        };
        final bc.t tVar3 = new bc.t(new a0());
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        f7786h = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final bc.t tVar4 = new bc.t(new b0());
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        f7787i = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final bc.t tVar5 = new bc.t(new a());
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        f7788j = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        new c();
        new d();
        final e eVar = new e();
        final Class cls14 = Character.TYPE;
        final Class<Character> cls15 = Character.class;
        f7790l = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r2.getName());
                q10.append("+");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r3);
                q10.append("]");
                return q10.toString();
            }
        };
        final f fVar = new f();
        final Class<String> cls16 = String.class;
        f7794p = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final j jVar = new j();
        final Class<StringBuilder> cls17 = StringBuilder.class;
        f7795q = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final l lVar = new l();
        final Class<StringBuffer> cls18 = StringBuffer.class;
        f7796r = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final m mVar = new m();
        final Class<URL> cls19 = URL.class;
        f7797s = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final n nVar = new n();
        final Class<URI> cls20 = URI.class;
        f7798t = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final o oVar = new o();
        final Class<InetAddress> cls21 = InetAddress.class;
        f7799u = new bc.v() {

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$a */
            public class a extends bc.u<Object> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Class f7815a;

                public a(Class cls) {
                    this.f7815a = cls;
                }

                public final Object a(hc.a aVar) {
                    Object a10 = r0.a(aVar);
                    if (a10 == null || this.f7815a.isInstance(a10)) {
                        return a10;
                    }
                    StringBuilder q10 = android.support.v4.media.a.q("Expected a ");
                    q10.append(this.f7815a.getName());
                    q10.append(" but was ");
                    q10.append(a10.getClass().getName());
                    q10.append("; at path ");
                    q10.append(aVar.E());
                    throw new JsonSyntaxException(q10.toString());
                }

                public final void b(hc.b bVar, Object obj) {
                    r0.b(bVar, obj);
                }
            }

            public final <T2> bc.u<T2> a(bc.h hVar, gc.a<T2> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (!r1.isAssignableFrom(cls)) {
                    return null;
                }
                return new a(cls);
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[typeHierarchy=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r0);
                q10.append("]");
                return q10.toString();
            }
        };
        final p pVar = new p();
        final Class<UUID> cls22 = UUID.class;
        f7800v = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final bc.t tVar6 = new bc.t(new q());
        final Class<Currency> cls23 = Currency.class;
        f7801w = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final r rVar = new r();
        final Class<Calendar> cls24 = Calendar.class;
        final Class<GregorianCalendar> cls25 = GregorianCalendar.class;
        f7802x = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == cls24 || cls == cls25) {
                    return rVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(cls24.getName());
                q10.append("+");
                q10.append(cls25.getName());
                q10.append(",adapter=");
                q10.append(rVar);
                q10.append("]");
                return q10.toString();
            }
        };
        final s sVar = new s();
        final Class<Locale> cls26 = Locale.class;
        f7803y = new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(r1.getName());
                q10.append(",adapter=");
                q10.append(r2);
                q10.append("]");
                return q10.toString();
            }
        };
        final t tVar7 = new t();
        f7804z = tVar7;
        final Class<bc.l> cls27 = bc.l.class;
        A = new bc.v() {

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$a */
            public class a extends bc.u<Object> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Class f7815a;

                public a(Class cls) {
                    this.f7815a = cls;
                }

                public final Object a(hc.a aVar) {
                    Object a10 = tVar7.a(aVar);
                    if (a10 == null || this.f7815a.isInstance(a10)) {
                        return a10;
                    }
                    StringBuilder q10 = android.support.v4.media.a.q("Expected a ");
                    q10.append(this.f7815a.getName());
                    q10.append(" but was ");
                    q10.append(a10.getClass().getName());
                    q10.append("; at path ");
                    q10.append(aVar.E());
                    throw new JsonSyntaxException(q10.toString());
                }

                public final void b(hc.b bVar, Object obj) {
                    tVar7.b(bVar, obj);
                }
            }

            public final <T2> bc.u<T2> a(bc.h hVar, gc.a<T2> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (!cls27.isAssignableFrom(cls)) {
                    return null;
                }
                return new a(cls);
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[typeHierarchy=");
                q10.append(cls27.getName());
                q10.append(",adapter=");
                q10.append(tVar7);
                q10.append("]");
                return q10.toString();
            }
        };
    }

    public static <TT> bc.v a(final Class<TT> cls, final bc.u<TT> uVar) {
        return new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                if (aVar.f10437a == cls) {
                    return uVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(cls.getName());
                q10.append(",adapter=");
                q10.append(uVar);
                q10.append("]");
                return q10.toString();
            }
        };
    }

    public static <TT> bc.v b(final Class<TT> cls, final Class<TT> cls2, final bc.u<? super TT> uVar) {
        return new bc.v() {
            public final <T> bc.u<T> a(bc.h hVar, gc.a<T> aVar) {
                Class<? super T> cls = aVar.f10437a;
                if (cls == cls || cls == cls2) {
                    return uVar;
                }
                return null;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Factory[type=");
                q10.append(cls2.getName());
                q10.append("+");
                q10.append(cls.getName());
                q10.append(",adapter=");
                q10.append(uVar);
                q10.append("]");
                return q10.toString();
            }
        };
    }
}
