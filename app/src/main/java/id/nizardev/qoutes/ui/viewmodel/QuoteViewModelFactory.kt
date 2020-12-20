package id.nizardev.qoutes.ui.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.nizardev.qoutes.data.QuotesRepository

class QuoteViewModelFactory(
    private val repository: QuotesRepository,
    private val application: Application
) : ViewModelProvider.Factory {
  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    return QuotesViewModel(application, repository) as T
  }

}