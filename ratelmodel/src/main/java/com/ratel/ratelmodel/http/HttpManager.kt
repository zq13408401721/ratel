package com.ratel.ratelmodel.http

import com.ratel.ratelmodel.Ratel
import com.ratel.ratelmodel.`interface`.ICallback
import com.ratel.ratelmodel.`interface`.IHttp

/**
 * Created by zq on 2018/9/20.
 */
class HttpManager:IHttp {


    companion object {
        private val lock = Any()
        //原子型操作
        @Volatile
        private var http:HttpManager? = null

        //注册HttpManager
        fun register(){
            if(http == null){
                synchronized(lock){
                    http = HttpManager()
                }
            }
            Ratel.R.http = http
        }
    }



    override fun get(entity: RequestParams, callback: ICallback.ICommonCallback<*>):ICallback.ICallable<*> {
        return request(Method.GET,entity,callback)
    }

    override fun post(entity: RequestParams, callback: ICallback.ICommonCallback<*>):ICallback.ICallable<*> {
        return request(Method.POST,entity,callback)
    }

    override fun put(entity: RequestParams, callback: ICallback) {
    }

    override fun delete(entity: RequestParams, callback: ICallback){

    }

    override fun request(method: Method, entity: RequestParams, callback: ICallback.ICommonCallback<*>):ICallback.ICallable<*> {
        entity.method = method
        var cancelable:ICallback.ICallable<*>
        if(callback is ICallback.ICallable<*>){
            cancelable = callback as ICallback.ICallable<*>
        }
        var task = HttpTask(entity,callback)
        return task
    }

}