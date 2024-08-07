package f1;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import g1.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, Constructor<? extends d>> f9659b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, ArrayList<d>> f9660a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        f9659b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            f9659b.put("KeyPosition", h.class.getConstructor(new Class[0]));
            f9659b.put("KeyCycle", f.class.getConstructor(new Class[0]));
            f9659b.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            f9659b.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public g() {
    }

    public final void a(n nVar) {
        boolean z10;
        ArrayList arrayList = this.f9660a.get(Integer.valueOf(nVar.f9731c));
        if (arrayList != null) {
            nVar.f9751w.addAll(arrayList);
        }
        ArrayList arrayList2 = this.f9660a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                String str = ((ConstraintLayout.LayoutParams) nVar.f9730b.getLayoutParams()).Y;
                String str2 = dVar.f9621c;
                if (str2 == null || str == null) {
                    z10 = false;
                } else {
                    z10 = str.matches(str2);
                }
                if (z10) {
                    nVar.a(dVar);
                }
            }
        }
    }

    public final void b(d dVar) {
        if (!this.f9660a.containsKey(Integer.valueOf(dVar.f9620b))) {
            this.f9660a.put(Integer.valueOf(dVar.f9620b), new ArrayList());
        }
        ArrayList arrayList = this.f9660a.get(Integer.valueOf(dVar.f9620b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, a> hashMap;
        HashMap<String, a> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (f9659b.containsKey(name)) {
                        try {
                            Constructor constructor = f9659b.get(name);
                            if (constructor != null) {
                                d dVar2 = (d) constructor.newInstance(new Object[0]);
                                try {
                                    dVar2.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(dVar2);
                                } catch (Exception unused) {
                                }
                                dVar = dVar2;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(dVar == null || (hashMap2 = dVar.f9622d) == null)) {
                            a.d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || dVar == null || (hashMap = dVar.f9622d) == null)) {
                        a.d(context, xmlResourceParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
