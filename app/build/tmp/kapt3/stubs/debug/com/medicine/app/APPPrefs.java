package com.medicine.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0011\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001;B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020#J)\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0\'\u00a2\u0006\u0002\u0010(J\u0018\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J&\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010+2\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040+H\u0007J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020!H\u0002J\u0016\u0010/\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0018J\u0016\u00101\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u001dJ\u0016\u00102\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u001fJ\u0016\u00103\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00100\u001a\u00020!J\u0016\u00104\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00100\u001a\u00020#J\u001a\u00105\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u0001J\u0016\u00107\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004J\u001e\u00108\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040+H\u0007J\u000e\u00109\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010:\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006<"}, d2 = {"Lcom/medicine/app/APPPrefs;", "", "()V", "DEFAULT_SUFFIX", "", "GSON", "Lcom/google/gson/Gson;", "LENGTH", "all", "", "getAll", "()Ljava/util/Map;", "mPrefs", "Landroid/content/SharedPreferences;", "preferences", "getPreferences", "()Landroid/content/SharedPreferences;", "backupUserPrefs", "", "context", "Landroid/content/Context;", "clear", "Landroid/content/SharedPreferences$Editor;", "contains", "", "key", "getBoolean", "defValue", "getDouble", "", "getFloat", "", "getInt", "", "getLong", "", "getObject", "T", "a", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "getStringSet", "", "initPrefs", "prefsName", "mode", "putBoolean", "value", "putDouble", "putFloat", "putInt", "putLong", "putObject", "object", "putString", "putStringSet", "remove", "restoreUserPrefs", "Builder", "app_debug"})
public final class APPPrefs {
    private static final java.lang.String DEFAULT_SUFFIX = "_aqprefs";
    private static final java.lang.String LENGTH = "#LENGTH";
    private static android.content.SharedPreferences mPrefs;
    private static final com.google.gson.Gson GSON = null;
    public static final com.medicine.app.APPPrefs INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ?> getAll() {
        return null;
    }
    
    /**
     * Initialize the Prefs helper class to keep a reference to the
     * SharedPreference for this application the SharedPreference will use the
     * package name of the application as the Key.
     *
     * This method
     *
     * @param context
     * the AppController context.
     */
    public final void initPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * @hide
     */
    private final void initPrefs(android.content.Context context, java.lang.String prefsName, int mode) {
    }
    
    /**
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not an int.
     * @see SharedPreferences.getInt
     */
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defValue) {
        return 0;
    }
    
    /**
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not a boolean.
     * @see SharedPreferences.getBoolean
     */
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    /**
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not a long.
     * @see SharedPreferences.getLong
     */
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defValue) {
        return 0L;
    }
    
    /**
     * Returns the double that has been saved as a long raw bits value in the
     * long preferences.
     *
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * the double Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not a long.
     * @see SharedPreferences.getLong
     */
    public final double getDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double defValue) {
        return 0.0;
    }
    
    /**
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not a float.
     * @see SharedPreferences.getFloat
     */
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defValue) {
        return 0.0F;
    }
    
    /**
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws
     * ClassCastException if there is a preference with this name that
     * is not a String.
     * @see SharedPreferences.getString
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defValue) {
        return null;
    }
    
    /**
     * @param key
     * The name of the preference to retrieve.
     * @param defValue
     * Value to return if this preference does not exist.
     * @return Returns the preference values if they exist, or defValues. Throws
     * ClassCastException if there is a preference with this name that
     * is not a Set.
     * @see SharedPreferences.getStringSet
     */
    @org.jetbrains.annotations.Nullable()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    public final java.util.Set<java.lang.String> getStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> a) {
        return null;
    }
    
    /**
     * @param key
     * The name of the preference to modify.
     * @param value
     * The new value for the preference.
     * @see Editor.putLong
     */
    public final void putLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    /**
     * @param key
     * The name of the preference to modify.
     * @param value
     * The new value for the preference.
     * @see Editor.putInt
     */
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    /**
     * Saves the double as a long raw bits inside the preferences.
     *
     * @param key
     * The name of the preference to modify.
     * @param value
     * The double value to be save in the preferences.
     * @see Editor.putLong
     */
    public final void putDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
    }
    
    /**
     * @param key
     * The name of the preference to modify.
     * @param value
     * The new value for the preference.
     * @see Editor.putFloat
     */
    public final void putFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    /**
     * @param key
     * The name of the preference to modify.
     * @param value
     * The new value for the preference.
     * @see Editor.putBoolean
     */
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    /**
     * @param key
     * The name of the preference to modify.
     * @param value
     * The new value for the preference.
     * @see Editor.putString
     */
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * @param key
     * The name of the preference to modify.
     * @param value
     * The new value for the preference.
     * @see Editor.putStringSet
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.HONEYCOMB)
    public final void putStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> value) {
    }
    
    public final void putObject(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object object) {
    }
    
    /**
     * @param key
     * The name of the preference to remove.
     * @see Editor.remove
     */
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    /**
     * @param key
     * The name of the preference to check.
     * @see SharedPreferences.contains
     * @return true if preference contains this key value.
     */
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    /**
     * @see Editor.clear
     * @return the [Editor] that has been cleared.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor clear() {
        return null;
    }
    
    public final void backupUserPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean restoreUserPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private APPPrefs() {
        super();
    }
    
    /**
     * Builder class for the EasyPrefs instance. You only have to call this once
     * in the AppController onCreate. And in the rest of the code base you can
     * call Prefs.method name.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/medicine/app/APPPrefs$Builder;", "", "()V", "mContext", "Landroid/content/Context;", "mKey", "", "mMode", "", "mUseDefault", "", "build", "", "setContext", "context", "setMode", "mode", "setPrefsName", "prefsName", "setUseDefaultSharedPreference", "defaultSharedPreference", "app_debug"})
    public static final class Builder {
        private java.lang.String mKey;
        private android.content.Context mContext;
        private int mMode;
        private boolean mUseDefault;
        
        /**
         * Set the filename of the sharedprefence instance usually this is the
         * applications packagename.xml but for migration purposes or
         * customization.
         *
         * @param prefsName
         * the filename used for the sharedpreference
         * @return the {@linkcom.pixplicity.easyprefs.library.Prefs.Builder}
         * object.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.medicine.app.APPPrefs.Builder setPrefsName(@org.jetbrains.annotations.NotNull()
        java.lang.String prefsName) {
            return null;
        }
        
        /**
         * Set the context used to instantiate the sharedpreferences
         *
         * @param context
         * the application context
         * @return the {@linkcom.pixplicity.easyprefs.library.Prefs.Builder}
         * object.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.medicine.app.APPPrefs.Builder setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Set the mode of the sharedpreference instance.
         *
         * @param mode
         * Operating mode. Use 0 or [Context.MODE_PRIVATE] for
         * the default operation, [Context.MODE_WORLD_READABLE]
         * @return the {@linkcom.pixplicity.easyprefs.library.Prefs.Builder}
         * object.
         * @see Context.getSharedPreferences
         */
        @org.jetbrains.annotations.NotNull()
        public final com.medicine.app.APPPrefs.Builder setMode(int mode) {
            return null;
        }
        
        /**
         * Set the default sharedpreference file name. Often the package name of
         * the application is used, but if the
         * [android.preference.PreferenceActivity] or
         * [android.preference.PreferenceFragment] is used android append
         * that with _preference.
         *
         * @param defaultSharedPreference
         * true if default sharedpreference name should used.
         * @return the {@linkcom.pixplicity.easyprefs.library.Prefs.Builder}
         * object.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.medicine.app.APPPrefs.Builder setUseDefaultSharedPreference(boolean defaultSharedPreference) {
            return null;
        }
        
        /**
         * Initialize the sharedpreference instance to used in the application.
         *
         * @throws RuntimeException
         * if context has not been set.
         */
        public final void build() {
        }
        
        public Builder() {
            super();
        }
    }
}