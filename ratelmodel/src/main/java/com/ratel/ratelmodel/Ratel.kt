package com.ratel.ratelmodel

import android.app.Application
import com.ratel.ratelmodel.`interface`.IHttp
import com.ratel.ratelmodel.http.HttpManager

/**
 * Created by zq on 2018/9/20.
 */
final class Ratel {



    object R{

        val lock:Any = Any()

        @Volatile
        var http:IHttp? = null

        var app:Application? = null

        fun init(application: Application){
            if (R.app == null){
                R.app = application
            }
        }
    }

    companion object {

        fun http():IHttp{
            if(R.http == null){
                HttpManager.register()
            }
            return R.http!!
        }
    }


}