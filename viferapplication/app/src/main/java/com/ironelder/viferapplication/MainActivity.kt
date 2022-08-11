package com.ironelder.viferapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ironelder.viferapplication.ui.MainContract
import com.ironelder.viferapplication.ui.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun publishData(data: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun showMessage(msg: String) {
        TODO("Not yet implemented")
    }

    companion object {
        fun launch(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }
}