/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class localization_lcmt implements lcm.lcm.LCMEncodable
{
    public float xyz[];
    public float rpy[];
 
    public localization_lcmt()
    {
        xyz = new float[3];
        rpy = new float[3];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x3c3402ee7c7bd738L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.localization_lcmt.class))
            return 0L;
 
        classes.add(lcmtypes.localization_lcmt.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.xyz[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeFloat(this.rpy[a]); 
        }
 
    }
 
    public localization_lcmt(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public localization_lcmt(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.localization_lcmt _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.localization_lcmt o = new lcmtypes.localization_lcmt();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.xyz = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.xyz[a] = ins.readFloat();
        }
 
        this.rpy = new float[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.rpy[a] = ins.readFloat();
        }
 
    }
 
    public lcmtypes.localization_lcmt copy()
    {
        lcmtypes.localization_lcmt outobj = new lcmtypes.localization_lcmt();
        outobj.xyz = new float[(int) 3];
        System.arraycopy(this.xyz, 0, outobj.xyz, 0, 3); 
        outobj.rpy = new float[(int) 3];
        System.arraycopy(this.rpy, 0, outobj.rpy, 0, 3); 
        return outobj;
    }
 
}

