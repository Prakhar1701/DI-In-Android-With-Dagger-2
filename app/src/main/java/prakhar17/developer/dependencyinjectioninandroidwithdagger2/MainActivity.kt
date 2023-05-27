package prakhar17.developer.dependencyinjectioninandroidwithdagger2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import prakhar17.developer.dependencyinjectioninandroidwithdagger2.ui.theme.DependencyInjectionInAndroidWithDagger2Theme
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DependencyInjectionInAndroidWithDagger2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Dependency Injection In Android With Dagger 2")
                }
            }
        }

//        val smartPhone = SmartPhone(Battery(), MemoryCard(), SIMCard(ServiceProvider()))
//            .makeCallWithRecording()

//        val smartPhone = DaggerSmartPhoneComponent.create().getSmartPhone()
//            .makeCallWithRecording()

        DaggerSmartPhoneComponent.create().inject(this)
        smartPhone.makeCallWithRecording()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
    )
}