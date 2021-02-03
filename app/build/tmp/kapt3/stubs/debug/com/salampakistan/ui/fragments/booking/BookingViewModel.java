package com.salampakistan.ui.fragments.booking;

import java.lang.System;

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/salampakistan/ui/fragments/booking/BookingViewModel;", "Lcom/salampakistan/base/BaseViewModel;", "app", "Landroid/app/Application;", "repo", "Lcom/salampakistan/network/repos/TripsRepo;", "(Landroid/app/Application;Lcom/salampakistan/network/repos/TripsRepo;)V", "getRepo", "()Lcom/salampakistan/network/repos/TripsRepo;", "app_debug"})
public final class BookingViewModel extends com.salampakistan.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.salampakistan.network.repos.TripsRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.salampakistan.network.repos.TripsRepo getRepo() {
        return null;
    }
    
    @javax.inject.Inject()
    public BookingViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.salampakistan.network.repos.TripsRepo repo) {
        super(null);
    }
}