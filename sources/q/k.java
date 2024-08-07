package q;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import androidx.biometric.R$array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p1.b;

/* compiled from: BiometricManager */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final d f14200a;

    /* renamed from: b  reason: collision with root package name */
    public final BiometricManager f14201b;

    /* renamed from: c  reason: collision with root package name */
    public final p1.b f14202c;

    /* compiled from: BiometricManager */
    public static class a {
        public static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        public static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: BiometricManager */
    public static class b {
        public static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    /* compiled from: BiometricManager */
    public static class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final Context f14203a;

        public c(Context context) {
            this.f14203a = context.getApplicationContext();
        }
    }

    /* compiled from: BiometricManager */
    public interface d {
    }

    public k(c cVar) {
        BiometricManager biometricManager;
        this.f14200a = cVar;
        int i10 = Build.VERSION.SDK_INT;
        p1.b bVar = null;
        if (i10 >= 29) {
            biometricManager = a.b(cVar.f14203a);
        } else {
            biometricManager = null;
        }
        this.f14201b = biometricManager;
        this.f14202c = i10 <= 29 ? new p1.b(cVar.f14203a) : bVar;
    }

    public final int a(int i10) {
        boolean z10;
        boolean z11;
        int b10;
        boolean z12;
        boolean z13;
        boolean z14;
        BiometricPrompt.CryptoObject b11;
        Object obj;
        boolean z15;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 1;
        if (i11 >= 30) {
            BiometricManager biometricManager = this.f14201b;
            if (biometricManager == null) {
                return 1;
            }
            return b.a(biometricManager, i10);
        } else if (!c.b(i10)) {
            return -2;
        } else {
            if (i10 != 0) {
                if (v.a(((c) this.f14200a).f14203a) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (c.a(i10)) {
                        KeyguardManager a10 = v.a(((c) this.f14200a).f14203a);
                        if (a10 == null) {
                            z15 = false;
                        } else {
                            z15 = v.b(a10);
                        }
                        if (z15) {
                            return 0;
                        }
                        return 11;
                    }
                    if (i11 == 29) {
                        if ((i10 & 255) == 255) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            BiometricManager biometricManager2 = this.f14201b;
                            if (biometricManager2 != null) {
                                i12 = a.a(biometricManager2);
                            }
                        } else {
                            Method c10 = a.c();
                            if (!(c10 == null || (b11 = p.b(p.a())) == null)) {
                                if (i11 == 29) {
                                    try {
                                        obj = c10.invoke(this.f14201b, new Object[]{b11});
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof Integer) {
                                    return ((Integer) obj).intValue();
                                }
                            }
                            BiometricManager biometricManager3 = this.f14201b;
                            if (biometricManager3 != null) {
                                i12 = a.a(biometricManager3);
                            }
                            Context context = ((c) this.f14200a).f14203a;
                            String str = Build.MODEL;
                            if (Build.VERSION.SDK_INT >= 30) {
                                z13 = false;
                            } else {
                                z13 = q.a(R$array.assume_strong_biometrics_models, context, str);
                            }
                            if (!z13 && i12 == 0) {
                                KeyguardManager a11 = v.a(((c) this.f14200a).f14203a);
                                if (a11 == null) {
                                    z14 = false;
                                } else {
                                    z14 = v.b(a11);
                                }
                                if (!z14) {
                                    b10 = b();
                                } else {
                                    if (b() == 0) {
                                        return 0;
                                    }
                                    return -1;
                                }
                            }
                        }
                        return i12;
                    } else if (i11 != 28) {
                        return b();
                    } else {
                        Context context2 = ((c) this.f14200a).f14203a;
                        if (context2 == null || context2.getPackageManager() == null || !w.a(context2.getPackageManager())) {
                            i12 = 0;
                        }
                        if (i12 != 0) {
                            KeyguardManager a12 = v.a(((c) this.f14200a).f14203a);
                            if (a12 == null) {
                                z11 = false;
                            } else {
                                z11 = v.b(a12);
                            }
                            if (!z11) {
                                b10 = b();
                            } else {
                                if (b() == 0) {
                                    return 0;
                                }
                                return -1;
                            }
                        }
                    }
                    return b10;
                }
            }
            return 12;
        }
    }

    public final int b() {
        boolean z10;
        p1.b bVar = this.f14202c;
        boolean z11 = true;
        if (bVar == null) {
            return 1;
        }
        FingerprintManager c10 = b.a.c(bVar.f13903a);
        if (c10 == null || !b.a.e(c10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return 12;
        }
        FingerprintManager c11 = b.a.c(this.f14202c.f13903a);
        if (c11 == null || !b.a.d(c11)) {
            z11 = false;
        }
        if (!z11) {
            return 11;
        }
        return 0;
    }
}
