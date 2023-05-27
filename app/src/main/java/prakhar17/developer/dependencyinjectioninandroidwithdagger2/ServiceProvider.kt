package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log

class ServiceProvider {
    init {
        Log.i("STATUS", "Service Provider Constructed")
    }

    fun getServiceProvider() {
        Log.i("STATUS", "Service Provider Connected")
    }
}