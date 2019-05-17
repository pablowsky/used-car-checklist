package cl.datageneral.usedcarchecklist.di.module

import cl.datageneral.usedcarchecklist.ui.home.HomeActivity
import cl.datageneral.usedcarchecklist.ui.home.HomeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Pablo Molina on 16-05-2019. s.pablo.molina@gmail.com
 */
@Module
abstract class ActivityBindingModule {


	@ContributesAndroidInjector(modules = [HomeActivityModule::class])
	abstract fun bindHomeActivity(): HomeActivity


}