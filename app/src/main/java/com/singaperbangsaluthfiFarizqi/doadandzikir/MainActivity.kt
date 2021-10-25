package com.singaperbangsaluthfiFarizqi.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var llsunnahQuliyahShalat: LinearLayout
    private lateinit var lldzikirharian: LinearLayout
    private lateinit var lldzikirsetiapsaat: LinearLayout
    private lateinit var lldzikirpagipetang: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llsunnahQuliyahShalat = findViewById(R.id.ll_sunnah_Qauliyah)
        lldzikirharian = findViewById(R.id.ll_dzikir_harian)
        lldzikirsetiapsaat = findViewById(R.id.ll_dzikir_setiap_saat)
        lldzikirpagipetang = findViewById(R.id.ll_dzikir_pagi_petang)


        llsunnahQuliyahShalat.setOnClickListener(this)
        lldzikirharian.setOnClickListener(this)
        lldzikirsetiapsaat.setOnClickListener(this)
        lldzikirpagipetang.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        /*if (view?.id == R.id.ll_sunnah_Qauliyah){
            startActivity(Intent(this, QuliyahShalatActivity::class.java))
        }else if(view?.id == R.id.ll_dzikir_harian){
            startActivity(Intent(this, SetiapSaatDzikirActivity::class.java))
        } else if(view?.id == R.id.ll_dzikir_setiap_saat){
            startActivity(Intent(this, HarianDzikirDoaActivity::class.java))
        }else if(view?.id == R.id.ll_dzikir_pagi_petang){
            startActivity(Intent(this, PagiPetangDzikirActivity::class.java)))
        } else {

        }*/

        when (view?.id) {
            R.id.ll_sunnah_Qauliyah -> startActivity(
                Intent(
                    this,
                    QuliyahShalatActivity::class.java
                )
            )

            R.id.ll_dzikir_harian -> startActivity(
                Intent(
                    this,
                    HarianDzikirDoaActivity::class.java
                )
            )

            R.id.ll_dzikir_setiap_saat -> startActivity(
                Intent(
                    this,
                    SetiapSaatDzikirActivity::class.java
                )
            )

            R.id.ll_dzikir_pagi_petang -> startActivity(
                Intent(
                    this,
                    PagiPetangDzikirActivity::class.java
                )
            )

        }
    }
}

