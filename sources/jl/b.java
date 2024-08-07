package jl;

import al.k;
import al.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import okhttp3.Request;
import p3.l0;
import retrofit2.HttpException;
import sk.j;
import ul.d;
import ul.y;

/* compiled from: Tasks.kt */
public final class b implements OnCompleteListener, d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f20803a;

    public /* synthetic */ b(l lVar) {
        this.f20803a = lVar;
    }

    public void a(ul.b bVar, y yVar) {
        j.g(bVar, "call");
        j.g(yVar, "response");
        if (yVar.f23246a.i()) {
            T t10 = yVar.f23247b;
            if (t10 == null) {
                Request i10 = bVar.i();
                Class<ul.j> cls = ul.j.class;
                i10.getClass();
                ul.j cast = cls.cast(i10.f22108e.get(cls));
                if (cast != null) {
                    Method method = cast.f23121a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    j.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    j.b(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    this.f20803a.resumeWith(l0.A(new KotlinNullPointerException(sb2.toString())));
                    return;
                }
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                j.j(j.class.getName(), kotlinNullPointerException);
                throw kotlinNullPointerException;
            }
            this.f20803a.resumeWith(t10);
            return;
        }
        this.f20803a.resumeWith(l0.A(new HttpException(yVar)));
    }

    public void c(ul.b bVar, Throwable th2) {
        j.g(bVar, "call");
        j.g(th2, "t");
        this.f20803a.resumeWith(l0.A(th2));
    }

    public void onComplete(Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            this.f20803a.resumeWith(l0.A(exception));
        } else if (task.isCanceled()) {
            this.f20803a.cancel((Throwable) null);
        } else {
            this.f20803a.resumeWith(task.getResult());
        }
    }
}
