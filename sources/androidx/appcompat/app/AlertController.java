package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class AlertController {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public c E;
    public final a F = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f310a;

    /* renamed from: b  reason: collision with root package name */
    public final m f311b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f312c;

    /* renamed from: d  reason: collision with root package name */
    public final int f313d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f314e;

    /* renamed from: f  reason: collision with root package name */
    public RecycleListView f315f;

    /* renamed from: g  reason: collision with root package name */
    public View f316g;

    /* renamed from: h  reason: collision with root package name */
    public int f317h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f318i = false;

    /* renamed from: j  reason: collision with root package name */
    public Button f319j;

    /* renamed from: k  reason: collision with root package name */
    public Button f320k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f321l;

    /* renamed from: m  reason: collision with root package name */
    public Message f322m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f323n;

    /* renamed from: o  reason: collision with root package name */
    public Button f324o;

    /* renamed from: p  reason: collision with root package name */
    public NestedScrollView f325p;

    /* renamed from: q  reason: collision with root package name */
    public int f326q = 0;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f327r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView f328s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f329t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f330u;

    /* renamed from: v  reason: collision with root package name */
    public View f331v;

    /* renamed from: w  reason: collision with root package name */
    public ListAdapter f332w;

    /* renamed from: x  reason: collision with root package name */
    public int f333x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f334y;

    /* renamed from: z  reason: collision with root package name */
    public int f335z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        public final int f336a;

        /* renamed from: b  reason: collision with root package name */
        public final int f337b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public void setHasDecor(boolean z10, boolean z11) {
            int i10;
            int i11;
            if (!z11 || !z10) {
                int paddingLeft = getPaddingLeft();
                if (z10) {
                    i10 = getPaddingTop();
                } else {
                    i10 = this.f336a;
                }
                int paddingRight = getPaddingRight();
                if (z11) {
                    i11 = getPaddingBottom();
                } else {
                    i11 = this.f337b;
                }
                setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
            this.f337b = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f336a = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            if (view == alertController.f319j) {
                alertController.getClass();
            }
            if (view != alertController.f320k || (message2 = alertController.f322m) == null) {
                if (view == alertController.f324o) {
                    alertController.getClass();
                }
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.E.obtainMessage(1, alertController2.f311b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f339a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f340b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f341c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f342d;

        /* renamed from: e  reason: collision with root package name */
        public View f343e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f344f;

        /* renamed from: g  reason: collision with root package name */
        public DialogInterface.OnClickListener f345g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnKeyListener f346h;

        /* renamed from: i  reason: collision with root package name */
        public ListAdapter f347i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f348j;

        /* renamed from: k  reason: collision with root package name */
        public View f349k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f350l;

        /* renamed from: m  reason: collision with root package name */
        public int f351m = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f339a = contextThemeWrapper;
            this.f340b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f352a;

        public c(DialogInterface dialogInterface) {
            this.f352a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f352a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10) {
            super(context, i10, 16908308, (Object[]) null);
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m mVar, Window window) {
        this.f310a = context;
        this.f311b = mVar;
        this.f312c = window;
        this.E = new c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.AlertDialog, R$attr.alertDialogStyle, 0);
        this.f334y = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
        this.f335z = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.A = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.B = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.C = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.D = obtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
        this.f313d = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        mVar.d().s(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
