package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log

class MemoryCard {
    init {
        Log.i("STATUS", "Memory Card Constructed")
    }

    fun spaceAvailability() {
        Log.i("STATUS", "Memory Space Available")
    }
}