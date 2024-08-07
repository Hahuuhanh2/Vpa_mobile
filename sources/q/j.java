package q;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.R$array;
import androidx.biometric.R$string;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import q.l;
import q.n;
import q.o;
import r2.p;

/* compiled from: BiometricFragment */
public class j extends Fragment {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f14193g0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public n f14194e0;

    /* renamed from: f0  reason: collision with root package name */
    public Handler f14195f0 = new Handler(Looper.getMainLooper());

    /* compiled from: BiometricFragment */
    public static class a {
        public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* compiled from: BiometricFragment */
    public static class b {
        public static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        public static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        public static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* compiled from: BiometricFragment */
    public static class c {
        public static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        public static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    /* compiled from: BiometricFragment */
    public static class d {
        public static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    /* compiled from: BiometricFragment */
    public static class e implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f14196a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f14196a.post(runnable);
        }
    }

    /* compiled from: BiometricFragment */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<j> f14197a;

        public f(j jVar) {
            this.f14197a = new WeakReference<>(jVar);
        }

        public final void run() {
            if (this.f14197a.get() != null) {
                this.f14197a.get().s0();
            }
        }
    }

    /* compiled from: BiometricFragment */
    public static class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<n> f14198a;

        public g(n nVar) {
            this.f14198a = new WeakReference<>(nVar);
        }

        public final void run() {
            if (this.f14198a.get() != null) {
                this.f14198a.get().f14236p = false;
            }
        }
    }

    /* compiled from: BiometricFragment */
    public static class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<n> f14199a;

        public h(n nVar) {
            this.f14199a = new WeakReference<>(nVar);
        }

        public final void run() {
            if (this.f14199a.get() != null) {
                this.f14199a.get().f14237q = false;
            }
        }
    }

    public final void G(int i10, int i11, Intent intent) {
        super.G(i10, i11, intent);
        int i12 = 1;
        if (i10 == 1) {
            n nVar = this.f14194e0;
            nVar.f14235o = false;
            if (i11 == -1) {
                if (nVar.f14238r) {
                    nVar.f14238r = false;
                    i12 = -1;
                }
                q0(new l.b((l.c) null, i12));
                return;
            }
            o0(10, x(R$string.generic_error_user_canceled));
        }
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (this.f14194e0 == null) {
            this.f14194e0 = l.c(this, this.f2448f.getBoolean("host_activity", true));
        }
        n nVar = this.f14194e0;
        FragmentActivity m10 = m();
        nVar.getClass();
        new WeakReference(m10);
        n nVar2 = this.f14194e0;
        if (nVar2.f14239s == null) {
            nVar2.f14239s = new p<>();
        }
        nVar2.f14239s.e(this, new f(this, 0));
        n nVar3 = this.f14194e0;
        if (nVar3.f14240t == null) {
            nVar3.f14240t = new p<>();
        }
        nVar3.f14240t.e(this, new g(this, 0));
        n nVar4 = this.f14194e0;
        if (nVar4.f14241u == null) {
            nVar4.f14241u = new p<>();
        }
        nVar4.f14241u.e(this, new h(this, 0));
        n nVar5 = this.f14194e0;
        if (nVar5.f14242v == null) {
            nVar5.f14242v = new p<>();
        }
        nVar5.f14242v.e(this, new f(this, 1));
        n nVar6 = this.f14194e0;
        if (nVar6.f14243w == null) {
            nVar6.f14243w = new p<>();
        }
        nVar6.f14243w.e(this, new g(this, 1));
        n nVar7 = this.f14194e0;
        if (nVar7.f14245y == null) {
            nVar7.f14245y = new p<>();
        }
        nVar7.f14245y.e(this, new h(this, 1));
    }

    public final void U() {
        this.J = true;
        if (Build.VERSION.SDK_INT == 29 && c.a(this.f14194e0.d())) {
            n nVar = this.f14194e0;
            nVar.f14237q = true;
            this.f14195f0.postDelayed(new h(nVar), 250);
        }
    }

    public final void V() {
        boolean z10 = true;
        this.J = true;
        if (Build.VERSION.SDK_INT < 29 && !this.f14194e0.f14235o) {
            FragmentActivity m10 = m();
            if (m10 == null || !m10.isChangingConfigurations()) {
                z10 = false;
            }
            if (!z10) {
                i0(0);
            }
        }
    }

    public final void i0(int i10) {
        if (i10 == 3 || !this.f14194e0.f14237q) {
            if (m0()) {
                this.f14194e0.f14232l = i10;
                if (i10 == 1) {
                    p0(10, j7.a.G(r(), 10));
                }
            }
            n nVar = this.f14194e0;
            if (nVar.f14229i == null) {
                nVar.f14229i = new o();
            }
            o oVar = nVar.f14229i;
            CancellationSignal cancellationSignal = oVar.f14251b;
            if (cancellationSignal != null) {
                try {
                    o.b.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                oVar.f14251b = null;
            }
            s1.e eVar = oVar.f14252c;
            if (eVar != null) {
                try {
                    eVar.a();
                } catch (NullPointerException unused2) {
                }
                oVar.f14252c = null;
            }
        }
    }

    public final void j0() {
        k0();
        n nVar = this.f14194e0;
        boolean z10 = false;
        nVar.f14233m = false;
        if (!nVar.f14235o && C()) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(v());
            aVar.i(this);
            aVar.d();
        }
        Context r10 = r();
        if (r10 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29) {
                z10 = q.a(R$array.delay_showing_prompt_models, r10, str);
            }
            if (z10) {
                n nVar2 = this.f14194e0;
                nVar2.f14236p = true;
                this.f14195f0.postDelayed(new g(nVar2), 600);
            }
        }
    }

    public final void k0() {
        this.f14194e0.f14233m = false;
        if (C()) {
            FragmentManager v2 = v();
            r rVar = (r) v2.D("androidx.biometric.FingerprintDialogFragment");
            if (rVar == null) {
                return;
            }
            if (rVar.C()) {
                rVar.i0();
                return;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(v2);
            aVar.i(rVar);
            aVar.d();
        }
    }

    public final boolean l0() {
        if (Build.VERSION.SDK_INT > 28 || !c.a(this.f14194e0.d())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m0() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 28
            if (r0 < r3) goto L_0x0062
            android.content.Context r4 = r8.r()
            if (r4 == 0) goto L_0x0033
            q.n r5 = r8.f14194e0
            q.l$c r5 = r5.f14227g
            if (r5 == 0) goto L_0x0033
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r6 = android.os.Build.MODEL
            if (r0 == r3) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            int r7 = androidx.biometric.R$array.crypto_fingerprint_fallback_vendors
            boolean r5 = q.q.c(r7, r4, r5)
            if (r5 != 0) goto L_0x002e
            int r5 = androidx.biometric.R$array.crypto_fingerprint_fallback_prefixes
            boolean r4 = q.q.b(r5, r4, r6)
            if (r4 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            if (r4 == 0) goto L_0x0033
            r4 = r1
            goto L_0x0034
        L_0x0033:
            r4 = r2
        L_0x0034:
            if (r4 != 0) goto L_0x0062
            if (r0 != r3) goto L_0x005d
            android.os.Bundle r0 = r8.f2448f
            android.content.Context r3 = r8.r()
            if (r3 == 0) goto L_0x0052
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            if (r4 == 0) goto L_0x0052
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            boolean r3 = q.w.a(r3)
            if (r3 == 0) goto L_0x0052
            r3 = r1
            goto L_0x0053
        L_0x0052:
            r3 = r2
        L_0x0053:
            java.lang.String r4 = "has_fingerprint"
            boolean r0 = r0.getBoolean(r4, r3)
            if (r0 != 0) goto L_0x005d
            r0 = r1
            goto L_0x005e
        L_0x005d:
            r0 = r2
        L_0x005e:
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.j.m0():boolean");
    }

    public final void n0() {
        KeyguardManager keyguardManager;
        CharSequence charSequence;
        CharSequence charSequence2;
        Context r10 = r();
        CharSequence charSequence3 = null;
        if (r10 != null) {
            keyguardManager = v.a(r10);
        } else {
            keyguardManager = null;
        }
        if (keyguardManager == null) {
            o0(12, x(R$string.generic_error_no_keyguard));
            return;
        }
        n nVar = this.f14194e0;
        l.d dVar = nVar.f14226f;
        if (dVar != null) {
            charSequence = dVar.f14213a;
        } else {
            charSequence = null;
        }
        if (dVar != null) {
            charSequence2 = dVar.f14214b;
        } else {
            charSequence2 = null;
        }
        nVar.getClass();
        if (charSequence2 != null) {
            charSequence3 = charSequence2;
        }
        Intent a10 = a.a(keyguardManager, charSequence, charSequence3);
        if (a10 == null) {
            o0(14, x(R$string.generic_error_no_device_credential));
            return;
        }
        this.f14194e0.f14235o = true;
        if (m0()) {
            k0();
        }
        a10.setFlags(134742016);
        startActivityForResult(a10, 1);
    }

    public final void o0(int i10, CharSequence charSequence) {
        p0(i10, charSequence);
        j0();
    }

    public final void p0(int i10, CharSequence charSequence) {
        n nVar = this.f14194e0;
        if (!nVar.f14235o && nVar.f14234n) {
            nVar.f14234n = false;
            Executor executor = nVar.f14224d;
            if (executor == null) {
                executor = new n.b();
            }
            executor.execute(new e(this, i10, 0, charSequence));
        }
    }

    public final void q0(l.b bVar) {
        n nVar = this.f14194e0;
        if (nVar.f14234n) {
            nVar.f14234n = false;
            Executor executor = nVar.f14224d;
            if (executor == null) {
                executor = new n.b();
            }
            executor.execute(new androidx.appcompat.app.p(1, this, bVar));
        }
        j0();
    }

    public final void r0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = x(R$string.default_error_msg);
        }
        this.f14194e0.h(2);
        this.f14194e0.g(charSequence);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: type inference failed for: r5v17, types: [android.os.CancellationSignal] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014f A[Catch:{ NullPointerException -> 0x017b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s0() {
        /*
            r12 = this;
            q.n r0 = r12.f14194e0
            boolean r0 = r0.f14233m
            if (r0 != 0) goto L_0x026b
            android.content.Context r0 = r12.r()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            q.n r0 = r12.f14194e0
            r1 = 1
            r0.f14233m = r1
            r0.f14234n = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.Context r2 = r12.r()
            r3 = 29
            r4 = 0
            if (r2 == 0) goto L_0x004b
            java.lang.String r5 = android.os.Build.MANUFACTURER
            if (r0 == r3) goto L_0x0025
            r2 = r4
            goto L_0x002c
        L_0x0025:
            int r6 = androidx.biometric.R$array.keyguard_biometric_and_credential_exclude_vendors
            boolean r2 = q.q.c(r6, r2, r5)
            r2 = r2 ^ r1
        L_0x002c:
            if (r2 == 0) goto L_0x004b
            q.n r2 = r12.f14194e0
            int r2 = r2.d()
            r5 = 255(0xff, float:3.57E-43)
            r6 = r2 & 255(0xff, float:3.57E-43)
            if (r6 != r5) goto L_0x003c
            r5 = r1
            goto L_0x003d
        L_0x003c:
            r5 = r4
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            boolean r2 = q.c.a(r2)
            if (r2 == 0) goto L_0x004b
            q.n r2 = r12.f14194e0
            r2.f14238r = r1
            r2 = r1
            goto L_0x004c
        L_0x004b:
            r2 = r4
        L_0x004c:
            if (r2 == 0) goto L_0x0053
            r12.n0()
            goto L_0x026b
        L_0x0053:
            boolean r2 = r12.m0()
            r5 = 0
            if (r2 == 0) goto L_0x0184
            android.content.Context r2 = r12.d0()
            android.content.Context r2 = r2.getApplicationContext()
            android.hardware.fingerprint.FingerprintManager r3 = p1.b.a.c(r2)
            if (r3 == 0) goto L_0x0070
            boolean r3 = p1.b.a.e(r3)
            if (r3 == 0) goto L_0x0070
            r3 = r1
            goto L_0x0071
        L_0x0070:
            r3 = r4
        L_0x0071:
            if (r3 != 0) goto L_0x0076
            r3 = 12
            goto L_0x008b
        L_0x0076:
            android.hardware.fingerprint.FingerprintManager r3 = p1.b.a.c(r2)
            if (r3 == 0) goto L_0x0084
            boolean r3 = p1.b.a.d(r3)
            if (r3 == 0) goto L_0x0084
            r3 = r1
            goto L_0x0085
        L_0x0084:
            r3 = r4
        L_0x0085:
            if (r3 != 0) goto L_0x008a
            r3 = 11
            goto L_0x008b
        L_0x008a:
            r3 = r4
        L_0x008b:
            if (r3 == 0) goto L_0x0096
            java.lang.String r0 = j7.a.G(r2, r3)
            r12.o0(r3, r0)
            goto L_0x026b
        L_0x0096:
            boolean r3 = r12.C()
            if (r3 == 0) goto L_0x026b
            q.n r3 = r12.f14194e0
            r3.f14244x = r1
            java.lang.String r3 = android.os.Build.MODEL
            r6 = 28
            if (r0 == r6) goto L_0x00a8
            r0 = r4
            goto L_0x00ae
        L_0x00a8:
            int r0 = androidx.biometric.R$array.hide_fingerprint_instantly_prefixes
            boolean r0 = q.q.b(r0, r2, r3)
        L_0x00ae:
            if (r0 != 0) goto L_0x00e0
            android.os.Handler r0 = r12.f14195f0
            d.h r3 = new d.h
            r6 = 3
            r3.<init>(r12, r6)
            r6 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r3, r6)
            android.os.Bundle r0 = r12.f2448f
            java.lang.String r3 = "host_activity"
            boolean r0 = r0.getBoolean(r3, r1)
            q.r r3 = new q.r
            r3.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "host_activity"
            r6.putBoolean(r7, r0)
            r3.g0(r6)
            androidx.fragment.app.FragmentManager r0 = r12.v()
            java.lang.String r6 = "androidx.biometric.FingerprintDialogFragment"
            r3.n0(r0, r6)
        L_0x00e0:
            q.n r0 = r12.f14194e0
            r0.f14232l = r4
            q.l$c r3 = r0.f14227g
            if (r3 != 0) goto L_0x00e9
            goto L_0x0108
        L_0x00e9:
            javax.crypto.Cipher r4 = r3.f14209b
            if (r4 == 0) goto L_0x00f3
            p1.b$c r3 = new p1.b$c
            r3.<init>((javax.crypto.Cipher) r4)
            goto L_0x0109
        L_0x00f3:
            java.security.Signature r4 = r3.f14208a
            if (r4 == 0) goto L_0x00fd
            p1.b$c r3 = new p1.b$c
            r3.<init>((java.security.Signature) r4)
            goto L_0x0109
        L_0x00fd:
            javax.crypto.Mac r3 = r3.f14210c
            if (r3 == 0) goto L_0x0108
            p1.b$c r4 = new p1.b$c
            r4.<init>((javax.crypto.Mac) r3)
            r3 = r4
            goto L_0x0109
        L_0x0108:
            r3 = r5
        L_0x0109:
            q.o r4 = r0.f14229i
            if (r4 != 0) goto L_0x0114
            q.o r4 = new q.o
            r4.<init>()
            r0.f14229i = r4
        L_0x0114:
            q.o r0 = r0.f14229i
            s1.e r4 = r0.f14252c
            if (r4 != 0) goto L_0x0126
            q.o$a r4 = r0.f14250a
            r4.getClass()
            s1.e r4 = new s1.e
            r4.<init>()
            r0.f14252c = r4
        L_0x0126:
            s1.e r0 = r0.f14252c
            q.n r4 = r12.f14194e0
            q.b r6 = r4.f14228h
            if (r6 != 0) goto L_0x013a
            q.b r6 = new q.b
            q.n$a r7 = new q.n$a
            r7.<init>(r4)
            r6.<init>(r7)
            r4.f14228h = r6
        L_0x013a:
            q.b r4 = r4.f14228h
            q.a r6 = r4.f14175b
            if (r6 != 0) goto L_0x0147
            q.a r6 = new q.a
            r6.<init>(r4)
            r4.f14175b = r6
        L_0x0147:
            q.a r4 = r4.f14175b
            android.hardware.fingerprint.FingerprintManager r6 = p1.b.a.c(r2)     // Catch:{ NullPointerException -> 0x017b }
            if (r6 == 0) goto L_0x026b
            if (r0 == 0) goto L_0x016a
            monitor-enter(r0)     // Catch:{ NullPointerException -> 0x017b }
            android.os.CancellationSignal r5 = r0.f14590c     // Catch:{ all -> 0x0167 }
            if (r5 != 0) goto L_0x0163
            android.os.CancellationSignal r5 = s1.e.a.b()     // Catch:{ all -> 0x0167 }
            r0.f14590c = r5     // Catch:{ all -> 0x0167 }
            boolean r7 = r0.f14588a     // Catch:{ all -> 0x0167 }
            if (r7 == 0) goto L_0x0163
            s1.e.a.a(r5)     // Catch:{ all -> 0x0167 }
        L_0x0163:
            android.os.CancellationSignal r5 = r0.f14590c     // Catch:{ all -> 0x0167 }
            monitor-exit(r0)     // Catch:{ all -> 0x0167 }
            goto L_0x016a
        L_0x0167:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0167 }
            throw r3     // Catch:{ NullPointerException -> 0x017b }
        L_0x016a:
            r8 = r5
            android.hardware.fingerprint.FingerprintManager$CryptoObject r7 = p1.b.a.g(r3)     // Catch:{ NullPointerException -> 0x017b }
            p1.a r10 = new p1.a     // Catch:{ NullPointerException -> 0x017b }
            r10.<init>(r4)     // Catch:{ NullPointerException -> 0x017b }
            r9 = 0
            r11 = 0
            p1.b.a.a(r6, r7, r8, r9, r10, r11)     // Catch:{ NullPointerException -> 0x017b }
            goto L_0x026b
        L_0x017b:
            java.lang.String r0 = j7.a.G(r2, r1)
            r12.o0(r1, r0)
            goto L_0x026b
        L_0x0184:
            android.content.Context r2 = r12.d0()
            android.content.Context r2 = r2.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r2 = q.j.b.d(r2)
            q.n r6 = r12.f14194e0
            q.l$d r7 = r6.f14226f
            if (r7 == 0) goto L_0x0199
            java.lang.CharSequence r8 = r7.f14213a
            goto L_0x019a
        L_0x0199:
            r8 = r5
        L_0x019a:
            if (r7 == 0) goto L_0x019e
            java.lang.CharSequence r5 = r7.f14214b
        L_0x019e:
            r6.getClass()
            if (r8 == 0) goto L_0x01a6
            q.j.b.g(r2, r8)
        L_0x01a6:
            if (r5 == 0) goto L_0x01ab
            q.j.b.f(r2, r5)
        L_0x01ab:
            q.n r5 = r12.f14194e0
            java.lang.CharSequence r5 = r5.e()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x01d5
            q.n r6 = r12.f14194e0
            java.util.concurrent.Executor r6 = r6.f14224d
            if (r6 == 0) goto L_0x01be
            goto L_0x01c3
        L_0x01be:
            q.n$b r6 = new q.n$b
            r6.<init>()
        L_0x01c3:
            q.n r7 = r12.f14194e0
            q.n$c r8 = r7.f14230j
            if (r8 != 0) goto L_0x01d0
            q.n$c r8 = new q.n$c
            r8.<init>(r7)
            r7.f14230j = r8
        L_0x01d0:
            q.n$c r7 = r7.f14230j
            q.j.b.e(r2, r5, r6, r7)
        L_0x01d5:
            if (r0 < r3) goto L_0x01e5
            q.n r5 = r12.f14194e0
            q.l$d r5 = r5.f14226f
            if (r5 == 0) goto L_0x01e1
            boolean r5 = r5.f14216d
            if (r5 == 0) goto L_0x01e2
        L_0x01e1:
            r4 = r1
        L_0x01e2:
            q.j.c.a(r2, r4)
        L_0x01e5:
            q.n r4 = r12.f14194e0
            int r4 = r4.d()
            r5 = 30
            if (r0 < r5) goto L_0x01f3
            q.j.d.a(r2, r4)
            goto L_0x01fc
        L_0x01f3:
            if (r0 < r3) goto L_0x01fc
            boolean r0 = q.c.a(r4)
            q.j.c.b(r2, r0)
        L_0x01fc:
            android.hardware.biometrics.BiometricPrompt r0 = q.j.b.c(r2)
            android.content.Context r2 = r12.r()
            q.n r3 = r12.f14194e0
            q.l$c r3 = r3.f14227g
            android.hardware.biometrics.BiometricPrompt$CryptoObject r3 = q.p.b(r3)
            q.n r4 = r12.f14194e0
            q.o r5 = r4.f14229i
            if (r5 != 0) goto L_0x0219
            q.o r5 = new q.o
            r5.<init>()
            r4.f14229i = r5
        L_0x0219:
            q.o r4 = r4.f14229i
            android.os.CancellationSignal r5 = r4.f14251b
            if (r5 != 0) goto L_0x022a
            q.o$a r5 = r4.f14250a
            r5.getClass()
            android.os.CancellationSignal r5 = q.o.b.b()
            r4.f14251b = r5
        L_0x022a:
            android.os.CancellationSignal r4 = r4.f14251b
            q.j$e r5 = new q.j$e
            r5.<init>()
            q.n r6 = r12.f14194e0
            q.b r7 = r6.f14228h
            if (r7 != 0) goto L_0x0243
            q.b r7 = new q.b
            q.n$a r8 = new q.n$a
            r8.<init>(r6)
            r7.<init>(r8)
            r6.f14228h = r7
        L_0x0243:
            q.b r6 = r6.f14228h
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r7 = r6.f14174a
            if (r7 != 0) goto L_0x0251
            q.b$c r7 = r6.f14176c
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r7 = q.b.a.a(r7)
            r6.f14174a = r7
        L_0x0251:
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r6 = r6.f14174a
            if (r3 != 0) goto L_0x0259
            q.j.b.b(r0, r4, r5, r6)     // Catch:{ NullPointerException -> 0x025d }
            goto L_0x026b
        L_0x0259:
            q.j.b.a(r0, r3, r4, r5, r6)     // Catch:{ NullPointerException -> 0x025d }
            goto L_0x026b
        L_0x025d:
            if (r2 == 0) goto L_0x0266
            int r0 = androidx.biometric.R$string.default_error_msg
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0268
        L_0x0266:
            java.lang.String r0 = ""
        L_0x0268:
            r12.o0(r1, r0)
        L_0x026b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.j.s0():void");
    }
}
