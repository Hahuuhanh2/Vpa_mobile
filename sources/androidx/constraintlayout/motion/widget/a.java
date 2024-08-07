package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import b1.c;
import f1.g;
import f1.n;
import g1.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1640a;

    /* renamed from: b  reason: collision with root package name */
    public d f1641b = null;

    /* renamed from: c  reason: collision with root package name */
    public b f1642c = null;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f1643d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public b f1644e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b> f1645f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.a> f1646g = new SparseArray<>();

    /* renamed from: h  reason: collision with root package name */
    public HashMap<String, Integer> f1647h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public SparseIntArray f1648i = new SparseIntArray();

    /* renamed from: j  reason: collision with root package name */
    public int f1649j = 400;

    /* renamed from: k  reason: collision with root package name */
    public int f1650k = 0;

    /* renamed from: l  reason: collision with root package name */
    public MotionEvent f1651l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1652m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1653n = false;

    /* renamed from: o  reason: collision with root package name */
    public MotionLayout.f f1654o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1655p;

    /* renamed from: q  reason: collision with root package name */
    public final d f1656q;

    /* renamed from: r  reason: collision with root package name */
    public float f1657r;

    /* renamed from: s  reason: collision with root package name */
    public float f1658s;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a  reason: collision with other inner class name */
    /* compiled from: MotionScene */
    public class C0014a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f1659a;

        public C0014a(c cVar) {
            this.f1659a = cVar;
        }

        public final float getInterpolation(float f10) {
            return (float) this.f1659a.a((double) f10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r11, androidx.constraintlayout.motion.widget.MotionLayout r12, int r13) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.f1641b = r0
            r10.f1642c = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f1643d = r1
            r10.f1644e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f1645f = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r10.f1646g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r10.f1647h = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r10.f1648i = r1
            r1 = 400(0x190, float:5.6E-43)
            r10.f1649j = r1
            r1 = 0
            r10.f1650k = r1
            r10.f1652m = r1
            r10.f1653n = r1
            r10.f1640a = r12
            androidx.constraintlayout.motion.widget.d r2 = new androidx.constraintlayout.motion.widget.d
            r2.<init>(r12)
            r10.f1656q = r2
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.XmlResourceParser r12 = r12.getXml(r13)
            int r2 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r3 = r0
        L_0x004e:
            r4 = 1
            if (r2 == r4) goto L_0x0195
            if (r2 == 0) goto L_0x0183
            r5 = 2
            if (r2 == r5) goto L_0x0058
            goto L_0x0186
        L_0x0058:
            java.lang.String r2 = r12.getName()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r7 = 4
            r8 = 5
            r9 = -1
            switch(r6) {
                case -1349929691: goto L_0x00c4;
                case -1239391468: goto L_0x00b9;
                case -687739768: goto L_0x00af;
                case 61998586: goto L_0x00a4;
                case 269306229: goto L_0x009b;
                case 312750793: goto L_0x0091;
                case 327855227: goto L_0x0087;
                case 793277014: goto L_0x007d;
                case 1382829617: goto L_0x0073;
                case 1942574248: goto L_0x0068;
                default: goto L_0x0066;
            }     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
        L_0x0066:
            goto L_0x00ce
        L_0x0068:
            java.lang.String r4 = "include"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = 6
            goto L_0x00cf
        L_0x0073:
            java.lang.String r4 = "StateSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = r7
            goto L_0x00cf
        L_0x007d:
            java.lang.String r4 = "MotionScene"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = r1
            goto L_0x00cf
        L_0x0087:
            java.lang.String r4 = "OnSwipe"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = r5
            goto L_0x00cf
        L_0x0091:
            java.lang.String r4 = "OnClick"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = 3
            goto L_0x00cf
        L_0x009b:
            java.lang.String r5 = "Transition"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00a4:
            java.lang.String r4 = "ViewTransition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = 9
            goto L_0x00cf
        L_0x00af:
            java.lang.String r4 = "Include"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = 7
            goto L_0x00cf
        L_0x00b9:
            java.lang.String r4 = "KeyFrameSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = 8
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x00ce
            r4 = r8
            goto L_0x00cf
        L_0x00ce:
            r4 = r9
        L_0x00cf:
            switch(r4) {
                case 0: goto L_0x017f;
                case 1: goto L_0x014c;
                case 2: goto L_0x0134;
                case 3: goto L_0x0127;
                case 4: goto L_0x011f;
                case 5: goto L_0x011b;
                case 6: goto L_0x0116;
                case 7: goto L_0x0116;
                case 8: goto L_0x0108;
                case 9: goto L_0x00d4;
                default: goto L_0x00d2;
            }     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
        L_0x00d2:
            goto L_0x0186
        L_0x00d4:
            androidx.constraintlayout.motion.widget.c r2 = new androidx.constraintlayout.motion.widget.c     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            androidx.constraintlayout.motion.widget.d r4 = r10.f1656q     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r5 = r4.f1742b     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r5.add(r2)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r4.f1743c = r0     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            int r4 = r2.f1708b     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r4 != r7) goto L_0x00f6
            androidx.constraintlayout.widget.b r4 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            int r2 = r2.f1727u     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            f1.t r5 = new f1.t     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r4.a(r2, r5)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x00f6:
            if (r4 != r8) goto L_0x0186
            androidx.constraintlayout.widget.b r4 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            int r2 = r2.f1727u     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            f1.t r5 = new f1.t     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r4.a(r2, r5)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x0108:
            f1.g r2 = new f1.g     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r3 == 0) goto L_0x0186
            java.util.ArrayList<f1.g> r4 = r3.f1670k     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x0116:
            r10.k(r11, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x011b:
            r10.i(r11, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x011f:
            g1.d r2 = new g1.d     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r10.f1641b = r2     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x0127:
            if (r3 == 0) goto L_0x0186
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b$a> r2 = r3.f1672m     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            androidx.constraintlayout.motion.widget.a$b$a r4 = new androidx.constraintlayout.motion.widget.a$b$a     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r4.<init>(r11, r3, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.add(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x0134:
            if (r3 != 0) goto L_0x0140
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.getResourceEntryName(r13)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r12.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
        L_0x0140:
            if (r3 == 0) goto L_0x0186
            androidx.constraintlayout.motion.widget.b r2 = new androidx.constraintlayout.motion.widget.b     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r10.f1640a     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.<init>(r11, r4, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r3.f1671l = r2     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x014c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r2 = r10.f1643d     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            androidx.constraintlayout.motion.widget.a$b r3 = new androidx.constraintlayout.motion.widget.a$b     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r3.<init>((androidx.constraintlayout.motion.widget.a) r10, (android.content.Context) r11, (android.content.res.XmlResourceParser) r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            androidx.constraintlayout.motion.widget.a$b r2 = r10.f1642c     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 != 0) goto L_0x0169
            boolean r2 = r3.f1661b     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 != 0) goto L_0x0169
            r10.f1642c = r3     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            androidx.constraintlayout.motion.widget.b r2 = r3.f1671l     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x0169
            boolean r4 = r10.f1655p     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.c(r4)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
        L_0x0169:
            boolean r2 = r3.f1661b     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 == 0) goto L_0x0186
            int r2 = r3.f1662c     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            if (r2 != r9) goto L_0x0174
            r10.f1644e = r3     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0179
        L_0x0174:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r2 = r10.f1645f     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
        L_0x0179:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r2 = r10.f1643d     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            r2.remove(r3)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x017f:
            r10.l(r11, r12)     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x0186
        L_0x0183:
            r12.getName()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
        L_0x0186:
            int r2 = r12.next()     // Catch:{ XmlPullParserException -> 0x0191, IOException -> 0x018c }
            goto L_0x004e
        L_0x018c:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x0195
        L_0x0191:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0195:
            android.util.SparseArray<androidx.constraintlayout.widget.a> r11 = r10.f1646g
            int r12 = androidx.constraintlayout.widget.R$id.motion_base
            androidx.constraintlayout.widget.a r13 = new androidx.constraintlayout.widget.a
            r13.<init>()
            r11.put(r12, r13)
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r10.f1647h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "motion_base"
            r11.put(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public final boolean a(int i10, MotionLayout motionLayout) {
        boolean z10;
        boolean z11;
        MotionLayout.i iVar = MotionLayout.i.FINISHED;
        MotionLayout.i iVar2 = MotionLayout.i.MOVING;
        MotionLayout.i iVar3 = MotionLayout.i.SETUP;
        if (this.f1654o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        Iterator<b> it = this.f1643d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i11 = next.f1673n;
            if (i11 != 0) {
                b bVar = this.f1642c;
                if (bVar == next) {
                    if ((bVar.f1677r & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        continue;
                    }
                }
                if (i10 == next.f1663d && (i11 == 4 || i11 == 2)) {
                    motionLayout.setState(iVar);
                    motionLayout.setTransition(next);
                    if (next.f1673n == 4) {
                        motionLayout.r(1.0f);
                        motionLayout.C0 = null;
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.t(true);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        motionLayout.setState(iVar);
                        motionLayout.A();
                    }
                    return true;
                } else if (i10 == next.f1662c && (i11 == 3 || i11 == 1)) {
                    motionLayout.setState(iVar);
                    motionLayout.setTransition(next);
                    if (next.f1673n == 3) {
                        motionLayout.r(0.0f);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.t(true);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        motionLayout.setState(iVar);
                        motionLayout.A();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.a b(int i10) {
        int a10;
        d dVar = this.f1641b;
        if (!(dVar == null || (a10 = dVar.a(i10)) == -1)) {
            i10 = a10;
        }
        if (this.f1646g.get(i10) != null) {
            return this.f1646g.get(i10);
        }
        f1.a.c(this.f1640a.getContext(), i10);
        SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f1646g;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        b bVar = this.f1642c;
        if (bVar != null) {
            return bVar.f1667h;
        }
        return this.f1649j;
    }

    public final int d(Context context, String str) {
        int i10;
        if (str.contains("/")) {
            i10 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i10 = -1;
        }
        if (i10 != -1 || str.length() <= 1) {
            return i10;
        }
        return Integer.parseInt(str.substring(1));
    }

    public final Interpolator e() {
        b bVar = this.f1642c;
        int i10 = bVar.f1664e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f1640a.getContext(), this.f1642c.f1666g);
        }
        if (i10 == -1) {
            return new C0014a(c.c(bVar.f1665f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(n nVar) {
        b bVar = this.f1642c;
        if (bVar == null) {
            b bVar2 = this.f1644e;
            if (bVar2 != null) {
                Iterator<g> it = bVar2.f1670k.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar);
                }
                return;
            }
            return;
        }
        Iterator<g> it2 = bVar.f1670k.iterator();
        while (it2.hasNext()) {
            it2.next().a(nVar);
        }
    }

    public final float g() {
        b bVar;
        b bVar2 = this.f1642c;
        if (bVar2 == null || (bVar = bVar2.f1671l) == null) {
            return 0.0f;
        }
        return bVar.f1700t;
    }

    public final int h() {
        b bVar = this.f1642c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1663d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.a r0 = new androidx.constraintlayout.widget.a
            r0.<init>()
            r1 = 0
            r0.f1945e = r1
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L_0x0010:
            if (r4 >= r2) goto L_0x00d8
            java.lang.String r7 = r15.getAttributeName(r4)
            java.lang.String r8 = r15.getAttributeValue(r4)
            r7.getClass()
            int r9 = r7.hashCode()
            r10 = 2
            r11 = 1
            switch(r9) {
                case -1496482599: goto L_0x003e;
                case -1153153640: goto L_0x0033;
                case 3355: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r7 = r3
            goto L_0x0048
        L_0x0028:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r7 = r10
            goto L_0x0048
        L_0x0033:
            java.lang.String r9 = "constraintRotate"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r7 = r11
            goto L_0x0048
        L_0x003e:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0047
            goto L_0x0026
        L_0x0047:
            r7 = r1
        L_0x0048:
            switch(r7) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x0071;
                case 2: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x00d4
        L_0x004d:
            int r5 = r13.d(r14, r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f1647h
            r9 = 47
            int r9 = r8.indexOf(r9)
            if (r9 >= 0) goto L_0x005c
            goto L_0x0062
        L_0x005c:
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)
        L_0x0062:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = f1.a.c(r14, r5)
            r0.f1941a = r7
            goto L_0x00d4
        L_0x0071:
            int r7 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0079 }
            r0.f1943c = r7     // Catch:{ NumberFormatException -> 0x0079 }
            goto L_0x00d4
        L_0x0079:
            r8.getClass()
            int r7 = r8.hashCode()
            r9 = 3
            r12 = 4
            switch(r7) {
                case -768416914: goto L_0x00b3;
                case 3317767: goto L_0x00a8;
                case 3387192: goto L_0x009d;
                case 108511772: goto L_0x0092;
                case 1954540437: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            r7 = r3
            goto L_0x00bd
        L_0x0087:
            java.lang.String r7 = "x_right"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0090
            goto L_0x0085
        L_0x0090:
            r7 = r12
            goto L_0x00bd
        L_0x0092:
            java.lang.String r7 = "right"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x009b
            goto L_0x0085
        L_0x009b:
            r7 = r9
            goto L_0x00bd
        L_0x009d:
            java.lang.String r7 = "none"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00a6
            goto L_0x0085
        L_0x00a6:
            r7 = r10
            goto L_0x00bd
        L_0x00a8:
            java.lang.String r7 = "left"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00b1
            goto L_0x0085
        L_0x00b1:
            r7 = r11
            goto L_0x00bd
        L_0x00b3:
            java.lang.String r7 = "x_left"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00bc
            goto L_0x0085
        L_0x00bc:
            r7 = r1
        L_0x00bd:
            switch(r7) {
                case 0: goto L_0x00cd;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00c1;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            goto L_0x00d4
        L_0x00c1:
            r0.f1943c = r9
            goto L_0x00d4
        L_0x00c4:
            r0.f1943c = r11
            goto L_0x00d4
        L_0x00c7:
            r0.f1943c = r1
            goto L_0x00d4
        L_0x00ca:
            r0.f1943c = r10
            goto L_0x00d4
        L_0x00cd:
            r0.f1943c = r12
            goto L_0x00d4
        L_0x00d0:
            int r6 = r13.d(r14, r8)
        L_0x00d4:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x00d8:
            if (r5 == r3) goto L_0x00ed
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.f1640a
            int r1 = r1.R
            r0.k(r14, r15)
            if (r6 == r3) goto L_0x00e8
            android.util.SparseIntArray r14 = r13.f1648i
            r14.put(r5, r6)
        L_0x00e8:
            android.util.SparseArray<androidx.constraintlayout.widget.a> r14 = r13.f1646g
            r14.put(r5, r0)
        L_0x00ed:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.i(android.content.Context, android.content.res.XmlResourceParser):int");
    }

    public final int j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
            return -1;
        } catch (IOException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R$styleable.include_constraintSet) {
                j(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R$styleable.MotionScene_defaultDuration) {
                int i11 = obtainStyledAttributes.getInt(index, this.f1649j);
                this.f1649j = i11;
                if (i11 < 8) {
                    this.f1649j = 8;
                }
            } else if (index == R$styleable.MotionScene_layoutDuringTransition) {
                this.f1650k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(int i10, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.a aVar = this.f1646g.get(i10);
        aVar.f1942b = aVar.f1941a;
        int i11 = this.f1648i.get(i10);
        if (i11 > 0) {
            m(i11, motionLayout);
            androidx.constraintlayout.widget.a aVar2 = this.f1646g.get(i11);
            if (aVar2 == null) {
                f1.a.c(this.f1640a.getContext(), i11);
                return;
            }
            aVar.f1942b += "/" + aVar2.f1942b;
            for (Integer next : aVar2.f1946f.keySet()) {
                int intValue = next.intValue();
                a.C0016a aVar3 = aVar2.f1946f.get(next);
                if (!aVar.f1946f.containsKey(Integer.valueOf(intValue))) {
                    aVar.f1946f.put(Integer.valueOf(intValue), new a.C0016a());
                }
                a.C0016a aVar4 = aVar.f1946f.get(Integer.valueOf(intValue));
                if (aVar4 != null) {
                    a.b bVar = aVar4.f1951e;
                    if (!bVar.f1970b) {
                        bVar.a(aVar3.f1951e);
                    }
                    a.d dVar = aVar4.f1949c;
                    if (!dVar.f2024a) {
                        a.d dVar2 = aVar3.f1949c;
                        dVar.f2024a = dVar2.f2024a;
                        dVar.f2025b = dVar2.f2025b;
                        dVar.f2027d = dVar2.f2027d;
                        dVar.f2028e = dVar2.f2028e;
                        dVar.f2026c = dVar2.f2026c;
                    }
                    a.e eVar = aVar4.f1952f;
                    if (!eVar.f2030a) {
                        eVar.a(aVar3.f1952f);
                    }
                    a.c cVar = aVar4.f1950d;
                    if (!cVar.f2011a) {
                        cVar.a(aVar3.f1950d);
                    }
                    for (String next2 : aVar3.f1953g.keySet()) {
                        if (!aVar4.f1953g.containsKey(next2)) {
                            aVar4.f1953g.put(next2, aVar3.f1953g.get(next2));
                        }
                    }
                }
            }
        } else {
            aVar.f1942b = android.support.v4.media.a.o(new StringBuilder(), aVar.f1942b, "  layout");
            int childCount = motionLayout.getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = motionLayout.getChildAt(i12);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (!aVar.f1945e || id2 != -1) {
                    if (!aVar.f1946f.containsKey(Integer.valueOf(id2))) {
                        aVar.f1946f.put(Integer.valueOf(id2), new a.C0016a());
                    }
                    a.C0016a aVar5 = aVar.f1946f.get(Integer.valueOf(id2));
                    if (aVar5 != null) {
                        if (!aVar5.f1951e.f1970b) {
                            aVar5.c(id2, layoutParams);
                            if (childAt instanceof ConstraintHelper) {
                                aVar5.f1951e.f1987j0 = ((ConstraintHelper) childAt).getReferencedIds();
                                if (childAt instanceof Barrier) {
                                    Barrier barrier = (Barrier) childAt;
                                    aVar5.f1951e.f1997o0 = barrier.getAllowsGoneWidget();
                                    aVar5.f1951e.f1981g0 = barrier.getType();
                                    aVar5.f1951e.f1983h0 = barrier.getMargin();
                                }
                            }
                            aVar5.f1951e.f1970b = true;
                        }
                        a.d dVar3 = aVar5.f1949c;
                        if (!dVar3.f2024a) {
                            dVar3.f2025b = childAt.getVisibility();
                            aVar5.f1949c.f2027d = childAt.getAlpha();
                            aVar5.f1949c.f2024a = true;
                        }
                        a.e eVar2 = aVar5.f1952f;
                        if (!eVar2.f2030a) {
                            eVar2.f2030a = true;
                            eVar2.f2031b = childAt.getRotation();
                            aVar5.f1952f.f2032c = childAt.getRotationX();
                            aVar5.f1952f.f2033d = childAt.getRotationY();
                            aVar5.f1952f.f2034e = childAt.getScaleX();
                            aVar5.f1952f.f2035f = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                                a.e eVar3 = aVar5.f1952f;
                                eVar3.f2036g = pivotX;
                                eVar3.f2037h = pivotY;
                            }
                            aVar5.f1952f.f2039j = childAt.getTranslationX();
                            aVar5.f1952f.f2040k = childAt.getTranslationY();
                            aVar5.f1952f.f2041l = childAt.getTranslationZ();
                            a.e eVar4 = aVar5.f1952f;
                            if (eVar4.f2042m) {
                                eVar4.f2043n = childAt.getElevation();
                            }
                        }
                    }
                    i12++;
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
        for (a.C0016a next3 : aVar.f1946f.values()) {
            if (next3.f1954h != null) {
                if (next3.f1948b != null) {
                    for (Integer intValue2 : aVar.f1946f.keySet()) {
                        a.C0016a i13 = aVar.i(intValue2.intValue());
                        String str = i13.f1951e.f1991l0;
                        if (str != null && next3.f1948b.matches(str)) {
                            next3.f1954h.e(i13);
                            i13.f1953g.putAll((HashMap) next3.f1953g.clone());
                        }
                    }
                } else {
                    next3.f1954h.e(aVar.i(next3.f1947a));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(int r8, int r9) {
        /*
            r7 = this;
            g1.d r0 = r7.f1641b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.a(r8)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r8
        L_0x000d:
            g1.d r2 = r7.f1641b
            int r2 = r2.a(r9)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r8
        L_0x0017:
            r2 = r9
        L_0x0018:
            androidx.constraintlayout.motion.widget.a$b r3 = r7.f1642c
            if (r3 == 0) goto L_0x0025
            int r4 = r3.f1662c
            if (r4 != r9) goto L_0x0025
            int r3 = r3.f1663d
            if (r3 != r8) goto L_0x0025
            return
        L_0x0025:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r7.f1643d
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = r4.f1662c
            if (r5 != r2) goto L_0x003f
            int r6 = r4.f1663d
            if (r6 == r0) goto L_0x0045
        L_0x003f:
            if (r5 != r9) goto L_0x002b
            int r5 = r4.f1663d
            if (r5 != r8) goto L_0x002b
        L_0x0045:
            r7.f1642c = r4
            androidx.constraintlayout.motion.widget.b r8 = r4.f1671l
            if (r8 == 0) goto L_0x0050
            boolean r9 = r7.f1655p
            r8.c(r9)
        L_0x0050:
            return
        L_0x0051:
            androidx.constraintlayout.motion.widget.a$b r8 = r7.f1644e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r7.f1645f
            java.util.Iterator r3 = r3.iterator()
        L_0x0059:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = r4.f1662c
            if (r5 != r9) goto L_0x0059
            r8 = r4
            goto L_0x0059
        L_0x006b:
            androidx.constraintlayout.motion.widget.a$b r9 = new androidx.constraintlayout.motion.widget.a$b
            r9.<init>(r7, r8)
            r9.f1663d = r0
            r9.f1662c = r2
            if (r0 == r1) goto L_0x007b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r8 = r7.f1643d
            r8.add(r9)
        L_0x007b:
            r7.f1642c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.n(int, int):void");
    }

    public final boolean o() {
        Iterator<b> it = this.f1643d.iterator();
        while (it.hasNext()) {
            if (it.next().f1671l != null) {
                return true;
            }
        }
        b bVar = this.f1642c;
        if (bVar == null || bVar.f1671l == null) {
            return false;
        }
        return true;
    }

    /* compiled from: MotionScene */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1660a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1661b;

        /* renamed from: c  reason: collision with root package name */
        public int f1662c;

        /* renamed from: d  reason: collision with root package name */
        public int f1663d;

        /* renamed from: e  reason: collision with root package name */
        public int f1664e;

        /* renamed from: f  reason: collision with root package name */
        public String f1665f;

        /* renamed from: g  reason: collision with root package name */
        public int f1666g;

        /* renamed from: h  reason: collision with root package name */
        public int f1667h;

        /* renamed from: i  reason: collision with root package name */
        public float f1668i;

        /* renamed from: j  reason: collision with root package name */
        public final a f1669j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList<g> f1670k;

        /* renamed from: l  reason: collision with root package name */
        public b f1671l;

        /* renamed from: m  reason: collision with root package name */
        public ArrayList<C0015a> f1672m;

        /* renamed from: n  reason: collision with root package name */
        public int f1673n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1674o;

        /* renamed from: p  reason: collision with root package name */
        public int f1675p;

        /* renamed from: q  reason: collision with root package name */
        public int f1676q;

        /* renamed from: r  reason: collision with root package name */
        public int f1677r;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a  reason: collision with other inner class name */
        /* compiled from: MotionScene */
        public static class C0015a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f1678a;

            /* renamed from: b  reason: collision with root package name */
            public int f1679b = -1;

            /* renamed from: c  reason: collision with root package name */
            public int f1680c = 17;

            public C0015a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f1678a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    if (index == R$styleable.OnClick_targetId) {
                        this.f1679b = obtainStyledAttributes.getResourceId(index, this.f1679b);
                    } else if (index == R$styleable.OnClick_clickAction) {
                        this.f1680c = obtainStyledAttributes.getInt(index, this.f1680c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public final void a(MotionLayout motionLayout, int i10, b bVar) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                int i11 = this.f1679b;
                View view = motionLayout;
                if (i11 != -1) {
                    view = motionLayout.findViewById(i11);
                }
                if (view != null) {
                    int i12 = bVar.f1663d;
                    int i13 = bVar.f1662c;
                    if (i12 == -1) {
                        view.setOnClickListener(this);
                        return;
                    }
                    int i14 = this.f1680c;
                    int i15 = i14 & 1;
                    boolean z14 = false;
                    if (i15 == 0 || i10 != i12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if ((i14 & 256) == 0 || i10 != i12) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    boolean z15 = z10 | z11;
                    if (i15 == 0 || i10 != i12) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    boolean z16 = z12 | z15;
                    if ((i14 & 16) == 0 || i10 != i13) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    boolean z17 = z16 | z13;
                    if ((i14 & 4096) != 0 && i10 == i13) {
                        z14 = true;
                    }
                    if (z17 || z14) {
                        view.setOnClickListener(this);
                    }
                }
            }

            public final void onClick(View view) {
                boolean z10;
                boolean z11;
                boolean z12;
                b bVar = this.f1678a;
                a aVar = bVar.f1669j;
                MotionLayout motionLayout = aVar.f1640a;
                if (motionLayout.G) {
                    if (bVar.f1663d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            int i10 = this.f1678a.f1662c;
                            if (!motionLayout.isAttachedToWindow()) {
                                if (motionLayout.B0 == null) {
                                    motionLayout.B0 = new MotionLayout.g();
                                }
                                motionLayout.B0.f1633d = i10;
                                return;
                            }
                            motionLayout.E(i10, -1);
                            return;
                        }
                        b bVar2 = this.f1678a;
                        b bVar3 = new b(bVar2.f1669j, bVar2);
                        bVar3.f1663d = currentState;
                        bVar3.f1662c = this.f1678a.f1662c;
                        motionLayout.setTransition(bVar3);
                        motionLayout.r(1.0f);
                        motionLayout.C0 = null;
                        return;
                    }
                    b bVar4 = aVar.f1642c;
                    int i11 = this.f1680c;
                    boolean z13 = false;
                    if ((i11 & 1) == 0 && (i11 & 256) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if ((i11 & 16) == 0 && (i11 & 4096) == 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z10 || !z11) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        if (bVar4 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z10 = false;
                        } else {
                            z11 = false;
                        }
                    }
                    b bVar5 = this.f1678a;
                    if (bVar5 != bVar4) {
                        int i12 = bVar5.f1662c;
                        int i13 = bVar5.f1663d;
                        if (i13 != -1) {
                        }
                    }
                    z13 = true;
                    if (!z13) {
                        return;
                    }
                    if (z10 && (this.f1680c & 1) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.r(1.0f);
                        motionLayout.C0 = null;
                    } else if (z11 && (this.f1680c & 16) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.r(0.0f);
                    } else if (z10 && (this.f1680c & 256) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(1.0f);
                    } else if (z11 && (this.f1680c & 4096) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.f1660a = -1;
            this.f1661b = false;
            this.f1662c = -1;
            this.f1663d = -1;
            this.f1664e = 0;
            this.f1665f = null;
            this.f1666g = -1;
            this.f1667h = 400;
            this.f1668i = 0.0f;
            this.f1670k = new ArrayList<>();
            this.f1671l = null;
            this.f1672m = new ArrayList<>();
            this.f1673n = 0;
            this.f1674o = false;
            this.f1675p = -1;
            this.f1676q = 0;
            this.f1677r = 0;
            this.f1669j = aVar;
            this.f1667h = aVar.f1649j;
            if (bVar != null) {
                this.f1675p = bVar.f1675p;
                this.f1664e = bVar.f1664e;
                this.f1665f = bVar.f1665f;
                this.f1666g = bVar.f1666g;
                this.f1667h = bVar.f1667h;
                this.f1670k = bVar.f1670k;
                this.f1668i = bVar.f1668i;
                this.f1676q = bVar.f1676q;
            }
        }

        public b(a aVar, int i10, int i11) {
            this.f1660a = -1;
            this.f1661b = false;
            this.f1662c = -1;
            this.f1663d = -1;
            this.f1664e = 0;
            this.f1665f = null;
            this.f1666g = -1;
            this.f1667h = 400;
            this.f1668i = 0.0f;
            this.f1670k = new ArrayList<>();
            this.f1671l = null;
            this.f1672m = new ArrayList<>();
            this.f1673n = 0;
            this.f1674o = false;
            this.f1675p = -1;
            this.f1676q = 0;
            this.f1677r = 0;
            this.f1660a = -1;
            this.f1669j = aVar;
            this.f1663d = i10;
            this.f1662c = i11;
            this.f1667h = aVar.f1649j;
            this.f1676q = aVar.f1650k;
        }

        public b(a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f1660a = -1;
            this.f1661b = false;
            this.f1662c = -1;
            this.f1663d = -1;
            this.f1664e = 0;
            this.f1665f = null;
            this.f1666g = -1;
            this.f1667h = 400;
            this.f1668i = 0.0f;
            this.f1670k = new ArrayList<>();
            this.f1671l = null;
            this.f1672m = new ArrayList<>();
            this.f1673n = 0;
            this.f1674o = false;
            this.f1675p = -1;
            this.f1676q = 0;
            this.f1677r = 0;
            this.f1667h = aVar.f1649j;
            this.f1676q = aVar.f1650k;
            this.f1669j = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Transition);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.Transition_constraintSetEnd) {
                    this.f1662c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1662c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                        aVar2.j(context, this.f1662c);
                        aVar.f1646g.append(this.f1662c, aVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f1662c = aVar.j(context, this.f1662c);
                    }
                } else if (index == R$styleable.Transition_constraintSetStart) {
                    this.f1663d = obtainStyledAttributes.getResourceId(index, this.f1663d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f1663d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.a aVar3 = new androidx.constraintlayout.widget.a();
                        aVar3.j(context, this.f1663d);
                        aVar.f1646g.append(this.f1663d, aVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f1663d = aVar.j(context, this.f1663d);
                    }
                } else if (index == R$styleable.Transition_motionInterpolator) {
                    int i11 = obtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f1666g = resourceId;
                        if (resourceId != -1) {
                            this.f1664e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f1665f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f1666g = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1664e = -2;
                            } else {
                                this.f1664e = -1;
                            }
                        }
                    } else {
                        this.f1664e = obtainStyledAttributes.getInteger(index, this.f1664e);
                    }
                } else if (index == R$styleable.Transition_duration) {
                    int i12 = obtainStyledAttributes.getInt(index, this.f1667h);
                    this.f1667h = i12;
                    if (i12 < 8) {
                        this.f1667h = 8;
                    }
                } else if (index == R$styleable.Transition_staggered) {
                    this.f1668i = obtainStyledAttributes.getFloat(index, this.f1668i);
                } else if (index == R$styleable.Transition_autoTransition) {
                    this.f1673n = obtainStyledAttributes.getInteger(index, this.f1673n);
                } else if (index == R$styleable.Transition_android_id) {
                    this.f1660a = obtainStyledAttributes.getResourceId(index, this.f1660a);
                } else if (index == R$styleable.Transition_transitionDisable) {
                    this.f1674o = obtainStyledAttributes.getBoolean(index, this.f1674o);
                } else if (index == R$styleable.Transition_pathMotionArc) {
                    this.f1675p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == R$styleable.Transition_layoutDuringTransition) {
                    this.f1676q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R$styleable.Transition_transitionFlags) {
                    this.f1677r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f1663d == -1) {
                this.f1661b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
