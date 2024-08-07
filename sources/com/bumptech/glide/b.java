package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.i;
import h5.k;
import i5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o5.l;
import u4.m;
import v4.c;
import v4.d;
import w4.f;
import w4.g;
import w4.h;
import w4.i;
import x4.a;

/* compiled from: Glide */
public final class b implements ComponentCallbacks2 {

    /* renamed from: p  reason: collision with root package name */
    public static volatile b f4914p;

    /* renamed from: q  reason: collision with root package name */
    public static volatile boolean f4915q;

    /* renamed from: a  reason: collision with root package name */
    public final c f4916a;

    /* renamed from: b  reason: collision with root package name */
    public final h f4917b;

    /* renamed from: c  reason: collision with root package name */
    public final h f4918c;

    /* renamed from: d  reason: collision with root package name */
    public final Registry f4919d;

    /* renamed from: e  reason: collision with root package name */
    public final v4.b f4920e;

    /* renamed from: f  reason: collision with root package name */
    public final k f4921f;

    /* renamed from: n  reason: collision with root package name */
    public final h5.c f4922n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f4923o = new ArrayList();

    /* compiled from: Glide */
    public interface a {
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e0  */
    public b(android.content.Context r28, u4.m r29, w4.h r30, v4.c r31, v4.b r32, h5.k r33, h5.c r34, int r35, com.bumptech.glide.c r36, v0.b r37, java.util.List r38, com.bumptech.glide.i r39) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r31
            r4 = r32
            r11 = r39
            java.lang.Class<q4.a> r3 = q4.a.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<byte[]> r7 = byte[].class
            r27.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f4923o = r8
            r1.f4916a = r2
            r1.f4920e = r4
            r8 = r30
            r1.f4917b = r8
            r8 = r33
            r1.f4921f = r8
            r8 = r34
            r1.f4922n = r8
            android.content.res.Resources r8 = r28.getResources()
            com.bumptech.glide.Registry r9 = new com.bumptech.glide.Registry
            r9.<init>()
            r1.f4919d = r9
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r10 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r10.<init>()
            h4.e r12 = r9.f4910g
            monitor-enter(r12)
            java.util.List r13 = r12.f10547a     // Catch:{ all -> 0x041f }
            r13.add(r10)     // Catch:{ all -> 0x041f }
            monitor-exit(r12)
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 27
            if (r10 < r12) goto L_0x005d
            b5.o r12 = new b5.o
            r12.<init>()
            h4.e r13 = r9.f4910g
            monitor-enter(r13)
            java.util.List r14 = r13.f10547a     // Catch:{ all -> 0x005a }
            r14.add(r12)     // Catch:{ all -> 0x005a }
            monitor-exit(r13)
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x005d:
            java.util.List r12 = r9.d()
            f5.a r13 = new f5.a
            r13.<init>(r0, r12, r2, r4)
            b5.b0 r14 = new b5.b0
            b5.b0$g r15 = new b5.b0$g
            r15.<init>()
            r14.<init>(r2, r15)
            b5.l r15 = new b5.l
            java.util.List r1 = r9.d()
            r16 = r7
            android.util.DisplayMetrics r7 = r8.getDisplayMetrics()
            r15.<init>(r1, r7, r2, r4)
            r1 = 28
            if (r10 < r1) goto L_0x0098
            java.lang.Class<com.bumptech.glide.e> r7 = com.bumptech.glide.e.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r11.f4935a
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x0098
            b5.s r1 = new b5.s
            r1.<init>()
            b5.g r7 = new b5.g
            r7.<init>()
            goto L_0x00a2
        L_0x0098:
            b5.f r7 = new b5.f
            r7.<init>(r15)
            b5.x r1 = new b5.x
            r1.<init>(r15, r4)
        L_0x00a2:
            r17 = r5
            java.lang.String r5 = "Animation"
            r18 = r6
            r6 = 28
            if (r10 < r6) goto L_0x00e0
            java.lang.Class<com.bumptech.glide.d> r6 = com.bumptech.glide.d.class
            r30 = r10
            java.util.Map<java.lang.Class<?>, java.lang.Object> r10 = r11.f4935a
            boolean r6 = r10.containsKey(r6)
            if (r6 == 0) goto L_0x00dd
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.Drawable> r10 = android.graphics.drawable.Drawable.class
            d5.a$c r11 = new d5.a$c
            r19 = r3
            d5.a r3 = new d5.a
            r3.<init>(r12, r4)
            r11.<init>(r3)
            r9.c(r11, r6, r10, r5)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r6 = android.graphics.drawable.Drawable.class
            d5.a$b r10 = new d5.a$b
            d5.a r11 = new d5.a
            r11.<init>(r12, r4)
            r10.<init>(r11)
            r9.c(r10, r3, r6, r5)
            goto L_0x00e4
        L_0x00dd:
            r19 = r3
            goto L_0x00e4
        L_0x00e0:
            r19 = r3
            r30 = r10
        L_0x00e4:
            d5.e r3 = new d5.e
            r3.<init>(r0)
            y4.s$c r6 = new y4.s$c
            r6.<init>(r8)
            y4.s$d r10 = new y4.s$d
            r10.<init>(r8)
            y4.s$b r11 = new y4.s$b
            r11.<init>(r8)
            y4.s$a r0 = new y4.s$a
            r0.<init>(r8)
            r33 = r0
            b5.b r0 = new b5.b
            r0.<init>(r4)
            r34 = r10
            g5.a r10 = new g5.a
            r10.<init>()
            r20 = r10
            al.g0 r10 = new al.g0
            r21 = r11
            r11 = 5
            r10.<init>(r11)
            android.content.ContentResolver r11 = r28.getContentResolver()
            r22 = r10
            java.lang.Class<java.nio.ByteBuffer> r10 = java.nio.ByteBuffer.class
            r23 = r11
            al.g0 r11 = new al.g0
            r24 = r6
            r6 = 4
            r11.<init>(r6)
            j5.a r6 = r9.f4905b
            monitor-enter(r6)
            r25 = r3
            java.util.ArrayList r3 = r6.f11686a     // Catch:{ all -> 0x041a }
            r26 = r5
            j5.a$a r5 = new j5.a$a     // Catch:{ all -> 0x041a }
            r5.<init>(r10, r11)     // Catch:{ all -> 0x041a }
            r3.add(r5)     // Catch:{ all -> 0x041a }
            monitor-exit(r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            z.j r5 = new z.j
            r6 = 3
            r5.<init>(r4, r6)
            j5.a r10 = r9.f4905b
            monitor-enter(r10)
            java.util.ArrayList r11 = r10.f11686a     // Catch:{ all -> 0x0415 }
            j5.a$a r6 = new j5.a$a     // Catch:{ all -> 0x0415 }
            r6.<init>(r3, r5)     // Catch:{ all -> 0x0415 }
            r11.add(r6)     // Catch:{ all -> 0x0415 }
            monitor-exit(r10)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.String r6 = "Bitmap"
            r9.c(r7, r3, r5, r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9.c(r1, r3, r5, r6)
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            b5.u r10 = new b5.u
            r11 = 0
            r10.<init>(r15, r11)
            r9.c(r10, r3, r5, r6)
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9.c(r14, r3, r5, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            b5.b0 r10 = new b5.b0
            b5.b0$c r11 = new b5.b0$c
            r11.<init>()
            r10.<init>(r2, r11)
            r9.c(r10, r3, r5, r6)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            y4.u$a<?> r10 = y4.u.a.f17518a
            r9.a(r3, r5, r10)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            b5.z r11 = new b5.z
            r11.<init>()
            r9.c(r11, r3, r5, r6)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r9.b(r3, r0)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            b5.a r11 = new b5.a
            r11.<init>((android.content.res.Resources) r8, (s4.j) r7)
            java.lang.String r7 = "BitmapDrawable"
            r9.c(r11, r3, r5, r7)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            b5.a r11 = new b5.a
            r11.<init>((android.content.res.Resources) r8, (s4.j) r1)
            r9.c(r11, r3, r5, r7)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r3 = android.graphics.drawable.BitmapDrawable.class
            b5.a r5 = new b5.a
            r5.<init>((android.content.res.Resources) r8, (s4.j) r14)
            r9.c(r5, r1, r3, r7)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            vl.d r3 = new vl.d
            r5 = 4
            r3.<init>(r5, r2, r0)
            r9.b(r1, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class<f5.c> r1 = f5.c.class
            f5.h r3 = new f5.h
            r3.<init>(r12, r13, r4)
            r5 = r26
            r9.c(r3, r0, r1, r5)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class<f5.c> r1 = f5.c.class
            r9.c(r13, r0, r1, r5)
            java.lang.Class<f5.c> r0 = f5.c.class
            lb.b r1 = new lb.b
            r3 = 3
            r1.<init>(r3)
            r9.b(r0, r1)
            r0 = r19
            r9.a(r0, r0, r10)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            b5.u r3 = new b5.u
            r5 = 1
            r3.<init>(r2, r5)
            r9.c(r3, r0, r1, r6)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "legacy_append"
            r5 = r25
            r9.c(r5, r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            b5.a r6 = new b5.a
            r6.<init>((d5.e) r5, (v4.c) r2)
            r9.c(r6, r0, r1, r3)
            c5.a$a r0 = new c5.a$a
            r0.<init>()
            r9.g(r0)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            y4.c$b r5 = new y4.c$b
            r5.<init>()
            r9.a(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            y4.e$e r5 = new y4.e$e
            r5.<init>()
            r9.a(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            e5.a r5 = new e5.a
            r5.<init>()
            r9.c(r5, r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            y4.e$b r5 = new y4.e$b
            r5.<init>()
            r9.a(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r9.a(r0, r1, r10)
            com.bumptech.glide.load.data.j$a r0 = new com.bumptech.glide.load.data.j$a
            r0.<init>(r4)
            r9.g(r0)
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r9.g(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r5 = r24
            r9.a(r0, r1, r5)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r6 = r21
            r9.a(r0, r1, r6)
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r7 = r18
            r9.a(r7, r1, r5)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r9.a(r7, r1, r6)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5 = r34
            r9.a(r7, r1, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r6 = r33
            r9.a(r0, r1, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r9.a(r7, r1, r6)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r9.a(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            y4.d$c r1 = new y4.d$c
            r1.<init>()
            r5 = r17
            r9.a(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            y4.d$c r6 = new y4.d$c
            r6.<init>()
            r9.a(r0, r1, r6)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            y4.t$c r1 = new y4.t$c
            r1.<init>()
            r9.a(r5, r0, r1)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            y4.t$b r1 = new y4.t$b
            r1.<init>()
            r9.a(r5, r0, r1)
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            y4.t$a r1 = new y4.t$a
            r1.<init>()
            r9.a(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            y4.a$c r5 = new y4.a$c
            android.content.res.AssetManager r6 = r28.getAssets()
            r5.<init>(r6)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            y4.a$b r5 = new y4.a$b
            android.content.res.AssetManager r6 = r28.getAssets()
            r5.<init>(r6)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            z4.b$a r5 = new z4.b$a
            r6 = r28
            r5.<init>(r6)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            z4.c$a r5 = new z4.c$a
            r5.<init>(r6)
            r9.a(r0, r1, r5)
            r0 = 29
            r1 = r30
            if (r1 < r0) goto L_0x0327
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            z4.d$c r5 = new z4.d$c
            r5.<init>(r6)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            z4.d$b r5 = new z4.d$b
            r5.<init>(r6)
            r9.a(r0, r1, r5)
        L_0x0327:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            y4.v$d r5 = new y4.v$d
            r7 = r23
            r5.<init>(r7)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            y4.v$b r5 = new y4.v$b
            r5.<init>(r7)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            y4.v$a r5 = new y4.v$a
            r5.<init>(r7)
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            y4.w$a r5 = new y4.w$a
            r5.<init>()
            r9.a(r0, r1, r5)
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            z4.e$a r5 = new z4.e$a
            r5.<init>()
            r9.a(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            y4.j$a r5 = new y4.j$a
            r5.<init>(r6)
            r9.a(r0, r1, r5)
            java.lang.Class<y4.f> r0 = y4.f.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            z4.a$a r5 = new z4.a$a
            r5.<init>()
            r9.a(r0, r1, r5)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            y4.b$a r1 = new y4.b$a
            r1.<init>()
            r5 = r16
            r9.a(r5, r0, r1)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            y4.b$d r1 = new y4.b$d
            r1.<init>()
            r9.a(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r9.a(r0, r1, r10)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r9.a(r0, r1, r10)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            d5.f r7 = new d5.f
            r7.<init>()
            r9.c(r7, r0, r1, r3)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            z.j r3 = new z.j
            r3.<init>((android.content.res.Resources) r8)
            r9.h(r0, r1, r3)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r1 = r20
            r9.h(r0, r5, r1)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            z.k r3 = new z.k
            r7 = r22
            r3.<init>(r2, r1, r7)
            r9.h(r0, r5, r3)
            java.lang.Class<f5.c> r0 = f5.c.class
            r9.h(r0, r5, r7)
            b5.b0 r0 = new b5.b0
            b5.b0$d r1 = new b5.b0$d
            r1.<init>()
            r0.<init>(r2, r1)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.String r3 = "legacy_append"
            r9.c(r0, r1, r2, r3)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            b5.a r3 = new b5.a
            r3.<init>((android.content.res.Resources) r8, (s4.j) r0)
            java.lang.String r0 = "legacy_append"
            r9.c(r3, r1, r2, r0)
            lb.b r0 = new lb.b
            r1 = 5
            r0.<init>(r1)
            com.bumptech.glide.h r1 = new com.bumptech.glide.h
            r2 = r1
            r3 = r28
            r4 = r32
            r5 = r9
            r6 = r0
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r29
            r11 = r39
            r12 = r35
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r27
            r2.f4918c = r1
            return
        L_0x0415:
            r0 = move-exception
            r2 = r27
            monitor-exit(r10)
            throw r0
        L_0x041a:
            r0 = move-exception
            r2 = r27
            monitor-exit(r6)
            throw r0
        L_0x041f:
            r0 = move-exception
            r2 = r1
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.<init>(android.content.Context, u4.m, w4.h, v4.c, v4.b, h5.k, h5.c, int, com.bumptech.glide.c, v0.b, java.util.List, com.bumptech.glide.i):void");
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        c cVar;
        if (!f4915q) {
            f4915q = true;
            v0.b bVar = new v0.b();
            i.a aVar = new i.a();
            c cVar2 = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            Log.isLoggable("ManifestParser", 3);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    Log.isLoggable("ManifestParser", 3);
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(e.a(next));
                            Log.isLoggable("ManifestParser", 3);
                        }
                    }
                    Log.isLoggable("ManifestParser", 3);
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c10 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i5.c cVar3 = (i5.c) it.next();
                        if (c10.contains(cVar3.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                cVar3.toString();
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((i5.c) it2.next()).getClass().toString();
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((i5.c) it3.next()).b();
                }
                a.C0224a aVar2 = new a.C0224a();
                if (x4.a.f17063c == 0) {
                    x4.a.f17063c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = x4.a.f17063c;
                if (!TextUtils.isEmpty("source")) {
                    x4.a aVar3 = new x4.a(new ThreadPoolExecutor(i11, i11, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar2, "source", false)));
                    int i12 = x4.a.f17063c;
                    a.C0224a aVar4 = new a.C0224a();
                    if (!TextUtils.isEmpty("disk-cache")) {
                        x4.a aVar5 = new x4.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar4, "disk-cache", true)));
                        if (x4.a.f17063c == 0) {
                            x4.a.f17063c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (x4.a.f17063c >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        a.C0224a aVar6 = new a.C0224a();
                        if (!TextUtils.isEmpty("animation")) {
                            x4.a aVar7 = new x4.a(new ThreadPoolExecutor(i10, i10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar6, "animation", true)));
                            w4.i iVar = new w4.i(new i.a(applicationContext));
                            h5.e eVar = new h5.e();
                            int i13 = iVar.f16474a;
                            if (i13 > 0) {
                                cVar = new v4.i((long) i13);
                            } else {
                                cVar = new d();
                            }
                            v4.h hVar = new v4.h(iVar.f16476c);
                            g gVar = new g((long) iVar.f16475b);
                            m mVar = new m(gVar, new f(applicationContext), aVar5, aVar3, new x4.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, x4.a.f17062b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.C0224a(), "source-unlimited", false))), aVar7);
                            List emptyList = Collections.emptyList();
                            i iVar2 = new i(aVar);
                            b bVar2 = new b(applicationContext, mVar, gVar, cVar, hVar, new k((k.b) null, iVar2), eVar, 4, cVar2, bVar, emptyList, iVar2);
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                i5.c cVar4 = (i5.c) it4.next();
                                try {
                                    cVar4.a(bVar2.f4919d);
                                } catch (AbstractMethodError e10) {
                                    StringBuilder q10 = android.support.v4.media.a.q("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                                    q10.append(cVar4.getClass().getName());
                                    throw new IllegalStateException(q10.toString(), e10);
                                }
                            }
                            applicationContext.registerComponentCallbacks(bVar2);
                            f4914p = bVar2;
                            f4915q = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        if (f4914p == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f4914p == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f4914p;
    }

    public static k c(Context context) {
        if (context != null) {
            return b(context).f4921f;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static l e(View view) {
        boolean z10;
        View view2;
        k c10 = c(view.getContext());
        c10.getClass();
        if (l.h()) {
            return c10.f(view.getContext().getApplicationContext());
        }
        if (view.getContext() != null) {
            Activity a10 = k.a(view.getContext());
            if (a10 == null) {
                return c10.f(view.getContext().getApplicationContext());
            }
            if (a10 instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) a10;
                c10.f10572f.clear();
                k.c(fragmentActivity.G().H(), c10.f10572f);
                View findViewById = fragmentActivity.findViewById(16908290);
                Fragment fragment = null;
                while (!view.equals(findViewById) && (fragment = c10.f10572f.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c10.f10572f.clear();
                if (fragment == null) {
                    return c10.g(fragmentActivity);
                }
                if (fragment.r() == null) {
                    throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
                } else if (l.h()) {
                    return c10.f(fragment.r().getApplicationContext());
                } else {
                    if (fragment.m() != null) {
                        h5.g gVar = c10.f10575i;
                        fragment.m();
                        gVar.h();
                    }
                    FragmentManager o10 = fragment.o();
                    Context r10 = fragment.r();
                    if (!fragment.C() || fragment.D() || (view2 = fragment.L) == null || view2.getWindowToken() == null || fragment.L.getVisibility() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    return c10.j(r10, o10, fragment, z10);
                }
            } else {
                c10.f10573g.clear();
                c10.b(a10.getFragmentManager(), c10.f10573g);
                View findViewById2 = a10.findViewById(16908290);
                android.app.Fragment fragment2 = null;
                while (!view.equals(findViewById2) && (fragment2 = c10.f10573g.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c10.f10573g.clear();
                if (fragment2 == null) {
                    return c10.e(a10);
                }
                if (fragment2.getActivity() == null) {
                    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                } else if (l.h()) {
                    return c10.f(fragment2.getActivity().getApplicationContext());
                } else {
                    if (fragment2.getActivity() != null) {
                        h5.g gVar2 = c10.f10575i;
                        fragment2.getActivity();
                        gVar2.h();
                    }
                    return c10.d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
                }
            }
        } else {
            throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
        }
    }

    public final void d(l lVar) {
        synchronized (this.f4923o) {
            if (this.f4923o.contains(lVar)) {
                this.f4923o.remove(lVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        l.a();
        ((o5.i) this.f4917b).e(0);
        this.f4916a.b();
        this.f4920e.b();
    }

    public final void onTrimMemory(int i10) {
        long j10;
        l.a();
        synchronized (this.f4923o) {
            Iterator it = this.f4923o.iterator();
            while (it.hasNext()) {
                ((l) it.next()).getClass();
            }
        }
        g gVar = (g) this.f4917b;
        if (i10 >= 40) {
            gVar.e(0);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (gVar) {
                j10 = gVar.f13746b;
            }
            gVar.e(j10 / 2);
        } else {
            gVar.getClass();
        }
        this.f4916a.a(i10);
        this.f4920e.a(i10);
    }
}
