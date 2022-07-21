package com.example.foodrecipeapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J-\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0!2\u0006\u0010\"\u001a\u00020#H\u0016\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/foodrecipeapp/SplashActivity;", "Lcom/example/foodrecipeapp/BaseActivity;", "Lpub/devrel/easypermissions/EasyPermissions$RationaleCallbacks;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "READ_STORAGE_PERM", "", "clearDatabase", "", "getCategories", "getMeal", "categoryName", "", "hasReadstoragePermission", "", "insertDataintoRoom", "category", "Lcom/example/foodrecipeapp/entities/Category;", "insertMealDataintoRoom", "meal", "Lcom/example/foodrecipeapp/entities/Meal;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionsDenied", "requestCode", "perms", "", "onPermissionsGranted", "onRationaleAccepted", "onRationaleDenied", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "readStorageTask", "app_debug"})
public final class SplashActivity extends com.example.foodrecipeapp.BaseActivity implements pub.devrel.easypermissions.EasyPermissions.RationaleCallbacks, pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks {
    private int READ_STORAGE_PERM = 123;
    private java.util.HashMap _$_findViewCache;
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getCategories() {
    }
    
    public final void getMeal(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName) {
    }
    
    public final void insertDataintoRoom(@org.jetbrains.annotations.Nullable()
    com.example.foodrecipeapp.entities.Category category) {
    }
    
    public final void insertMealDataintoRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
    com.example.foodrecipeapp.entities.Meal meal) {
    }
    
    private final void clearDatabase() {
    }
    
    private final boolean hasReadstoragePermission() {
        return false;
    }
    
    private final void readStorageTask() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onRationaleAccepted(int requestCode) {
    }
    
    @java.lang.Override()
    public void onRationaleDenied(int requestCode) {
    }
    
    @java.lang.Override()
    public void onPermissionsGranted(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    @java.lang.Override()
    public void onPermissionsDenied(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
}