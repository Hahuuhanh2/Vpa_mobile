package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public abstract class zzhl<MessageType extends zzhl<MessageType, BuilderType>, BuilderType extends zzhn<MessageType, BuilderType>> implements zzkr {
    public int zza = 0;

    public int zza(zzlj zzlj) {
        int zzbt = zzbt();
        if (zzbt != -1) {
            return zzbt;
        }
        int zza2 = zzlj.zza(this);
        zzc(zza2);
        return zza2;
    }

    public int zzbt() {
        throw new UnsupportedOperationException();
    }

    public final zzhu zzbu() {
        try {
            zzid zzc = zzhu.zzc(zzbw());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "ByteString" + " threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzio zzb = zzio.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "byte array" + " threw an IOException (should never happen).", e10);
        }
    }

    public void zzc(int i10) {
        throw new UnsupportedOperationException();
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzjh.zza(iterable);
        if (iterable instanceof zzjx) {
            List<?> zzb = ((zzjx) iterable).zzb();
            zzjx zzjx = (zzjx) list;
            int size = list.size();
            for (Object next : zzb) {
                if (next == null) {
                    String str = "Element at index " + (zzjx.size() - size) + " is null.";
                    for (int size2 = zzjx.size() - 1; size2 >= size; size2--) {
                        zzjx.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (next instanceof zzhu) {
                    zzjx.zza((zzhu) next);
                } else {
                    zzjx.add((String) next);
                }
            }
        } else if (iterable instanceof zzld) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(next2);
            }
        }
    }
}
