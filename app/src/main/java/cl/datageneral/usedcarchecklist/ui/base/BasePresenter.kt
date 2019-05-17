package cl.datageneral.usedcarchecklist.ui.base

import cl.bureauveritas.auditorias.ui.base.BaseContract
import io.reactivex.disposables.CompositeDisposable


/**
 * Created by Pablo Molina on 04-02-2019. s.pablo.molina@gmail.com
 */
open class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V> {
    protected var mView: V?    = null
    protected var mCompositeDisposable: CompositeDisposable? = null

    override fun subscribe() {
    }

    override fun unsubscribe() {
    }

    override fun onAttach(view: V) {
        mView = view
        mCompositeDisposable = CompositeDisposable()
    }

    override fun onDetach() {
        /*if(q!=null){
            q?.close()
        }*/
        //compositeDisposable.dispose()
        mView = null
    }
}
