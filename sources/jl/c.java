package jl;

import al.g0;
import al.l;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import jk.a;

/* compiled from: Tasks.kt */
public final class c {
    public static final Object a(Task task, kk.c cVar) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            } else if (!task.isCanceled()) {
                return task.getResult();
            } else {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
        } else {
            l lVar = new l(1, g0.b0(cVar));
            lVar.t();
            task.addOnCompleteListener((Executor) a.f20802a, new b(lVar));
            Object s10 = lVar.s();
            a aVar = a.COROUTINE_SUSPENDED;
            return s10;
        }
    }
}
