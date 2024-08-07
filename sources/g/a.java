package g;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.io.Serializable;
import sk.j;

/* compiled from: ActivityResultContract.kt */
public abstract class a<I, O> {

    /* renamed from: g.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResultContract.kt */
    public static final class C0108a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f10213a;

        public C0108a(Serializable serializable) {
            this.f10213a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0108a b(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i10);
}
