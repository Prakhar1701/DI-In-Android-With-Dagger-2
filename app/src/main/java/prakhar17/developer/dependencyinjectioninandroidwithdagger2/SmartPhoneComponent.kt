package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
    /*The name of the function can be anything but
      the return type of the function should be the type of dependency required.*/
    fun getSmartPhone(): SmartPhone
}