package com.ratel.ratelmodel.`interface`

import java.io.IOException
import java.io.OutputStream

/**
 * Created by zq on 2018/9/20.
 */
interface IRequestBody {

    fun getContentLength():Long

    fun getContentType(contentType:String)

    fun getContentType():String

    @Throws(IOException::class)
    fun writeTo(out:OutputStream)
}