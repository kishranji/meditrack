package com.medicine.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/medicine/app/DatabaseClient;", "", "mCtx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appDatabase", "Lcom/medicine/app/AppDatabase;", "getAppDatabase", "()Lcom/medicine/app/AppDatabase;", "Companion", "app_debug"})
public final class DatabaseClient {
    @org.jetbrains.annotations.NotNull()
    private final com.medicine.app.AppDatabase appDatabase = null;
    private final android.content.Context mCtx = null;
    private static com.medicine.app.DatabaseClient mInstance;
    public static final com.medicine.app.DatabaseClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.medicine.app.AppDatabase getAppDatabase() {
        return null;
    }
    
    private DatabaseClient(android.content.Context mCtx) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/medicine/app/DatabaseClient$Companion;", "", "()V", "mInstance", "Lcom/medicine/app/DatabaseClient;", "getInstance", "mCtx", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final synchronized com.medicine.app.DatabaseClient getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context mCtx) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}