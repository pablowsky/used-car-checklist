package cl.datageneral.usedcarchecklist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ReviewActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_review)

		loadCategories()
	}

	fun loadCategories(){
		val frag = CategoriesFragment()

		val manager = supportFragmentManager
		val transaction = manager.beginTransaction()
		transaction.replace(R.id.frameContainer, frag, "auditorias")
		transaction.addToBackStack("auditorias")
		transaction.commit()
	}
}
