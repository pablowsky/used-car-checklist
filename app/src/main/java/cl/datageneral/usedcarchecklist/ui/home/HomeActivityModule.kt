package cl.datageneral.usedcarchecklist.ui.home

import cl.datageneral.usedcarchecklist.utils.rx.SchedulerProvider
import cl.datageneral.usedcarchecklist.data.DataManager
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by bel on 09/01/2018.
 */
@Module
abstract class HomeActivityModule{

    @Binds
    abstract fun provideHomeActivityView(subMenuActivity: HomeActivity): HomeContract.View

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideHomePresenter(dm: DataManager, sp: SchedulerProvider): HomePresenter<HomeContract.View> = HomePresenter(dm, sp)
    }
}