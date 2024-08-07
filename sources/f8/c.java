package f8;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d.x;
import java.util.Objects;

/* compiled from: MaterialBackOrchestrator */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f10046a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10047b;

    /* renamed from: c  reason: collision with root package name */
    public final View f10048c;

    /* compiled from: MaterialBackOrchestrator */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public OnBackInvokedCallback f10049a;

        public OnBackInvokedCallback a(b bVar) {
            Objects.requireNonNull(bVar);
            return new x(bVar, 2);
        }

        public void b(b bVar, View view, boolean z10) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            int i10;
            if (this.f10049a == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback a10 = a(bVar);
                this.f10049a = a10;
                if (z10) {
                    i10 = 1000000;
                } else {
                    i10 = 0;
                }
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i10, a10);
            }
        }

        public void c(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f10049a);
                this.f10049a = null;
            }
        }
    }

    /* compiled from: MaterialBackOrchestrator */
    public static class b extends a {

        /* compiled from: MaterialBackOrchestrator */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f10050a;

            public a(b bVar) {
                this.f10050a = bVar;
            }

            public final void onBackCancelled() {
                boolean z10;
                if (b.this.f10049a != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f10050a.d();
                }
            }

            public final void onBackInvoked() {
                this.f10050a.b();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                boolean z10;
                if (b.this.f10049a != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f10050a.a(new d.b(backEvent));
                }
            }

            public final void onBackStarted(BackEvent backEvent) {
                boolean z10;
                if (b.this.f10049a != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f10050a.c(new d.b(backEvent));
                }
            }
        }

        public final OnBackInvokedCallback a(b bVar) {
            return new a(bVar);
        }
    }

    public <T extends View & b> c(T t10) {
        this((b) t10, t10);
    }

    public final void a(boolean z10) {
        a aVar = this.f10046a;
        if (aVar != null) {
            aVar.b(this.f10047b, this.f10048c, z10);
        }
    }

    public c(b bVar, View view) {
        a aVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            aVar = new b();
        } else {
            aVar = i10 >= 33 ? new a() : null;
        }
        this.f10046a = aVar;
        this.f10047b = bVar;
        this.f10048c = view;
    }
}
