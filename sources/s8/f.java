package s8;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f14686a = new a0("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) {
        String str;
        if (signatureArr == null || (r1 = signatureArr.length) == 0) {
            a0 a0Var = f14686a;
            Object[] objArr = new Object[0];
            a0Var.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                a0.c(a0Var.f14658a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
            }
            return false;
        }
        for (Signature byteArray : signatureArr) {
            byte[] byteArray2 = byteArray.toByteArray();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(byteArray2);
                str = Base64.encodeToString(instance.digest(), 11);
            } catch (NoSuchAlgorithmException unused) {
                str = "";
            }
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                return true;
            }
            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                return true;
            }
        }
        return false;
    }
}
