package v9;

import com.google.firebase.FirebaseException;
import s9.a;
import y6.j;

/* compiled from: DefaultAppCheckTokenResult */
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16091a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseException f16092b;

    public c(String str, FirebaseException firebaseException) {
        j.c(str);
        this.f16091a = str;
        this.f16092b = firebaseException;
    }

    public final FirebaseException a() {
        return this.f16092b;
    }

    public final String b() {
        return this.f16091a;
    }
}
