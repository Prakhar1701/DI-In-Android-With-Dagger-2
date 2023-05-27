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
import androidx.compose.ui.tooling.preview.Preview
import prakhar17.developer.dependencyinjectioninandroidwithdagger2.ui.theme.DependencyInjectionInAndroidWithDagger2Theme

class MainActivity : ComponentActivity() {
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

        val smartPhone = SmartPhone(Battery(), MemoryCard(), SIMCard(ServiceProvider()))
            .makeCallWithRecording()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
    )
}