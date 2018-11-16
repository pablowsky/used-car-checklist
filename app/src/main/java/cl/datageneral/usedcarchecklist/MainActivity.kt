package cl.datageneral.usedcarchecklist

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.RadioButton

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(toolbar)

		fab.setOnClickListener { view ->
			dialogNew()
			/*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
					.setAction("Action", null).show()*/
		}
	}

	private fun dialogNew() {
		val builder = AlertDialog.Builder(this)
		val factory = LayoutInflater.from(this)
		val textEntryView = factory.inflate(R.layout.dg_newreview, null)
		/*val obs = textEntryView.findViewById(R.id.observacion) as EditText
		val realm = Realm.getDefaultInstance()

		val itemInsp = realm.where<InspeccionItemLista>()
				.equalTo("inspeccion.idInspeccion",idInspeccion)
				.equalTo("idItem.idItem",item.idItem)
				.findFirst()

		if(itemInsp!=null){
			Log.e("itemInsp",itemInsp.chequeo)
			Log.e("itemInsp",itemInsp.idInspeccionItemLista.toString())
		}

		obs.setText(itemInsp?.observacion)
		textEntryView.itemDescripcion.text = itemInsp?.idItem!!.descripcion

		when(itemInsp?.chequeo){
			getString(R.string.tag_dg_s) -> textEntryView.radioS.isChecked = true
			getString(R.string.tag_dg_n) -> textEntryView.radioN.isChecked = true
			else -> textEntryView.radioX.isChecked = true
		}*/

		builder.setView(textEntryView)
		builder.setTitle(R.string.dialogTitle)
				.setCancelable(false)
				.setPositiveButton(R.string.btnContinue) { _, _ ->
					/*val selectedId = textEntryView.estadoChequeo.checkedRadioButtonId
					val radioEst = textEntryView.findViewById(selectedId) as RadioButton

					Log.e("Opcion seleccionada,"+itemInsp.idItem,"-"+radioEst.tag)

					realm.executeTransaction { _ ->
						itemInsp.chequeo = radioEst.tag.toString()
						itemInsp.observacion = obs.text.toString()
					}*/
					val intent = Intent()
					startActivity(intent)
				}
				.setNegativeButton(R.string.btnCancel) { dialog, id -> dialog.cancel() }
		val alert = builder.create()
		alert.show()
	}
}
