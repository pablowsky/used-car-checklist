package cl.datageneral.usedcarchecklist

import cl.datageneral.usedcarchecklist.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.realm.Realm


/**
 * Created by Pablo Molina on 16-11-2018. s.pablo.molina@gmail.com
 */
class DGApplication : DaggerApplication() {
	override fun onCreate() {
		super.onCreate()
		Realm.init(this)
	}

	override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
		val appComponent = DaggerAppComponent.builder()
				.application(this)
				.build()
		appComponent.inject(this)
		return appComponent
	}
}