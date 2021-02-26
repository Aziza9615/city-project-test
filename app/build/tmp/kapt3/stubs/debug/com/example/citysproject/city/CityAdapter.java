package com.example.citysproject.city;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/example/citysproject/city/CityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/citysproject/city/CityViewHolder;", "()V", "array", "", "Lcom/example/citysproject/data/model/City;", "getArray", "()Ljava/util/List;", "setArray", "(Ljava/util/List;)V", "addItems", "", "item", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickListener", "app_debug"})
public final class CityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.citysproject.city.CityViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.citysproject.data.model.City> array;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.citysproject.data.model.City> getArray() {
        return null;
    }
    
    public final void setArray(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.citysproject.data.model.City> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.citysproject.city.CityViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.citysproject.city.CityViewHolder holder, int position) {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.citysproject.data.model.City> item) {
    }
    
    public CityAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/example/citysproject/city/CityAdapter$ClickListener;", "", "app_debug"})
    public static abstract interface ClickListener {
    }
}