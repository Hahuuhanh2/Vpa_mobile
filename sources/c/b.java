package c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: ITrustedWebActivityService */
public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.os.Bundle} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0170, code lost:
        if (s.a.b(r10.f1271a, r4) == false) goto L_0x0179;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            r0 = 9
            r1 = 0
            r2 = 1
            java.lang.String r3 = "android.support.customtabs.trusted.ITrustedWebActivityService"
            if (r10 == r0) goto L_0x018f
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r10 == r0) goto L_0x018b
            java.lang.String r0 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
            r4 = 26
            java.lang.String r5 = "android.support.customtabs.trusted.CHANNEL_NAME"
            java.lang.String r6 = "android.support.customtabs.trusted.PLATFORM_ID"
            java.lang.String r7 = "android.support.customtabs.trusted.PLATFORM_TAG"
            r8 = 0
            switch(r10) {
                case 2: goto L_0x0113;
                case 3: goto L_0x00df;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00a1;
                case 6: goto L_0x004f;
                case 7: goto L_0x0020;
                default: goto L_0x001b;
            }
        L_0x001b:
            boolean r10 = super.onTransact(r10, r11, r12, r13)
            return r10
        L_0x0020:
            r11.enforceInterface(r3)
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.a) r10
            r10.m()
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            int r11 = r10.d()
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r0 = -1
            if (r11 != r0) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeResource(r10, r11)
            java.lang.String r11 = "android.support.customtabs.trusted.SMALL_ICON_BITMAP"
            r13.putParcelable(r11, r10)
        L_0x0045:
            r12.writeNoException()
            r12.writeInt(r2)
            r13.writeToParcel(r12, r2)
            return r2
        L_0x004f:
            r11.enforceInterface(r3)
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x0061
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            r8 = r10
            android.os.Bundle r8 = (android.os.Bundle) r8
        L_0x0061:
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.a) r10
            r10.m()
            al.g0.P(r8, r5)
            java.lang.String r11 = r8.getString(r5)
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.b()
            i1.v r13 = new i1.v
            r13.<init>(r10)
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x007f
            goto L_0x008f
        L_0x007f:
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r4) goto L_0x0085
            r1 = r2
            goto L_0x008f
        L_0x0085:
            android.app.NotificationManager r10 = r10.f1271a
            java.lang.String r11 = androidx.browser.trusted.TrustedWebActivityService.a(r11)
            boolean r1 = s.a.b(r10, r11)
        L_0x008f:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r10.putBoolean(r0, r1)
            r12.writeNoException()
            r12.writeInt(r2)
            r10.writeToParcel(r12, r2)
            return r2
        L_0x00a1:
            r11.enforceInterface(r3)
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.a) r10
            r10.m()
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.b()
            android.app.NotificationManager r10 = r10.f1271a
            android.service.notification.StatusBarNotification[] r10 = r10.getActiveNotifications()
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r13 = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"
            r11.putParcelableArray(r13, r10)
            r12.writeNoException()
            r12.writeInt(r2)
            r11.writeToParcel(r12, r2)
            return r2
        L_0x00c9:
            r11.enforceInterface(r3)
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.a) r10
            r10.m()
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            int r10 = r10.d()
            r12.writeNoException()
            r12.writeInt(r10)
            return r2
        L_0x00df:
            r11.enforceInterface(r3)
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x00f1
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            r8 = r10
            android.os.Bundle r8 = (android.os.Bundle) r8
        L_0x00f1:
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.a) r10
            r10.m()
            al.g0.P(r8, r7)
            al.g0.P(r8, r6)
            java.lang.String r11 = r8.getString(r7)
            int r13 = r8.getInt(r6)
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.b()
            android.app.NotificationManager r10 = r10.f1271a
            r10.cancel(r11, r13)
            r12.writeNoException()
            return r2
        L_0x0113:
            r11.enforceInterface(r3)
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x0125
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            r8 = r10
            android.os.Bundle r8 = (android.os.Bundle) r8
        L_0x0125:
            r10 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r10 = (androidx.browser.trusted.TrustedWebActivityService.a) r10
            r10.m()
            al.g0.P(r8, r7)
            al.g0.P(r8, r6)
            java.lang.String r11 = "android.support.customtabs.trusted.NOTIFICATION"
            al.g0.P(r8, r11)
            al.g0.P(r8, r5)
            java.lang.String r13 = r8.getString(r7)
            int r3 = r8.getInt(r6)
            android.os.Parcelable r11 = r8.getParcelable(r11)
            android.app.Notification r11 = (android.app.Notification) r11
            java.lang.String r5 = r8.getString(r5)
            androidx.browser.trusted.TrustedWebActivityService r10 = androidx.browser.trusted.TrustedWebActivityService.this
            r10.b()
            i1.v r6 = new i1.v
            r6.<init>(r10)
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x015c
            goto L_0x0179
        L_0x015c:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0173
            java.lang.String r4 = androidx.browser.trusted.TrustedWebActivityService.a(r5)
            android.app.NotificationManager r6 = r10.f1271a
            android.app.Notification r11 = s.a.a(r10, r6, r11, r4, r5)
            android.app.NotificationManager r5 = r10.f1271a
            boolean r4 = s.a.b(r5, r4)
            if (r4 != 0) goto L_0x0173
            goto L_0x0179
        L_0x0173:
            android.app.NotificationManager r10 = r10.f1271a
            r10.notify(r13, r3, r11)
            r1 = r2
        L_0x0179:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r10.putBoolean(r0, r1)
            r12.writeNoException()
            r12.writeInt(r2)
            r10.writeToParcel(r12, r2)
            return r2
        L_0x018b:
            r12.writeString(r3)
            return r2
        L_0x018f:
            r11.enforceInterface(r3)
            r11.readString()
            int r10 = r11.readInt()
            if (r10 == 0) goto L_0x01a3
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            java.lang.Object r10 = r10.createFromParcel(r11)
            android.os.Bundle r10 = (android.os.Bundle) r10
        L_0x01a3:
            android.os.IBinder r10 = r11.readStrongBinder()
            r11 = r9
            androidx.browser.trusted.TrustedWebActivityService$a r11 = (androidx.browser.trusted.TrustedWebActivityService.a) r11
            r11.m()
            androidx.browser.trusted.TrustedWebActivityService r11 = androidx.browser.trusted.TrustedWebActivityService.this
            if (r10 != 0) goto L_0x01b2
            goto L_0x01c0
        L_0x01b2:
            java.lang.String r13 = "android.support.customtabs.trusted.ITrustedWebActivityCallback"
            android.os.IInterface r10 = r10.queryLocalInterface(r13)
            if (r10 == 0) goto L_0x01c0
            boolean r13 = r10 instanceof c.a
            if (r13 == 0) goto L_0x01c0
            c.a r10 = (c.a) r10
        L_0x01c0:
            r11.getClass()
            r12.writeNoException()
            r12.writeInt(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
