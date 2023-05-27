package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log

class Battery {
    init {
        Log.i("STATUS", "Battery Constructed")
    }

    fun getPower() {
        Log.i("STATUS", "Battery Power Is Available")
    }
}