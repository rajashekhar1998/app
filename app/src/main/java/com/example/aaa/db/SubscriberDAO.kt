package com.example.aaa.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SubscriberDAO {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun delete(subscriber: Subscriber)

    @Query("delete from subscriber_data_table")
    suspend fun deleteAll()

    @Query("select * from subscriber_data_table")
    fun getAllSubscribers(): LiveData<List<Subscriber>>
}