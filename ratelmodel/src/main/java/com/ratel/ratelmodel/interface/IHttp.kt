package com.ratel.ratelmodel.`interface`

import com.ratel.ratelmodel.http.Method
import com.ratel.ratelmodel.http.RequestParams

/**
 * Created by zq on 2018/9/20.
 */
interface IHttp {

    fun get(entity:RequestParams,callback:ICallback.ICommonCallback<*>):ICallback.ICallable<*>

    fun post(entity:RequestParams,callback: ICallback.ICommonCallback<*>):ICallback.ICallable<*>

    fun put(entity: RequestParams,callback: ICallback)

    fun delete(entity: RequestParams,callback: ICallback)

    fun request(method:Method,entity:RequestParams,callback:ICallback.ICommonCallback<*>):ICallback.ICallable<*>

}

