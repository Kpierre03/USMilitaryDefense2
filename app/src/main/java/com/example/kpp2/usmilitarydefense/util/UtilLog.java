package com.example.kpp2.usmilitarydefense.util;

import android.util.Log;

/**
 * Created by Kpp2 on 7/26/17.
 */

    public class UtilLog {

        private static boolean isLog = false;

        public static void setIsLog(boolean b) {
            isLog = b;
        }

        public static void d(String tag, String msg) {
            if(isLog){
                Log.d(tag,msg);
            }

        }
        public static void v(String tag, String msg) {
            if(isLog){
                Log.v(tag,msg);
            }

        }
}
