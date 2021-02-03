package com.salampakistan.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u0012\u0010\u000f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u0012\u0010\u0010\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u0012\u0010\u0011\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u0012\u0010\u0014\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u001c\u0010\u0015\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0016\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tJ\u0012\u0010\u0017\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/salampakistan/utils/FragmentTransitionHelper;", "", "()V", "ENTER_DURATION", "", "EXIT_DURATION", "createStandardTransitionListener", "Landroid/transition/Transition$TransitionListener;", "fragment", "Lcom/salampakistan/base/BaseFragment;", "setupTransition", "", "direction", "Lcom/salampakistan/utils/FragmentTransitionHelper$Direction;", "setupTransitionFromBottom", "setupTransitionFromEnd", "setupTransitionFromStart", "setupTransitionFromTop", "updateEnterTransition", "updateEnterTransitionFromEnd", "updateEnterTransitionFromStart", "updateExitTransition", "updateExitTransitionToEnd", "updateExitTransitionToStart", "Direction", "app_debug"})
public final class FragmentTransitionHelper {
    private static final int ENTER_DURATION = 190;
    private static final int EXIT_DURATION = 190;
    public static final com.salampakistan.utils.FragmentTransitionHelper INSTANCE = null;
    
    /**
     * SETUP ENTER AND EXIT TRANSITIONS
     */
    public final void setupTransitionFromTop(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void setupTransitionFromEnd(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void setupTransitionFromBottom(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void setupTransitionFromStart(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    /**
     * UPDATE ONLY ENTER TRANSITIONS
     */
    public final void updateEnterTransitionFromStart(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void updateEnterTransitionFromEnd(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    /**
     * UPDATE ONLY EXIT TRANSITIONS
     */
    public final void updateExitTransitionToStart(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    public final void updateExitTransitionToEnd(@org.jetbrains.annotations.NotNull()
    com.salampakistan.base.BaseFragment<?> fragment) {
    }
    
    private final void updateEnterTransition(com.salampakistan.base.BaseFragment<?> fragment, com.salampakistan.utils.FragmentTransitionHelper.Direction direction) {
    }
    
    private final void updateExitTransition(com.salampakistan.base.BaseFragment<?> fragment, com.salampakistan.utils.FragmentTransitionHelper.Direction direction) {
    }
    
    private final void setupTransition(com.salampakistan.base.BaseFragment<?> fragment, com.salampakistan.utils.FragmentTransitionHelper.Direction direction) {
    }
    
    private final android.transition.Transition.TransitionListener createStandardTransitionListener(com.salampakistan.base.BaseFragment<?> fragment) {
        return null;
    }
    
    private FragmentTransitionHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/salampakistan/utils/FragmentTransitionHelper$Direction;", "", "(Ljava/lang/String;I)V", "TOP", "END", "BOTTOM", "START", "app_debug"})
    static enum Direction {
        /*public static final*/ TOP /* = new TOP() */,
        /*public static final*/ END /* = new END() */,
        /*public static final*/ BOTTOM /* = new BOTTOM() */,
        /*public static final*/ START /* = new START() */;
        
        Direction() {
        }
    }
}