package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import dagger.Component

@Component
interface SmartPhoneComponent {
    /*The name of the function can be anything but
      the return type of the function should be the type of dependency required.*/
    fun getSmartPhone(): SmartPhone
}