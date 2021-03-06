/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_pzhao_opensltest_MainActivity */

#ifndef _Included_com_pzhao_opensltest_MainActivity
#define _Included_com_pzhao_opensltest_MainActivity
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_pzhao_opensltest_MainActivity
 * Method:    createEngine
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_pzhao_opensltest_MainActivity_createEngine
  (JNIEnv *, jclass, jstring);

/*
 * Class:     com_pzhao_opensltest_MainActivity
 * Method:    createAudioPlayer
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_pzhao_opensltest_MainActivity_createAudioPlayer
  (JNIEnv *, jclass, jstring);

/*
 * Class:     com_pzhao_opensltest_MainActivity
 * Method:    createUriAudioPlayer
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_pzhao_opensltest_MainActivity_createUriAudioPlayer
  (JNIEnv *, jclass, jstring);

/*
 * Class:     com_pzhao_opensltest_MainActivity
 * Method:    setPlayingUriAudioPlayer
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_com_pzhao_opensltest_MainActivity_setPlayingUriAudioPlayer
  (JNIEnv *, jclass, jboolean);

/*
 * Class:     com_pzhao_opensltest_MainActivity
 * Method:    setMuteUriAudioPlayer
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_com_pzhao_opensltest_MainActivity_setMuteUriAudioPlayer
  (JNIEnv *, jclass, jboolean);

/*
 * Class:     com_pzhao_opensltest_MainActivity
 * Method:    shutdown
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_pzhao_opensltest_MainActivity_shutdown
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
