
package com.erby.casestudy 
import android.app.Service 
import android.content.Context 
import android.net.ConnectivityManager 
import android.net.NetworkInfo 

class Connection_Detection { // the name of this class is Connection_Detection 
    var context: Context? = null // in this class, nagdeclare tayo ng variable na ang pangalan ay 'context' 
    fun connect_detector(context:Context) { // katumbas ng public void ang 'fun',kaya fun ang gamit dito dahil ang gamit na programming language ay Kotlin
    // Kotlin is a programming language use in Java Virtual Machine na maaaring gamitin sa paggawa ng android applications. 'Public' means that anyone can have an access. 'Void' means no returning value                                       
        this.context = context // ang 'this' parameter ay ginagamit upang ma-clarify natin kung anong object ang pinag uusapan
    }
    fun isConnected() { 
        val connectivityManager = context?.getSystemService(Service.CONNECTIVITY_SERVICE) as ConnectivityManager
       
    } // under the isConnected() method is to get if the  

}
