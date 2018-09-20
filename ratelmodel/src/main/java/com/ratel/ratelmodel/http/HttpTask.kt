package com.ratel.ratelmodel.http

import com.ratel.ratelmodel.`interface`.ICallback

/**
 * Created by zq on 2018/9/20.
 */
class HttpTask(entity:RequestParams,callback:ICallback.ICommonCallback<*>):ICallback.ICallable<Any> {
    override fun call(result: Any) {
    }
}