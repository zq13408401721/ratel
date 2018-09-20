package com.ratel.ratelmodel.`interface`

/**
 * Created by zq on 2018/9/20.
 */
interface ICallback {

    interface ICommonCallback<ResultType>:ICallback{

        fun onSuccess(result:ResultType)

        fun onError(ex:Throwable,isOnCallback:Boolean)

        fun onCancelled()

        fun onFinished()
    }

    interface ICallable<ResultType>{
        fun call(result:ResultType)
    }

}