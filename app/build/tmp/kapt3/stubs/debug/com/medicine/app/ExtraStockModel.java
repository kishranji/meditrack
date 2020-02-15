package com.medicine.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/medicine/app/ExtraStockModel;", "", "()V", "data", "Ljava/util/ArrayList;", "Lcom/medicine/app/ExtraStockModel$item;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "item", "app_debug"})
public final class ExtraStockModel {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.util.ArrayList<com.medicine.app.ExtraStockModel.item> data;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.medicine.app.ExtraStockModel.item> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.medicine.app.ExtraStockModel.item> p0) {
    }
    
    public ExtraStockModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/medicine/app/ExtraStockModel$item;", "", "()V", "Actual_price", "", "getActual_price", "()Ljava/lang/String;", "setActual_price", "(Ljava/lang/String;)V", "Expiry_date", "getExpiry_date", "setExpiry_date", "Medicine_Batch_no", "getMedicine_Batch_no", "setMedicine_Batch_no", "Medicine_name", "getMedicine_name", "setMedicine_name", "Number_of_items", "getNumber_of_items", "setNumber_of_items", "Pickup_Address", "getPickup_Address", "setPickup_Address", "Price", "getPrice", "setPrice", "User_name", "getUser_name", "setUser_name", "app_debug"})
    public static final class item {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Medicine_name")
        private java.lang.String Medicine_name;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "User_name")
        private java.lang.String User_name;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Number_of_items")
        private java.lang.String Number_of_items;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Medicine_Batch_no")
        private java.lang.String Medicine_Batch_no;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Expiry_date")
        private java.lang.String Expiry_date;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Actual_price")
        private java.lang.String Actual_price;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Price")
        private java.lang.String Price;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Pickup_Address")
        private java.lang.String Pickup_Address;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMedicine_name() {
            return null;
        }
        
        public final void setMedicine_name(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUser_name() {
            return null;
        }
        
        public final void setUser_name(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getNumber_of_items() {
            return null;
        }
        
        public final void setNumber_of_items(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMedicine_Batch_no() {
            return null;
        }
        
        public final void setMedicine_Batch_no(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getExpiry_date() {
            return null;
        }
        
        public final void setExpiry_date(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getActual_price() {
            return null;
        }
        
        public final void setActual_price(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPickup_Address() {
            return null;
        }
        
        public final void setPickup_Address(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public item() {
            super();
        }
    }
}