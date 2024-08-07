package androidx.work;

import android.content.Context;
import z3.c;

/* compiled from: ListenableWorker */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public Context f3756a;

    /* renamed from: b  reason: collision with root package name */
    public WorkerParameters f3757b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f3758c = -256;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3759d;

    /* compiled from: ListenableWorker */
    public static abstract class a {

        /* renamed from: androidx.work.d$a$a  reason: collision with other inner class name */
        /* compiled from: ListenableWorker */
        public static final class C0036a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final c f3760a = c.f3753b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0036a.class != obj.getClass()) {
                    return false;
                }
                return this.f3760a.equals(((C0036a) obj).f3760a);
            }

            public final int hashCode() {
                return this.f3760a.hashCode() + (C0036a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Failure {mOutputData=");
                q10.append(this.f3760a);
                q10.append('}');
                return q10.toString();
            }
        }

        /* compiled from: ListenableWorker */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || b.class != obj.getClass()) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: ListenableWorker */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final c f3761a;

            public c() {
                this(c.f3753b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3761a.equals(((c) obj).f3761a);
            }

            public final int hashCode() {
                return this.f3761a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("Success {mOutputData=");
                q10.append(this.f3761a);
                q10.append('}');
                return q10.toString();
            }

            public c(c cVar) {
                this.f3761a = cVar;
            }
        }
    }

    public d(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f3756a = context;
            this.f3757b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public v8.a<o3.d> a() {
        c cVar = new c();
        cVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public void b() {
    }

    public abstract c c();

    public final void d(int i10) {
        this.f3758c = i10;
        b();
    }
}
