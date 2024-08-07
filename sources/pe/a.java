package pe;

/* compiled from: ImmersiveManager */
public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        pe.b.b(r11, false, false, r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0110 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd A[Catch:{ Exception -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1 A[Catch:{ Exception -> 0x011d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(androidx.appcompat.app.AppCompatActivity r11, int r12, int r13) {
        /*
            android.view.Window r0 = r11.getWindow()     // Catch:{ Exception -> 0x011d }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            r3 = 1
            r0.requestFeature(r3)     // Catch:{ Exception -> 0x011d }
            r0.clearFlags(r2)     // Catch:{ Exception -> 0x011d }
            r2 = 0
            if (r12 != 0) goto L_0x0014
            r4 = r3
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            java.lang.Integer r5 = pe.c.f14172b     // Catch:{ Exception -> 0x011d }
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L_0x0020
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x011d }
            goto L_0x0065
        L_0x0020:
            java.lang.String r5 = pe.c.b()     // Catch:{ Exception -> 0x011d }
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x011d }
            r9 = 4
            if (r8 != 0) goto L_0x0037
            int r5 = j7.a.A0(r5)     // Catch:{ Exception -> 0x0033 }
            if (r5 < r9) goto L_0x0037
            r5 = r3
            goto L_0x0038
        L_0x0033:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ Exception -> 0x011d }
        L_0x0037:
            r5 = r2
        L_0x0038:
            if (r5 == 0) goto L_0x0045
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x011d }
            pe.c.f14172b = r5     // Catch:{ Exception -> 0x011d }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x011d }
            goto L_0x0065
        L_0x0045:
            int r5 = pe.c.a()     // Catch:{ Exception -> 0x011d }
            if (r5 < r9) goto L_0x004d
            r5 = r3
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            if (r5 == 0) goto L_0x005b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x011d }
            pe.c.f14172b = r5     // Catch:{ Exception -> 0x011d }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x011d }
            goto L_0x0065
        L_0x005b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x011d }
            pe.c.f14172b = r5     // Catch:{ Exception -> 0x011d }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x011d }
        L_0x0065:
            r8 = 7
            if (r5 == r3) goto L_0x00b7
            if (r5 == r7) goto L_0x0073
            if (r5 == r6) goto L_0x006e
            goto L_0x0113
        L_0x006e:
            pe.b.b(r11, r2, r2, r4)     // Catch:{ Exception -> 0x011d }
            goto L_0x0113
        L_0x0073:
            pe.b.a(r11, r2, r2)     // Catch:{ Exception -> 0x011d }
            android.view.Window r5 = r11.getWindow()     // Catch:{ Exception -> 0x00b3 }
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()     // Catch:{ Exception -> 0x00b3 }
            java.lang.Class<android.view.WindowManager$LayoutParams> r6 = android.view.WindowManager.LayoutParams.class
            java.lang.String r7 = "MEIZU_FLAG_DARK_STATUS_BAR_ICON"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x00b3 }
            java.lang.Class<android.view.WindowManager$LayoutParams> r7 = android.view.WindowManager.LayoutParams.class
            java.lang.String r9 = "meizuFlags"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r9)     // Catch:{ Exception -> 0x00b3 }
            r6.setAccessible(r3)     // Catch:{ Exception -> 0x00b3 }
            r7.setAccessible(r3)     // Catch:{ Exception -> 0x00b3 }
            r3 = 0
            int r3 = r6.getInt(r3)     // Catch:{ Exception -> 0x00b3 }
            int r6 = r7.getInt(r5)     // Catch:{ Exception -> 0x00b3 }
            int r3 = ~r3     // Catch:{ Exception -> 0x00b3 }
            r3 = r3 & r6
            r7.setInt(r5, r3)     // Catch:{ Exception -> 0x00b3 }
            android.view.Window r3 = r11.getWindow()     // Catch:{ Exception -> 0x00b3 }
            r3.setAttributes(r5)     // Catch:{ Exception -> 0x00b3 }
            int r3 = pe.c.a()     // Catch:{ Exception -> 0x00b3 }
            if (r3 < r8) goto L_0x0113
            pe.b.b(r11, r2, r2, r4)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x0113
        L_0x00b3:
            pe.b.b(r11, r2, r2, r4)     // Catch:{ Exception -> 0x011d }
            goto L_0x0113
        L_0x00b7:
            java.lang.String r5 = pe.c.b()     // Catch:{ Exception -> 0x011d }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x011d }
            if (r6 != 0) goto L_0x00ca
            int r5 = j7.a.A0(r5)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00cb
        L_0x00c6:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ Exception -> 0x011d }
        L_0x00ca:
            r5 = r2
        L_0x00cb:
            if (r5 < r8) goto L_0x00d1
            pe.b.b(r11, r2, r2, r4)     // Catch:{ Exception -> 0x011d }
            goto L_0x0113
        L_0x00d1:
            pe.b.a(r11, r2, r2)     // Catch:{ Exception -> 0x011d }
            android.view.Window r5 = r11.getWindow()     // Catch:{ Exception -> 0x011d }
            java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = "android.view.MiuiWindowManager$LayoutParams"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r8 = "EXTRA_FLAG_STATUS_BAR_DARK_MODE"
            java.lang.reflect.Field r8 = r6.getField(r8)     // Catch:{ Exception -> 0x0110 }
            int r6 = r8.getInt(r6)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r8 = "setExtraFlags"
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0110 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0110 }
            r9[r2] = r10     // Catch:{ Exception -> 0x0110 }
            r9[r3] = r10     // Catch:{ Exception -> 0x0110 }
            java.lang.reflect.Method r5 = r5.getMethod(r8, r9)     // Catch:{ Exception -> 0x0110 }
            android.view.Window r8 = r11.getWindow()     // Catch:{ Exception -> 0x0110 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0110 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0110 }
            r7[r2] = r9     // Catch:{ Exception -> 0x0110 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0110 }
            r7[r3] = r6     // Catch:{ Exception -> 0x0110 }
            r5.invoke(r8, r7)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0113
        L_0x0110:
            pe.b.b(r11, r2, r2, r4)     // Catch:{ Exception -> 0x011d }
        L_0x0113:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x011d }
            r0.setStatusBarColor(r12)     // Catch:{ Exception -> 0x011d }
            r0.setNavigationBarColor(r13)     // Catch:{ Exception -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.a.a(androidx.appcompat.app.AppCompatActivity, int, int):void");
    }
}
