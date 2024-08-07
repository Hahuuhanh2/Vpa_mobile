package com.google.firebase.auth.internal;

import aa.f;
import android.os.Parcel;
import android.os.Parcelable;
import ba.k0;
import ba.m;
import com.google.android.gms.internal.p001firebaseauthapi.zzahb;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m9.d;
import p3.l0;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new k0();

    /* renamed from: a  reason: collision with root package name */
    public zzahb f7544a;

    /* renamed from: b  reason: collision with root package name */
    public zzt f7545b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7546c;

    /* renamed from: d  reason: collision with root package name */
    public String f7547d;

    /* renamed from: e  reason: collision with root package name */
    public List f7548e;

    /* renamed from: f  reason: collision with root package name */
    public List f7549f;

    /* renamed from: n  reason: collision with root package name */
    public String f7550n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f7551o;

    /* renamed from: p  reason: collision with root package name */
    public zzz f7552p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7553q;

    /* renamed from: r  reason: collision with root package name */
    public zze f7554r;

    /* renamed from: s  reason: collision with root package name */
    public zzbd f7555s;

    public zzx(d dVar, ArrayList arrayList) {
        j.f(dVar);
        dVar.a();
        this.f7546c = dVar.f13219b;
        this.f7547d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f7550n = "2";
        V0(arrayList);
    }

    public final /* synthetic */ ba.d P0() {
        return new ba.d(this);
    }

    public final List<? extends f> Q0() {
        return this.f7548e;
    }

    public final String R() {
        return this.f7545b.f7537b;
    }

    public final String R0() {
        Map map;
        zzahb zzahb = this.f7544a;
        if (zzahb == null || zzahb.zze() == null || (map = (Map) ((Map) m.a(zzahb.zze()).f23363c).get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final String S0() {
        return this.f7545b.f7536a;
    }

    public final boolean T0() {
        String str;
        Boolean bool = this.f7551o;
        if (bool == null || bool.booleanValue()) {
            zzahb zzahb = this.f7544a;
            if (zzahb != null) {
                Map map = (Map) ((Map) m.a(zzahb.zze()).f23363c).get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z10 = false;
            if (this.f7548e.size() <= 1 && (str == null || !str.equals("custom"))) {
                z10 = true;
            }
            this.f7551o = Boolean.valueOf(z10);
        }
        return this.f7551o.booleanValue();
    }

    public final zzx U0() {
        this.f7551o = Boolean.FALSE;
        return this;
    }

    public final synchronized zzx V0(List list) {
        j.f(list);
        this.f7548e = new ArrayList(list.size());
        this.f7549f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            f fVar = (f) list.get(i10);
            if (fVar.R().equals("firebase")) {
                this.f7545b = (zzt) fVar;
            } else {
                this.f7549f.add(fVar.R());
            }
            this.f7548e.add((zzt) fVar);
        }
        if (this.f7545b == null) {
            this.f7545b = (zzt) this.f7548e.get(0);
        }
        return this;
    }

    public final zzahb W0() {
        return this.f7544a;
    }

    public final List X0() {
        return this.f7549f;
    }

    public final void Y0(zzahb zzahb) {
        j.f(zzahb);
        this.f7544a = zzahb;
    }

    public final void Z0(ArrayList arrayList) {
        zzbd zzbd;
        if (arrayList.isEmpty()) {
            zzbd = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList2.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList3.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbd = new zzbd(arrayList2, arrayList3);
        }
        this.f7555s = zzbd;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.e1(parcel, 1, this.f7544a, i10);
        l0.e1(parcel, 2, this.f7545b, i10);
        l0.f1(parcel, 3, this.f7546c);
        l0.f1(parcel, 4, this.f7547d);
        l0.j1(parcel, 5, this.f7548e);
        l0.h1(parcel, 6, this.f7549f);
        l0.f1(parcel, 7, this.f7550n);
        Boolean valueOf = Boolean.valueOf(T0());
        if (valueOf != null) {
            parcel.writeInt(262152);
            parcel.writeInt(valueOf.booleanValue() ? 1 : 0);
        }
        l0.e1(parcel, 9, this.f7552p, i10);
        l0.X0(parcel, 10, this.f7553q);
        l0.e1(parcel, 11, this.f7554r, i10);
        l0.e1(parcel, 12, this.f7555s, i10);
        l0.o1(n12, parcel);
    }

    public final String zze() {
        return this.f7544a.zze();
    }

    public final String zzf() {
        return this.f7544a.zzh();
    }

    public zzx(zzahb zzahb, zzt zzt, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, zzz zzz, boolean z10, zze zze, zzbd zzbd) {
        this.f7544a = zzahb;
        this.f7545b = zzt;
        this.f7546c = str;
        this.f7547d = str2;
        this.f7548e = arrayList;
        this.f7549f = arrayList2;
        this.f7550n = str3;
        this.f7551o = bool;
        this.f7552p = zzz;
        this.f7553q = z10;
        this.f7554r = zze;
        this.f7555s = zzbd;
    }
}
