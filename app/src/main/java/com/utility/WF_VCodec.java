package com.utility;

public class WF_VCodec {
    public native int WFVC_Decode(
            /*input*/ byte[] pAVData,
            /*input*/ int DataLen,
            /*out*/ byte[] out_yuv420,
            /*out*/ int out_yuv420ByteSize,
            /*out*/ int out_picture_width,
            /*out*/ int out_picture_heigh);




    static {
        System.loadLibrary("WFVCodec");
    }

}
