package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ProfileVerifier */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final z0.c<c> f2923a = new z0.c<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2924b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static c f2925c = null;

    /* compiled from: ProfileVerifier */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    /* compiled from: ProfileVerifier */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2926a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2927b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2928c;

        /* renamed from: d  reason: collision with root package name */
        public final long f2929d;

        public b(int i10, int i11, long j10, long j11) {
            this.f2926a = i10;
            this.f2927b = i11;
            this.f2928c = j10;
            this.f2929d = j11;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2926a);
                dataOutputStream.writeInt(this.f2927b);
                dataOutputStream.writeLong(this.f2928c);
                dataOutputStream.writeLong(this.f2929d);
                dataOutputStream.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2927b == bVar.f2927b && this.f2928c == bVar.f2928c && this.f2926a == bVar.f2926a && this.f2929d == bVar.f2929d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f2927b), Long.valueOf(this.f2928c), Integer.valueOf(this.f2926a), Long.valueOf(this.f2929d)});
        }
    }

    /* compiled from: ProfileVerifier */
    public static class c {
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c();
        f2925c = cVar;
        f2923a.p(cVar);
        return f2925c;
    }

    public static void c(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        b bVar;
        if (z10 || f2925c == null) {
            synchronized (f2924b) {
                if (!z10) {
                    if (f2925c != null) {
                        return;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 >= 28) {
                    if (i10 != 30) {
                        File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length = file.length();
                        if (!file.exists() || length <= 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (!file2.exists() || length2 <= 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        try {
                            long a10 = a(context);
                            File file3 = new File(context.getFilesDir(), "profileInstalled");
                            b bVar2 = null;
                            if (file3.exists()) {
                                try {
                                    bVar2 = b.a(file3);
                                } catch (IOException unused) {
                                    b(131072, z11, z12);
                                    return;
                                }
                            }
                            if (bVar2 != null && bVar2.f2928c == a10) {
                                int i12 = bVar2.f2927b;
                                if (i12 != 2) {
                                    i11 = i12;
                                    if (z10 && z12 && i11 != 1) {
                                        i11 = 2;
                                    }
                                    if (bVar2 != null && bVar2.f2927b == 2 && i11 == 1 && length < bVar2.f2929d) {
                                        i11 = 3;
                                    }
                                    bVar = new b(1, i11, a10, length2);
                                    if (bVar2 == null || !bVar2.equals(bVar)) {
                                        bVar.b(file3);
                                    }
                                    b(i11, z11, z12);
                                    return;
                                }
                            }
                            if (z11) {
                                i11 = 1;
                            } else if (z12) {
                                i11 = 2;
                            }
                            i11 = 2;
                            i11 = 3;
                            bVar = new b(1, i11, a10, length2);
                            try {
                                bVar.b(file3);
                            } catch (IOException unused2) {
                                i11 = 196608;
                            }
                            b(i11, z11, z12);
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            b(65536, z11, z12);
                            return;
                        }
                    }
                }
                b(262144, false, false);
            }
        }
    }
}
