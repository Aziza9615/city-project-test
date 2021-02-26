package com.example.citysproject.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/citysproject/main/MainRepository;", "", "callback", "Lcom/example/citysproject/city/RequestResult;", "(Lcom/example/citysproject/city/RequestResult;)V", "api", "Lcom/example/citysproject/data/network/SimpleApi;", "kotlin.jvm.PlatformType", "database", "Lcom/example/citysproject/data/local/CityDao;", "fetchCity", "", "city", "", "fetchFavorites", "app_debug"})
public final class MainRepository {
    private com.example.citysproject.data.network.SimpleApi api;
    private final com.example.citysproject.data.local.CityDao database = null;
    private final com.example.citysproject.city.RequestResult callback = null;
    
    public final void fetchCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    public final void fetchFavorites() {
    }
    
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.example.citysproject.city.RequestResult callback) {
        super();
    }
}