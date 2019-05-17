package cl.datageneral.usedcarchecklist.ui.home

import cl.datageneral.usedcarchecklist.utils.rx.SchedulerProvider
import cl.datageneral.usedcarchecklist.data.DataManager
import cl.datageneral.usedcarchecklist.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by Pablo Molina on 20-11-2018. s.pablo.molina@gmail.com
 */
class HomePresenter<V: HomeContract.View>@Inject constructor(val dm: DataManager, val scheduler: SchedulerProvider):
		BasePresenter<V>(),
		HomeContract.Presenter