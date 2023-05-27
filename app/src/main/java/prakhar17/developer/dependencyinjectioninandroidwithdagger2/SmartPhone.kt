package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log

class SmartPhone(
    private val battery: Battery,
    private val memoryCard: MemoryCard,
    private val simCard: SIMCard,
) {
    init {
        battery.getPower()
        memoryCard.spaceAvailability()
        simCard.getConnection()
        Log.i("STATUS", "SmartPhone Constructed")
    }

    fun makeCallWithRecording() {
        Log.i("STATUS", "Calling...")
    }
}
