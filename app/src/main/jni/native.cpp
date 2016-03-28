#include <string.h>
#include <jni.h>

extern "C" {

JNIEXPORT jobject JNICALL Java_cat_xojan_androidndk_MainActivity_getCarFromJNI(JNIEnv* env, jobject thiz) {
    jclass carClass = env->FindClass("cat/xojan/androidndk/Car");
    jmethodID midConstructor = env->GetMethodID(carClass, "<init>", "(Ljava/lang/String;I)V");

    jstring brand = env->NewStringUTF("Ford");
    jint numDoors = 5;
    jobject employeeObject = env->NewObject(carClass, midConstructor, brand, numDoors);
    return employeeObject;
}

}