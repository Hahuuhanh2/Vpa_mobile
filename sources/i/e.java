package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import i.b;

/* compiled from: StateListDrawableCompat */
public class e extends b {

    /* renamed from: u  reason: collision with root package name */
    public a f10892u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10893v;

    /* compiled from: StateListDrawableCompat */
    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f10859g.length][];
            }
        }

        public void e() {
            int[] iArr;
            int[][] iArr2 = this.H;
            int[][] iArr3 = new int[iArr2.length][];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.H[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.H = iArr3;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i10 = this.f10860h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new e(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void e(b.c cVar) {
        this.f10839a = cVar;
        int i10 = this.f10845n;
        if (i10 >= 0) {
            Drawable d10 = cVar.d(i10);
            this.f10841c = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f10842d = null;
        if (cVar instanceof a) {
            this.f10892u = (a) cVar;
        }
    }

    /* renamed from: f */
    public a b() {
        return new a(this.f10892u, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f10893v) {
            super.mutate();
            this.f10892u.e();
            this.f10893v = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f10 = this.f10892u.f(iArr);
        if (f10 < 0) {
            f10 = this.f10892u.f(StateSet.WILD_CARD);
        }
        if (d(f10) || onStateChange) {
            return true;
        }
        return false;
    }

    public e() {
    }
}
