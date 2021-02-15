package com.salampakistan.model

class AppliedFilterBus {
    var values: ArrayList<String> = ArrayList()

    init {
        reset()
    }

    fun reset() {
        this.values =  ArrayList()
    }
}