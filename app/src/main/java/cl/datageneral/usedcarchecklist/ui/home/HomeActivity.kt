package cl.datageneral.usedcarchecklist.ui.home

import android.os.Bundle
import cl.datageneral.usedcarchecklist.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class HomeActivity : DaggerAppCompatActivity(), HomeContract.View {

	@Inject
	lateinit var presenter: HomePresenter<HomeContract.View>

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_home)
	}
}
