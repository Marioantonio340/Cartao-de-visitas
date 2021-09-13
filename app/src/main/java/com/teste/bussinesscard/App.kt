package com.teste.bussinesscard

import android.app.Application
import com.teste.bussinesscard.data.AppDatabase
import com.teste.bussinesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao())}
}