package com.google.android.play.core.integrity;

import android.support.v4.media.a;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f7217a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f7218b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f7219c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f7217a = str;
        this.f7218b = l10;
    }

    private static boolean a() {
        return true;
    }

    public final Long cloudProjectNumber() {
        return this.f7218b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L_0x002f
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f7217a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x002f
            java.lang.Long r3 = r5.f7218b
            if (r3 != 0) goto L_0x0023
            java.lang.Long r1 = r1.cloudProjectNumber()
            if (r1 != 0) goto L_0x002f
            goto L_0x002d
        L_0x0023:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x002f
        L_0x002d:
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            boolean r3 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r3 == 0) goto L_0x0043
            boolean r3 = a()
            if (r3 == 0) goto L_0x0043
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r1 == 0) goto L_0x0041
            java.lang.Object r6 = r6.f7219c
            goto L_0x0044
        L_0x0041:
            r0 = r2
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f7217a.hashCode() ^ 1000003;
        Long l10 = this.f7218b;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        int i11 = (hashCode * 1000003) ^ i10;
        if (a()) {
            return i11 * 1000003;
        }
        return i11;
    }

    public final String nonce() {
        return this.f7217a;
    }

    public final String toString() {
        StringBuilder q10 = a.q("IntegrityTokenRequest{nonce=");
        q10.append(this.f7217a);
        q10.append(", cloudProjectNumber=");
        q10.append(this.f7218b);
        String sb2 = q10.toString();
        if (a()) {
            sb2 = sb2.concat(", network=null");
        }
        return sb2.concat("}");
    }
}
