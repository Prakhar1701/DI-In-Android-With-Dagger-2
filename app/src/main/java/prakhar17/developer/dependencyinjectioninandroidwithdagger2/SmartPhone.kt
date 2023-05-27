package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(
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
