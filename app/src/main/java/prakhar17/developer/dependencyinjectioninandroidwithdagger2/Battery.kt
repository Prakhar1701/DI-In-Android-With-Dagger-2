package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.i("STATUS", "Battery Constructed")
    }

    fun getPower() {
        Log.i("STATUS", "Battery Power Is Available")
    }
}