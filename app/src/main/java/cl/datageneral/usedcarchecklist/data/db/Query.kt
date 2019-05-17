package cl.datageneral.usedcarchecklist.data.db

import android.util.Log
import io.realm.Realm
import io.realm.RealmModel


/**
 * Created by Pablo Molina on 19-07-2018. s.pablo.molina@gmail.com
 */
open class Query{
    val realm: Realm

    init {
        println("First initializer block that prints Query")
        realm = Realm.getDefaultInstance()
    }

	private fun <T : RealmModel> getId(clazz: Class<T>, field:String):Int{
		val currentId 	= realm.where<T>(clazz).max(field)
		var nextId 		= 0
		if (currentId != null) {
			nextId = currentId.toInt()
		}else{
			Log.e("getId","$nextId")
		}
		nextId++
		return nextId
	}

/*
	fun insertAnswer(answer: Respuesta, idQuestion:Int){
		try {
			realm.executeTransaction { realm ->
				// Obtengo el ID
				val currentId = realm.where<Respuesta>().max("idRespuesta")
				var nextId = 0
				if (currentId != null) {
					nextId = currentId.toInt()
				}
				nextId++

				// Relleno los atributos
				val preg = realm.where<Pregunta>().equalTo("idPregunta",idQuestion).findFirst()
				answer.idRespuesta 	= nextId
				answer.pregunta		= preg
				answer.estado		= Respuesta.ELIMINADO

				realm.copyToRealm(answer)
			}
		}catch (e: Exception){
			Log.e("QueryRealm1",e.toString())
		}
	}
	fun insertAudit(audit: Auditoria){
		Log.e("insertAudit","1")
		try {
			realm.executeTransaction { realm ->
				realm.copyToRealmOrUpdate(audit)
			}
		}catch (e: Exception){
			Log.e("insertAudit",e.toString())
		}
	}

	fun setRespuestaSinc(idRespuesta:Int){
		realm.executeTransaction { realm ->
			val rp1 = realm.where<Respuesta>()
					.equalTo("idRespuesta", idRespuesta)
					.findFirst()
			rp1?.estado		= Respuesta.SINC
			Log.e("Respuesta Actualizada, "+idRespuesta,rp1?.estado)
		}
	}
	fun updateAnswer(answer: Respuesta){
		realm.executeTransaction { realm ->
			val rp1 = realm.where<Respuesta>()
					.equalTo("idRespuesta", answer.idRespuesta)
					.findFirst()
			rp1?.evidencia 	= answer.evidencia
			rp1?.hallazgo	= answer.hallazgo
			rp1?.evaluacion	= answer.evaluacion
			rp1?.estado		= answer.estado
		}
	}
	fun insertSecuencia(secResp: SecuenciasResponse){
		try {
			realm.executeTransaction { realm ->
				val sec 		= Secuencias()
				sec.className 	= secResp.className
				sec.seqEnd 		= secResp.seqEnd
				sec.seqInit 	= secResp.seqInit
				sec.seqCurrent 	= secResp.seqInit
				sec.status		= true
				realm.copyToRealmOrUpdate(sec)


			}
		}catch (e: Exception){
			Log.e("QueryRealm2",e.toString())
		}
		when(secResp.className) {
			"respuesta" -> sinGlobalRespuesta()
			"foto" 		-> {}
			else 		-> {}
		}
	}

	fun sinGlobalRespuesta():Int{
		val inspSecuencias = realm.where<Secuencias>().equalTo("className","respuesta").findFirst()
		val items = realm.where<Respuesta>().isNull("idGlobal").findAll()
		var cm = 0
		try {
			realm.executeTransaction { realm ->
				for(inspeccion in items){
					val new_seq = inspSecuencias?.seq()
					if(new_seq!=null){
						inspeccion.idGlobal = new_seq
						cm++
					}
				}
			}
		}catch (e: Exception){
			Log.e("QueryRealm3",e.toString())
		}
		return items.size-cm
	}

	fun getRespuestasGlobalNull(): RealmResults<Respuesta> {
		val resp = realm.where<Respuesta>()
				.equalTo("estado", Respuesta.NO_SINC)
				.isNull("idGlobal")
				.findAll()
		return resp
	}
	fun getRespuestasGlobalNotNull(): RealmResults<Respuesta> {
		val resp = realm.where<Respuesta>()
				.equalTo("estado", Respuesta.NO_SINC)
				.isNotNull("idGlobal")
				.findAll()
		return resp
	}

	fun getAudits(idUsuario:String): RealmResults<Auditoria> {
		val items = realm.where<Auditoria>().findAll()
		return items
	}

	fun getChapters(idStandard:Int): RealmResults<Capitulo> {
		val items = realm.where<Capitulo>()
				.equalTo("norma.idNorma",idStandard)
				.findAll()
		return items
	}

	fun getQuestions(idRequirement:Int): RealmResults<Pregunta> {
		return realm.where<Pregunta>()
				.equalTo("idRequisito",idRequirement)
				.findAll()
	}

	fun getRequeriments(idChapter:Int): RealmResults<Requisito> {
		return realm.where<Requisito>()
				.equalTo("capitulo.idCapitulo",idChapter)
				.findAll()
	}

	fun getAnswer(idQuestion:Int): Respuesta? {
		return realm.where<Respuesta>()
				.equalTo("pregunta.idPregunta",idQuestion)
				.findFirst()
	}*/






	fun close(){
		realm.close()
	}

}