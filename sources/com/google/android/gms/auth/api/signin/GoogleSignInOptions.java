package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p3.l0;
import r6.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5302a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5303b;

    /* renamed from: c  reason: collision with root package name */
    public Account f5304c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5305d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5306e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5307f;

    /* renamed from: n  reason: collision with root package name */
    public String f5308n;

    /* renamed from: o  reason: collision with root package name */
    public String f5309o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f5310p;

    /* renamed from: q  reason: collision with root package name */
    public String f5311q;

    /* renamed from: r  reason: collision with root package name */
    public Map f5312r;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        Scope scope4 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(scope4) && hashSet.contains(scope3)) {
            hashSet.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(scope4) && hashSet2.contains(scope3)) {
            hashSet2.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap hashMap, String str3) {
        this.f5302a = i10;
        this.f5303b = arrayList;
        this.f5304c = account;
        this.f5305d = z10;
        this.f5306e = z11;
        this.f5307f = z12;
        this.f5308n = str;
        this.f5309o = str2;
        this.f5310p = new ArrayList(hashMap.values());
        this.f5312r = hashMap;
        this.f5311q = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1.equals(r5.f5304c) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r1 = r4.f5310p     // Catch:{ ClassCastException -> 0x0086 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 > 0) goto L_0x0086
            java.util.ArrayList r1 = r5.f5310p     // Catch:{ ClassCastException -> 0x0086 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0086
        L_0x0018:
            java.util.ArrayList r1 = r4.f5303b     // Catch:{ ClassCastException -> 0x0086 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r3 = r5.f5303b     // Catch:{ ClassCastException -> 0x0086 }
            r2.<init>(r3)     // Catch:{ ClassCastException -> 0x0086 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            java.util.ArrayList r1 = r4.f5303b     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r3 = r5.f5303b     // Catch:{ ClassCastException -> 0x0086 }
            r2.<init>(r3)     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x003b
            goto L_0x0086
        L_0x003b:
            android.accounts.Account r1 = r4.f5304c     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x0044
            android.accounts.Account r1 = r5.f5304c     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x0086
            goto L_0x004c
        L_0x0044:
            android.accounts.Account r2 = r5.f5304c     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 == 0) goto L_0x0086
        L_0x004c:
            java.lang.String r1 = r4.f5308n     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r5.f5308n     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 == 0) goto L_0x0086
            goto L_0x0068
        L_0x005d:
            java.lang.String r1 = r4.f5308n     // Catch:{ ClassCastException -> 0x0086 }
            java.lang.String r2 = r5.f5308n     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x0068
            goto L_0x0086
        L_0x0068:
            boolean r1 = r4.f5307f     // Catch:{ ClassCastException -> 0x0086 }
            boolean r2 = r5.f5307f     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            boolean r1 = r4.f5305d     // Catch:{ ClassCastException -> 0x0086 }
            boolean r2 = r5.f5305d     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            boolean r1 = r4.f5306e     // Catch:{ ClassCastException -> 0x0086 }
            boolean r2 = r5.f5306e     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            java.lang.String r1 = r4.f5311q     // Catch:{ ClassCastException -> 0x0086 }
            java.lang.String r5 = r5.f5311q     // Catch:{ ClassCastException -> 0x0086 }
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch:{ ClassCastException -> 0x0086 }
            if (r5 == 0) goto L_0x0086
            r5 = 1
            return r5
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5303b;
        int size = arrayList2.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((Scope) arrayList2.get(i13)).f5339b);
        }
        Collections.sort(arrayList);
        Account account = this.f5304c;
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        if (account == null) {
            i10 = 0;
        } else {
            i10 = account.hashCode();
        }
        int i14 = hashCode + i10;
        String str = this.f5308n;
        int i15 = i14 * 31;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = ((((((i15 + i11) * 31) + (this.f5307f ? 1 : 0)) * 31) + (this.f5305d ? 1 : 0)) * 31) + (this.f5306e ? 1 : 0);
        String str2 = this.f5311q;
        int i17 = i16 * 31;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i17 + i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5302a);
        l0.j1(parcel, 2, new ArrayList(this.f5303b));
        l0.e1(parcel, 3, this.f5304c, i10);
        l0.X0(parcel, 4, this.f5305d);
        l0.X0(parcel, 5, this.f5306e);
        l0.X0(parcel, 6, this.f5307f);
        l0.f1(parcel, 7, this.f5308n);
        l0.f1(parcel, 8, this.f5309o);
        l0.j1(parcel, 9, this.f5310p);
        l0.f1(parcel, 10, this.f5311q);
        l0.o1(n12, parcel);
    }
}
