package id.nizardev.qoutes.data

import androidx.lifecycle.LiveData
import androidx.room.*
import id.nizardev.qoutes.data.Quote

@Dao
interface QuotesDao {

  @Query("SELECT * FROM rwquotes ORDER BY id DESC")
  fun getQuotes(): LiveData<List<Quote>>

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertQuote(quote: Quote) : Long

  @Update
  fun updateQuote(quote: Quote): Int

  @Delete
  fun deleteQuote(quote: Quote): Int
}