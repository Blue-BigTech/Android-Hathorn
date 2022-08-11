#include <jni.h>

//
// Created by javad on 7/30/2022.
//


extern "C"
JNIEXPORT jint JNICALL
Java_com_utility_WF_1VCodec_WFVC_1Decode(JNIEnv *env, jobject thiz, jbyteArray p_avdata,
                                         jint data_len, jbyteArray out_yuv420,
                                         jint out_yuv420_byte_size, jint out_picture_width,
                                         jint out_picture_heigh) {
    // TODO: implement WFVC_Decode()
    int testResult = 777;
    return testResult ;
}