package cl.datageneral.models

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

/**
 * Created by Pablo Molina on 16-11-2018. s.pablo.molina@gmail.com
 */
open class Item : RealmObject() {
	@PrimaryKey
	@Required
	var idItem:	Int? 			= null
	var description: String? 	= null
}