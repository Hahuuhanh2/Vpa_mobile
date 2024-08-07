package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1938g = {0, 4, 8};

    /* renamed from: h  reason: collision with root package name */
    public static SparseIntArray f1939h = new SparseIntArray();

    /* renamed from: i  reason: collision with root package name */
    public static SparseIntArray f1940i = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f1941a;

    /* renamed from: b  reason: collision with root package name */
    public String f1942b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f1943c = 0;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, g1.a> f1944d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1945e = true;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<Integer, C0016a> f1946f = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    public static class C0016a {

        /* renamed from: a  reason: collision with root package name */
        public int f1947a;

        /* renamed from: b  reason: collision with root package name */
        public String f1948b;

        /* renamed from: c  reason: collision with root package name */
        public final d f1949c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f1950d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f1951e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f1952f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, g1.a> f1953g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public C0017a f1954h;

        /* renamed from: androidx.constraintlayout.widget.a$a$a  reason: collision with other inner class name */
        /* compiled from: ConstraintSet */
        public static class C0017a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1955a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1956b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1957c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1958d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1959e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1960f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1961g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1962h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1963i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1964j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1965k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1966l = 0;

            public final void a(int i10, float f10) {
                int i11 = this.f1960f;
                int[] iArr = this.f1958d;
                if (i11 >= iArr.length) {
                    this.f1958d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1959e;
                    this.f1959e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1958d;
                int i12 = this.f1960f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1959e;
                this.f1960f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f1957c;
                int[] iArr = this.f1955a;
                if (i12 >= iArr.length) {
                    this.f1955a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1956b;
                    this.f1956b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1955a;
                int i13 = this.f1957c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1956b;
                this.f1957c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f1963i;
                int[] iArr = this.f1961g;
                if (i11 >= iArr.length) {
                    this.f1961g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1962h;
                    this.f1962h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1961g;
                int i12 = this.f1963i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1962h;
                this.f1963i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f1966l;
                int[] iArr = this.f1964j;
                if (i11 >= iArr.length) {
                    this.f1964j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1965k;
                    this.f1965k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1964j;
                int i12 = this.f1966l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1965k;
                this.f1966l = i12 + 1;
                zArr2[i12] = z10;
            }

            public final void e(C0016a aVar) {
                for (int i10 = 0; i10 < this.f1957c; i10++) {
                    int i11 = this.f1955a[i10];
                    int i12 = this.f1956b[i10];
                    int[] iArr = a.f1938g;
                    if (i11 == 6) {
                        aVar.f1951e.D = i12;
                    } else if (i11 == 7) {
                        aVar.f1951e.E = i12;
                    } else if (i11 == 8) {
                        aVar.f1951e.K = i12;
                    } else if (i11 == 27) {
                        aVar.f1951e.F = i12;
                    } else if (i11 == 28) {
                        aVar.f1951e.H = i12;
                    } else if (i11 == 41) {
                        aVar.f1951e.W = i12;
                    } else if (i11 == 42) {
                        aVar.f1951e.X = i12;
                    } else if (i11 == 61) {
                        aVar.f1951e.A = i12;
                    } else if (i11 == 62) {
                        aVar.f1951e.B = i12;
                    } else if (i11 == 72) {
                        aVar.f1951e.f1981g0 = i12;
                    } else if (i11 == 73) {
                        aVar.f1951e.f1983h0 = i12;
                    } else if (i11 == 88) {
                        aVar.f1950d.f2022l = i12;
                    } else if (i11 == 89) {
                        aVar.f1950d.f2023m = i12;
                    } else if (i11 == 2) {
                        aVar.f1951e.J = i12;
                    } else if (i11 == 31) {
                        aVar.f1951e.L = i12;
                    } else if (i11 == 34) {
                        aVar.f1951e.I = i12;
                    } else if (i11 == 38) {
                        aVar.f1947a = i12;
                    } else if (i11 == 64) {
                        aVar.f1950d.f2012b = i12;
                    } else if (i11 == 66) {
                        aVar.f1950d.f2016f = i12;
                    } else if (i11 == 76) {
                        aVar.f1950d.f2015e = i12;
                    } else if (i11 == 78) {
                        aVar.f1949c.f2026c = i12;
                    } else if (i11 == 97) {
                        aVar.f1951e.f1999p0 = i12;
                    } else if (i11 == 93) {
                        aVar.f1951e.M = i12;
                    } else if (i11 != 94) {
                        switch (i11) {
                            case 11:
                                aVar.f1951e.Q = i12;
                                break;
                            case 12:
                                aVar.f1951e.R = i12;
                                break;
                            case 13:
                                aVar.f1951e.N = i12;
                                break;
                            case 14:
                                aVar.f1951e.P = i12;
                                break;
                            case 15:
                                aVar.f1951e.S = i12;
                                break;
                            case 16:
                                aVar.f1951e.O = i12;
                                break;
                            case 17:
                                aVar.f1951e.f1976e = i12;
                                break;
                            case 18:
                                aVar.f1951e.f1978f = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 21:
                                        aVar.f1951e.f1974d = i12;
                                        break;
                                    case 22:
                                        aVar.f1949c.f2025b = i12;
                                        break;
                                    case 23:
                                        aVar.f1951e.f1972c = i12;
                                        break;
                                    case 24:
                                        aVar.f1951e.G = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 54:
                                                aVar.f1951e.Y = i12;
                                                break;
                                            case 55:
                                                aVar.f1951e.Z = i12;
                                                break;
                                            case 56:
                                                aVar.f1951e.f1969a0 = i12;
                                                break;
                                            case 57:
                                                aVar.f1951e.f1971b0 = i12;
                                                break;
                                            case 58:
                                                aVar.f1951e.f1973c0 = i12;
                                                break;
                                            case 59:
                                                aVar.f1951e.f1975d0 = i12;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 82:
                                                        aVar.f1950d.f2013c = i12;
                                                        break;
                                                    case 83:
                                                        aVar.f1952f.f2038i = i12;
                                                        break;
                                                    case 84:
                                                        aVar.f1950d.f2020j = i12;
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        aVar.f1951e.T = i12;
                    }
                }
                for (int i13 = 0; i13 < this.f1960f; i13++) {
                    int i14 = this.f1958d[i13];
                    float f10 = this.f1959e[i13];
                    int[] iArr2 = a.f1938g;
                    if (i14 == 19) {
                        aVar.f1951e.f1980g = f10;
                    } else if (i14 == 20) {
                        aVar.f1951e.f2007x = f10;
                    } else if (i14 == 37) {
                        aVar.f1951e.f2008y = f10;
                    } else if (i14 == 60) {
                        aVar.f1952f.f2031b = f10;
                    } else if (i14 == 63) {
                        aVar.f1951e.C = f10;
                    } else if (i14 == 79) {
                        aVar.f1950d.f2017g = f10;
                    } else if (i14 == 85) {
                        aVar.f1950d.f2019i = f10;
                    } else if (i14 == 39) {
                        aVar.f1951e.V = f10;
                    } else if (i14 != 40) {
                        switch (i14) {
                            case 43:
                                aVar.f1949c.f2027d = f10;
                                break;
                            case 44:
                                e eVar = aVar.f1952f;
                                eVar.f2043n = f10;
                                eVar.f2042m = true;
                                break;
                            case 45:
                                aVar.f1952f.f2032c = f10;
                                break;
                            case 46:
                                aVar.f1952f.f2033d = f10;
                                break;
                            case 47:
                                aVar.f1952f.f2034e = f10;
                                break;
                            case 48:
                                aVar.f1952f.f2035f = f10;
                                break;
                            case 49:
                                aVar.f1952f.f2036g = f10;
                                break;
                            case 50:
                                aVar.f1952f.f2037h = f10;
                                break;
                            case 51:
                                aVar.f1952f.f2039j = f10;
                                break;
                            case 52:
                                aVar.f1952f.f2040k = f10;
                                break;
                            case 53:
                                aVar.f1952f.f2041l = f10;
                                break;
                            default:
                                switch (i14) {
                                    case 67:
                                        aVar.f1950d.f2018h = f10;
                                        break;
                                    case 68:
                                        aVar.f1949c.f2028e = f10;
                                        break;
                                    case 69:
                                        aVar.f1951e.f1977e0 = f10;
                                        break;
                                    case 70:
                                        aVar.f1951e.f1979f0 = f10;
                                        break;
                                }
                        }
                    } else {
                        aVar.f1951e.U = f10;
                    }
                }
                for (int i15 = 0; i15 < this.f1963i; i15++) {
                    int i16 = this.f1961g[i15];
                    String str = this.f1962h[i15];
                    int[] iArr3 = a.f1938g;
                    if (i16 == 5) {
                        aVar.f1951e.f2009z = str;
                    } else if (i16 == 65) {
                        aVar.f1950d.f2014d = str;
                    } else if (i16 == 74) {
                        b bVar = aVar.f1951e;
                        bVar.f1989k0 = str;
                        bVar.f1987j0 = null;
                    } else if (i16 == 77) {
                        aVar.f1951e.f1991l0 = str;
                    } else if (i16 == 90) {
                        aVar.f1950d.f2021k = str;
                    }
                }
                for (int i17 = 0; i17 < this.f1966l; i17++) {
                    int i18 = this.f1964j[i17];
                    boolean z10 = this.f1965k[i17];
                    int[] iArr4 = a.f1938g;
                    if (i18 == 44) {
                        aVar.f1952f.f2042m = z10;
                    } else if (i18 == 75) {
                        aVar.f1951e.f1997o0 = z10;
                    } else if (i18 == 80) {
                        aVar.f1951e.f1993m0 = z10;
                    } else if (i18 == 81) {
                        aVar.f1951e.f1995n0 = z10;
                    }
                }
            }
        }

        public final void a(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f1951e;
            layoutParams.f1874e = bVar.f1984i;
            layoutParams.f1876f = bVar.f1986j;
            layoutParams.f1878g = bVar.f1988k;
            layoutParams.f1880h = bVar.f1990l;
            layoutParams.f1882i = bVar.f1992m;
            layoutParams.f1884j = bVar.f1994n;
            layoutParams.f1886k = bVar.f1996o;
            layoutParams.f1888l = bVar.f1998p;
            layoutParams.f1890m = bVar.f2000q;
            layoutParams.f1892n = bVar.f2001r;
            layoutParams.f1894o = bVar.f2002s;
            layoutParams.f1901s = bVar.f2003t;
            layoutParams.f1902t = bVar.f2004u;
            layoutParams.f1903u = bVar.f2005v;
            layoutParams.f1904v = bVar.f2006w;
            layoutParams.leftMargin = bVar.G;
            layoutParams.rightMargin = bVar.H;
            layoutParams.topMargin = bVar.I;
            layoutParams.bottomMargin = bVar.J;
            layoutParams.A = bVar.S;
            layoutParams.B = bVar.R;
            layoutParams.f1906x = bVar.O;
            layoutParams.f1908z = bVar.Q;
            layoutParams.E = bVar.f2007x;
            layoutParams.F = bVar.f2008y;
            layoutParams.f1896p = bVar.A;
            layoutParams.f1898q = bVar.B;
            layoutParams.f1900r = bVar.C;
            layoutParams.G = bVar.f2009z;
            layoutParams.T = bVar.D;
            layoutParams.U = bVar.E;
            layoutParams.I = bVar.U;
            layoutParams.H = bVar.V;
            layoutParams.K = bVar.X;
            layoutParams.J = bVar.W;
            layoutParams.W = bVar.f1993m0;
            layoutParams.X = bVar.f1995n0;
            layoutParams.L = bVar.Y;
            layoutParams.M = bVar.Z;
            layoutParams.P = bVar.f1969a0;
            layoutParams.Q = bVar.f1971b0;
            layoutParams.N = bVar.f1973c0;
            layoutParams.O = bVar.f1975d0;
            layoutParams.R = bVar.f1977e0;
            layoutParams.S = bVar.f1979f0;
            layoutParams.V = bVar.F;
            layoutParams.f1870c = bVar.f1980g;
            layoutParams.f1866a = bVar.f1976e;
            layoutParams.f1868b = bVar.f1978f;
            layoutParams.width = bVar.f1972c;
            layoutParams.height = bVar.f1974d;
            String str = bVar.f1991l0;
            if (str != null) {
                layoutParams.Y = str;
            }
            layoutParams.Z = bVar.f1999p0;
            layoutParams.setMarginStart(bVar.L);
            layoutParams.setMarginEnd(this.f1951e.K);
            layoutParams.a();
        }

        /* renamed from: b */
        public final C0016a clone() {
            C0016a aVar = new C0016a();
            aVar.f1951e.a(this.f1951e);
            aVar.f1950d.a(this.f1950d);
            d dVar = aVar.f1949c;
            d dVar2 = this.f1949c;
            dVar.getClass();
            dVar.f2024a = dVar2.f2024a;
            dVar.f2025b = dVar2.f2025b;
            dVar.f2027d = dVar2.f2027d;
            dVar.f2028e = dVar2.f2028e;
            dVar.f2026c = dVar2.f2026c;
            aVar.f1952f.a(this.f1952f);
            aVar.f1947a = this.f1947a;
            aVar.f1954h = this.f1954h;
            return aVar;
        }

        public final void c(int i10, ConstraintLayout.LayoutParams layoutParams) {
            this.f1947a = i10;
            b bVar = this.f1951e;
            bVar.f1984i = layoutParams.f1874e;
            bVar.f1986j = layoutParams.f1876f;
            bVar.f1988k = layoutParams.f1878g;
            bVar.f1990l = layoutParams.f1880h;
            bVar.f1992m = layoutParams.f1882i;
            bVar.f1994n = layoutParams.f1884j;
            bVar.f1996o = layoutParams.f1886k;
            bVar.f1998p = layoutParams.f1888l;
            bVar.f2000q = layoutParams.f1890m;
            bVar.f2001r = layoutParams.f1892n;
            bVar.f2002s = layoutParams.f1894o;
            bVar.f2003t = layoutParams.f1901s;
            bVar.f2004u = layoutParams.f1902t;
            bVar.f2005v = layoutParams.f1903u;
            bVar.f2006w = layoutParams.f1904v;
            bVar.f2007x = layoutParams.E;
            bVar.f2008y = layoutParams.F;
            bVar.f2009z = layoutParams.G;
            bVar.A = layoutParams.f1896p;
            bVar.B = layoutParams.f1898q;
            bVar.C = layoutParams.f1900r;
            bVar.D = layoutParams.T;
            bVar.E = layoutParams.U;
            bVar.F = layoutParams.V;
            bVar.f1980g = layoutParams.f1870c;
            bVar.f1976e = layoutParams.f1866a;
            bVar.f1978f = layoutParams.f1868b;
            bVar.f1972c = layoutParams.width;
            bVar.f1974d = layoutParams.height;
            bVar.G = layoutParams.leftMargin;
            bVar.H = layoutParams.rightMargin;
            bVar.I = layoutParams.topMargin;
            bVar.J = layoutParams.bottomMargin;
            bVar.M = layoutParams.D;
            bVar.U = layoutParams.I;
            bVar.V = layoutParams.H;
            bVar.X = layoutParams.K;
            bVar.W = layoutParams.J;
            bVar.f1993m0 = layoutParams.W;
            bVar.f1995n0 = layoutParams.X;
            bVar.Y = layoutParams.L;
            bVar.Z = layoutParams.M;
            bVar.f1969a0 = layoutParams.P;
            bVar.f1971b0 = layoutParams.Q;
            bVar.f1973c0 = layoutParams.N;
            bVar.f1975d0 = layoutParams.O;
            bVar.f1977e0 = layoutParams.R;
            bVar.f1979f0 = layoutParams.S;
            bVar.f1991l0 = layoutParams.Y;
            bVar.O = layoutParams.f1906x;
            bVar.Q = layoutParams.f1908z;
            bVar.N = layoutParams.f1905w;
            bVar.P = layoutParams.f1907y;
            bVar.S = layoutParams.A;
            bVar.R = layoutParams.B;
            bVar.T = layoutParams.C;
            bVar.f1999p0 = layoutParams.Z;
            bVar.K = layoutParams.getMarginEnd();
            this.f1951e.L = layoutParams.getMarginStart();
        }

        public final void d(int i10, Constraints.LayoutParams layoutParams) {
            c(i10, layoutParams);
            this.f1949c.f2027d = layoutParams.f1919r0;
            e eVar = this.f1952f;
            eVar.f2031b = layoutParams.f1922u0;
            eVar.f2032c = layoutParams.f1923v0;
            eVar.f2033d = layoutParams.f1924w0;
            eVar.f2034e = layoutParams.f1925x0;
            eVar.f2035f = layoutParams.f1926y0;
            eVar.f2036g = layoutParams.f1927z0;
            eVar.f2037h = layoutParams.A0;
            eVar.f2039j = layoutParams.B0;
            eVar.f2040k = layoutParams.C0;
            eVar.f2041l = layoutParams.D0;
            eVar.f2043n = layoutParams.f1921t0;
            eVar.f2042m = layoutParams.f1920s0;
        }
    }

    /* compiled from: ConstraintSet */
    public static class b {

        /* renamed from: q0  reason: collision with root package name */
        public static SparseIntArray f1967q0;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1968a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1969a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1970b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f1971b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1972c;

        /* renamed from: c0  reason: collision with root package name */
        public int f1973c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1974d;

        /* renamed from: d0  reason: collision with root package name */
        public int f1975d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1976e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public float f1977e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public int f1978f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f1979f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1980g = -1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f1981g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1982h = true;

        /* renamed from: h0  reason: collision with root package name */
        public int f1983h0 = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1984i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1985i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1986j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f1987j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1988k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f1989k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1990l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f1991l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1992m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1993m0 = false;

        /* renamed from: n  reason: collision with root package name */
        public int f1994n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1995n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f1996o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1997o0 = true;

        /* renamed from: p  reason: collision with root package name */
        public int f1998p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public int f1999p0 = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f2000q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f2001r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f2002s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f2003t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f2004u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f2005v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f2006w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f2007x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f2008y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f2009z = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1967q0 = sparseIntArray;
            sparseIntArray.append(R$styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            f1967q0.append(R$styleable.Layout_layout_constraintLeft_toRightOf, 25);
            f1967q0.append(R$styleable.Layout_layout_constraintRight_toLeftOf, 28);
            f1967q0.append(R$styleable.Layout_layout_constraintRight_toRightOf, 29);
            f1967q0.append(R$styleable.Layout_layout_constraintTop_toTopOf, 35);
            f1967q0.append(R$styleable.Layout_layout_constraintTop_toBottomOf, 34);
            f1967q0.append(R$styleable.Layout_layout_constraintBottom_toTopOf, 4);
            f1967q0.append(R$styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            f1967q0.append(R$styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f1967q0.append(R$styleable.Layout_layout_editor_absoluteX, 6);
            f1967q0.append(R$styleable.Layout_layout_editor_absoluteY, 7);
            f1967q0.append(R$styleable.Layout_layout_constraintGuide_begin, 17);
            f1967q0.append(R$styleable.Layout_layout_constraintGuide_end, 18);
            f1967q0.append(R$styleable.Layout_layout_constraintGuide_percent, 19);
            f1967q0.append(R$styleable.Layout_guidelineUseRtl, 90);
            f1967q0.append(R$styleable.Layout_android_orientation, 26);
            f1967q0.append(R$styleable.Layout_layout_constraintStart_toEndOf, 31);
            f1967q0.append(R$styleable.Layout_layout_constraintStart_toStartOf, 32);
            f1967q0.append(R$styleable.Layout_layout_constraintEnd_toStartOf, 10);
            f1967q0.append(R$styleable.Layout_layout_constraintEnd_toEndOf, 9);
            f1967q0.append(R$styleable.Layout_layout_goneMarginLeft, 13);
            f1967q0.append(R$styleable.Layout_layout_goneMarginTop, 16);
            f1967q0.append(R$styleable.Layout_layout_goneMarginRight, 14);
            f1967q0.append(R$styleable.Layout_layout_goneMarginBottom, 11);
            f1967q0.append(R$styleable.Layout_layout_goneMarginStart, 15);
            f1967q0.append(R$styleable.Layout_layout_goneMarginEnd, 12);
            f1967q0.append(R$styleable.Layout_layout_constraintVertical_weight, 38);
            f1967q0.append(R$styleable.Layout_layout_constraintHorizontal_weight, 37);
            f1967q0.append(R$styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            f1967q0.append(R$styleable.Layout_layout_constraintVertical_chainStyle, 40);
            f1967q0.append(R$styleable.Layout_layout_constraintHorizontal_bias, 20);
            f1967q0.append(R$styleable.Layout_layout_constraintVertical_bias, 36);
            f1967q0.append(R$styleable.Layout_layout_constraintDimensionRatio, 5);
            f1967q0.append(R$styleable.Layout_layout_constraintLeft_creator, 91);
            f1967q0.append(R$styleable.Layout_layout_constraintTop_creator, 91);
            f1967q0.append(R$styleable.Layout_layout_constraintRight_creator, 91);
            f1967q0.append(R$styleable.Layout_layout_constraintBottom_creator, 91);
            f1967q0.append(R$styleable.Layout_layout_constraintBaseline_creator, 91);
            f1967q0.append(R$styleable.Layout_android_layout_marginLeft, 23);
            f1967q0.append(R$styleable.Layout_android_layout_marginRight, 27);
            f1967q0.append(R$styleable.Layout_android_layout_marginStart, 30);
            f1967q0.append(R$styleable.Layout_android_layout_marginEnd, 8);
            f1967q0.append(R$styleable.Layout_android_layout_marginTop, 33);
            f1967q0.append(R$styleable.Layout_android_layout_marginBottom, 2);
            f1967q0.append(R$styleable.Layout_android_layout_width, 22);
            f1967q0.append(R$styleable.Layout_android_layout_height, 21);
            f1967q0.append(R$styleable.Layout_layout_constraintWidth, 41);
            f1967q0.append(R$styleable.Layout_layout_constraintHeight, 42);
            f1967q0.append(R$styleable.Layout_layout_constrainedWidth, 41);
            f1967q0.append(R$styleable.Layout_layout_constrainedHeight, 42);
            f1967q0.append(R$styleable.Layout_layout_wrapBehaviorInParent, 76);
            f1967q0.append(R$styleable.Layout_layout_constraintCircle, 61);
            f1967q0.append(R$styleable.Layout_layout_constraintCircleRadius, 62);
            f1967q0.append(R$styleable.Layout_layout_constraintCircleAngle, 63);
            f1967q0.append(R$styleable.Layout_layout_constraintWidth_percent, 69);
            f1967q0.append(R$styleable.Layout_layout_constraintHeight_percent, 70);
            f1967q0.append(R$styleable.Layout_chainUseRtl, 71);
            f1967q0.append(R$styleable.Layout_barrierDirection, 72);
            f1967q0.append(R$styleable.Layout_barrierMargin, 73);
            f1967q0.append(R$styleable.Layout_constraint_referenced_ids, 74);
            f1967q0.append(R$styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public final void a(b bVar) {
            this.f1968a = bVar.f1968a;
            this.f1972c = bVar.f1972c;
            this.f1970b = bVar.f1970b;
            this.f1974d = bVar.f1974d;
            this.f1976e = bVar.f1976e;
            this.f1978f = bVar.f1978f;
            this.f1980g = bVar.f1980g;
            this.f1982h = bVar.f1982h;
            this.f1984i = bVar.f1984i;
            this.f1986j = bVar.f1986j;
            this.f1988k = bVar.f1988k;
            this.f1990l = bVar.f1990l;
            this.f1992m = bVar.f1992m;
            this.f1994n = bVar.f1994n;
            this.f1996o = bVar.f1996o;
            this.f1998p = bVar.f1998p;
            this.f2000q = bVar.f2000q;
            this.f2001r = bVar.f2001r;
            this.f2002s = bVar.f2002s;
            this.f2003t = bVar.f2003t;
            this.f2004u = bVar.f2004u;
            this.f2005v = bVar.f2005v;
            this.f2006w = bVar.f2006w;
            this.f2007x = bVar.f2007x;
            this.f2008y = bVar.f2008y;
            this.f2009z = bVar.f2009z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1969a0 = bVar.f1969a0;
            this.f1971b0 = bVar.f1971b0;
            this.f1973c0 = bVar.f1973c0;
            this.f1975d0 = bVar.f1975d0;
            this.f1977e0 = bVar.f1977e0;
            this.f1979f0 = bVar.f1979f0;
            this.f1981g0 = bVar.f1981g0;
            this.f1983h0 = bVar.f1983h0;
            this.f1985i0 = bVar.f1985i0;
            this.f1991l0 = bVar.f1991l0;
            int[] iArr = bVar.f1987j0;
            if (iArr == null || bVar.f1989k0 != null) {
                this.f1987j0 = null;
            } else {
                this.f1987j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1989k0 = bVar.f1989k0;
            this.f1993m0 = bVar.f1993m0;
            this.f1995n0 = bVar.f1995n0;
            this.f1997o0 = bVar.f1997o0;
            this.f1999p0 = bVar.f1999p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Layout);
            this.f1970b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1967q0.get(index);
                switch (i11) {
                    case 1:
                        this.f2000q = a.l(obtainStyledAttributes, index, this.f2000q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.f1998p = a.l(obtainStyledAttributes, index, this.f1998p);
                        break;
                    case 4:
                        this.f1996o = a.l(obtainStyledAttributes, index, this.f1996o);
                        break;
                    case 5:
                        this.f2009z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.f2006w = a.l(obtainStyledAttributes, index, this.f2006w);
                        break;
                    case 10:
                        this.f2005v = a.l(obtainStyledAttributes, index, this.f2005v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f1976e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1976e);
                        break;
                    case 18:
                        this.f1978f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1978f);
                        break;
                    case 19:
                        this.f1980g = obtainStyledAttributes.getFloat(index, this.f1980g);
                        break;
                    case 20:
                        this.f2007x = obtainStyledAttributes.getFloat(index, this.f2007x);
                        break;
                    case 21:
                        this.f1974d = obtainStyledAttributes.getLayoutDimension(index, this.f1974d);
                        break;
                    case 22:
                        this.f1972c = obtainStyledAttributes.getLayoutDimension(index, this.f1972c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.f1984i = a.l(obtainStyledAttributes, index, this.f1984i);
                        break;
                    case 25:
                        this.f1986j = a.l(obtainStyledAttributes, index, this.f1986j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.f1988k = a.l(obtainStyledAttributes, index, this.f1988k);
                        break;
                    case 29:
                        this.f1990l = a.l(obtainStyledAttributes, index, this.f1990l);
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.f2003t = a.l(obtainStyledAttributes, index, this.f2003t);
                        break;
                    case 32:
                        this.f2004u = a.l(obtainStyledAttributes, index, this.f2004u);
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.f1994n = a.l(obtainStyledAttributes, index, this.f1994n);
                        break;
                    case 35:
                        this.f1992m = a.l(obtainStyledAttributes, index, this.f1992m);
                        break;
                    case 36:
                        this.f2008y = obtainStyledAttributes.getFloat(index, this.f2008y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        a.m(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        a.m(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.A = a.l(obtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1977e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1979f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f1981g0 = obtainStyledAttributes.getInt(index, this.f1981g0);
                                        break;
                                    case 73:
                                        this.f1983h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1983h0);
                                        break;
                                    case 74:
                                        this.f1989k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1997o0 = obtainStyledAttributes.getBoolean(index, this.f1997o0);
                                        break;
                                    case 76:
                                        this.f1999p0 = obtainStyledAttributes.getInt(index, this.f1999p0);
                                        break;
                                    case 77:
                                        this.f2001r = a.l(obtainStyledAttributes, index, this.f2001r);
                                        break;
                                    case 78:
                                        this.f2002s = a.l(obtainStyledAttributes, index, this.f2002s);
                                        break;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.f1971b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1971b0);
                                        break;
                                    case 84:
                                        this.f1969a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1969a0);
                                        break;
                                    case 85:
                                        this.f1975d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1975d0);
                                        break;
                                    case 86:
                                        this.f1973c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1973c0);
                                        break;
                                    case 87:
                                        this.f1993m0 = obtainStyledAttributes.getBoolean(index, this.f1993m0);
                                        break;
                                    case 88:
                                        this.f1995n0 = obtainStyledAttributes.getBoolean(index, this.f1995n0);
                                        break;
                                    case 89:
                                        this.f1991l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1982h = obtainStyledAttributes.getBoolean(index, this.f1982h);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        f1967q0.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        f1967q0.get(index);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class c {

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f2010n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2011a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2012b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f2013c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f2014d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f2015e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2016f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f2017g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2018h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f2019i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public int f2020j = -1;

        /* renamed from: k  reason: collision with root package name */
        public String f2021k = null;

        /* renamed from: l  reason: collision with root package name */
        public int f2022l = -3;

        /* renamed from: m  reason: collision with root package name */
        public int f2023m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2010n = sparseIntArray;
            sparseIntArray.append(R$styleable.Motion_motionPathRotate, 1);
            f2010n.append(R$styleable.Motion_pathMotionArc, 2);
            f2010n.append(R$styleable.Motion_transitionEasing, 3);
            f2010n.append(R$styleable.Motion_drawPath, 4);
            f2010n.append(R$styleable.Motion_animateRelativeTo, 5);
            f2010n.append(R$styleable.Motion_animateCircleAngleTo, 6);
            f2010n.append(R$styleable.Motion_motionStagger, 7);
            f2010n.append(R$styleable.Motion_quantizeMotionSteps, 8);
            f2010n.append(R$styleable.Motion_quantizeMotionPhase, 9);
            f2010n.append(R$styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public final void a(c cVar) {
            this.f2011a = cVar.f2011a;
            this.f2012b = cVar.f2012b;
            this.f2014d = cVar.f2014d;
            this.f2015e = cVar.f2015e;
            this.f2016f = cVar.f2016f;
            this.f2018h = cVar.f2018h;
            this.f2017g = cVar.f2017g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Motion);
            this.f2011a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2010n.get(index)) {
                    case 1:
                        this.f2018h = obtainStyledAttributes.getFloat(index, this.f2018h);
                        break;
                    case 2:
                        this.f2015e = obtainStyledAttributes.getInt(index, this.f2015e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f2014d = b1.c.f3899c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f2014d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f2016f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2012b = a.l(obtainStyledAttributes, index, this.f2012b);
                        break;
                    case 6:
                        this.f2013c = obtainStyledAttributes.getInteger(index, this.f2013c);
                        break;
                    case 7:
                        this.f2017g = obtainStyledAttributes.getFloat(index, this.f2017g);
                        break;
                    case 8:
                        this.f2020j = obtainStyledAttributes.getInteger(index, this.f2020j);
                        break;
                    case 9:
                        this.f2019i = obtainStyledAttributes.getFloat(index, this.f2019i);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f2022l = obtainStyledAttributes.getInteger(index, this.f2023m);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f2021k = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f2022l = -1;
                                    break;
                                } else {
                                    this.f2023m = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f2022l = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2023m = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f2022l = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2024a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2025b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2026c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2027d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2028e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PropertySet);
            this.f2024a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.PropertySet_android_alpha) {
                    this.f2027d = obtainStyledAttributes.getFloat(index, this.f2027d);
                } else if (index == R$styleable.PropertySet_android_visibility) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f2025b);
                    this.f2025b = i11;
                    this.f2025b = a.f1938g[i11];
                } else if (index == R$styleable.PropertySet_visibilityMode) {
                    this.f2026c = obtainStyledAttributes.getInt(index, this.f2026c);
                } else if (index == R$styleable.PropertySet_motionProgress) {
                    this.f2028e = obtainStyledAttributes.getFloat(index, this.f2028e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f2029o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2030a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2031b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f2032c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2033d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2034e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2035f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2036g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2037h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f2038i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2039j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2040k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2041l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2042m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f2043n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2029o = sparseIntArray;
            sparseIntArray.append(R$styleable.Transform_android_rotation, 1);
            f2029o.append(R$styleable.Transform_android_rotationX, 2);
            f2029o.append(R$styleable.Transform_android_rotationY, 3);
            f2029o.append(R$styleable.Transform_android_scaleX, 4);
            f2029o.append(R$styleable.Transform_android_scaleY, 5);
            f2029o.append(R$styleable.Transform_android_transformPivotX, 6);
            f2029o.append(R$styleable.Transform_android_transformPivotY, 7);
            f2029o.append(R$styleable.Transform_android_translationX, 8);
            f2029o.append(R$styleable.Transform_android_translationY, 9);
            f2029o.append(R$styleable.Transform_android_translationZ, 10);
            f2029o.append(R$styleable.Transform_android_elevation, 11);
            f2029o.append(R$styleable.Transform_transformPivotTarget, 12);
        }

        public final void a(e eVar) {
            this.f2030a = eVar.f2030a;
            this.f2031b = eVar.f2031b;
            this.f2032c = eVar.f2032c;
            this.f2033d = eVar.f2033d;
            this.f2034e = eVar.f2034e;
            this.f2035f = eVar.f2035f;
            this.f2036g = eVar.f2036g;
            this.f2037h = eVar.f2037h;
            this.f2038i = eVar.f2038i;
            this.f2039j = eVar.f2039j;
            this.f2040k = eVar.f2040k;
            this.f2041l = eVar.f2041l;
            this.f2042m = eVar.f2042m;
            this.f2043n = eVar.f2043n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Transform);
            this.f2030a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2029o.get(index)) {
                    case 1:
                        this.f2031b = obtainStyledAttributes.getFloat(index, this.f2031b);
                        break;
                    case 2:
                        this.f2032c = obtainStyledAttributes.getFloat(index, this.f2032c);
                        break;
                    case 3:
                        this.f2033d = obtainStyledAttributes.getFloat(index, this.f2033d);
                        break;
                    case 4:
                        this.f2034e = obtainStyledAttributes.getFloat(index, this.f2034e);
                        break;
                    case 5:
                        this.f2035f = obtainStyledAttributes.getFloat(index, this.f2035f);
                        break;
                    case 6:
                        this.f2036g = obtainStyledAttributes.getDimension(index, this.f2036g);
                        break;
                    case 7:
                        this.f2037h = obtainStyledAttributes.getDimension(index, this.f2037h);
                        break;
                    case 8:
                        this.f2039j = obtainStyledAttributes.getDimension(index, this.f2039j);
                        break;
                    case 9:
                        this.f2040k = obtainStyledAttributes.getDimension(index, this.f2040k);
                        break;
                    case 10:
                        this.f2041l = obtainStyledAttributes.getDimension(index, this.f2041l);
                        break;
                    case 11:
                        this.f2042m = true;
                        this.f2043n = obtainStyledAttributes.getDimension(index, this.f2043n);
                        break;
                    case 12:
                        this.f2038i = a.l(obtainStyledAttributes, index, this.f2038i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1939h.append(R$styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        f1939h.append(R$styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        f1939h.append(R$styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        f1939h.append(R$styleable.Constraint_layout_constraintRight_toRightOf, 30);
        f1939h.append(R$styleable.Constraint_layout_constraintTop_toTopOf, 36);
        f1939h.append(R$styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        f1939h.append(R$styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        f1939h.append(R$styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        f1939h.append(R$styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f1939h.append(R$styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        f1939h.append(R$styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f1939h.append(R$styleable.Constraint_layout_editor_absoluteX, 6);
        f1939h.append(R$styleable.Constraint_layout_editor_absoluteY, 7);
        f1939h.append(R$styleable.Constraint_layout_constraintGuide_begin, 17);
        f1939h.append(R$styleable.Constraint_layout_constraintGuide_end, 18);
        f1939h.append(R$styleable.Constraint_layout_constraintGuide_percent, 19);
        f1939h.append(R$styleable.Constraint_guidelineUseRtl, 99);
        f1939h.append(R$styleable.Constraint_android_orientation, 27);
        f1939h.append(R$styleable.Constraint_layout_constraintStart_toEndOf, 32);
        f1939h.append(R$styleable.Constraint_layout_constraintStart_toStartOf, 33);
        f1939h.append(R$styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        f1939h.append(R$styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        f1939h.append(R$styleable.Constraint_layout_goneMarginLeft, 13);
        f1939h.append(R$styleable.Constraint_layout_goneMarginTop, 16);
        f1939h.append(R$styleable.Constraint_layout_goneMarginRight, 14);
        f1939h.append(R$styleable.Constraint_layout_goneMarginBottom, 11);
        f1939h.append(R$styleable.Constraint_layout_goneMarginStart, 15);
        f1939h.append(R$styleable.Constraint_layout_goneMarginEnd, 12);
        f1939h.append(R$styleable.Constraint_layout_constraintVertical_weight, 40);
        f1939h.append(R$styleable.Constraint_layout_constraintHorizontal_weight, 39);
        f1939h.append(R$styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f1939h.append(R$styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        f1939h.append(R$styleable.Constraint_layout_constraintHorizontal_bias, 20);
        f1939h.append(R$styleable.Constraint_layout_constraintVertical_bias, 37);
        f1939h.append(R$styleable.Constraint_layout_constraintDimensionRatio, 5);
        f1939h.append(R$styleable.Constraint_layout_constraintLeft_creator, 87);
        f1939h.append(R$styleable.Constraint_layout_constraintTop_creator, 87);
        f1939h.append(R$styleable.Constraint_layout_constraintRight_creator, 87);
        f1939h.append(R$styleable.Constraint_layout_constraintBottom_creator, 87);
        f1939h.append(R$styleable.Constraint_layout_constraintBaseline_creator, 87);
        f1939h.append(R$styleable.Constraint_android_layout_marginLeft, 24);
        f1939h.append(R$styleable.Constraint_android_layout_marginRight, 28);
        f1939h.append(R$styleable.Constraint_android_layout_marginStart, 31);
        f1939h.append(R$styleable.Constraint_android_layout_marginEnd, 8);
        f1939h.append(R$styleable.Constraint_android_layout_marginTop, 34);
        f1939h.append(R$styleable.Constraint_android_layout_marginBottom, 2);
        f1939h.append(R$styleable.Constraint_android_layout_width, 23);
        f1939h.append(R$styleable.Constraint_android_layout_height, 21);
        f1939h.append(R$styleable.Constraint_layout_constraintWidth, 95);
        f1939h.append(R$styleable.Constraint_layout_constraintHeight, 96);
        f1939h.append(R$styleable.Constraint_android_visibility, 22);
        f1939h.append(R$styleable.Constraint_android_alpha, 43);
        f1939h.append(R$styleable.Constraint_android_elevation, 44);
        f1939h.append(R$styleable.Constraint_android_rotationX, 45);
        f1939h.append(R$styleable.Constraint_android_rotationY, 46);
        f1939h.append(R$styleable.Constraint_android_rotation, 60);
        f1939h.append(R$styleable.Constraint_android_scaleX, 47);
        f1939h.append(R$styleable.Constraint_android_scaleY, 48);
        f1939h.append(R$styleable.Constraint_android_transformPivotX, 49);
        f1939h.append(R$styleable.Constraint_android_transformPivotY, 50);
        f1939h.append(R$styleable.Constraint_android_translationX, 51);
        f1939h.append(R$styleable.Constraint_android_translationY, 52);
        f1939h.append(R$styleable.Constraint_android_translationZ, 53);
        f1939h.append(R$styleable.Constraint_layout_constraintWidth_default, 54);
        f1939h.append(R$styleable.Constraint_layout_constraintHeight_default, 55);
        f1939h.append(R$styleable.Constraint_layout_constraintWidth_max, 56);
        f1939h.append(R$styleable.Constraint_layout_constraintHeight_max, 57);
        f1939h.append(R$styleable.Constraint_layout_constraintWidth_min, 58);
        f1939h.append(R$styleable.Constraint_layout_constraintHeight_min, 59);
        f1939h.append(R$styleable.Constraint_layout_constraintCircle, 61);
        f1939h.append(R$styleable.Constraint_layout_constraintCircleRadius, 62);
        f1939h.append(R$styleable.Constraint_layout_constraintCircleAngle, 63);
        f1939h.append(R$styleable.Constraint_animateRelativeTo, 64);
        f1939h.append(R$styleable.Constraint_transitionEasing, 65);
        f1939h.append(R$styleable.Constraint_drawPath, 66);
        f1939h.append(R$styleable.Constraint_transitionPathRotate, 67);
        f1939h.append(R$styleable.Constraint_motionStagger, 79);
        f1939h.append(R$styleable.Constraint_android_id, 38);
        f1939h.append(R$styleable.Constraint_motionProgress, 68);
        f1939h.append(R$styleable.Constraint_layout_constraintWidth_percent, 69);
        f1939h.append(R$styleable.Constraint_layout_constraintHeight_percent, 70);
        f1939h.append(R$styleable.Constraint_layout_wrapBehaviorInParent, 97);
        f1939h.append(R$styleable.Constraint_chainUseRtl, 71);
        f1939h.append(R$styleable.Constraint_barrierDirection, 72);
        f1939h.append(R$styleable.Constraint_barrierMargin, 73);
        f1939h.append(R$styleable.Constraint_constraint_referenced_ids, 74);
        f1939h.append(R$styleable.Constraint_barrierAllowsGoneWidgets, 75);
        f1939h.append(R$styleable.Constraint_pathMotionArc, 76);
        f1939h.append(R$styleable.Constraint_layout_constraintTag, 77);
        f1939h.append(R$styleable.Constraint_visibilityMode, 78);
        f1939h.append(R$styleable.Constraint_layout_constrainedWidth, 80);
        f1939h.append(R$styleable.Constraint_layout_constrainedHeight, 81);
        f1939h.append(R$styleable.Constraint_polarRelativeTo, 82);
        f1939h.append(R$styleable.Constraint_transformPivotTarget, 83);
        f1939h.append(R$styleable.Constraint_quantizeMotionSteps, 84);
        f1939h.append(R$styleable.Constraint_quantizeMotionPhase, 85);
        f1939h.append(R$styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f1940i;
        int i10 = R$styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i10, 6);
        f1940i.append(i10, 7);
        f1940i.append(R$styleable.ConstraintOverride_android_orientation, 27);
        f1940i.append(R$styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        f1940i.append(R$styleable.ConstraintOverride_layout_goneMarginTop, 16);
        f1940i.append(R$styleable.ConstraintOverride_layout_goneMarginRight, 14);
        f1940i.append(R$styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        f1940i.append(R$styleable.ConstraintOverride_layout_goneMarginStart, 15);
        f1940i.append(R$styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_marginLeft, 24);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_marginRight, 28);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_marginStart, 31);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_marginEnd, 8);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_marginTop, 34);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_marginBottom, 2);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_width, 23);
        f1940i.append(R$styleable.ConstraintOverride_android_layout_height, 21);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintWidth, 95);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHeight, 96);
        f1940i.append(R$styleable.ConstraintOverride_android_visibility, 22);
        f1940i.append(R$styleable.ConstraintOverride_android_alpha, 43);
        f1940i.append(R$styleable.ConstraintOverride_android_elevation, 44);
        f1940i.append(R$styleable.ConstraintOverride_android_rotationX, 45);
        f1940i.append(R$styleable.ConstraintOverride_android_rotationY, 46);
        f1940i.append(R$styleable.ConstraintOverride_android_rotation, 60);
        f1940i.append(R$styleable.ConstraintOverride_android_scaleX, 47);
        f1940i.append(R$styleable.ConstraintOverride_android_scaleY, 48);
        f1940i.append(R$styleable.ConstraintOverride_android_transformPivotX, 49);
        f1940i.append(R$styleable.ConstraintOverride_android_transformPivotY, 50);
        f1940i.append(R$styleable.ConstraintOverride_android_translationX, 51);
        f1940i.append(R$styleable.ConstraintOverride_android_translationY, 52);
        f1940i.append(R$styleable.ConstraintOverride_android_translationZ, 53);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        f1940i.append(R$styleable.ConstraintOverride_animateRelativeTo, 64);
        f1940i.append(R$styleable.ConstraintOverride_transitionEasing, 65);
        f1940i.append(R$styleable.ConstraintOverride_drawPath, 66);
        f1940i.append(R$styleable.ConstraintOverride_transitionPathRotate, 67);
        f1940i.append(R$styleable.ConstraintOverride_motionStagger, 79);
        f1940i.append(R$styleable.ConstraintOverride_android_id, 38);
        f1940i.append(R$styleable.ConstraintOverride_motionTarget, 98);
        f1940i.append(R$styleable.ConstraintOverride_motionProgress, 68);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        f1940i.append(R$styleable.ConstraintOverride_chainUseRtl, 71);
        f1940i.append(R$styleable.ConstraintOverride_barrierDirection, 72);
        f1940i.append(R$styleable.ConstraintOverride_barrierMargin, 73);
        f1940i.append(R$styleable.ConstraintOverride_constraint_referenced_ids, 74);
        f1940i.append(R$styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f1940i.append(R$styleable.ConstraintOverride_pathMotionArc, 76);
        f1940i.append(R$styleable.ConstraintOverride_layout_constraintTag, 77);
        f1940i.append(R$styleable.ConstraintOverride_visibilityMode, 78);
        f1940i.append(R$styleable.ConstraintOverride_layout_constrainedWidth, 80);
        f1940i.append(R$styleable.ConstraintOverride_layout_constrainedHeight, 81);
        f1940i.append(R$styleable.ConstraintOverride_polarRelativeTo, 82);
        f1940i.append(R$styleable.ConstraintOverride_transformPivotTarget, 83);
        f1940i.append(R$styleable.ConstraintOverride_quantizeMotionSteps, 84);
        f1940i.append(R$styleable.ConstraintOverride_quantizeMotionPhase, 85);
        f1940i.append(R$styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        f1940i.append(R$styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static C0016a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C0016a aVar = new C0016a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R$styleable.ConstraintOverride);
        o(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = R$id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1863t) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f1863t.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    public static C0016a g(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        C0016a aVar = new C0016a();
        if (z10) {
            iArr = R$styleable.ConstraintOverride;
        } else {
            iArr = R$styleable.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z10) {
            o(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (!(index == R$styleable.Constraint_android_id || R$styleable.Constraint_android_layout_marginStart == index || R$styleable.Constraint_android_layout_marginEnd == index)) {
                    aVar.f1950d.f2011a = true;
                    aVar.f1951e.f1970b = true;
                    aVar.f1949c.f2024a = true;
                    aVar.f1952f.f2030a = true;
                }
                switch (f1939h.get(index)) {
                    case 1:
                        b bVar = aVar.f1951e;
                        bVar.f2000q = l(obtainStyledAttributes, index, bVar.f2000q);
                        break;
                    case 2:
                        b bVar2 = aVar.f1951e;
                        bVar2.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.J);
                        break;
                    case 3:
                        b bVar3 = aVar.f1951e;
                        bVar3.f1998p = l(obtainStyledAttributes, index, bVar3.f1998p);
                        break;
                    case 4:
                        b bVar4 = aVar.f1951e;
                        bVar4.f1996o = l(obtainStyledAttributes, index, bVar4.f1996o);
                        break;
                    case 5:
                        aVar.f1951e.f2009z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        b bVar5 = aVar.f1951e;
                        bVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.D);
                        break;
                    case 7:
                        b bVar6 = aVar.f1951e;
                        bVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.E);
                        break;
                    case 8:
                        b bVar7 = aVar.f1951e;
                        bVar7.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.K);
                        break;
                    case 9:
                        b bVar8 = aVar.f1951e;
                        bVar8.f2006w = l(obtainStyledAttributes, index, bVar8.f2006w);
                        break;
                    case 10:
                        b bVar9 = aVar.f1951e;
                        bVar9.f2005v = l(obtainStyledAttributes, index, bVar9.f2005v);
                        break;
                    case 11:
                        b bVar10 = aVar.f1951e;
                        bVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.Q);
                        break;
                    case 12:
                        b bVar11 = aVar.f1951e;
                        bVar11.R = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.R);
                        break;
                    case 13:
                        b bVar12 = aVar.f1951e;
                        bVar12.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.N);
                        break;
                    case 14:
                        b bVar13 = aVar.f1951e;
                        bVar13.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.P);
                        break;
                    case 15:
                        b bVar14 = aVar.f1951e;
                        bVar14.S = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.S);
                        break;
                    case 16:
                        b bVar15 = aVar.f1951e;
                        bVar15.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.O);
                        break;
                    case 17:
                        b bVar16 = aVar.f1951e;
                        bVar16.f1976e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f1976e);
                        break;
                    case 18:
                        b bVar17 = aVar.f1951e;
                        bVar17.f1978f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f1978f);
                        break;
                    case 19:
                        b bVar18 = aVar.f1951e;
                        bVar18.f1980g = obtainStyledAttributes.getFloat(index, bVar18.f1980g);
                        break;
                    case 20:
                        b bVar19 = aVar.f1951e;
                        bVar19.f2007x = obtainStyledAttributes.getFloat(index, bVar19.f2007x);
                        break;
                    case 21:
                        b bVar20 = aVar.f1951e;
                        bVar20.f1974d = obtainStyledAttributes.getLayoutDimension(index, bVar20.f1974d);
                        break;
                    case 22:
                        d dVar = aVar.f1949c;
                        dVar.f2025b = obtainStyledAttributes.getInt(index, dVar.f2025b);
                        d dVar2 = aVar.f1949c;
                        dVar2.f2025b = f1938g[dVar2.f2025b];
                        break;
                    case 23:
                        b bVar21 = aVar.f1951e;
                        bVar21.f1972c = obtainStyledAttributes.getLayoutDimension(index, bVar21.f1972c);
                        break;
                    case 24:
                        b bVar22 = aVar.f1951e;
                        bVar22.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.G);
                        break;
                    case 25:
                        b bVar23 = aVar.f1951e;
                        bVar23.f1984i = l(obtainStyledAttributes, index, bVar23.f1984i);
                        break;
                    case 26:
                        b bVar24 = aVar.f1951e;
                        bVar24.f1986j = l(obtainStyledAttributes, index, bVar24.f1986j);
                        break;
                    case 27:
                        b bVar25 = aVar.f1951e;
                        bVar25.F = obtainStyledAttributes.getInt(index, bVar25.F);
                        break;
                    case 28:
                        b bVar26 = aVar.f1951e;
                        bVar26.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.H);
                        break;
                    case 29:
                        b bVar27 = aVar.f1951e;
                        bVar27.f1988k = l(obtainStyledAttributes, index, bVar27.f1988k);
                        break;
                    case 30:
                        b bVar28 = aVar.f1951e;
                        bVar28.f1990l = l(obtainStyledAttributes, index, bVar28.f1990l);
                        break;
                    case 31:
                        b bVar29 = aVar.f1951e;
                        bVar29.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.L);
                        break;
                    case 32:
                        b bVar30 = aVar.f1951e;
                        bVar30.f2003t = l(obtainStyledAttributes, index, bVar30.f2003t);
                        break;
                    case 33:
                        b bVar31 = aVar.f1951e;
                        bVar31.f2004u = l(obtainStyledAttributes, index, bVar31.f2004u);
                        break;
                    case 34:
                        b bVar32 = aVar.f1951e;
                        bVar32.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.I);
                        break;
                    case 35:
                        b bVar33 = aVar.f1951e;
                        bVar33.f1994n = l(obtainStyledAttributes, index, bVar33.f1994n);
                        break;
                    case 36:
                        b bVar34 = aVar.f1951e;
                        bVar34.f1992m = l(obtainStyledAttributes, index, bVar34.f1992m);
                        break;
                    case 37:
                        b bVar35 = aVar.f1951e;
                        bVar35.f2008y = obtainStyledAttributes.getFloat(index, bVar35.f2008y);
                        break;
                    case 38:
                        aVar.f1947a = obtainStyledAttributes.getResourceId(index, aVar.f1947a);
                        break;
                    case 39:
                        b bVar36 = aVar.f1951e;
                        bVar36.V = obtainStyledAttributes.getFloat(index, bVar36.V);
                        break;
                    case 40:
                        b bVar37 = aVar.f1951e;
                        bVar37.U = obtainStyledAttributes.getFloat(index, bVar37.U);
                        break;
                    case 41:
                        b bVar38 = aVar.f1951e;
                        bVar38.W = obtainStyledAttributes.getInt(index, bVar38.W);
                        break;
                    case 42:
                        b bVar39 = aVar.f1951e;
                        bVar39.X = obtainStyledAttributes.getInt(index, bVar39.X);
                        break;
                    case 43:
                        d dVar3 = aVar.f1949c;
                        dVar3.f2027d = obtainStyledAttributes.getFloat(index, dVar3.f2027d);
                        break;
                    case 44:
                        e eVar = aVar.f1952f;
                        eVar.f2042m = true;
                        eVar.f2043n = obtainStyledAttributes.getDimension(index, eVar.f2043n);
                        break;
                    case 45:
                        e eVar2 = aVar.f1952f;
                        eVar2.f2032c = obtainStyledAttributes.getFloat(index, eVar2.f2032c);
                        break;
                    case 46:
                        e eVar3 = aVar.f1952f;
                        eVar3.f2033d = obtainStyledAttributes.getFloat(index, eVar3.f2033d);
                        break;
                    case 47:
                        e eVar4 = aVar.f1952f;
                        eVar4.f2034e = obtainStyledAttributes.getFloat(index, eVar4.f2034e);
                        break;
                    case 48:
                        e eVar5 = aVar.f1952f;
                        eVar5.f2035f = obtainStyledAttributes.getFloat(index, eVar5.f2035f);
                        break;
                    case 49:
                        e eVar6 = aVar.f1952f;
                        eVar6.f2036g = obtainStyledAttributes.getDimension(index, eVar6.f2036g);
                        break;
                    case 50:
                        e eVar7 = aVar.f1952f;
                        eVar7.f2037h = obtainStyledAttributes.getDimension(index, eVar7.f2037h);
                        break;
                    case 51:
                        e eVar8 = aVar.f1952f;
                        eVar8.f2039j = obtainStyledAttributes.getDimension(index, eVar8.f2039j);
                        break;
                    case 52:
                        e eVar9 = aVar.f1952f;
                        eVar9.f2040k = obtainStyledAttributes.getDimension(index, eVar9.f2040k);
                        break;
                    case 53:
                        e eVar10 = aVar.f1952f;
                        eVar10.f2041l = obtainStyledAttributes.getDimension(index, eVar10.f2041l);
                        break;
                    case 54:
                        b bVar40 = aVar.f1951e;
                        bVar40.Y = obtainStyledAttributes.getInt(index, bVar40.Y);
                        break;
                    case 55:
                        b bVar41 = aVar.f1951e;
                        bVar41.Z = obtainStyledAttributes.getInt(index, bVar41.Z);
                        break;
                    case 56:
                        b bVar42 = aVar.f1951e;
                        bVar42.f1969a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.f1969a0);
                        break;
                    case 57:
                        b bVar43 = aVar.f1951e;
                        bVar43.f1971b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.f1971b0);
                        break;
                    case 58:
                        b bVar44 = aVar.f1951e;
                        bVar44.f1973c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.f1973c0);
                        break;
                    case 59:
                        b bVar45 = aVar.f1951e;
                        bVar45.f1975d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.f1975d0);
                        break;
                    case 60:
                        e eVar11 = aVar.f1952f;
                        eVar11.f2031b = obtainStyledAttributes.getFloat(index, eVar11.f2031b);
                        break;
                    case 61:
                        b bVar46 = aVar.f1951e;
                        bVar46.A = l(obtainStyledAttributes, index, bVar46.A);
                        break;
                    case 62:
                        b bVar47 = aVar.f1951e;
                        bVar47.B = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.B);
                        break;
                    case 63:
                        b bVar48 = aVar.f1951e;
                        bVar48.C = obtainStyledAttributes.getFloat(index, bVar48.C);
                        break;
                    case 64:
                        c cVar = aVar.f1950d;
                        cVar.f2012b = l(obtainStyledAttributes, index, cVar.f2012b);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.f1950d.f2014d = b1.c.f3899c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            aVar.f1950d.f2014d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 66:
                        aVar.f1950d.f2016f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        c cVar2 = aVar.f1950d;
                        cVar2.f2018h = obtainStyledAttributes.getFloat(index, cVar2.f2018h);
                        break;
                    case 68:
                        d dVar4 = aVar.f1949c;
                        dVar4.f2028e = obtainStyledAttributes.getFloat(index, dVar4.f2028e);
                        break;
                    case 69:
                        aVar.f1951e.f1977e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        aVar.f1951e.f1979f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        b bVar49 = aVar.f1951e;
                        bVar49.f1981g0 = obtainStyledAttributes.getInt(index, bVar49.f1981g0);
                        break;
                    case 73:
                        b bVar50 = aVar.f1951e;
                        bVar50.f1983h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.f1983h0);
                        break;
                    case 74:
                        aVar.f1951e.f1989k0 = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        b bVar51 = aVar.f1951e;
                        bVar51.f1997o0 = obtainStyledAttributes.getBoolean(index, bVar51.f1997o0);
                        break;
                    case 76:
                        c cVar3 = aVar.f1950d;
                        cVar3.f2015e = obtainStyledAttributes.getInt(index, cVar3.f2015e);
                        break;
                    case 77:
                        aVar.f1951e.f1991l0 = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        d dVar5 = aVar.f1949c;
                        dVar5.f2026c = obtainStyledAttributes.getInt(index, dVar5.f2026c);
                        break;
                    case 79:
                        c cVar4 = aVar.f1950d;
                        cVar4.f2017g = obtainStyledAttributes.getFloat(index, cVar4.f2017g);
                        break;
                    case 80:
                        b bVar52 = aVar.f1951e;
                        bVar52.f1993m0 = obtainStyledAttributes.getBoolean(index, bVar52.f1993m0);
                        break;
                    case 81:
                        b bVar53 = aVar.f1951e;
                        bVar53.f1995n0 = obtainStyledAttributes.getBoolean(index, bVar53.f1995n0);
                        break;
                    case 82:
                        c cVar5 = aVar.f1950d;
                        cVar5.f2013c = obtainStyledAttributes.getInteger(index, cVar5.f2013c);
                        break;
                    case 83:
                        e eVar12 = aVar.f1952f;
                        eVar12.f2038i = l(obtainStyledAttributes, index, eVar12.f2038i);
                        break;
                    case 84:
                        c cVar6 = aVar.f1950d;
                        cVar6.f2020j = obtainStyledAttributes.getInteger(index, cVar6.f2020j);
                        break;
                    case 85:
                        c cVar7 = aVar.f1950d;
                        cVar7.f2019i = obtainStyledAttributes.getFloat(index, cVar7.f2019i);
                        break;
                    case 86:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                c cVar8 = aVar.f1950d;
                                cVar8.f2022l = obtainStyledAttributes.getInteger(index, cVar8.f2023m);
                                break;
                            } else {
                                aVar.f1950d.f2021k = obtainStyledAttributes.getString(index);
                                if (aVar.f1950d.f2021k.indexOf("/") <= 0) {
                                    aVar.f1950d.f2022l = -1;
                                    break;
                                } else {
                                    aVar.f1950d.f2023m = obtainStyledAttributes.getResourceId(index, -1);
                                    aVar.f1950d.f2022l = -2;
                                    break;
                                }
                            }
                        } else {
                            aVar.f1950d.f2023m = obtainStyledAttributes.getResourceId(index, -1);
                            c cVar9 = aVar.f1950d;
                            if (cVar9.f2023m == -1) {
                                break;
                            } else {
                                cVar9.f2022l = -2;
                                break;
                            }
                        }
                    case 87:
                        Integer.toHexString(index);
                        f1939h.get(index);
                        break;
                    case 91:
                        b bVar54 = aVar.f1951e;
                        bVar54.f2001r = l(obtainStyledAttributes, index, bVar54.f2001r);
                        break;
                    case 92:
                        b bVar55 = aVar.f1951e;
                        bVar55.f2002s = l(obtainStyledAttributes, index, bVar55.f2002s);
                        break;
                    case 93:
                        b bVar56 = aVar.f1951e;
                        bVar56.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar56.M);
                        break;
                    case 94:
                        b bVar57 = aVar.f1951e;
                        bVar57.T = obtainStyledAttributes.getDimensionPixelSize(index, bVar57.T);
                        break;
                    case 95:
                        m(aVar.f1951e, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        m(aVar.f1951e, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        b bVar58 = aVar.f1951e;
                        bVar58.f1999p0 = obtainStyledAttributes.getInt(index, bVar58.f1999p0);
                        break;
                    default:
                        Integer.toHexString(index);
                        f1939h.get(index);
                        break;
                }
            }
            b bVar59 = aVar.f1951e;
            if (bVar59.f1989k0 != null) {
                bVar59.f1987j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006d
            r1 = -2
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r1
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.W = r4
            goto L_0x006c
        L_0x003c:
            r8.height = r7
            r8.X = r4
            goto L_0x006c
        L_0x0041:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.a.b
            if (r9 == 0) goto L_0x0053
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.a.b) r8
            if (r11 != 0) goto L_0x004e
            r8.f1972c = r7
            r8.f1993m0 = r4
            goto L_0x006c
        L_0x004e:
            r8.f1974d = r7
            r8.f1995n0 = r4
            goto L_0x006c
        L_0x0053:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.a.C0016a.C0017a
            if (r9 == 0) goto L_0x006c
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.a.C0016a.C0017a) r8
            if (r11 != 0) goto L_0x0064
            r8.b(r3, r7)
            r9 = 80
            r8.d(r9, r4)
            goto L_0x006c
        L_0x0064:
            r8.b(r2, r7)
            r9 = 81
            r8.d(r9, r4)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0075
            goto L_0x0175
        L_0x0075:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x0175
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x0175
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0175
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00ca
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r10 == 0) goto L_0x00b5
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            if (r11 != 0) goto L_0x00ae
            r8.width = r7
            goto L_0x00b0
        L_0x00ae:
            r8.height = r7
        L_0x00b0:
            n(r8, r9)
            goto L_0x0175
        L_0x00b5:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.a.b
            if (r10 == 0) goto L_0x00bf
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.a.b) r8
            r8.f2009z = r9
            goto L_0x0175
        L_0x00bf:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.a.C0016a.C0017a
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.a.C0016a.C0017a) r8
            r8.c(r6, r9)
            goto L_0x0175
        L_0x00ca:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0118
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00ea
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00e4
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00e4:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.I = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00ea:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.a.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00fe
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.a.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00f8
            r8.f1972c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.V = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00f8:
            r8.f1974d = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00fe:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.a.C0016a.C0017a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.a.C0016a.C0017a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x010f
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 39
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x010f:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 40
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0118:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0175
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams     // Catch:{ NumberFormatException -> 0x0175 }
            r0 = 2
            if (r10 == 0) goto L_0x0146
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x013f
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x013f:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.M = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0146:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.a.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x015c
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.a.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x0155
            r8.f1972c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f1977e0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0155:
            r8.f1974d = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f1979f0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Z = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x015c:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.a.C0016a.C0017a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r9 == 0) goto L_0x0175
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.a.C0016a.C0017a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x016d
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 54
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x016d:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 55
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.m(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void n(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i10);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i10, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        layoutParams.G = str;
    }

    public static void o(C0016a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0016a.C0017a aVar2 = new C0016a.C0017a();
        aVar.f1954h = aVar2;
        aVar.f1950d.f2011a = false;
        aVar.f1951e.f1970b = false;
        aVar.f1949c.f2024a = false;
        aVar.f1952f.f2030a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1940i.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f1951e.J));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1951e.D));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1951e.E));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f1951e.K));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f1951e.Q));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f1951e.R));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f1951e.N));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f1951e.P));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f1951e.S));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f1951e.O));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1951e.f1976e));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1951e.f1978f));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f1951e.f1980g));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f1951e.f2007x));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f1951e.f1974d));
                    break;
                case 22:
                    aVar2.b(22, f1938g[typedArray.getInt(index, aVar.f1949c.f2025b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f1951e.f1972c));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f1951e.G));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f1951e.F));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f1951e.H));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f1951e.L));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f1951e.I));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f1951e.f2008y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1947a);
                    aVar.f1947a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f1951e.V));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f1951e.U));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f1951e.W));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f1951e.X));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f1949c.f2027d));
                    break;
                case 44:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f1952f.f2043n));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f1952f.f2032c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f1952f.f2033d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f1952f.f2034e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f1952f.f2035f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f1952f.f2036g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f1952f.f2037h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f1952f.f2039j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f1952f.f2040k));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f1952f.f2041l));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f1951e.Y));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f1951e.Z));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f1951e.f1969a0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f1951e.f1971b0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f1951e.f1973c0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f1951e.f1975d0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f1952f.f2031b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f1951e.B));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f1951e.C));
                    break;
                case 64:
                    aVar2.b(64, l(typedArray, index, aVar.f1950d.f2012b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, b1.c.f3899c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f1950d.f2018h));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f1949c.f2028e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f1951e.f1981g0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f1951e.f1983h0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f1951e.f1997o0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f1950d.f2015e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f1949c.f2026c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f1950d.f2017g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f1951e.f1993m0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f1951e.f1995n0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f1950d.f2013c));
                    break;
                case 83:
                    aVar2.b(83, l(typedArray, index, aVar.f1952f.f2038i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f1950d.f2020j));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f1950d.f2019i));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar = aVar.f1950d;
                            cVar.f2022l = typedArray.getInteger(index, cVar.f2023m);
                            aVar2.b(88, aVar.f1950d.f2022l);
                            break;
                        } else {
                            aVar.f1950d.f2021k = typedArray.getString(index);
                            aVar2.c(90, aVar.f1950d.f2021k);
                            if (aVar.f1950d.f2021k.indexOf("/") <= 0) {
                                aVar.f1950d.f2022l = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f1950d.f2023m = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f1950d.f2023m);
                                aVar.f1950d.f2022l = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f1950d.f2023m = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f1950d.f2023m);
                        c cVar2 = aVar.f1950d;
                        if (cVar2.f2023m == -1) {
                            break;
                        } else {
                            cVar2.f2022l = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Integer.toHexString(index);
                    f1939h.get(index);
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f1951e.M));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f1951e.T));
                    break;
                case 95:
                    m(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f1951e.f1999p0));
                    break;
                case 98:
                    if (!MotionLayout.M0) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f1947a = typedArray.getResourceId(index, aVar.f1947a);
                            break;
                        } else {
                            aVar.f1948b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1947a);
                        aVar.f1947a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f1948b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f1951e.f1982h));
                    break;
                default:
                    Integer.toHexString(index);
                    f1939h.get(index);
                    break;
            }
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        C0016a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1946f.containsKey(Integer.valueOf(id2))) {
                f1.a.d(childAt);
            } else if (this.f1945e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f1946f.containsKey(Integer.valueOf(id2)) && (aVar = this.f1946f.get(Integer.valueOf(id2))) != null) {
                g1.a.e(childAt, aVar.f1953g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet((a) null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1946f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1946f.containsKey(Integer.valueOf(id2))) {
                f1.a.d(childAt);
            } else if (this.f1945e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1 && this.f1946f.containsKey(Integer.valueOf(id2))) {
                hashSet.remove(Integer.valueOf(id2));
                C0016a aVar = this.f1946f.get(Integer.valueOf(id2));
                if (aVar != null) {
                    if (childAt instanceof Barrier) {
                        aVar.f1951e.f1985i0 = 1;
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id2);
                        barrier.setType(aVar.f1951e.f1981g0);
                        barrier.setMargin(aVar.f1951e.f1983h0);
                        barrier.setAllowsGoneWidget(aVar.f1951e.f1997o0);
                        b bVar = aVar.f1951e;
                        int[] iArr = bVar.f1987j0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f1989k0;
                            if (str != null) {
                                bVar.f1987j0 = f(barrier, str);
                                barrier.setReferencedIds(aVar.f1951e.f1987j0);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.a();
                    aVar.a(layoutParams);
                    g1.a.e(childAt, aVar.f1953g);
                    childAt.setLayoutParams(layoutParams);
                    d dVar = aVar.f1949c;
                    if (dVar.f2026c == 0) {
                        childAt.setVisibility(dVar.f2025b);
                    }
                    childAt.setAlpha(aVar.f1949c.f2027d);
                    childAt.setRotation(aVar.f1952f.f2031b);
                    childAt.setRotationX(aVar.f1952f.f2032c);
                    childAt.setRotationY(aVar.f1952f.f2033d);
                    childAt.setScaleX(aVar.f1952f.f2034e);
                    childAt.setScaleY(aVar.f1952f.f2035f);
                    e eVar = aVar.f1952f;
                    if (eVar.f2038i != -1) {
                        View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1952f.f2038i);
                        if (findViewById != null) {
                            float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                            float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                            if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                childAt.setPivotX(right - ((float) childAt.getLeft()));
                                childAt.setPivotY(bottom - ((float) childAt.getTop()));
                            }
                        }
                    } else {
                        if (!Float.isNaN(eVar.f2036g)) {
                            childAt.setPivotX(aVar.f1952f.f2036g);
                        }
                        if (!Float.isNaN(aVar.f1952f.f2037h)) {
                            childAt.setPivotY(aVar.f1952f.f2037h);
                        }
                    }
                    childAt.setTranslationX(aVar.f1952f.f2039j);
                    childAt.setTranslationY(aVar.f1952f.f2040k);
                    childAt.setTranslationZ(aVar.f1952f.f2041l);
                    e eVar2 = aVar.f1952f;
                    if (eVar2.f2042m) {
                        childAt.setElevation(eVar2.f2043n);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0016a aVar2 = this.f1946f.get(num);
            if (aVar2 != null) {
                if (aVar2.f1951e.f1985i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f1951e;
                    int[] iArr2 = bVar2.f1987j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1989k0;
                        if (str2 != null) {
                            bVar2.f1987j0 = f(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1951e.f1987j0);
                        }
                    }
                    barrier2.setType(aVar2.f1951e.f1981g0);
                    barrier2.setMargin(aVar2.f1951e.f1983h0);
                    b bVar3 = ConstraintLayout.f1850w;
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2);
                    barrier2.t();
                    aVar2.a(layoutParams2);
                    constraintLayout.addView(barrier2, layoutParams2);
                }
                if (aVar2.f1951e.f1968a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    b bVar4 = ConstraintLayout.f1850w;
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2);
                    aVar2.a(layoutParams3);
                    constraintLayout.addView(guideline, layoutParams3);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).j(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        a aVar = this;
        int childCount = constraintLayout.getChildCount();
        aVar.f1946f.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!aVar.f1945e || id2 != -1) {
                if (!aVar.f1946f.containsKey(Integer.valueOf(id2))) {
                    aVar.f1946f.put(Integer.valueOf(id2), new C0016a());
                }
                C0016a aVar2 = aVar.f1946f.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    HashMap<String, g1.a> hashMap = aVar.f1944d;
                    HashMap<String, g1.a> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        g1.a aVar3 = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                hashMap2.put(next, new g1.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                try {
                                    hashMap2.put(next, new g1.a(aVar3, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    e.printStackTrace();
                                }
                            }
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            e.printStackTrace();
                        } catch (IllegalAccessException e14) {
                            e = e14;
                            e.printStackTrace();
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    }
                    aVar2.f1953g = hashMap2;
                    aVar2.c(id2, layoutParams);
                    aVar2.f1949c.f2025b = childAt.getVisibility();
                    aVar2.f1949c.f2027d = childAt.getAlpha();
                    aVar2.f1952f.f2031b = childAt.getRotation();
                    aVar2.f1952f.f2032c = childAt.getRotationX();
                    aVar2.f1952f.f2033d = childAt.getRotationY();
                    aVar2.f1952f.f2034e = childAt.getScaleX();
                    aVar2.f1952f.f2035f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar2.f1952f;
                        eVar.f2036g = pivotX;
                        eVar.f2037h = pivotY;
                    }
                    aVar2.f1952f.f2039j = childAt.getTranslationX();
                    aVar2.f1952f.f2040k = childAt.getTranslationY();
                    aVar2.f1952f.f2041l = childAt.getTranslationZ();
                    e eVar2 = aVar2.f1952f;
                    if (eVar2.f2042m) {
                        eVar2.f2043n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar2.f1951e.f1997o0 = barrier.getAllowsGoneWidget();
                        aVar2.f1951e.f1987j0 = barrier.getReferencedIds();
                        aVar2.f1951e.f1981g0 = barrier.getType();
                        aVar2.f1951e.f1983h0 = barrier.getMargin();
                    }
                }
                i10++;
                aVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final C0016a h(int i10) {
        if (!this.f1946f.containsKey(Integer.valueOf(i10))) {
            this.f1946f.put(Integer.valueOf(i10), new C0016a());
        }
        return this.f1946f.get(Integer.valueOf(i10));
    }

    public final C0016a i(int i10) {
        if (this.f1946f.containsKey(Integer.valueOf(i10))) {
            return this.f1946f.get(Integer.valueOf(i10));
        }
        return null;
    }

    public final void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0016a g2 = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g2.f1951e.f1968a = true;
                    }
                    this.f1946f.put(Integer.valueOf(g2.f1947a), g2);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r7
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.a$a> r0 = r9.f1946f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f1947a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r7
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r5
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r3
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, g1.a> r0 = r2.f1953g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            g1.a.d(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.a$c r0 = r2.f1950d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.a$b r0 = r2.f1951e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.a$e r0 = r2.f1952f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.a$d r0 = r2.f1949c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.a(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = g(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$b r2 = r0.f1951e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1985i0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = g(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$b r2 = r0.f1951e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1968a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f1970b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = g(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = g(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.k(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
