package i1;

import java.lang.reflect.Method;

/* compiled from: ActivityRecreator */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f10930a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10931b;

    public d(Object obj, Object obj2) {
        this.f10930a = obj;
        this.f10931b = obj2;
    }

    public final void run() {
        try {
            Method method = e.f10935d;
            if (method != null) {
                method.invoke(this.f10930a, new Object[]{this.f10931b, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            e.f10936e.invoke(this.f10930a, new Object[]{this.f10931b, Boolean.FALSE});
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable unused) {
        }
    }
}
