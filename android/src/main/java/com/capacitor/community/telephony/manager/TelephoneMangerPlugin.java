package com.capacitor.community.telephony.manager;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.telephony.TelephonyManager;

@CapacitorPlugin(name = "TelephoneManger")
public class TelephoneMangerPlugin extends Plugin {

    private TelephoneManger implementation = new TelephoneManger();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void getImei(PluginCall call) {
        // String value = call.getString("value");

        // get Imei from TelephonyManager

        TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService(getContext().TELEPHONY_SERVICE);
        String imei = telephonyManager.getDeviceId();

        JSObject ret = new JSObject();
        ret.put("value", implementation.getImei(imei));
        call.resolve(ret);
    }

    @PluginMethod
    public void getMeid(PluginCall call) {
        // String value = call.getString("value");

        // get Meid from TelephonyManager

        TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService(getContext().TELEPHONY_SERVICE);
        String meid = telephonyManager.getDeviceId();

        JSObject ret = new JSObject();
        ret.put("value", implementation.getMeid(meid));
        call.resolve(ret);
    }

    @PluginMethod
    public void getSimSerialNumber(PluginCall call) {
        // String value = call.getString("value");

        // get SimSerialNumber from TelephonyManager

        TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService(getContext().TELEPHONY_SERVICE);
        String simSerialNumber = telephonyManager.getSimSerialNumber();

        JSObject ret = new JSObject();
        ret.put("value", implementation.getSimSerialNumber(simSerialNumber));
        call.resolve(ret);
    }
}
