package vj;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;

/* compiled from: Functions */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0312a f23325a = new C0312a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f23326b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f23327c = new c();

    /* renamed from: vj.a$a  reason: collision with other inner class name */
    /* compiled from: Functions */
    public static final class C0312a implements tj.a {
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions */
    public static final class b implements tj.b<Object> {
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions */
    public static final class c implements tj.b<Throwable> {
        public final void accept(Object obj) {
            bk.a.a(new OnErrorNotImplementedException((Throwable) obj));
        }
    }
}
