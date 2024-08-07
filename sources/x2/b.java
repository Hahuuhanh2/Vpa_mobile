package x2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import c3.c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import n0.l;
import sk.j;
import x2.n;
import y2.a;

/* compiled from: DatabaseConfiguration.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16884a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16885b;

    /* renamed from: c  reason: collision with root package name */
    public final c.C0050c f16886c;

    /* renamed from: d  reason: collision with root package name */
    public final n.c f16887d;

    /* renamed from: e  reason: collision with root package name */
    public final List<n.b> f16888e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16889f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16890g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f16891h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f16892i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f16893j = null;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f16894k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16895l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<Integer> f16896m;

    /* renamed from: n  reason: collision with root package name */
    public final List<Object> f16897n;

    /* renamed from: o  reason: collision with root package name */
    public final List<a> f16898o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f16899p;

    @SuppressLint({"LambdaLast"})
    public b(Context context, String str, c.C0050c cVar, n.c cVar2, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        j.f(context, "context");
        j.f(cVar2, "migrationContainer");
        l.o(i10, "journalMode");
        j.f(arrayList2, "typeConverters");
        j.f(arrayList3, "autoMigrationSpecs");
        this.f16884a = context;
        this.f16885b = str;
        this.f16886c = cVar;
        this.f16887d = cVar2;
        this.f16888e = arrayList;
        this.f16889f = z10;
        this.f16890g = i10;
        this.f16891h = executor;
        this.f16892i = executor2;
        this.f16894k = z11;
        this.f16895l = z12;
        this.f16896m = linkedHashSet;
        this.f16897n = arrayList2;
        this.f16898o = arrayList3;
        this.f16899p = false;
    }

    public final boolean a(int i10, int i11) {
        boolean z10;
        Set<Integer> set;
        if (i10 > i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f16895l) {
            return false;
        }
        if (!this.f16894k || ((set = this.f16896m) != null && set.contains(Integer.valueOf(i10)))) {
            return false;
        }
        return true;
    }
}
