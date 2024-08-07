package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import c0.i0;
import ca.b;
import ca.i;
import ca.o;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import da.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import r9.a;
import r9.c;
import r9.d;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final o<ScheduledExecutorService> f7566a = new o<>(new h(0));

    /* renamed from: b  reason: collision with root package name */
    public static final o<ScheduledExecutorService> f7567b = new o<>(new i(2));

    /* renamed from: c  reason: collision with root package name */
    public static final o<ScheduledExecutorService> f7568c = new o<>(new da.i(0));

    /* renamed from: d  reason: collision with root package name */
    public static final o<ScheduledExecutorService> f7569d = new o<>(new h(1));

    public final List<b<?>> getComponents() {
        b[] bVarArr = new b[4];
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        int length = rVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (rVarArr[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, rVarArr);
        String str = "Null interface";
        bVarArr[0] = new b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i0(0), hashSet3);
        r rVar2 = new r(r9.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(r9.b.class, ExecutorService.class), new r(r9.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar2);
        int length2 = rVarArr2.length;
        int i11 = 0;
        while (i11 < length2) {
            if (rVarArr2[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException(str);
            }
        }
        Collections.addAll(hashSet4, rVarArr2);
        bVarArr[1] = new b((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new android.support.v4.media.a(), hashSet6);
        r rVar3 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar3);
        int length3 = rVarArr3.length;
        int i12 = 0;
        while (i12 < length3) {
            if (rVarArr3[i12] != null) {
                i12++;
            } else {
                throw new NullPointerException(str);
            }
        }
        Collections.addAll(hashSet7, rVarArr3);
        bVarArr[2] = new b((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new kh.h(1), hashSet9);
        b.a a10 = b.a(new r(d.class, Executor.class));
        a10.f4619f = new i0(1);
        bVarArr[3] = a10.b();
        return Arrays.asList(bVarArr);
    }
}
