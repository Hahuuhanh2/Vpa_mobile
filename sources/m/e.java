package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import q1.a;
import q1.b;
import v0.h;

/* compiled from: MenuWrapperICS */
public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f13034d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f13034d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return d(this.f13034d.add(charSequence));
    }

    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f13034d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr3[i14] = d(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return e(this.f13034d.addSubMenu(charSequence));
    }

    public final void clear() {
        h hVar = (h) this.f13021b;
        if (hVar != null) {
            hVar.clear();
        }
        h hVar2 = (h) this.f13022c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f13034d.clear();
    }

    public final void close() {
        this.f13034d.close();
    }

    public final MenuItem findItem(int i10) {
        return d(this.f13034d.findItem(i10));
    }

    public final MenuItem getItem(int i10) {
        return d(this.f13034d.getItem(i10));
    }

    public final boolean hasVisibleItems() {
        return this.f13034d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f13034d.isShortcutKey(i10, keyEvent);
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f13034d.performIdentifierAction(i10, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f13034d.performShortcut(i10, keyEvent, i11);
    }

    public final void removeGroup(int i10) {
        if (((h) this.f13021b) != null) {
            int i11 = 0;
            while (true) {
                h hVar = (h) this.f13021b;
                if (i11 >= hVar.f16007c) {
                    break;
                }
                if (((b) hVar.i(i11)).getGroupId() == i10) {
                    ((h) this.f13021b).k(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f13034d.removeGroup(i10);
    }

    public final void removeItem(int i10) {
        if (((h) this.f13021b) != null) {
            int i11 = 0;
            while (true) {
                h hVar = (h) this.f13021b;
                if (i11 >= hVar.f16007c) {
                    break;
                } else if (((b) hVar.i(i11)).getItemId() == i10) {
                    ((h) this.f13021b).k(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f13034d.removeItem(i10);
    }

    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f13034d.setGroupCheckable(i10, z10, z11);
    }

    public final void setGroupEnabled(int i10, boolean z10) {
        this.f13034d.setGroupEnabled(i10, z10);
    }

    public final void setGroupVisible(int i10, boolean z10) {
        this.f13034d.setGroupVisible(i10, z10);
    }

    public final void setQwertyMode(boolean z10) {
        this.f13034d.setQwertyMode(z10);
    }

    public final int size() {
        return this.f13034d.size();
    }

    public final MenuItem add(int i10) {
        return d(this.f13034d.add(i10));
    }

    public final SubMenu addSubMenu(int i10) {
        return e(this.f13034d.addSubMenu(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f13034d.add(i10, i11, i12, charSequence));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return e(this.f13034d.addSubMenu(i10, i11, i12, charSequence));
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return d(this.f13034d.add(i10, i11, i12, i13));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return e(this.f13034d.addSubMenu(i10, i11, i12, i13));
    }
}
