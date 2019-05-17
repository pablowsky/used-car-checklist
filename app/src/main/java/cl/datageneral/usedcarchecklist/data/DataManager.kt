package cl.datageneral.usedcarchecklist.data

import cl.bureauveritas.auditorias.data.prefs.MyPrefs
import cl.datageneral.usedcarchecklist.data.db.Query
import io.reactivex.disposables.CompositeDisposable


/**
 * Created by Pablo Molina on 04-04-2019. s.pablo.molina@gmail.com
 */
class DataManager(val query: Query,
				  val sPrefs: MyPrefs){
	private var mCompositeDisposable: CompositeDisposable? = null

	init{
		mCompositeDisposable = CompositeDisposable()
	}

/*
	fun getAudits(): RealmResults<Auditoria>?{
		return query.getAudits(sPrefs.get("ID_USUARIO")!!)
		*
		Log.e("DataManager","getAudits"+sPrefs.get("ID_USUARIO"))
		val call = apiObj.getAudits("1")
		mCompositeDisposable?.add(call
				.observeOn(AndroidSchedulers.mainThread())
				.subscribeOn(Schedulers.io())
				.subscribe( this::handleInsertSecResponse, this::handleInsertError )
		)
		return query.getAudits()*
	}

	fun getAuditsApi(): Observable<AuditsResponse> {
		return apiObj.getAudits(sPrefs.get("ID_USUARIO")!!)
	}

	fun getChapters(idStandard:Int): RealmResults<Capitulo>? {
		return query.getChapters(idStandard)
	}

	fun getQuestions(idRequirement:Int): RealmResults<Pregunta>? {
		return query.getQuestions(idRequirement)
	}

	fun getRequeriments(idChapter:Int): RealmResults<Requisito>? {
		return query.getRequeriments(idChapter)
	}

	fun getAnswer(idQuestion:Int): Respuesta {
		var an = query.getAnswer(idQuestion)
		if(an==null){
			an = Respuesta()
			an.idUsuario	= sPrefs.get("ID_USUARIO")!!.toInt()
			query.insertAnswer(an, idQuestion)
		}
		return an
	}

	fun insertAudit(audit: Auditoria){
		query.insertAudit(audit)
	}

	fun updateAnswer(answer: Respuesta){
		query.updateAnswer(answer)
	}*/
}