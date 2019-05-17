package cl.datageneral.usedcarchecklist.data.db.models

import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

/**
 * Created by Pablo Molina on 17-05-2019. s.pablo.molina@gmail.com
 */
open class Answer : RealmObject() {
	@PrimaryKey
	@Required
	var idAnswer:		Int? 	= null
	var evaluation:		String 	= EV_NO_APPLY
	var remark:			String?	= null

	@LinkingObjects("answers")
	val item: RealmResults<Item>? = null

	companion object{
		val EV_NO_APPLY 	= "NA"
		val EV_SATISFY		= "S"
		val EV_NO_SATISFY	= "N"
	}
}