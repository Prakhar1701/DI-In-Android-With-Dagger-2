package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.app.Application

class SmartPhoneApplication : Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()
}

/* When do we create a subclass of the application class?
->If there are tasks that need to run before the creation of first activity.
->If there are immutable data or global objects that needs to be shared across all components.*/