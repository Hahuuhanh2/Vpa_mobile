package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: AlertDialog */
public final class b extends m {

    /* renamed from: f  reason: collision with root package name */
    public final AlertController f423f = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f424a;

        /* renamed from: b  reason: collision with root package name */
        public final int f425b;

        public a(Context context) {
            int f10 = b.f(context, 0);
            this.f424a = new AlertController.b(new ContextThemeWrapper(context, b.f(context, f10)));
            this.f425b = f10;
        }

        public final b a() {
            int i10;
            Message message;
            b bVar = new b(this.f424a.f339a, this.f425b);
            AlertController.b bVar2 = this.f424a;
            AlertController alertController = bVar.f423f;
            View view = bVar2.f343e;
            if (view != null) {
                alertController.f331v = view;
            } else {
                CharSequence charSequence = bVar2.f342d;
                if (charSequence != null) {
                    alertController.f314e = charSequence;
                    TextView textView = alertController.f329t;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f341c;
                if (drawable != null) {
                    alertController.f327r = drawable;
                    alertController.f326q = 0;
                    ImageView imageView = alertController.f328s;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f328s.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f344f;
            if (charSequence2 != null) {
                DialogInterface.OnClickListener onClickListener = bVar2.f345g;
                if (onClickListener != null) {
                    message = alertController.E.obtainMessage(-2, onClickListener);
                } else {
                    message = null;
                }
                alertController.f321l = charSequence2;
                alertController.f322m = message;
                alertController.f323n = null;
            }
            if (bVar2.f347i != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f340b.inflate(alertController.A, (ViewGroup) null);
                if (bVar2.f350l) {
                    i10 = alertController.B;
                } else {
                    i10 = alertController.C;
                }
                ListAdapter listAdapter = bVar2.f347i;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f339a, i10);
                }
                alertController.f332w = listAdapter;
                alertController.f333x = bVar2.f351m;
                if (bVar2.f348j != null) {
                    recycleListView.setOnItemClickListener(new a(bVar2, alertController));
                }
                if (bVar2.f350l) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f315f = recycleListView;
            }
            View view2 = bVar2.f349k;
            if (view2 != null) {
                alertController.f316g = view2;
                alertController.f317h = 0;
                alertController.f318i = false;
            }
            this.f424a.getClass();
            bVar.setCancelable(true);
            this.f424a.getClass();
            bVar.setCanceledOnTouchOutside(true);
            this.f424a.getClass();
            bVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            this.f424a.getClass();
            bVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f424a.f346h;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }
    }

    public b(Context context, int i10) {
        super(context, f(context, i10));
    }

    public static int f(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void onCreate(Bundle bundle) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f423f;
        if (alertController.f335z == 0) {
            i10 = alertController.f334y;
        } else {
            i10 = alertController.f334y;
        }
        alertController.f311b.setContentView(i10);
        View findViewById2 = alertController.f312c.findViewById(R$id.parentPanel);
        int i11 = R$id.topPanel;
        View findViewById3 = findViewById2.findViewById(i11);
        int i12 = R$id.contentPanel;
        View findViewById4 = findViewById2.findViewById(i12);
        int i13 = R$id.buttonPanel;
        View findViewById5 = findViewById2.findViewById(i13);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R$id.customPanel);
        View view = alertController.f316g;
        View view2 = null;
        boolean z17 = false;
        if (view == null) {
            if (alertController.f317h != 0) {
                view = LayoutInflater.from(alertController.f310a).inflate(alertController.f317h, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !AlertController.a(view)) {
            alertController.f312c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) alertController.f312c.findViewById(R$id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f318i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f315f != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(i11);
        View findViewById7 = viewGroup.findViewById(i12);
        View findViewById8 = viewGroup.findViewById(i13);
        ViewGroup c10 = AlertController.c(findViewById6, findViewById3);
        ViewGroup c11 = AlertController.c(findViewById7, findViewById4);
        ViewGroup c12 = AlertController.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f312c.findViewById(R$id.scrollView);
        alertController.f325p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f325p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(16908299);
        alertController.f330u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f325p.removeView(alertController.f330u);
            if (alertController.f315f != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f325p.getParent();
                int indexOfChild = viewGroup2.indexOfChild(alertController.f325p);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(alertController.f315f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c11.setVisibility(8);
            }
        }
        Button button = (Button) c12.findViewById(16908313);
        alertController.f319j = button;
        button.setOnClickListener(alertController.F);
        alertController.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            alertController.getClass();
            alertController.f319j.setVisibility(8);
            z11 = false;
        } else {
            Button button2 = alertController.f319j;
            alertController.getClass();
            button2.setText((CharSequence) null);
            alertController.getClass();
            alertController.f319j.setVisibility(0);
            z11 = true;
        }
        Button button3 = (Button) c12.findViewById(16908314);
        alertController.f320k = button3;
        button3.setOnClickListener(alertController.F);
        if (!TextUtils.isEmpty(alertController.f321l) || alertController.f323n != null) {
            alertController.f320k.setText(alertController.f321l);
            Drawable drawable = alertController.f323n;
            if (drawable != null) {
                int i14 = alertController.f313d;
                drawable.setBounds(0, 0, i14, i14);
                alertController.f320k.setCompoundDrawables(alertController.f323n, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f320k.setVisibility(0);
            z11 |= true;
        } else {
            alertController.f320k.setVisibility(8);
        }
        Button button4 = (Button) c12.findViewById(16908315);
        alertController.f324o = button4;
        button4.setOnClickListener(alertController.F);
        alertController.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            alertController.getClass();
            alertController.f324o.setVisibility(8);
        } else {
            Button button5 = alertController.f324o;
            alertController.getClass();
            button5.setText((CharSequence) null);
            alertController.getClass();
            alertController.f324o.setVisibility(0);
            z11 |= true;
        }
        Context context = alertController.f310a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                AlertController.b(alertController.f319j);
            } else if (z11) {
                AlertController.b(alertController.f320k);
            } else if (z11) {
                AlertController.b(alertController.f324o);
            }
        }
        if (z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            c12.setVisibility(8);
        }
        if (alertController.f331v != null) {
            c10.addView(alertController.f331v, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f312c.findViewById(R$id.title_template).setVisibility(8);
        } else {
            alertController.f328s = (ImageView) alertController.f312c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f314e)) || !alertController.D) {
                alertController.f312c.findViewById(R$id.title_template).setVisibility(8);
                alertController.f328s.setVisibility(8);
                c10.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f312c.findViewById(R$id.alertTitle);
                alertController.f329t = textView2;
                textView2.setText(alertController.f314e);
                int i15 = alertController.f326q;
                if (i15 != 0) {
                    alertController.f328s.setImageResource(i15);
                } else {
                    Drawable drawable2 = alertController.f327r;
                    if (drawable2 != null) {
                        alertController.f328s.setImageDrawable(drawable2);
                    } else {
                        alertController.f329t.setPadding(alertController.f328s.getPaddingLeft(), alertController.f328s.getPaddingTop(), alertController.f328s.getPaddingRight(), alertController.f328s.getPaddingBottom());
                        alertController.f328s.setVisibility(8);
                    }
                }
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c10 == null || c10.getVisibility() == 8) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (c12.getVisibility() != 8) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z16 && (findViewById = c11.findViewById(R$id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z15) {
            NestedScrollView nestedScrollView2 = alertController.f325p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f315f != null) {
                view2 = c10.findViewById(R$id.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = c11.findViewById(R$id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f315f;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.setHasDecor(z15, z16);
        }
        if (!z14) {
            View view3 = alertController.f315f;
            if (view3 == null) {
                view3 = alertController.f325p;
            }
            if (view3 != null) {
                if (z16) {
                    z17 = true;
                }
                boolean z18 = z15 | z17;
                View findViewById10 = alertController.f312c.findViewById(R$id.scrollIndicatorUp);
                View findViewById11 = alertController.f312c.findViewById(R$id.scrollIndicatorDown);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.j.d(view3, z18 ? 1 : 0, 3);
                if (findViewById10 != null) {
                    c11.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    c11.removeView(findViewById11);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f315f;
        if (recycleListView2 != null && (listAdapter = alertController.f332w) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i16 = alertController.f333x;
            if (i16 > -1) {
                recycleListView2.setItemChecked(i16, true);
                recycleListView2.setSelection(i16);
            }
        }
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f423f.f325p;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f423f.f325p;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f423f;
        alertController.f314e = charSequence;
        TextView textView = alertController.f329t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
