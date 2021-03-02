package com.example.citysproject.city;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/citysproject/city/CityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/citysproject/city/CityAdapter$BaseViewHolder;", "listener", "Lcom/example/citysproject/city/CityAdapter$ClickListener;", "activity", "Landroid/app/Activity;", "(Lcom/example/citysproject/city/CityAdapter$ClickListener;Landroid/app/Activity;)V", "items", "", "Lcom/example/citysproject/data/model/City;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "addItems", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupCityViewHolder", "Lcom/example/citysproject/city/CityAdapter$CityViewHolder;", "BaseViewHolder", "CityViewHolder", "ClickListener", "Companion", "EmptyViewHolder", "app_debug"})
public final class CityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.citysproject.city.CityAdapter.BaseViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.citysproject.data.model.City> items;
    private final com.example.citysproject.city.CityAdapter.ClickListener listener = null;
    private final android.app.Activity activity = null;
    private static final int VIEW_TYPE_DATA = 1;
    private static final int VIEW_TYPE_EMPTY = 2;
    public static final com.example.citysproject.city.CityAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.citysproject.data.model.City> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.citysproject.data.model.City> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.citysproject.city.CityAdapter.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.citysproject.city.CityAdapter.BaseViewHolder holder, int position) {
    }
    
    private final void setupCityViewHolder(com.example.citysproject.city.CityAdapter.CityViewHolder holder, int position) {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.citysproject.data.model.City> items) {
    }
    
    public CityAdapter(@org.jetbrains.annotations.NotNull()
    com.example.citysproject.city.CityAdapter.ClickListener listener, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/example/citysproject/city/CityAdapter$ClickListener;", "", "app_debug"})
    public static abstract interface ClickListener {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/citysproject/city/CityAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static class BaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public BaseViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/citysproject/city/CityAdapter$CityViewHolder;", "Lcom/example/citysproject/city/CityAdapter$BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/example/citysproject/data/model/City;", "activity", "Landroid/app/Activity;", "app_debug"})
    public static final class CityViewHolder extends com.example.citysproject.city.CityAdapter.BaseViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.citysproject.data.model.City item, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public CityViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/citysproject/city/CityAdapter$EmptyViewHolder;", "Lcom/example/citysproject/city/CityAdapter$BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class EmptyViewHolder extends com.example.citysproject.city.CityAdapter.BaseViewHolder {
        
        public EmptyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/citysproject/city/CityAdapter$Companion;", "", "()V", "VIEW_TYPE_DATA", "", "getVIEW_TYPE_DATA", "()I", "VIEW_TYPE_EMPTY", "getVIEW_TYPE_EMPTY", "app_debug"})
    public static final class Companion {
        
        public final int getVIEW_TYPE_DATA() {
            return 0;
        }
        
        public final int getVIEW_TYPE_EMPTY() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}