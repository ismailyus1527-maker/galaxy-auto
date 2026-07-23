package com.samsung.galaxyauto

import android.content.Intent
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.model.*
import androidx.core.graphics.drawable.IconCompat

/**
 * Galaxy Auto ana oturum sınıfı.
 * Samsung Galaxy deneyimini başlatır.
 */
class GalaxyAutoSession : Session() {

    override fun onCreateScreen(intent: Intent): Screen {
        return GalaxyHomeScreen(carContext)
    }

    override fun onNewIntent(intent: Intent) {
        // Harici intent isşleme
    }
}

/**
 * Basit ana ekran - Grid template ile
 */
class GalaxyHomeScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        val listBuilder = ItemList.Builder().apply {
            addItem(
                Row.Builder()
                    .setTitle("🗏️ Navigasyon")
                    .addText("Rota ve trafik bilgisi")
                    .build()
            )
            addItem(
                Row.Builder()
                    .setTitle("🐵 Medya")
                    .addText("Müzik, podcast ve radyo")
                    .build()
            )
            addItem(
                Row.Builder()
                    .setTitle("💬 İletişim")
                    .addText("Aramalar ve mesajlar")
                    .build()
            )
            addItem(
                Row.Builder()
                    .setTitle("🏠 SmartThings")
                    .addText("Akıllı ev kontrolü")
                    .build()
            )
            addItem(
                Row.Builder()
                    .setTitle("🎤 Bixby")
                    .addText("Sesli asistan")
                    .build()
            )
            addItem(
                Row.Builder()
                    .setTitle("❤️ Sağlık")
                    .addText("Sürücü sağlık takibi")
                    .build()
            )
        }

        return GridTemplate.Builder()
            .setTitle("Galaxy Auto")
            .setSingleList(listBuilder.build())
            .setHeaderAction(Action.PAN)
            .build()
    }
}
