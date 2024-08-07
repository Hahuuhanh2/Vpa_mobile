package ye;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import com.ots.base.ui.AddressEdittext;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import d2.g;
import ek.i;
import fk.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kf.h;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AddressEdittext.kt */
public final class c {

    /* compiled from: AddressEdittext.kt */
    public static final class a extends k implements l<gf.b, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17723a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            gf.b bVar = (gf.b) obj;
            j.f(bVar, "it");
            String a10 = bVar.a();
            if (a10 == null) {
                return "";
            }
            return a10;
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f17724a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f17725b;

        public b(AddressEdittext addressEdittext, g gVar) {
            this.f17724a = addressEdittext;
            this.f17725b = gVar;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.f17724a.getOnChange()) {
                this.f17725b.b();
            }
        }
    }

    /* renamed from: ye.c$c  reason: collision with other inner class name */
    /* compiled from: AddressEdittext.kt */
    public static final class C0240c extends k implements l<String, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f17726a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0240c(g gVar) {
            super(1);
            this.f17726a = gVar;
        }

        public final Object invoke(Object obj) {
            j.f((String) obj, "it");
            this.f17726a.b();
            return i.f20112a;
        }
    }

    public static String a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (((gf.b) next).f10499c) {
                arrayList2.add(next);
            }
        }
        return p.Q0(arrayList2, "; ", (String) null, (String) null, a.f17723a, 30);
    }

    public static final ArrayList<gf.b> b(AddressEdittext addressEdittext) {
        j.f(addressEdittext, "view");
        return addressEdittext.getSelectionReflectionType();
    }

    public static final <T> long c(AddressEdittext addressEdittext) {
        j.f(addressEdittext, "view");
        addressEdittext.getDate();
        int i10 = h.f12560a;
        return addressEdittext.getDate();
    }

    public static final void d(AddressEdittext addressEdittext, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        j.f(addressEdittext, "view");
        TextView textView = addressEdittext.getTextView();
        boolean z13 = true;
        if (textView != null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = true;
            }
            textView.setEnabled(z12);
        }
        ImageView iconEnd = addressEdittext.getIconEnd();
        if (iconEnd != null) {
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = true;
            }
            iconEnd.setEnabled(z11);
        }
        ImageView iconStart = addressEdittext.getIconStart();
        if (iconStart != null) {
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = true;
            }
            iconStart.setEnabled(z10);
        }
        if (bool != null) {
            z13 = bool.booleanValue();
        }
        addressEdittext.setChecked(z13);
    }

    public static final void e(AddressEdittext addressEdittext, g gVar) {
        TextView textView;
        j.f(addressEdittext, "editText");
        if (gVar != null && (textView = addressEdittext.getTextView()) != null) {
            textView.addTextChangedListener(new b(addressEdittext, gVar));
        }
    }

    public static final void f(AddressEdittext addressEdittext, ArrayList<gf.b> arrayList) {
        T t10;
        String str;
        j.f(addressEdittext, "view");
        if (arrayList != null) {
            boolean z10 = false;
            addressEdittext.setOnChange(false);
            boolean z11 = true;
            if (!arrayList.isEmpty()) {
                addressEdittext.getSelectionReflectionType().clear();
                addressEdittext.getSelectionReflectionType().addAll(arrayList);
                TextView textView = addressEdittext.getTextView();
                if (textView != null) {
                    textView.setText(a(arrayList));
                }
                if (a(arrayList).length() != 0) {
                    z11 = false;
                }
                if (z11) {
                    AppTitleTextView tvTitle = addressEdittext.getTvTitle();
                    if (tvTitle != null) {
                        tvTitle.setVisibility(8);
                    }
                    TextView textView2 = addressEdittext.getTextView();
                    if (textView2 != null) {
                        textView2.setText(addressEdittext.getTvTextItem().f13595c);
                        return;
                    }
                    return;
                }
                AppTitleTextView tvTitle2 = addressEdittext.getTvTitle();
                if (tvTitle2 != null) {
                    tvTitle2.setVisibility(0);
                }
                l<String, i> onItemSelected = addressEdittext.getOnItemSelected();
                Iterator<T> it = addressEdittext.getSelectionReflectionType().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (((gf.b) t10).f10499c) {
                        break;
                    }
                }
                gf.b bVar = (gf.b) t10;
                if (bVar == null || (str = bVar.b()) == null) {
                    str = "";
                }
                onItemSelected.invoke(str);
                return;
            }
            addressEdittext.getSelectionReflectionType().clear();
            addressEdittext.getSelectionReflectionType().addAll(arrayList);
            TextView textView3 = addressEdittext.getTextView();
            if (textView3 != null) {
                textView3.setText(a(arrayList));
            }
            if (a(arrayList).length() == 0) {
                z10 = true;
            }
            if (z10) {
                AppTitleTextView tvTitle3 = addressEdittext.getTvTitle();
                if (tvTitle3 != null) {
                    tvTitle3.setVisibility(8);
                }
                TextView textView4 = addressEdittext.getTextView();
                if (textView4 != null) {
                    textView4.setText(addressEdittext.getTvTextItem().f13595c);
                }
            }
        }
    }

    public static final void g(AddressEdittext addressEdittext, g gVar) {
        j.f(addressEdittext, "editText");
        if (gVar != null) {
            addressEdittext.setOnChangeTime(new C0240c(gVar));
        }
    }

    public static final <T> void h(AddressEdittext addressEdittext, Long l10) {
        T t10;
        j.f(addressEdittext, "view");
        if (l10 != null) {
            try {
                addressEdittext.setDate(l10.longValue());
                TextView textView = addressEdittext.getTextView();
                String str = "";
                if (textView != null) {
                    String format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(l10.longValue()));
                    if (format == null) {
                        format = str;
                    }
                    textView.setText(format);
                }
                if (l10.longValue() != 0) {
                    AppTitleTextView tvTitle = addressEdittext.getTvTitle();
                    if (tvTitle != null) {
                        tvTitle.setVisibility(0);
                    }
                    l<String, i> onItemSelected = addressEdittext.getOnItemSelected();
                    Iterator<T> it = addressEdittext.getSelectionReflectionType().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (((gf.b) t10).f10499c) {
                            break;
                        }
                    }
                    gf.b bVar = (gf.b) t10;
                    if (bVar != null) {
                        String b10 = bVar.b();
                        if (b10 != null) {
                            str = b10;
                        }
                    }
                    onItemSelected.invoke(str);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                TextView textView2 = addressEdittext.getTextView();
                if (textView2 != null) {
                    textView2.setText(addressEdittext.getTvTextItem().f13595c);
                }
            }
        } else {
            TextView textView3 = addressEdittext.getTextView();
            if (textView3 != null) {
                textView3.setText(addressEdittext.getTvTextItem().f13595c);
            }
        }
    }
}
