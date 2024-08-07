package f1;

import android.content.Context;
import android.util.AttributeSet;
import e1.c;
import g1.a;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f9619a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f9620b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f9621c = null;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, a> f9622d;

    public static float g(Number number) {
        if (number instanceof Float) {
            return ((Float) number).floatValue();
        }
        return Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap<String, c> hashMap);

    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.f9619a = dVar.f9619a;
        this.f9620b = dVar.f9620b;
        this.f9621c = dVar.f9621c;
        this.f9622d = dVar.f9622d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }
}
