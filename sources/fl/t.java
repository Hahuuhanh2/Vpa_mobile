package fl;

import a.b;
import ek.f;
import p3.l0;

/* compiled from: StackTraceRecovery.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f20262a = 0;

    static {
        Object obj;
        Object obj2;
        Exception exc = new Exception();
        String simpleName = b.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE" + '.' + simpleName, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            obj = Class.forName("kk.a").getCanonicalName();
        } catch (Throwable th2) {
            obj = l0.A(th2);
        }
        if (f.a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = t.class.getCanonicalName();
        } catch (Throwable th3) {
            obj2 = l0.A(th3);
        }
        if (f.a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
