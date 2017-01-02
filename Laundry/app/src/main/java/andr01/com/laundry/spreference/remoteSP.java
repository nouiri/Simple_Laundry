package andr01.com.laundry.spreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Dony.A.Nuransyah on 23/12/16.
 * Email : dony.nuransyah@gmail.com
 */

public class remoteSP{

    private static final String TAG = "SharedPref";

    static SharedPreferences.Editor editor;
    static Context context;

    public remoteSP(Context context){
        this.context = context;
    }
    private static SharedPreferences getPref() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void clear(){
        editor.clear();
        editor.commit();
    }

    public static void saveString(String key, String value) {
        Log.d(TAG, "saveString: " + value);
        getPref().edit()
                .putString(key, value)
                .apply();
    }

    public static String getString(String key) {
        Log.d(TAG, "getString: " + getPref().getString(key, null));
        return getPref().getString(key, null);
    }


    public static void deleteString(String key) {
        getPref().edit()
                .remove(key)
                .apply();
    }

    public static void saveInt(String key, int value) {
        Log.d(TAG, "saveInt: " + value);
        getPref().edit()
                .putInt(key, value)
                .apply();
    }

    public static int getInt(String key) {
        return getPref().getInt(key, 0);
    }

    public static void deleteInt(String key) {
        getPref().edit()
                .remove(key)
                .apply();
    }

    public static void saveBol(String key, boolean value) {
        getPref().edit()
                .putBoolean(key, value)
                .apply();
    }

    public static boolean getBol(String key) {
        return getPref().getBoolean(key, false);
    }

    public static void deleteBol(String key) {
        getPref().edit()
                .remove(key)
                .apply();
    }
}