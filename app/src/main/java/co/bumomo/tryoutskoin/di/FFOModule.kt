package co.bumomo.tryoutskoin.di

import co.bumomo.tryoutskoin.DataProvider
import co.bumomo.tryoutskoin.DataProviderImpl
import co.bumomo.tryoutskoin.MySimplePresenter
import org.koin.dsl.module

    val module = module {
        single<DataProvider> { DataProviderImpl() }
        factory { MySimplePresenter(get()) }
    }
