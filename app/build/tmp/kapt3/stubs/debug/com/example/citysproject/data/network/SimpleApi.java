package com.example.citysproject.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/citysproject/data/network/SimpleApi;", "", "fetchCity", "Lretrofit2/Call;", "", "Lcom/example/citysproject/data/model/City;", "city", "", "app_debug"})
public abstract interface SimpleApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "capital/{city}")
    public abstract retrofit2.Call<java.util.List<com.example.citysproject.data.model.City>> fetchCity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "city")
    java.lang.String city);
}