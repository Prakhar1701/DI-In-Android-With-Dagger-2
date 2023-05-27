package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(private val memorySize: Int) {
    @Provides
    fun providesMemoryCard(): MemoryCard {
        Log.i("STATUS", "Size Of The Memory Is $memorySize")
        return MemoryCard()
    }
}