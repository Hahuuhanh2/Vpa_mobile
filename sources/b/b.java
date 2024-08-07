package b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: ICustomTabsService */
public abstract class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r1 = 1
            java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
            if (r5 == r0) goto L_0x0269
            r0 = 0
            java.lang.String r3 = "CustomTabsSessionToken must have either a session id or a callback (or both)."
            switch(r5) {
                case 2: goto L_0x0253;
                case 3: goto L_0x023a;
                case 4: goto L_0x01ee;
                case 5: goto L_0x01c0;
                case 6: goto L_0x0187;
                case 7: goto L_0x0156;
                case 8: goto L_0x011a;
                case 9: goto L_0x00d0;
                case 10: goto L_0x00a4;
                case 11: goto L_0x005d;
                case 12: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            boolean r5 = super.onTransact(r5, r6, r7, r8)
            return r5
        L_0x0013:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x002c
            android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
            java.lang.Object r8 = r8.createFromParcel(r6)
            android.net.Uri r8 = (android.net.Uri) r8
        L_0x002c:
            r6.readInt()
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x003e
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x003e:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            if (r5 != 0) goto L_0x0052
            if (r8 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x0052:
            boolean r5 = r6.e()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x005d:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x0076
            android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
            java.lang.Object r8 = r8.createFromParcel(r6)
            android.net.Uri r8 = (android.net.Uri) r8
        L_0x0076:
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x0085
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x0085:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            if (r5 != 0) goto L_0x0099
            if (r8 == 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x0099:
            boolean r5 = r6.f()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x00a4:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x00be
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x00be:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            boolean r5 = r6.o(r5, r8)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x00d0:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            r6.readInt()
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x00ec
            android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
            java.lang.Object r8 = r8.createFromParcel(r6)
            android.net.Uri r8 = (android.net.Uri) r8
        L_0x00ec:
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x00fb
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x00fb:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            if (r5 != 0) goto L_0x010f
            if (r8 == 0) goto L_0x0109
            goto L_0x010f
        L_0x0109:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x010f:
            boolean r5 = r6.h()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x011a:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            r6.readString()
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x0137
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x0137:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            if (r5 != 0) goto L_0x014b
            if (r8 == 0) goto L_0x0145
            goto L_0x014b
        L_0x0145:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x014b:
            int r5 = r6.d()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0156:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x016f
            android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            android.net.Uri r6 = (android.net.Uri) r6
        L_0x016f:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            if (r5 == 0) goto L_0x0181
            boolean r5 = r6.f()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0181:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x0187:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x01a1
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r8.createFromParcel(r6)
            r0 = r6
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x01a1:
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            if (r5 != 0) goto L_0x01b5
            if (r8 == 0) goto L_0x01af
            goto L_0x01b5
        L_0x01af:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x01b5:
            boolean r5 = r6.g()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x01c0:
            r6.enforceInterface(r2)
            r6.readString()
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x01d4
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
        L_0x01d4:
            r5 = r4
            androidx.browser.customtabs.CustomTabsService$a r5 = (androidx.browser.customtabs.CustomTabsService.a) r5
            androidx.browser.customtabs.CustomTabsService r5 = androidx.browser.customtabs.CustomTabsService.this
            android.os.Bundle r5 = r5.a()
            r7.writeNoException()
            if (r5 == 0) goto L_0x01e9
            r7.writeInt(r1)
            r5.writeToParcel(r7, r1)
            goto L_0x01ed
        L_0x01e9:
            r5 = 0
            r7.writeInt(r5)
        L_0x01ed:
            return r1
        L_0x01ee:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x0207
            android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
            java.lang.Object r8 = r8.createFromParcel(r6)
            android.net.Uri r8 = (android.net.Uri) r8
        L_0x0207:
            int r8 = r6.readInt()
            if (r8 == 0) goto L_0x0216
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            java.lang.Object r8 = r8.createFromParcel(r6)
            r0 = r8
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x0216:
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            r6.createTypedArrayList(r8)
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            androidx.browser.customtabs.CustomTabsService r6 = androidx.browser.customtabs.CustomTabsService.this
            android.app.PendingIntent r8 = androidx.browser.customtabs.CustomTabsService.a.m(r0)
            if (r5 != 0) goto L_0x022f
            if (r8 == 0) goto L_0x0229
            goto L_0x022f
        L_0x0229:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r3)
            throw r5
        L_0x022f:
            boolean r5 = r6.b()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x023a:
            r6.enforceInterface(r2)
            android.os.IBinder r5 = r6.readStrongBinder()
            b.a r5 = b.a.C0039a.m(r5)
            r6 = r4
            androidx.browser.customtabs.CustomTabsService$a r6 = (androidx.browser.customtabs.CustomTabsService.a) r6
            boolean r5 = r6.o(r5, r0)
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0253:
            r6.enforceInterface(r2)
            r6.readLong()
            r5 = r4
            androidx.browser.customtabs.CustomTabsService$a r5 = (androidx.browser.customtabs.CustomTabsService.a) r5
            androidx.browser.customtabs.CustomTabsService r5 = androidx.browser.customtabs.CustomTabsService.this
            boolean r5 = r5.i()
            r7.writeNoException()
            r7.writeInt(r5)
            return r1
        L_0x0269:
            r7.writeString(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
