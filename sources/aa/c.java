package aa;

import a7.a;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class c {
    private static final a zza = new a("PhoneAuthProvider", new String[0]);

    public void onCodeAutoRetrievalTimeOut(String str) {
        zza.a("Sms auto retrieval timed-out.", new Object[0]);
    }

    public void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
    }

    public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

    public abstract void onVerificationFailed(FirebaseException firebaseException);
}
