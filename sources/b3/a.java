package b3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import b9.b;
import c9.a;
import f0.b0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.e;
import v.v;
import v0.d;
import w8.c;
import w8.i;
import w8.q;

/* compiled from: EncryptedSharedPreferences */
public final class a implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f3986a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f3987b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final String f3988c;

    /* renamed from: d  reason: collision with root package name */
    public final w8.a f3989d;

    /* renamed from: e  reason: collision with root package name */
    public final c f3990e;

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    /* compiled from: EncryptedSharedPreferences */
    public static final class C0042a implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        public final a f3991a;

        /* renamed from: b  reason: collision with root package name */
        public final SharedPreferences.Editor f3992b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList f3993c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicBoolean f3994d = new AtomicBoolean(false);

        public C0042a(a aVar, SharedPreferences.Editor editor) {
            this.f3991a = aVar;
            this.f3992b = editor;
            this.f3993c = new CopyOnWriteArrayList();
        }

        public final void a() {
            if (this.f3994d.getAndSet(false)) {
                for (String str : ((HashMap) this.f3991a.getAll()).keySet()) {
                    if (!this.f3993c.contains(str)) {
                        this.f3991a.getClass();
                        if (!a.d(str)) {
                            this.f3992b.remove(this.f3991a.b(str));
                        }
                    }
                }
            }
        }

        public final void apply() {
            a();
            this.f3992b.apply();
            b();
            this.f3993c.clear();
        }

        public final void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f3991a.f3987b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator it2 = this.f3993c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.f3991a, (String) it2.next());
                }
            }
        }

        public final void c(byte[] bArr, String str) {
            this.f3991a.getClass();
            if (!a.d(str)) {
                this.f3993c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    a aVar = this.f3991a;
                    String b10 = aVar.b(str);
                    Pair pair = new Pair(b10, new String(e.b(aVar.f3989d.a(bArr, b10.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.f3992b.putString((String) pair.first, (String) pair.second);
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError(e10);
                } catch (GeneralSecurityException e11) {
                    StringBuilder q10 = android.support.v4.media.a.q("Could not encrypt data: ");
                    q10.append(e11.getMessage());
                    throw new SecurityException(q10.toString(), e11);
                }
            } else {
                throw new SecurityException(b0.r(str, " is a reserved key for the encryption keyset."));
            }
        }

        public final SharedPreferences.Editor clear() {
            this.f3994d.set(true);
            return this;
        }

        public final boolean commit() {
            a();
            try {
                return this.f3992b.commit();
            } finally {
                b();
                this.f3993c.clear();
            }
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(5);
            allocate.put(z10 ? (byte) 1 : 0);
            c(allocate.array(), str);
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(4);
            allocate.putFloat(f10);
            c(allocate.array(), str);
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(2);
            allocate.putInt(i10);
            c(allocate.array(), str);
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(3);
            allocate.putLong(j10);
            c(allocate.array(), str);
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(0);
            allocate.putInt(length);
            allocate.put(bytes);
            c(allocate.array(), str);
            return this;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
            /*
                r4 = this;
                if (r6 != 0) goto L_0x000c
                v0.d r6 = new v0.d
                r6.<init>()
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            L_0x000c:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L_0x001f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0037
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L_0x001f
            L_0x0037:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                r1 = 1
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x0045:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0059
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L_0x0045
            L_0x0059:
                byte[] r6 = r6.array()
                r4.c(r6, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.a.C0042a.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        public final SharedPreferences.Editor remove(String str) {
            this.f3991a.getClass();
            if (!a.d(str)) {
                this.f3992b.remove(this.f3991a.b(str));
                this.f3993c.add(str);
                return this;
            }
            throw new SecurityException(b0.r(str, " is a reserved key for the encryption keyset."));
        }
    }

    public a(String str, SharedPreferences sharedPreferences, w8.a aVar, c cVar) {
        this.f3988c = str;
        this.f3986a = sharedPreferences;
        this.f3989d = aVar;
        this.f3990e = cVar;
    }

    public static a a(Context context, String str, b bVar) {
        i c10;
        i c11;
        String str2 = bVar.f3995a;
        int i10 = b.f4093a;
        q.g(b9.c.f4095b);
        if (!a9.a.a()) {
            q.e(new b9.a(), true);
        }
        x8.a.a();
        Context applicationContext = context.getApplicationContext();
        a.C0052a aVar = new a.C0052a();
        android.support.v4.media.a.d(1);
        aVar.f4599f = m9.b.y("AES256_SIV");
        if (applicationContext != null) {
            aVar.f4594a = applicationContext;
            aVar.f4595b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
            aVar.f4596c = str;
            String r10 = b0.r("android-keystore://", str2);
            if (r10.startsWith("android-keystore://")) {
                aVar.f4597d = r10;
                c9.a a10 = aVar.a();
                synchronized (a10) {
                    c10 = a10.f4593b.c();
                }
                a.C0052a aVar2 = new a.C0052a();
                android.support.v4.media.a.c(1);
                aVar2.f4599f = m9.b.y("AES256_GCM");
                aVar2.f4594a = applicationContext;
                aVar2.f4595b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
                aVar2.f4596c = str;
                String r11 = b0.r("android-keystore://", str2);
                if (r11.startsWith("android-keystore://")) {
                    aVar2.f4597d = r11;
                    c9.a a11 = aVar2.a();
                    synchronized (a11) {
                        c11 = a11.f4593b.c();
                    }
                    w8.a aVar3 = (w8.a) c11.b(w8.a.class);
                    return new a(str, applicationContext.getSharedPreferences(str, 0), aVar3, (c) c10.b(c.class));
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public static boolean d(String str) {
        if ("__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return true;
        }
        return false;
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return new String(e.b(this.f3990e.a(str.getBytes(StandardCharsets.UTF_8), this.f3988c.getBytes())), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        } catch (GeneralSecurityException e11) {
            StringBuilder q10 = android.support.v4.media.a.q("Could not encrypt key. ");
            q10.append(e11.getMessage());
            throw new SecurityException(q10.toString(), e11);
        }
    }

    public final Object c(String str) {
        int i10;
        if (!d(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b10 = b(str);
                String string = this.f3986a.getString(b10, (String) null);
                if (string == null) {
                    return null;
                }
                ByteBuffer wrap = ByteBuffer.wrap(this.f3989d.b(e.a(string), b10.getBytes(StandardCharsets.UTF_8)));
                boolean z10 = false;
                wrap.position(0);
                int i11 = wrap.getInt();
                if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 1) {
                    i10 = 2;
                } else if (i11 == 2) {
                    i10 = 3;
                } else if (i11 == 3) {
                    i10 = 4;
                } else if (i11 == 4) {
                    i10 = 5;
                } else if (i11 != 5) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
                if (i10 != 0) {
                    int g2 = v.g(i10);
                    if (g2 == 0) {
                        int i12 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i12);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    } else if (g2 == 1) {
                        d dVar = new d();
                        while (wrap.hasRemaining()) {
                            int i13 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i13);
                            wrap.position(wrap.position() + i13);
                            dVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (dVar.f15979c != 1 || !"__NULL__".equals(dVar.f15978b[0])) {
                            return dVar;
                        }
                        return null;
                    } else if (g2 == 2) {
                        return Integer.valueOf(wrap.getInt());
                    } else {
                        if (g2 == 3) {
                            return Long.valueOf(wrap.getLong());
                        }
                        if (g2 == 4) {
                            return Float.valueOf(wrap.getFloat());
                        }
                        if (g2 == 5) {
                            if (wrap.get() != 0) {
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: " + android.support.v4.media.a.w(i10));
                    }
                } else {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i11);
                }
            } catch (GeneralSecurityException e10) {
                StringBuilder q10 = android.support.v4.media.a.q("Could not decrypt value. ");
                q10.append(e10.getMessage());
                throw new SecurityException(q10.toString(), e10);
            }
        } else {
            throw new SecurityException(b0.r(str, " is a reserved key for the encryption keyset."));
        }
    }

    public final boolean contains(String str) {
        if (!d(str)) {
            return this.f3986a.contains(b(str));
        }
        throw new SecurityException(b0.r(str, " is a reserved key for the encryption keyset."));
    }

    public final SharedPreferences.Editor edit() {
        return new C0042a(this, this.f3986a.edit());
    }

    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f3986a.getAll().entrySet()) {
            if (!d((String) next.getKey())) {
                try {
                    String str = new String(this.f3990e.b(e.a((String) next.getKey()), this.f3988c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, c(str));
                } catch (GeneralSecurityException e10) {
                    StringBuilder q10 = android.support.v4.media.a.q("Could not decrypt key. ");
                    q10.append(e10.getMessage());
                    throw new SecurityException(q10.toString(), e10);
                }
            }
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z10) {
        Object c10 = c(str);
        if (c10 instanceof Boolean) {
            return ((Boolean) c10).booleanValue();
        }
        return z10;
    }

    public final float getFloat(String str, float f10) {
        Object c10 = c(str);
        if (c10 instanceof Float) {
            return ((Float) c10).floatValue();
        }
        return f10;
    }

    public final int getInt(String str, int i10) {
        Object c10 = c(str);
        if (c10 instanceof Integer) {
            return ((Integer) c10).intValue();
        }
        return i10;
    }

    public final long getLong(String str, long j10) {
        Object c10 = c(str);
        if (c10 instanceof Long) {
            return ((Long) c10).longValue();
        }
        return j10;
    }

    public final String getString(String str, String str2) {
        Object c10 = c(str);
        if (c10 instanceof String) {
            return (String) c10;
        }
        return str2;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        Object c10 = c(str);
        if (c10 instanceof Set) {
            set2 = (Set) c10;
        } else {
            set2 = new d<>();
        }
        if (set2.size() > 0) {
            return set2;
        }
        return set;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3987b.add(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3987b.remove(onSharedPreferenceChangeListener);
    }
}
