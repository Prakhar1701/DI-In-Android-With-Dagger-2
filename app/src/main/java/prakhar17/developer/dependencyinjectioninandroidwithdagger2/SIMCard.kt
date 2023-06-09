package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    init {
        Log.i("STATUS", "SIM Card Constructed")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
        Log.i("STATUS", "Connection Obtained")
    }
}