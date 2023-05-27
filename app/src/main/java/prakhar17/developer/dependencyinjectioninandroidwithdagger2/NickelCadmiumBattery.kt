package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor() : Battery {
    init {
        Log.i("STATUS", "Battery Constructed")
    }

    override fun getPower() {
        super.getPower()
        Log.i("STATUS", "Power From NickelCadmiumBattery")
    }
}