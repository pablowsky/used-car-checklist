package cl.datageneral.usedcarchecklist.data.db.models

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

/**
 * Created by Pablo Molina on 17-05-2019. s.pablo.molina@gmail.com
 */
open class Review : RealmObject() {
	@PrimaryKey
	@Required
	var idReview:		Int? 	= null
	var title: 			String? = null
	var year: 			Int 	= 0
	var description: 	String? = null
	var date:			String? = null
	var answers: 		RealmList<Answer> = RealmList()
}