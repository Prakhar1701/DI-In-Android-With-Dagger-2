package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import javax.inject.Inject

interface Battery {
    fun getPower() {
        Log.i("STATUS", "Battery Power Is Available")
    }
}