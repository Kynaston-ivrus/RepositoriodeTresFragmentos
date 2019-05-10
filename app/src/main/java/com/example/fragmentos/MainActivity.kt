package com.example.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var EsFrag1 = true
    var EsFrag2 = true
    fun cambiarfragmento (view: View){
        val fragmento1 = BlankFragment1()
        val fragmento2 = BlankFragment2()
        val fragmento3 = BlankFragment3()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        if(EsFrag1){
            EsFrag1 = false
            transaction.replace(R.id.reemplazar, fragmento1)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        else if (EsFrag2){
            EsFrag2 = false
            transaction.replace(R.id.reemplazar, fragmento2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        else{
            EsFrag1 = true
            EsFrag2 = true
            transaction.replace(R.id.reemplazar, fragmento3)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
