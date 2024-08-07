package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.a;
import com.google.firebase.encoders.EncodingException;
import f0.b0;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import sa.b;
import sa.c;
import sa.d;
import sa.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzdm implements d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final b zzb;
    private static final b zzc;
    private static final c zzd = zzdl.zza;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final c zzh;
    private final zzdq zzi = new zzdq(this);

    static {
        zzdk h10 = a.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h10.annotationType(), h10);
        zzb = new b("key", b0.z(hashMap));
        zzdk h11 = a.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h11.annotationType(), h11);
        zzc = new b("value", b0.z(hashMap2));
    }

    public zzdm(OutputStream outputStream, Map map, Map map2, c cVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = cVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, d dVar) {
        dVar.add(zzb, entry.getKey());
        dVar.add(zzc, entry.getValue());
    }

    private static int zzh(b bVar) {
        zzdk zzdk = (zzdk) bVar.a(zzdk.class);
        if (zzdk != null) {
            return zzdk.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(c cVar, Object obj) {
        OutputStream outputStream;
        zzdh zzdh = new zzdh();
        try {
            outputStream = this.zze;
            this.zze = zzdh;
            cVar.encode(obj, this);
            this.zze = outputStream;
            long zza2 = zzdh.zza();
            zzdh.close();
            return zza2;
        } catch (Throwable th2) {
            try {
                zzdh.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th2, new Object[]{th3});
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static zzdk zzj(b bVar) {
        zzdk zzdk = (zzdk) bVar.a(zzdk.class);
        if (zzdk != null) {
            return zzdk;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzdm zzk(c cVar, b bVar, Object obj, boolean z10) {
        long zzi2 = zzi(cVar, obj);
        if (z10 && zzi2 == 0) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 2);
        zzo(zzi2);
        cVar.encode(obj, this);
        return this;
    }

    private final zzdm zzl(e eVar, b bVar, Object obj, boolean z10) {
        this.zzi.zza(bVar, z10);
        eVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.zze.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.zze.write(i10 & 127);
    }

    private final void zzo(long j10) {
        while ((-128 & j10) != 0) {
            this.zze.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.zze.write(((int) j10) & 127);
    }

    public final d add(b bVar, double d10) {
        zza(bVar, d10, true);
        return this;
    }

    public final d inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final d nested(b bVar) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final d zza(b bVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    public final d zzb(b bVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final d zzc(b bVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object zzc2 : (Collection) obj) {
                zzc(bVar, zzc2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry zzk : ((Map) obj).entrySet()) {
                zzk(zzd, bVar, zzk, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zza(bVar, ((Double) obj).doubleValue(), z10);
            return this;
        } else if (obj instanceof Float) {
            zzb(bVar, ((Float) obj).floatValue(), z10);
            return this;
        } else if (obj instanceof Number) {
            zze(bVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(bVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        } else {
            c cVar = (c) this.zzf.get(obj.getClass());
            if (cVar != null) {
                zzk(cVar, bVar, obj, z10);
                return this;
            }
            e eVar = (e) this.zzg.get(obj.getClass());
            if (eVar != null) {
                zzl(eVar, bVar, obj, z10);
                return this;
            } else if (obj instanceof zzdi) {
                zzd(bVar, ((zzdi) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzk(this.zzh, bVar, obj, z10);
                return this;
            }
        }
    }

    public final zzdm zzd(b bVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        zzdk zzj = zzj(bVar);
        zzdj zzdj = zzdj.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzn(i10);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzn((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i10).array());
        }
        return this;
    }

    public final zzdm zze(b bVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        zzdk zzj = zzj(bVar);
        zzdj zzdj = zzdj.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzo(j10);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzo((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j10).array());
        }
        return this;
    }

    public final zzdm zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        c cVar = (c) this.zzf.get(obj.getClass());
        if (cVar != null) {
            cVar.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    public final d add(b bVar, float f10) {
        zzb(bVar, f10, true);
        return this;
    }

    public final d nested(String str) {
        return nested(b.b(str));
    }

    public final /* synthetic */ d add(b bVar, int i10) {
        zzd(bVar, i10, true);
        return this;
    }

    public final /* synthetic */ d add(b bVar, long j10) {
        zze(bVar, j10, true);
        return this;
    }

    public final d add(b bVar, Object obj) {
        zzc(bVar, obj, true);
        return this;
    }

    public final /* synthetic */ d add(b bVar, boolean z10) {
        zzd(bVar, z10 ? 1 : 0, true);
        return this;
    }

    public final d add(String str, double d10) {
        zza(b.b(str), d10, true);
        return this;
    }

    public final d add(String str, int i10) {
        zzd(b.b(str), i10, true);
        return this;
    }

    public final d add(String str, long j10) {
        zze(b.b(str), j10, true);
        return this;
    }

    public final d add(String str, Object obj) {
        zzc(b.b(str), obj, true);
        return this;
    }

    public final d add(String str, boolean z10) {
        zzd(b.b(str), z10 ? 1 : 0, true);
        return this;
    }
}
