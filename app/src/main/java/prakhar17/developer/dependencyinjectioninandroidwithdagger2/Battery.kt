package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log

interface Battery {
    fun getPower() {
        Log.i("STATUS", "Battery Power Is Available")
    }
}