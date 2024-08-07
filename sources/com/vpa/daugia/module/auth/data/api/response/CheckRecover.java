package com.vpa.daugia.module.auth.data.api.response;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: CheckRecover.kt */
public final class CheckRecover {
    @b("lockUntil")
    private Object lockUntil;
    @b("lockUntilAuth")
    private Object lockUntilAuth;
    @b("lockUntilOtp")
    private Object lockUntilOtp;
    @b("lockUntilPass")
    private Object lockUntilPass;
    @b("message")
    private String message;
    @b("retryCount")
    private Integer retryCount;
    @b("retryCountAuth")
    private Integer retryCountAuth;
    @b("retryCountOtp")
    private Integer retryCountOtp;
    @b("retryCountPass")
    private Integer retryCountPass;
    @b("success")
    private boolean success;

    public CheckRecover() {
        this((Object) null, (Object) null, (Object) null, (Object) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, false, 1023, (e) null);
    }

    public CheckRecover(Object obj, Object obj2, Object obj3, Object obj4, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z10) {
        this.lockUntil = obj;
        this.lockUntilAuth = obj2;
        this.lockUntilOtp = obj3;
        this.lockUntilPass = obj4;
        this.message = str;
        this.retryCount = num;
        this.retryCountAuth = num2;
        this.retryCountOtp = num3;
        this.retryCountPass = num4;
        this.success = z10;
    }

    public static /* synthetic */ CheckRecover copy$default(CheckRecover checkRecover, Object obj, Object obj2, Object obj3, Object obj4, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z10, int i10, Object obj5) {
        CheckRecover checkRecover2 = checkRecover;
        int i11 = i10;
        return checkRecover.copy((i11 & 1) != 0 ? checkRecover2.lockUntil : obj, (i11 & 2) != 0 ? checkRecover2.lockUntilAuth : obj2, (i11 & 4) != 0 ? checkRecover2.lockUntilOtp : obj3, (i11 & 8) != 0 ? checkRecover2.lockUntilPass : obj4, (i11 & 16) != 0 ? checkRecover2.message : str, (i11 & 32) != 0 ? checkRecover2.retryCount : num, (i11 & 64) != 0 ? checkRecover2.retryCountAuth : num2, (i11 & 128) != 0 ? checkRecover2.retryCountOtp : num3, (i11 & 256) != 0 ? checkRecover2.retryCountPass : num4, (i11 & 512) != 0 ? checkRecover2.success : z10);
    }

    public final Object component1() {
        return this.lockUntil;
    }

    public final boolean component10() {
        return this.success;
    }

    public final Object component2() {
        return this.lockUntilAuth;
    }

    public final Object component3() {
        return this.lockUntilOtp;
    }

    public final Object component4() {
        return this.lockUntilPass;
    }

    public final String component5() {
        return this.message;
    }

    public final Integer component6() {
        return this.retryCount;
    }

    public final Integer component7() {
        return this.retryCountAuth;
    }

    public final Integer component8() {
        return this.retryCountOtp;
    }

    public final Integer component9() {
        return this.retryCountPass;
    }

    public final CheckRecover copy(Object obj, Object obj2, Object obj3, Object obj4, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z10) {
        return new CheckRecover(obj, obj2, obj3, obj4, str, num, num2, num3, num4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckRecover)) {
            return false;
        }
        CheckRecover checkRecover = (CheckRecover) obj;
        return j.a(this.lockUntil, checkRecover.lockUntil) && j.a(this.lockUntilAuth, checkRecover.lockUntilAuth) && j.a(this.lockUntilOtp, checkRecover.lockUntilOtp) && j.a(this.lockUntilPass, checkRecover.lockUntilPass) && j.a(this.message, checkRecover.message) && j.a(this.retryCount, checkRecover.retryCount) && j.a(this.retryCountAuth, checkRecover.retryCountAuth) && j.a(this.retryCountOtp, checkRecover.retryCountOtp) && j.a(this.retryCountPass, checkRecover.retryCountPass) && this.success == checkRecover.success;
    }

    public final Object getLockUntil() {
        return this.lockUntil;
    }

    public final Object getLockUntilAuth() {
        return this.lockUntilAuth;
    }

    public final Object getLockUntilOtp() {
        return this.lockUntilOtp;
    }

    public final Object getLockUntilPass() {
        return this.lockUntilPass;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final Integer getRetryCountAuth() {
        return this.retryCountAuth;
    }

    public final Integer getRetryCountOtp() {
        return this.retryCountOtp;
    }

    public final Integer getRetryCountPass() {
        return this.retryCountPass;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Object obj = this.lockUntil;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.lockUntilAuth;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.lockUntilOtp;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.lockUntilPass;
        int hashCode4 = (hashCode3 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str = this.message;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.retryCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.retryCountAuth;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.retryCountOtp;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.retryCountPass;
        if (num4 != null) {
            i10 = num4.hashCode();
        }
        int i11 = (hashCode8 + i10) * 31;
        boolean z10 = this.success;
        if (z10) {
            z10 = true;
        }
        return i11 + (z10 ? 1 : 0);
    }

    public final void setLockUntil(Object obj) {
        this.lockUntil = obj;
    }

    public final void setLockUntilAuth(Object obj) {
        this.lockUntilAuth = obj;
    }

    public final void setLockUntilOtp(Object obj) {
        this.lockUntilOtp = obj;
    }

    public final void setLockUntilPass(Object obj) {
        this.lockUntilPass = obj;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setRetryCount(Integer num) {
        this.retryCount = num;
    }

    public final void setRetryCountAuth(Integer num) {
        this.retryCountAuth = num;
    }

    public final void setRetryCountOtp(Integer num) {
        this.retryCountOtp = num;
    }

    public final void setRetryCountPass(Integer num) {
        this.retryCountPass = num;
    }

    public final void setSuccess(boolean z10) {
        this.success = z10;
    }

    public String toString() {
        StringBuilder q10 = a.q("CheckRecover(lockUntil=");
        q10.append(this.lockUntil);
        q10.append(", lockUntilAuth=");
        q10.append(this.lockUntilAuth);
        q10.append(", lockUntilOtp=");
        q10.append(this.lockUntilOtp);
        q10.append(", lockUntilPass=");
        q10.append(this.lockUntilPass);
        q10.append(", message=");
        q10.append(this.message);
        q10.append(", retryCount=");
        q10.append(this.retryCount);
        q10.append(", retryCountAuth=");
        q10.append(this.retryCountAuth);
        q10.append(", retryCountOtp=");
        q10.append(this.retryCountOtp);
        q10.append(", retryCountPass=");
        q10.append(this.retryCountPass);
        q10.append(", success=");
        q10.append(this.success);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckRecover(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.String r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.Integer r19, java.lang.Integer r20, boolean r21, int r22, sk.e r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r20
        L_0x0046:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            r0 = 0
            goto L_0x004e
        L_0x004c:
            r0 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r2
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.response.CheckRecover.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, int, sk.e):void");
    }
}
