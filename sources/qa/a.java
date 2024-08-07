package qa;

import gl.i;

/* compiled from: MiddleOutFallbackStrategy */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final b[] f14386a;

    /* renamed from: b  reason: collision with root package name */
    public final i f14387b = new i(1024);

    public a(b... bVarArr) {
        this.f14386a = bVarArr;
    }

    public final StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (b bVar : this.f14386a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = bVar.j(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return this.f14387b.j(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
