package p1;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* compiled from: FingerprintManagerCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13903a;

    /* compiled from: FingerprintManagerCompat */
    public static class a {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static c f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new c(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new c(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new c(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(c cVar) {
            if (cVar == null) {
                return null;
            }
            if (cVar.f13905b != null) {
                return new FingerprintManager.CryptoObject(cVar.f13905b);
            }
            if (cVar.f13904a != null) {
                return new FingerprintManager.CryptoObject(cVar.f13904a);
            }
            if (cVar.f13906c != null) {
                return new FingerprintManager.CryptoObject(cVar.f13906c);
            }
            return null;
        }
    }

    /* renamed from: p1.b$b  reason: collision with other inner class name */
    /* compiled from: FingerprintManagerCompat */
    public static abstract class C0175b {
    }

    public b(Context context) {
        this.f13903a = context;
    }

    /* compiled from: FingerprintManagerCompat */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f13904a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f13905b;

        /* renamed from: c  reason: collision with root package name */
        public final Mac f13906c;

        public c(Signature signature) {
            this.f13904a = signature;
            this.f13905b = null;
            this.f13906c = null;
        }

        public c(Cipher cipher) {
            this.f13905b = cipher;
            this.f13904a = null;
            this.f13906c = null;
        }

        public c(Mac mac) {
            this.f13906c = mac;
            this.f13905b = null;
            this.f13904a = null;
        }
    }
}
