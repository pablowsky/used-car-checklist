package cl.datageneral.usedcarchecklist.di.module

import android.content.Context
import cl.bureauveritas.auditorias.data.prefs.MyPrefs
import cl.datageneral.usedcarchecklist.utils.rx.SchedulerProvider
import cl.datageneral.usedcarchecklist.utils.rx.SchedulerProviderImpl
import cl.datageneral.usedcarchecklist.DGApplication
import cl.datageneral.usedcarchecklist.data.DataManager
import cl.datageneral.usedcarchecklist.data.db.Query
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Pablo Molina on 16-05-2019. s.pablo.molina@gmail.com
 */
@Module
abstract class AppModule {

	@Binds
	abstract fun provideContext(application: DGApplication) : Context

	@Module
	companion object {
		@JvmStatic
		@Provides
		fun provideDataManager(q: Query, p: MyPrefs): DataManager = DataManager(q, p)

		@JvmStatic
		@Provides
		fun provideSchedulerProvider(): SchedulerProvider = SchedulerProviderImpl()

		@JvmStatic
		@Provides
		fun provideMyPrefs(context: Context): MyPrefs = MyPrefs(context)

		@JvmStatic
		@Provides
		fun provideQuery(): Query = Query()
	}
}