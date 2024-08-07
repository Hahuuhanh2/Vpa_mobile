package com.kizitonwose.calendar.view.internal;

import android.view.ViewGroup;
import be.b;
import be.c;

/* compiled from: Utils.kt */
public final class f {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.widget.LinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <Day, Container extends m9.b> com.kizitonwose.calendar.view.internal.d<Day> a(be.c r16, be.b r17, android.content.Context r18, int r19, int r20, int r21, int r22, java.lang.String r23, be.a<Day, Container> r24) {
        /*
            r1 = r16
            r2 = r17
            r0 = r20
            r3 = r21
            r4 = r22
            java.lang.String r5 = "itemMargins"
            sk.j.f(r1, r5)
            java.lang.String r5 = "daySize"
            sk.j.f(r2, r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r6 = r18
            r5.<init>(r6)
            r6 = 1
            r5.setOrientation(r6)
            if (r0 == 0) goto L_0x002a
            android.view.View r0 = j7.a.O(r5, r0)
            r5.addView(r0)
            r8 = r0
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            com.kizitonwose.calendar.view.internal.b r0 = new com.kizitonwose.calendar.view.internal.b
            r9 = r19
            r10 = r24
            r0.<init>(r2, r9, r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            r10 = 0
            r11 = r10
        L_0x003b:
            if (r11 >= r4) goto L_0x005e
            be.b r12 = r0.f8054a
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 7
            r13.<init>(r14)
            r15 = r10
        L_0x0046:
            if (r15 >= r14) goto L_0x0053
            com.kizitonwose.calendar.view.internal.c r7 = new com.kizitonwose.calendar.view.internal.c
            r7.<init>(r0)
            r13.add(r7)
            int r15 = r15 + 1
            goto L_0x0046
        L_0x0053:
            com.kizitonwose.calendar.view.internal.g r7 = new com.kizitonwose.calendar.view.internal.g
            r7.<init>(r12, r13)
            r9.add(r7)
            int r11 = r11 + 1
            goto L_0x003b
        L_0x005e:
            java.util.Iterator r0 = r9.iterator()
        L_0x0062:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0149
            java.lang.Object r4 = r0.next()
            com.kizitonwose.calendar.view.internal.g r4 = (com.kizitonwose.calendar.view.internal.g) r4
            r4.getClass()
            com.kizitonwose.calendar.view.internal.WidthDivisorLinearLayout r7 = new com.kizitonwose.calendar.view.internal.WidthDivisorLinearLayout
            android.content.Context r11 = r5.getContext()
            java.lang.String r12 = "getContext(...)"
            sk.j.e(r11, r12)
            r7.<init>(r11)
            r4.f8071c = r7
            be.b r11 = r4.f8069a
            r11.getClass()
            be.b r12 = be.b.Square
            if (r11 == r12) goto L_0x0095
            be.b r13 = be.b.SeventhWidth
            if (r11 == r13) goto L_0x0095
            be.b r13 = be.b.Rectangle
            if (r11 != r13) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r11 = r10
            goto L_0x0096
        L_0x0095:
            r11 = r6
        L_0x0096:
            if (r11 == 0) goto L_0x009a
            r11 = -1
            goto L_0x009b
        L_0x009a:
            r11 = -2
        L_0x009b:
            be.b r15 = r4.f8069a
            r15.getClass()
            be.b r13 = be.b.Rectangle
            if (r15 != r13) goto L_0x00a6
            r15 = r6
            goto L_0x00a7
        L_0x00a6:
            r15 = r10
        L_0x00a7:
            if (r15 == 0) goto L_0x00ab
            r15 = -1
            goto L_0x00ac
        L_0x00ab:
            r15 = -2
        L_0x00ac:
            be.b r14 = r4.f8069a
            r14.getClass()
            if (r14 != r13) goto L_0x00b5
            r13 = r6
            goto L_0x00b6
        L_0x00b5:
            r13 = r10
        L_0x00b6:
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x00bc
            r13 = r14
            goto L_0x00bd
        L_0x00bc:
            r13 = 0
        L_0x00bd:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r11, r15, r13)
            r7.setLayoutParams(r6)
            r7.setOrientation(r10)
            java.util.List<com.kizitonwose.calendar.view.internal.c<Day>> r6 = r4.f8070b
            int r6 = r6.size()
            float r6 = (float) r6
            r7.setWeightSum(r6)
            be.b r6 = r4.f8069a
            if (r6 != r12) goto L_0x00dd
            java.util.List<com.kizitonwose.calendar.view.internal.c<Day>> r6 = r4.f8070b
            int r6 = r6.size()
            goto L_0x00de
        L_0x00dd:
            r6 = r10
        L_0x00de:
            r7.f8045a = r6
            java.util.List<com.kizitonwose.calendar.view.internal.c<Day>> r4 = r4.f8070b
            java.util.Iterator r4 = r4.iterator()
        L_0x00e6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0143
            java.lang.Object r6 = r4.next()
            com.kizitonwose.calendar.view.internal.c r6 = (com.kizitonwose.calendar.view.internal.c) r6
            r6.getClass()
            com.kizitonwose.calendar.view.internal.b<Day> r11 = r6.f8057a
            int r11 = r11.f8055b
            android.view.View r11 = j7.a.O(r7, r11)
            r6.f8058b = r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            java.lang.String r13 = "getLayoutParams(...)"
            sk.j.e(r12, r13)
            boolean r13 = r12 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r13 == 0) goto L_0x0114
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            r13.<init>(r12)
            goto L_0x0119
        L_0x0114:
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r12)
        L_0x0119:
            r13.weight = r14
            com.kizitonwose.calendar.view.internal.b<Day> r6 = r6.f8057a
            be.b r6 = r6.f8054a
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x0137
            r12 = 1
            if (r6 == r12) goto L_0x0131
            r12 = 2
            if (r6 == r12) goto L_0x012d
            r6 = -1
            goto L_0x013c
        L_0x012d:
            r6 = -1
            r13.width = r6
            goto L_0x013c
        L_0x0131:
            r6 = -1
            r13.width = r6
            r13.height = r6
            goto L_0x013c
        L_0x0137:
            r6 = -1
            r13.width = r6
            r13.height = r6
        L_0x013c:
            r11.setLayoutParams(r13)
            r7.addView(r11)
            goto L_0x00e6
        L_0x0143:
            r5.addView(r7)
            r6 = 1
            goto L_0x0062
        L_0x0149:
            if (r3 == 0) goto L_0x0154
            android.view.View r0 = j7.a.O(r5, r3)
            r5.addView(r0)
            r3 = r0
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            if (r23 == 0) goto L_0x0199
            java.lang.Class r0 = java.lang.Class.forName(r23)     // Catch:{ all -> 0x017a }
            r4 = 1
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x017a }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r10] = r7     // Catch:{ all -> 0x017a }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r6)     // Catch:{ all -> 0x017a }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x017a }
            android.content.Context r6 = r5.getContext()     // Catch:{ all -> 0x017a }
            r4[r10] = r6     // Catch:{ all -> 0x017a }
            java.lang.Object r0 = r0.newInstance(r4)     // Catch:{ all -> 0x017a }
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            sk.j.d(r0, r4)     // Catch:{ all -> 0x017a }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x017a }
            goto L_0x017f
        L_0x017a:
            r0 = move-exception
            ek.f$a r0 = p3.l0.A(r0)
        L_0x017f:
            ek.f.a(r0)
            boolean r4 = r0 instanceof ek.f.a
            if (r4 == 0) goto L_0x0187
            r0 = 0
        L_0x0187:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0193
            b(r2, r1, r0)
            r0.addView(r5)
            r7 = r0
            goto L_0x0194
        L_0x0193:
            r7 = 0
        L_0x0194:
            if (r7 != 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r5 = r7
            goto L_0x019c
        L_0x0199:
            b(r2, r1, r5)
        L_0x019c:
            com.kizitonwose.calendar.view.internal.d r0 = new com.kizitonwose.calendar.view.internal.d
            r0.<init>(r5, r8, r3, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kizitonwose.calendar.view.internal.f.a(be.c, be.b, android.content.Context, int, int, int, int, java.lang.String, be.a):com.kizitonwose.calendar.view.internal.d");
    }

    public static final void b(b bVar, c cVar, ViewGroup viewGroup) {
        boolean z10;
        int i10;
        bVar.getClass();
        boolean z11 = false;
        if (bVar == b.Square || bVar == b.SeventhWidth || bVar == b.Rectangle) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (z10) {
            i10 = -1;
        } else {
            i10 = -2;
        }
        if (bVar == b.Rectangle) {
            z11 = true;
        }
        if (!z11) {
            i11 = -2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, i11);
        marginLayoutParams.bottomMargin = cVar.f4174d;
        marginLayoutParams.topMargin = cVar.f4172b;
        marginLayoutParams.setMarginStart(cVar.f4171a);
        marginLayoutParams.setMarginEnd(cVar.f4173c);
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
