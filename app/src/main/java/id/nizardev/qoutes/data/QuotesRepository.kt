package id.nizardev.qoutes.data

import androidx.lifecycle.LiveData
import id.nizardev.qoutes.data.Quote

interface QuotesRepository {

  fun insert(quote: Quote)

  fun update(quote: Quote)

  fun delete(quote: Quote)

  fun getQuotes(): LiveData<List<Quote>>
}