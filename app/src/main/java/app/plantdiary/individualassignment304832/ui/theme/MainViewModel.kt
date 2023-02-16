package app.plantdiary.individualassignment304832.ui.theme
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.plantdiary.individualassignment304832.dto.Country
import app.plantdiary.individualassignment304832.service.CountryService
import kotlinx.coroutines.launch

class MainViewModel :ViewModel() {

    var countries = MutableLiveData<List<Country>>()
    var countryService: CountryService = CountryService()

    fun fetchCountries() {
        viewModelScope.launch {
            var innerCountry = countryService.fetchCountries()
            countries.postValue(innerCountry)
        }

    }
}