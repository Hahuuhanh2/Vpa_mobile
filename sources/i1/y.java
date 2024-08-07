package i1;

import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: Person */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f11003a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f11004b;

    /* renamed from: c  reason: collision with root package name */
    public String f11005c;

    /* renamed from: d  reason: collision with root package name */
    public String f11006d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11007e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11008f;

    /* compiled from: Person */
    public static class a {
        public static y a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f11009a = person.getName();
            IconCompat iconCompat2 = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f2119k;
                icon.getClass();
                int c10 = IconCompat.a.c(icon);
                if (c10 != 2) {
                    if (c10 == 4) {
                        Uri d10 = IconCompat.a.d(icon);
                        d10.getClass();
                        String uri = d10.toString();
                        uri.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f2121b = uri;
                    } else if (c10 != 6) {
                        iconCompat2 = new IconCompat(-1);
                        iconCompat2.f2121b = icon;
                    } else {
                        Uri d11 = IconCompat.a.d(icon);
                        d11.getClass();
                        String uri2 = d11.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f2121b = uri2;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.b((Resources) null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            bVar.f11010b = iconCompat2;
            bVar.f11011c = person.getUri();
            bVar.f11012d = person.getKey();
            bVar.f11013e = person.isBot();
            bVar.f11014f = person.isImportant();
            return new y(bVar);
        }

        public static Person b(y yVar) {
            Person.Builder name = new Person.Builder().setName(yVar.f11003a);
            IconCompat iconCompat = yVar.f11004b;
            Icon icon = null;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, (Context) null);
            }
            return name.setIcon(icon).setUri(yVar.f11005c).setKey(yVar.f11006d).setBot(yVar.f11007e).setImportant(yVar.f11008f).build();
        }
    }

    /* compiled from: Person */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f11009a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f11010b;

        /* renamed from: c  reason: collision with root package name */
        public String f11011c;

        /* renamed from: d  reason: collision with root package name */
        public String f11012d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11013e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11014f;
    }

    public y(b bVar) {
        this.f11003a = bVar.f11009a;
        this.f11004b = bVar.f11010b;
        this.f11005c = bVar.f11011c;
        this.f11006d = bVar.f11012d;
        this.f11007e = bVar.f11013e;
        this.f11008f = bVar.f11014f;
    }
}
