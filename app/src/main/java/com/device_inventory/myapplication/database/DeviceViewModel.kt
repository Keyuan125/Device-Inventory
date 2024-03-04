import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.device_inventory.myapplication.database.AppDatabase
import com.device_inventory.myapplication.database.Device
import kotlinx.coroutines.launch

class DeviceViewModel(private val database: AppDatabase) : ViewModel() {

    // Function to insert a device into the database
    fun insertDevice(device: Device) = viewModelScope.launch {
        database.deviceDao().insert(device)
    }
}
