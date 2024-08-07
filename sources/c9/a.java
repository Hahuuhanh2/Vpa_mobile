package c9;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.i;
import i9.c0;
import i9.d0;
import i9.t;
import i9.z;
import j9.c;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import m9.b;
import w8.h;
import w8.j;
import w8.r;
import z.d;

/* compiled from: AndroidKeysetManager */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4591c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final w8.a f4592a;

    /* renamed from: b  reason: collision with root package name */
    public j f4593b;

    /* renamed from: c9.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidKeysetManager */
    public static final class C0052a {

        /* renamed from: a  reason: collision with root package name */
        public Context f4594a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f4595b = null;

        /* renamed from: c  reason: collision with root package name */
        public String f4596c = null;

        /* renamed from: d  reason: collision with root package name */
        public String f4597d = null;

        /* renamed from: e  reason: collision with root package name */
        public b f4598e = null;

        /* renamed from: f  reason: collision with root package name */
        public h f4599f = null;

        /* renamed from: g  reason: collision with root package name */
        public j f4600g;

        public static byte[] c(Context context, String str, String str2) {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, (String) null);
                    if (string == null) {
                        return null;
                    }
                    return b.s(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{str}));
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        }

        /* JADX INFO: finally extract failed */
        public static j d(byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            d dVar = new d((Object) byteArrayInputStream);
            try {
                c0 L = c0.L(byteArrayInputStream, i.a());
                ((InputStream) dVar.f17746a).close();
                return new j((c0.a) w8.i.a(L).f16723a.a());
            } catch (Throwable th2) {
                ((InputStream) dVar.f17746a).close();
                throw th2;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            throw r2;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized c9.a a() {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.String r0 = r4.f4595b     // Catch:{ all -> 0x0085 }
                if (r0 == 0) goto L_0x007d
                java.lang.Object r0 = c9.a.f4591c     // Catch:{ all -> 0x0085 }
                monitor-enter(r0)     // Catch:{ all -> 0x0085 }
                android.content.Context r1 = r4.f4594a     // Catch:{ all -> 0x001f }
                java.lang.String r2 = r4.f4595b     // Catch:{ all -> 0x001f }
                java.lang.String r3 = r4.f4596c     // Catch:{ all -> 0x001f }
                byte[] r1 = c(r1, r2, r3)     // Catch:{ all -> 0x001f }
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = r4.f4597d     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0021
                c9.b r1 = r4.e()     // Catch:{ all -> 0x001f }
                r4.f4598e = r1     // Catch:{ all -> 0x001f }
                goto L_0x0021
            L_0x001f:
                r1 = move-exception
                goto L_0x007b
            L_0x0021:
                w8.j r1 = r4.b()     // Catch:{ all -> 0x001f }
                r4.f4600g = r1     // Catch:{ all -> 0x001f }
                goto L_0x0073
            L_0x0028:
                java.lang.String r2 = r4.f4597d     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x006d
                c9.c r2 = new c9.c     // Catch:{ GeneralSecurityException -> 0x0062, ProviderException -> 0x0060 }
                r2.<init>()     // Catch:{ GeneralSecurityException -> 0x0062, ProviderException -> 0x0060 }
                java.lang.String r3 = r4.f4597d     // Catch:{ GeneralSecurityException -> 0x0062, ProviderException -> 0x0060 }
                c9.b r2 = r2.b(r3)     // Catch:{ GeneralSecurityException -> 0x0062, ProviderException -> 0x0060 }
                r4.f4598e = r2     // Catch:{ GeneralSecurityException -> 0x0062, ProviderException -> 0x0060 }
                z.d r2 = new z.d     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                r3.<init>(r1)     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                r2.<init>((java.lang.Object) r3)     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                c9.b r3 = r4.f4598e     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                w8.i r2 = w8.i.c(r2, r3)     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                w8.j r3 = new w8.j     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                i9.c0 r2 = r2.f16723a     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                com.google.crypto.tink.shaded.protobuf.n$a r2 = r2.a()     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                i9.c0$a r2 = (i9.c0.a) r2     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                r3.<init>(r2)     // Catch:{ IOException -> 0x0059, GeneralSecurityException -> 0x0057 }
                goto L_0x0069
            L_0x0057:
                r2 = move-exception
                goto L_0x005a
            L_0x0059:
                r2 = move-exception
            L_0x005a:
                w8.j r3 = d(r1)     // Catch:{ IOException -> 0x005f }
                goto L_0x0069
            L_0x005f:
                throw r2     // Catch:{ all -> 0x001f }
            L_0x0060:
                r2 = move-exception
                goto L_0x0063
            L_0x0062:
                r2 = move-exception
            L_0x0063:
                w8.j r3 = d(r1)     // Catch:{ IOException -> 0x006c }
                java.lang.Object r1 = c9.a.f4591c     // Catch:{ IOException -> 0x006c }
            L_0x0069:
                r4.f4600g = r3     // Catch:{ all -> 0x001f }
                goto L_0x0073
            L_0x006c:
                throw r2     // Catch:{ all -> 0x001f }
            L_0x006d:
                w8.j r1 = d(r1)     // Catch:{ all -> 0x001f }
                r4.f4600g = r1     // Catch:{ all -> 0x001f }
            L_0x0073:
                c9.a r1 = new c9.a     // Catch:{ all -> 0x001f }
                r1.<init>(r4)     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                monitor-exit(r4)
                return r1
            L_0x007b:
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1     // Catch:{ all -> 0x0085 }
            L_0x007d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0085 }
                java.lang.String r1 = "keysetName cannot be null"
                r0.<init>(r1)     // Catch:{ all -> 0x0085 }
                throw r0     // Catch:{ all -> 0x0085 }
            L_0x0085:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c9.a.C0052a.a():c9.a");
        }

        public final j b() {
            SharedPreferences.Editor editor;
            if (this.f4599f != null) {
                j jVar = new j(c0.K());
                h hVar = this.f4599f;
                synchronized (jVar) {
                    jVar.a(hVar.f16722a);
                }
                int I = r.a(jVar.c().f16723a).G().I();
                synchronized (jVar) {
                    int i10 = 0;
                    while (i10 < ((c0) jVar.f16727a.f7405b).H()) {
                        c0.b G = ((c0) jVar.f16727a.f7405b).G(i10);
                        if (G.J() != I) {
                            i10++;
                        } else if (G.L().equals(z.ENABLED)) {
                            c0.a aVar = jVar.f16727a;
                            aVar.o();
                            c0.E((c0) aVar.f7405b, I);
                        } else {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + I);
                        }
                    }
                    throw new GeneralSecurityException("key not found: " + I);
                }
                Context context = this.f4594a;
                String str = this.f4595b;
                String str2 = this.f4596c;
                if (str != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (str2 == null) {
                        editor = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                    } else {
                        editor = applicationContext.getSharedPreferences(str2, 0).edit();
                    }
                    if (this.f4598e != null) {
                        w8.i c10 = jVar.c();
                        b bVar = this.f4598e;
                        byte[] bArr = new byte[0];
                        c0 c0Var = c10.f16723a;
                        byte[] a10 = bVar.a(c0Var.k(), bArr);
                        try {
                            if (c0.M(bVar.b(a10, bArr), i.a()).equals(c0Var)) {
                                t.a H = t.H();
                                c.f l10 = c.l(a10, 0, a10.length);
                                H.o();
                                t.E((t) H.f7405b, l10);
                                d0 a11 = r.a(c0Var);
                                H.o();
                                t.F((t) H.f7405b, a11);
                                if (!editor.putString(str, b.u(((t) H.build()).k())).commit()) {
                                    throw new IOException("Failed to write to SharedPreferences");
                                }
                            } else {
                                throw new GeneralSecurityException("cannot encrypt keyset");
                            }
                        } catch (InvalidProtocolBufferException unused) {
                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                        }
                    } else if (!editor.putString(str, b.u(jVar.c().f16723a.k())).commit()) {
                        throw new IOException("Failed to write to SharedPreferences");
                    }
                    return jVar;
                }
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }

        public final b e() {
            Object obj = a.f4591c;
            c cVar = new c();
            try {
                boolean c10 = c.c(this.f4597d);
                try {
                    return cVar.b(this.f4597d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (c10) {
                        Object obj2 = a.f4591c;
                        return null;
                    }
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f4597d}), e10);
                }
            } catch (GeneralSecurityException | ProviderException unused) {
                Object obj3 = a.f4591c;
                return null;
            }
        }
    }

    public a(C0052a aVar) {
        Context context = aVar.f4594a;
        String str = aVar.f4595b;
        String str2 = aVar.f4596c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f4592a = aVar.f4598e;
            this.f4593b = aVar.f4600g;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
