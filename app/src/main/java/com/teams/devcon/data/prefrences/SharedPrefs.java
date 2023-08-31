package com.teams.devcon.data.prefrences;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {

    private static final String PREF_NAME = "user_preference";
    private static final String KEY_FIRST_VISIT = "first_visit";

    private final SharedPreferences pref;
    private final SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    public SharedPrefs(Context context) {
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    public void clearPreference() {
        pref.edit().clear().apply();
    }

    public void setFirstVisit(Boolean data) {
        editor.putBoolean(KEY_FIRST_VISIT, data);
        editor.commit();
    }

    public Boolean getFirstVisit() {
        return pref.getBoolean(KEY_FIRST_VISIT, true);
    }
}
