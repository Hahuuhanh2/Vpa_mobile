package q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w;
import androidx.lifecycle.f0;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import r2.x;

/* compiled from: BiometricPrompt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public FragmentManager f14204a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14205b;

    /* compiled from: BiometricPrompt */
    public static abstract class a {
        public void a(CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    /* compiled from: BiometricPrompt */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f14206a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14207b;

        public b(c cVar, int i10) {
            this.f14206a = cVar;
            this.f14207b = i10;
        }
    }

    /* compiled from: BiometricPrompt */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f14213a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f14214b;

        /* renamed from: c  reason: collision with root package name */
        public final CharSequence f14215c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f14216d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14217e;

        /* compiled from: BiometricPrompt */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public CharSequence f14218a = null;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f14219b = null;

            /* renamed from: c  reason: collision with root package name */
            public CharSequence f14220c = null;

            /* renamed from: d  reason: collision with root package name */
            public boolean f14221d = true;

            /* renamed from: e  reason: collision with root package name */
            public int f14222e = 0;

            public final d a() {
                boolean z10;
                String str;
                if (TextUtils.isEmpty(this.f14218a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                } else if (!c.b(this.f14222e)) {
                    StringBuilder q10 = android.support.v4.media.a.q("Authenticator combination is unsupported on API ");
                    q10.append(Build.VERSION.SDK_INT);
                    q10.append(": ");
                    int i10 = this.f14222e;
                    if (i10 == 15) {
                        str = "BIOMETRIC_STRONG";
                    } else if (i10 == 255) {
                        str = "BIOMETRIC_WEAK";
                    } else if (i10 == 32768) {
                        str = "DEVICE_CREDENTIAL";
                    } else if (i10 == 32783) {
                        str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                    } else if (i10 != 33023) {
                        str = String.valueOf(i10);
                    } else {
                        str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                    }
                    q10.append(str);
                    throw new IllegalArgumentException(q10.toString());
                } else {
                    int i11 = this.f14222e;
                    if (i11 != 0) {
                        z10 = c.a(i11);
                    } else {
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(this.f14220c) && !z10) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    } else if (TextUtils.isEmpty(this.f14220c) || !z10) {
                        return new d(this.f14218a, this.f14219b, this.f14220c, this.f14221d, this.f14222e);
                    } else {
                        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                    }
                }
            }
        }

        public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z10, int i10) {
            this.f14213a = charSequence;
            this.f14214b = charSequence2;
            this.f14215c = charSequence3;
            this.f14216d = z10;
            this.f14217e = i10;
        }
    }

    /* compiled from: BiometricPrompt */
    public static class e implements r2.c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<n> f14223a;

        public e(n nVar) {
            this.f14223a = new WeakReference<>(nVar);
        }

        public final void onDestroy(r2.l lVar) {
            if (this.f14223a.get() != null) {
                this.f14223a.get().f14225e = null;
            }
        }

        public final void onPause(r2.l lVar) {
        }

        public final void onResume(r2.l lVar) {
        }

        public final void onStart(r2.l lVar) {
        }

        public final void onStop(r2.l lVar) {
        }

        public final void v(r2.l lVar) {
        }
    }

    @SuppressLint({"LambdaLast"})
    public l(FragmentActivity fragmentActivity, Executor executor, sh.c cVar) {
        if (fragmentActivity != null) {
            w G = fragmentActivity.G();
            n nVar = (n) new f0(fragmentActivity).a(n.class);
            this.f14205b = true;
            this.f14204a = G;
            nVar.f14224d = executor;
            nVar.f14225e = cVar;
            return;
        }
        throw new IllegalArgumentException("FragmentActivity must not be null.");
    }

    public static n c(Fragment fragment, boolean z10) {
        x xVar;
        if (z10) {
            xVar = fragment.m();
        } else {
            xVar = null;
        }
        if (xVar == null) {
            xVar = fragment.B;
        }
        if (xVar != null) {
            return (n) new f0(xVar).a(n.class);
        }
        throw new IllegalStateException("view model not found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        if (r4.getBoolean("has_iris", r1) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        if (new q.k(new q.k.c(r10)).a(255) != 0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(q.l.d r10) {
        /*
            r9 = this;
            androidx.fragment.app.FragmentManager r0 = r9.f14204a
            if (r0 != 0) goto L_0x0006
            goto L_0x012b
        L_0x0006:
            boolean r0 = r0.O()
            if (r0 == 0) goto L_0x000e
            goto L_0x012b
        L_0x000e:
            androidx.fragment.app.FragmentManager r0 = r9.f14204a
            java.lang.String r1 = "androidx.biometric.BiometricFragment"
            androidx.fragment.app.Fragment r0 = r0.D(r1)
            q.j r0 = (q.j) r0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0049
            boolean r0 = r9.f14205b
            q.j r4 = new q.j
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "host_activity"
            r5.putBoolean(r6, r0)
            r4.g0(r5)
            androidx.fragment.app.FragmentManager r0 = r9.f14204a
            r0.getClass()
            androidx.fragment.app.a r5 = new androidx.fragment.app.a
            r5.<init>(r0)
            r5.g(r2, r4, r1, r3)
            r5.d()
            androidx.fragment.app.FragmentManager r0 = r9.f14204a
            r0.y(r3)
            r0.E()
            r0 = r4
        L_0x0049:
            q.n r1 = r0.f14194e0
            r1.f14226f = r10
            r4 = 0
            int r10 = r10.f14217e
            r5 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r10 = r5
        L_0x0056:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 >= r7) goto L_0x0067
            r7 = 15
            if (r10 != r7) goto L_0x0067
            q.l$c r10 = q.p.a()
            r1.f14227g = r10
            goto L_0x0069
        L_0x0067:
            r1.f14227g = r4
        L_0x0069:
            boolean r10 = r0.l0()
            if (r10 == 0) goto L_0x007a
            q.n r10 = r0.f14194e0
            int r1 = androidx.biometric.R$string.confirm_device_credential_password
            java.lang.String r1 = r0.x(r1)
            r10.f14231k = r1
            goto L_0x007e
        L_0x007a:
            q.n r10 = r0.f14194e0
            r10.f14231k = r4
        L_0x007e:
            android.content.Context r10 = r0.r()
            r1 = 29
            if (r6 != r1) goto L_0x00f4
            android.os.Bundle r4 = r0.f2448f
            android.content.Context r7 = r0.r()
            if (r7 == 0) goto L_0x00a0
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            if (r8 == 0) goto L_0x00a0
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            boolean r7 = q.w.a(r7)
            if (r7 == 0) goto L_0x00a0
            r7 = r3
            goto L_0x00a1
        L_0x00a0:
            r7 = r2
        L_0x00a1:
            java.lang.String r8 = "has_fingerprint"
            boolean r4 = r4.getBoolean(r8, r7)
            if (r4 != 0) goto L_0x00f4
            android.os.Bundle r4 = r0.f2448f
            android.content.Context r7 = r0.r()
            if (r6 < r1) goto L_0x00c5
            if (r7 == 0) goto L_0x00c5
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            if (r8 == 0) goto L_0x00c5
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            boolean r7 = q.x.a(r7)
            if (r7 == 0) goto L_0x00c5
            r7 = r3
            goto L_0x00c6
        L_0x00c5:
            r7 = r2
        L_0x00c6:
            java.lang.String r8 = "has_face"
            boolean r4 = r4.getBoolean(r8, r7)
            if (r4 != 0) goto L_0x00f4
            android.os.Bundle r4 = r0.f2448f
            android.content.Context r7 = r0.r()
            if (r6 < r1) goto L_0x00ea
            if (r7 == 0) goto L_0x00ea
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            if (r1 == 0) goto L_0x00ea
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            boolean r1 = q.x.b(r1)
            if (r1 == 0) goto L_0x00ea
            r1 = r3
            goto L_0x00eb
        L_0x00ea:
            r1 = r2
        L_0x00eb:
            java.lang.String r6 = "has_iris"
            boolean r1 = r4.getBoolean(r6, r1)
            if (r1 != 0) goto L_0x00f4
            goto L_0x010a
        L_0x00f4:
            boolean r1 = r0.l0()
            if (r1 == 0) goto L_0x010b
            q.k r1 = new q.k
            q.k$c r4 = new q.k$c
            r4.<init>(r10)
            r1.<init>(r4)
            int r10 = r1.a(r5)
            if (r10 == 0) goto L_0x010b
        L_0x010a:
            r2 = r3
        L_0x010b:
            if (r2 == 0) goto L_0x0115
            q.n r10 = r0.f14194e0
            r10.f14234n = r3
            r0.n0()
            goto L_0x012b
        L_0x0115:
            q.n r10 = r0.f14194e0
            boolean r10 = r10.f14236p
            if (r10 == 0) goto L_0x0128
            android.os.Handler r10 = r0.f14195f0
            q.j$f r1 = new q.j$f
            r1.<init>(r0)
            r2 = 600(0x258, double:2.964E-321)
            r10.postDelayed(r1, r2)
            goto L_0x012b
        L_0x0128:
            r0.s0()
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.l.a(q.l$d):void");
    }

    public final void b() {
        j jVar;
        FragmentManager fragmentManager = this.f14204a;
        if (fragmentManager != null && (jVar = (j) fragmentManager.D("androidx.biometric.BiometricFragment")) != null) {
            jVar.i0(3);
        }
    }

    /* compiled from: BiometricPrompt */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f14208a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f14209b;

        /* renamed from: c  reason: collision with root package name */
        public final Mac f14210c;

        /* renamed from: d  reason: collision with root package name */
        public final IdentityCredential f14211d;

        /* renamed from: e  reason: collision with root package name */
        public final PresentationSession f14212e;

        public c(Signature signature) {
            this.f14208a = signature;
            this.f14209b = null;
            this.f14210c = null;
            this.f14211d = null;
            this.f14212e = null;
        }

        public c(Cipher cipher) {
            this.f14208a = null;
            this.f14209b = cipher;
            this.f14210c = null;
            this.f14211d = null;
            this.f14212e = null;
        }

        public c(Mac mac) {
            this.f14208a = null;
            this.f14209b = null;
            this.f14210c = mac;
            this.f14211d = null;
            this.f14212e = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f14208a = null;
            this.f14209b = null;
            this.f14210c = null;
            this.f14211d = identityCredential;
            this.f14212e = null;
        }

        public c(PresentationSession presentationSession) {
            this.f14208a = null;
            this.f14209b = null;
            this.f14210c = null;
            this.f14211d = null;
            this.f14212e = presentationSession;
        }
    }

    @SuppressLint({"LambdaLast"})
    public l(Fragment fragment, Executor executor, a aVar) {
        if (fragment != null) {
            FragmentManager o10 = fragment.o();
            n nVar = (n) new f0(fragment).a(n.class);
            fragment.U.a(new e(nVar));
            this.f14205b = false;
            this.f14204a = o10;
            nVar.f14224d = executor;
            nVar.f14225e = aVar;
            return;
        }
        throw new IllegalArgumentException("Fragment must not be null.");
    }
}
