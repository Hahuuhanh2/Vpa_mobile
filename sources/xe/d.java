package xe;

import android.content.Context;
import java.util.HashMap;

/* compiled from: FileDirMap */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Integer, String> f17321a = new HashMap<>();

    public static String a(Context context, int i10) {
        HashMap<Integer, String> hashMap = f17321a;
        String str = hashMap.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        b(context);
        return hashMap.get(Integer.valueOf(i10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r3) {
        /*
            boolean r0 = r3 instanceof android.app.Activity
            r1 = 1
            if (r0 == 0) goto L_0x000e
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = j7.a.T(r0)
        L_0x000c:
            r0 = r0 ^ r1
            goto L_0x0029
        L_0x000e:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0028
            r0 = r3
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r2 = r0.getBaseContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0028
            android.content.Context r0 = r0.getBaseContext()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = j7.a.T(r0)
            goto L_0x000c
        L_0x0028:
            r0 = r1
        L_0x0029:
            if (r0 != 0) goto L_0x002c
            return
        L_0x002c:
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = f17321a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0049
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r2 = r3.getExternalFilesDir(r2)
            java.lang.String r2 = r2.getPath()
            r0.put(r1, r2)
        L_0x0049:
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0065
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = android.os.Environment.DIRECTORY_MOVIES
            java.io.File r2 = r3.getExternalFilesDir(r2)
            java.lang.String r2 = r2.getPath()
            r0.put(r1, r2)
        L_0x0065:
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0081
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = android.os.Environment.DIRECTORY_MUSIC
            java.io.File r3 = r3.getExternalFilesDir(r2)
            java.lang.String r3 = r3.getPath()
            r0.put(r1, r3)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.d.b(android.content.Context):void");
    }
}
