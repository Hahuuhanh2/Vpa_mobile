package android.hardware.biometrics;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.Context;
import android.content.DialogInterface;
import android.os.CancellationSignal;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public /* synthetic */ class BiometricPrompt {

    public /* synthetic */ class AuthenticationCallback {
        static {
            throw new NoClassDefFoundError();
        }
    }

    public /* synthetic */ class AuthenticationResult {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ CryptoObject getCryptoObject();
    }

    public /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(Context context) {
        }

        @NonNull
        public native /* synthetic */ BiometricPrompt build();

        @NonNull
        public native /* synthetic */ Builder setNegativeButton(@NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener);

        @NonNull
        public native /* synthetic */ Builder setSubtitle(@NonNull CharSequence charSequence);

        @NonNull
        public native /* synthetic */ Builder setTitle(@NonNull CharSequence charSequence);
    }

    public final /* synthetic */ class CryptoObject {
        static {
            throw new NoClassDefFoundError();
        }

        @Deprecated
        public /* synthetic */ CryptoObject(@NonNull IdentityCredential identityCredential) {
        }

        public /* synthetic */ CryptoObject(@NonNull PresentationSession presentationSession) {
        }

        public /* synthetic */ CryptoObject(@NonNull Signature signature) {
        }

        public /* synthetic */ CryptoObject(@NonNull Cipher cipher) {
        }

        public /* synthetic */ CryptoObject(@NonNull Mac mac) {
        }

        public native /* synthetic */ Cipher getCipher();

        public native /* synthetic */ Mac getMac();

        @Nullable
        public native /* synthetic */ PresentationSession getPresentationSession();

        public native /* synthetic */ Signature getSignature();
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ void authenticate(@NonNull CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback);

    public native /* synthetic */ void authenticate(@NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback);
}
