package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public enum zznd implements zzdi {
    NO_ERROR(0),
    INCOMPATIBLE_INPUT(1),
    INCOMPATIBLE_OUTPUT(2),
    INCOMPATIBLE_TFLITE_VERSION(3),
    MISSING_OP(4),
    DATA_TYPE_ERROR(6),
    TFLITE_INTERNAL_ERROR(7),
    TFLITE_UNKNOWN_ERROR(8),
    MEDIAPIPE_ERROR(9),
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    MODEL_NOT_DOWNLOADED(100),
    URI_EXPIRED(101),
    NO_NETWORK_CONNECTION(102),
    METERED_NETWORK(103),
    DOWNLOAD_FAILED(104),
    MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS(105),
    MODEL_INFO_DOWNLOAD_NO_HASH(106),
    MODEL_INFO_DOWNLOAD_CONNECTION_FAILED(107),
    NO_VALID_MODEL(108),
    LOCAL_MODEL_INVALID(109),
    REMOTE_MODEL_INVALID(110),
    REMOTE_MODEL_LOADER_ERROR(111),
    REMOTE_MODEL_LOADER_LOADS_NO_MODEL(112),
    SMART_REPLY_LANG_ID_DETECTAION_FAILURE(113),
    MODEL_NOT_REGISTERED(114),
    MODEL_TYPE_MISUSE(115),
    MODEL_HASH_MISMATCH(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    OPTIONAL_MODULE_INIT_ERROR(202),
    OPTIONAL_MODULE_INFERENCE_ERROR(203),
    OPTIONAL_MODULE_RELEASE_ERROR(204),
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(205),
    NATIVE_LIBRARY_LOAD_ERROR(206),
    OPTIONAL_MODULE_CREATE_ERROR(207),
    CAMERAX_SOURCE_ERROR(301),
    CAMERA1_SOURCE_CANT_START_ERROR(302),
    CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR(303),
    CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR(304),
    CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR(305),
    CODE_SCANNER_UNAVAILABLE(400),
    CODE_SCANNER_CANCELLED(401),
    CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED(402),
    CODE_SCANNER_APP_NAME_UNAVAILABLE(403),
    CODE_SCANNER_TASK_IN_PROGRESS(404),
    CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR(405),
    CODE_SCANNER_PIPELINE_INFERENCE_ERROR(406),
    CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(407),
    UNKNOWN_ERROR(9999);
    
    private final int zzX;

    private zznd(int i10) {
        this.zzX = i10;
    }

    public final int zza() {
        return this.zzX;
    }
}
