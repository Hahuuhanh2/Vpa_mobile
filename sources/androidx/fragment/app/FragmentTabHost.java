package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f2545a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f2546b;

    /* renamed from: c  reason: collision with root package name */
    public FragmentManager f2547c;

    /* renamed from: d  reason: collision with root package name */
    public int f2548d;

    /* renamed from: e  reason: collision with root package name */
    public TabHost.OnTabChangeListener f2549e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2550f;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f2551a;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("FragmentTabHost.SavedState{");
            q10.append(Integer.toHexString(System.identityHashCode(this)));
            q10.append(" curTab=");
            return android.support.v4.media.a.o(q10, this.f2551a, "}");
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f2551a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2551a = parcel.readString();
        }
    }

    public static final class a {
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16842995}, 0, 0);
        this.f2548d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public final a0 a() {
        if (this.f2545a.size() <= 0) {
            return null;
        }
        this.f2545a.get(0).getClass();
        throw null;
    }

    public final void b() {
        if (this.f2546b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f2548d);
            this.f2546b = frameLayout;
            if (frameLayout == null) {
                StringBuilder q10 = android.support.v4.media.a.q("No tab content FrameLayout found for id ");
                q10.append(this.f2548d);
                throw new IllegalStateException(q10.toString());
            }
        }
    }

    public final void c(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f2546b = frameLayout2;
            frameLayout2.setId(this.f2548d);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        int size = this.f2545a.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = this.f2545a.get(i10);
            FragmentManager fragmentManager = this.f2547c;
            aVar.getClass();
            Fragment D = fragmentManager.D((String) null);
            aVar.getClass();
            if (D == null || D.G) {
                i10++;
            } else {
                throw null;
            }
        }
        this.f2550f = true;
        a();
    }

    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2550f = false;
    }

    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2551a);
    }

    @Deprecated
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2551a = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public final void onTabChanged(String str) {
        if (this.f2550f) {
            a();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f2549e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f2549e = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        c(context);
        super.setup();
        this.f2547c = fragmentManager;
        b();
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i10) {
        c(context);
        super.setup();
        this.f2547c = fragmentManager;
        this.f2548d = i10;
        b();
        this.f2546b.setId(i10);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f2548d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }
}
