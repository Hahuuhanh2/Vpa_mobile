package u6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static e f15294a;

    public e(Context context) {
        context.getApplicationContext();
    }

    public static final m a(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        n nVar = new n(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].equals(nVar)) {
                return mVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean b(PackageInfo packageInfo) {
        boolean z10;
        PackageInfo packageInfo2;
        m mVar;
        boolean z11;
        ApplicationInfo applicationInfo;
        if (packageInfo != null) {
            if (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            z10 = z11;
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
            z10 = true;
        }
        if (!(packageInfo == null || packageInfo2.signatures == null)) {
            if (z10) {
                mVar = a(packageInfo2, p.f15305a);
            } else {
                mVar = a(packageInfo2, p.f15305a[0]);
            }
            if (mVar != null) {
                return true;
            }
        }
        return false;
    }
}
