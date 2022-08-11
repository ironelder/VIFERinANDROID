package com.ironelder.viferapplication.ui

interface MainContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun publishData(data: List<Any>)
        fun showMessage(msg:String)
    }

    interface Presenter {
        fun bindView(view: MainContract.View)
        fun unbindView()
        fun onViewCreated()
        fun onItemClicked(item:Any)
        fun onBackClicked()
    }

    interface Interactor {
        fun getItems(onSuccess: (List<Any>) -> Unit, onError: (Throwable) -> Unit)
    }

    interface Router {
        fun finish()
        fun openDetail(item: Any)
    }

    interface Repository {
        fun getItems(): List<Any>
    }
}