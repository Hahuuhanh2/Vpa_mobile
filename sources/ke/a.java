package ke;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.ArrayList;
import ne.d;
import ve.b;
import xe.i;

/* compiled from: SelectorConfig */
public final class a {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public b U = new b();
    public d V;
    public LocalMediaFolder W;
    public final ArrayList<LocalMedia> X = new ArrayList<>();
    public final ArrayList<LocalMedia> Y = new ArrayList<>();
    public final ArrayList<LocalMediaFolder> Z = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public int f12517a = 1;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList<LocalMedia> f12518a0 = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public String f12519b;

    /* renamed from: c  reason: collision with root package name */
    public String f12520c;

    /* renamed from: d  reason: collision with root package name */
    public String f12521d;

    /* renamed from: e  reason: collision with root package name */
    public String f12522e;

    /* renamed from: f  reason: collision with root package name */
    public int f12523f;

    /* renamed from: g  reason: collision with root package name */
    public int f12524g = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f12525h = 9;

    /* renamed from: i  reason: collision with root package name */
    public int f12526i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f12527j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f12528k = 60;

    /* renamed from: l  reason: collision with root package name */
    public int f12529l = 4;

    /* renamed from: m  reason: collision with root package name */
    public int f12530m = -2;

    /* renamed from: n  reason: collision with root package name */
    public int f12531n = -1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12532o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12533p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12534q = true;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12535r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12536s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12537t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12538u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12539v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f12540w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12541x;

    /* renamed from: y  reason: collision with root package name */
    public String f12542y;

    /* renamed from: z  reason: collision with root package name */
    public String f12543z;

    public a() {
        boolean z10 = false;
        this.f12541x = false;
        this.f12535r = true;
        this.f12536s = true;
        this.f12537t = true;
        this.f12519b = ".jpeg";
        this.f12520c = ".mp4";
        this.f12521d = "image/jpeg";
        this.f12522e = "video/mp4";
        this.f12542y = "";
        this.f12543z = "";
        this.A = "";
        this.f12540w = new ArrayList();
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.H = 60;
        this.I = true;
        this.J = -1;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = !i.a();
        this.f12523f = -1;
        this.O = true;
        this.f12538u = true;
        this.f12539v = this.f12517a != 3 ? true : z10;
        this.P = true;
        new ArrayList();
        this.F = "";
        this.Q = true;
        this.G = "";
        this.R = true;
        this.S = true;
        this.T = true;
    }

    public final int a() {
        return this.X.size();
    }

    public final synchronized ArrayList<LocalMedia> b() {
        return this.X;
    }
}
