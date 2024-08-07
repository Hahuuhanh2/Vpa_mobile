package androidx.fragment.app;

import androidx.lifecycle.i;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f2555a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f2556b;

    /* renamed from: c  reason: collision with root package name */
    public int f2557c;

    /* renamed from: d  reason: collision with root package name */
    public int f2558d;

    /* renamed from: e  reason: collision with root package name */
    public int f2559e;

    /* renamed from: f  reason: collision with root package name */
    public int f2560f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2561g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2562h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f2563i;

    /* renamed from: j  reason: collision with root package name */
    public int f2564j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2565k;

    /* renamed from: l  reason: collision with root package name */
    public int f2566l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2567m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f2568n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f2569o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2570p = false;

    /* compiled from: FragmentTransaction */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2571a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f2572b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2573c;

        /* renamed from: d  reason: collision with root package name */
        public int f2574d;

        /* renamed from: e  reason: collision with root package name */
        public int f2575e;

        /* renamed from: f  reason: collision with root package name */
        public int f2576f;

        /* renamed from: g  reason: collision with root package name */
        public int f2577g;

        /* renamed from: h  reason: collision with root package name */
        public i.b f2578h;

        /* renamed from: i  reason: collision with root package name */
        public i.b f2579i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f2571a = i10;
            this.f2572b = fragment;
            this.f2573c = false;
            i.b bVar = i.b.RESUMED;
            this.f2578h = bVar;
            this.f2579i = bVar;
        }

        public a(int i10, Fragment fragment, int i11) {
            this.f2571a = i10;
            this.f2572b = fragment;
            this.f2573c = true;
            i.b bVar = i.b.RESUMED;
            this.f2578h = bVar;
            this.f2579i = bVar;
        }

        public a(Fragment fragment, i.b bVar) {
            this.f2571a = 10;
            this.f2572b = fragment;
            this.f2573c = false;
            this.f2578h = fragment.T;
            this.f2579i = bVar;
        }
    }

    public final void b(a aVar) {
        this.f2555a.add(aVar);
        aVar.f2574d = this.f2556b;
        aVar.f2575e = this.f2557c;
        aVar.f2576f = this.f2558d;
        aVar.f2577g = this.f2559e;
    }
}
