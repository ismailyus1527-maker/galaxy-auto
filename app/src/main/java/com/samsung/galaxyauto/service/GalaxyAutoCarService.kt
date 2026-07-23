package com.samsung.galaxyauto.service

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import com.samsung.galaxyauto.GalaxyAutoSession

class GalaxyAutoCarService : CarAppService() {

    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return GalaxyAutoSession()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    companion object {
        const val TAG = "GalaxyAutoCarService"
        const val SERVICE_VERSION = "1.0.0-beta"
    }
}
