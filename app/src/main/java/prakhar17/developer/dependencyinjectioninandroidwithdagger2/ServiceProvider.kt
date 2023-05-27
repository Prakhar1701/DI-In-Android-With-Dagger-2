package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.i("STATUS", "Service Provider Constructed")
    }

    fun getServiceProvider() {
        Log.i("STATUS", "Service Provider Connected")
    }
}