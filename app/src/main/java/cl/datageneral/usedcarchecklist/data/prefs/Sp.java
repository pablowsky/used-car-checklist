package cl.datageneral.usedcarchecklist.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Pablo Molina on 22-12-2016. s.pablo.molina@gmail.com
 */

public class Sp {
    private static String SHARED_PREFERENCES = "prefsUsedCarCheckList";
    private static final String LEN_PREFIX = "Count_";
    private static final String VAL_PREFIX = "IntValue_";

    public static void set(String var, String value, Context c){
        SharedPreferences sharedPref= c.getSharedPreferences(SHARED_PREFERENCES, 0);
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putString(var, value);
        editor.commit();
    }

    public static String get(String var, Context c){
        String element;
        SharedPreferences sharedPref= c.getSharedPreferences(SHARED_PREFERENCES, 0);
        element = sharedPref.getString(var, "");
        return element;
    }
}
