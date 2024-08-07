package ck;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rj.f;
import sj.b;

/* compiled from: PublishSubject */
public final class a<T> extends b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final C0258a[] f19201c = new C0258a[0];

    /* renamed from: d  reason: collision with root package name */
    public static final C0258a[] f19202d = new C0258a[0];

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<C0258a<T>[]> f19203a = new AtomicReference<>(f19202d);

    /* renamed from: b  reason: collision with root package name */
    public Throwable f19204b;

    /* renamed from: ck.a$a  reason: collision with other inner class name */
    /* compiled from: PublishSubject */
    public static final class C0258a<T> extends AtomicBoolean implements b {

        /* renamed from: a  reason: collision with root package name */
        public final f<? super T> f19205a;

        /* renamed from: b  reason: collision with root package name */
        public final a<T> f19206b;

        public C0258a(f<? super T> fVar, a<T> aVar) {
            this.f19205a = fVar;
            this.f19206b = aVar;
        }

        public final void b() {
            if (compareAndSet(false, true)) {
                this.f19206b.f(this);
            }
        }
    }

    public final void a() {
        C0258a<T>[] aVarArr = this.f19203a.get();
        C0258a<T>[] aVarArr2 = f19201c;
        if (aVarArr != aVarArr2) {
            for (C0258a aVar : (C0258a[]) this.f19203a.getAndSet(aVarArr2)) {
                if (!aVar.get()) {
                    aVar.f19205a.a();
                }
            }
        }
    }

    public final void c(b bVar) {
        if (this.f19203a.get() == f19201c) {
            bVar.b();
        }
    }

    public final void d(T t10) {
        int i10 = zj.a.f23782a;
        if (t10 != null) {
            for (C0258a aVar : (C0258a[]) this.f19203a.get()) {
                if (!aVar.get()) {
                    aVar.f19205a.d(t10);
                }
            }
            return;
        }
        throw new NullPointerException("onNext called with a null value. Null values are generally not allowed in 3.x operators and sources.");
    }

    public final void e(f<? super T> fVar) {
        boolean z10;
        C0258a aVar = new C0258a(fVar, this);
        fVar.c(aVar);
        while (true) {
            C0258a<T>[] aVarArr = (C0258a[]) this.f19203a.get();
            z10 = false;
            if (aVarArr != f19201c) {
                int length = aVarArr.length;
                C0258a[] aVarArr2 = new C0258a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                AtomicReference<C0258a<T>[]> atomicReference = this.f19203a;
                while (true) {
                    if (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                        if (atomicReference.get() != aVarArr) {
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z10) {
            Throwable th2 = this.f19204b;
            if (th2 != null) {
                fVar.onError(th2);
            } else {
                fVar.a();
            }
        } else if (aVar.get()) {
            f(aVar);
        }
    }

    public final void f(C0258a<T> aVar) {
        boolean z10;
        C0258a[] aVarArr;
        do {
            C0258a<T>[] aVarArr2 = (C0258a[]) this.f19203a.get();
            if (aVarArr2 != f19201c && aVarArr2 != f19202d) {
                int length = aVarArr2.length;
                int i10 = -1;
                z10 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (aVarArr2[i11] == aVar) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 >= 0) {
                    if (length == 1) {
                        aVarArr = f19202d;
                    } else {
                        C0258a[] aVarArr3 = new C0258a[(length - 1)];
                        System.arraycopy(aVarArr2, 0, aVarArr3, 0, i10);
                        System.arraycopy(aVarArr2, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                        aVarArr = aVarArr3;
                    }
                    AtomicReference<C0258a<T>[]> atomicReference = this.f19203a;
                    while (true) {
                        if (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                            if (atomicReference.get() != aVarArr2) {
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!z10);
    }

    public final void onError(Throwable th2) {
        int i10 = zj.a.f23782a;
        if (th2 != null) {
            C0258a<T>[] aVarArr = this.f19203a.get();
            C0258a<T>[] aVarArr2 = f19201c;
            if (aVarArr == aVarArr2) {
                bk.a.a(th2);
                return;
            }
            this.f19204b = th2;
            for (C0258a aVar : (C0258a[]) this.f19203a.getAndSet(aVarArr2)) {
                if (aVar.get()) {
                    bk.a.a(th2);
                } else {
                    aVar.f19205a.onError(th2);
                }
            }
            return;
        }
        throw new NullPointerException("onError called with a null Throwable. Null values are generally not allowed in 3.x operators and sources.");
    }
}
