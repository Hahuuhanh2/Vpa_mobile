package okhttp3.internal.tls;

import sk.j;

/* compiled from: BasicCertificateChainCleaner.kt */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: b  reason: collision with root package name */
    public final TrustRootIndex f22609b;

    /* compiled from: BasicCertificateChainCleaner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        j.f(trustRootIndex, "trustRootIndex");
        this.f22609b = trustRootIndex;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            sk.j.f(r12, r0)
            java.lang.String r0 = "hostname"
            sk.j.f(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            sk.j.e(r0, r1)
            r12.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0023:
            r3 = 9
            if (r1 >= r3) goto L_0x00c4
            int r3 = r12.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            sk.j.d(r3, r5)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            okhttp3.internal.tls.TrustRootIndex r6 = r10.f22609b
            java.security.cert.X509Certificate r6 = r6.a(r3)
            if (r6 == 0) goto L_0x006d
            int r2 = r12.size()
            if (r2 > r4) goto L_0x004c
            boolean r2 = sk.j.a(r3, r6)
            if (r2 != 0) goto L_0x004f
        L_0x004c:
            r12.add(r6)
        L_0x004f:
            java.security.Principal r2 = r6.getIssuerDN()
            java.security.Principal r3 = r6.getSubjectDN()
            boolean r2 = sk.j.a(r2, r3)
            if (r2 != 0) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            java.security.PublicKey r2 = r6.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x0067 }
            r6.verify(r2)     // Catch:{ GeneralSecurityException -> 0x0067 }
            r2 = r4
            goto L_0x0068
        L_0x0067:
            r2 = r0
        L_0x0068:
            if (r2 == 0) goto L_0x006b
            return r12
        L_0x006b:
            r2 = r4
            goto L_0x00a6
        L_0x006d:
            java.util.Iterator r6 = r11.iterator()
            java.lang.String r7 = "queue.iterator()"
            sk.j.e(r6, r7)
        L_0x0076:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00aa
            java.lang.Object r7 = r6.next()
            sk.j.d(r7, r5)
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.Principal r8 = r3.getIssuerDN()
            java.security.Principal r9 = r7.getSubjectDN()
            boolean r8 = sk.j.a(r8, r9)
            if (r8 != 0) goto L_0x0094
            goto L_0x009d
        L_0x0094:
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x009d }
            r3.verify(r8)     // Catch:{ GeneralSecurityException -> 0x009d }
            r8 = r4
            goto L_0x009e
        L_0x009d:
            r8 = r0
        L_0x009e:
            if (r8 == 0) goto L_0x0076
            r6.remove()
            r12.add(r7)
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x0023
        L_0x00aa:
            if (r2 == 0) goto L_0x00ad
            return r12
        L_0x00ad:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.BasicCertificateChainCleaner.a(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicCertificateChainCleaner) || !j.a(((BasicCertificateChainCleaner) obj).f22609b, this.f22609b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22609b.hashCode();
    }
}
