package cl.datageneral.usedcarchecklist

import android.app.Application
import io.realm.Realm


/**
 * Created by Pablo Molina on 16-11-2018. s.pablo.molina@gmail.com
 */
class DGApplication : Application() {
	override fun onCreate() {
		super.onCreate()
		Realm.init(this)
	}
}