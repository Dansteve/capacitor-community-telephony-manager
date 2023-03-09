package com.capacitor.community.telephony.manager;

import android.util.Log;

public class TelephoneManger {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public String getImei(String value) {
        Log.i("getImei", value);
        return value;
    }

    public String getMeid(String value) {
        Log.i("getMeid", value);
        return value;
    }

    public String getSimSerialNumber(String value) {
        Log.i("getSimSerialNumber", value);
        return value;
    }
}
