package mx.itson.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //var = variable que va a cambiar su valor en diferentes ambientes
    //val = constante cuyo valor no cambia
    private lateinit var txtValor1 : EditText
    private lateinit var txtValor2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtValor1 =findViewById(R.id.valor1)
        txtValor2 =findViewById(R.id.valor2)

        val btnSumar =findViewById<Button>(R.id.btnSumar)
        btnSumar.setOnClickListener(this)

    }


    fun sumar (a:Int, b:Int) : Int {
        return a + b
    }

    fun sumar2 (a:Int, b:Int) = a + b

    fun restar (a: Int, b:Int) : Int{
        return a-b
    }

    fun dividir (a: Int, b:Int) : Int{
        return a / b
    }

    fun multiplicar (a:Int, b:Int) : Int{
        return a * b
    }

    override fun onClick(v: View?) {
        when(v?.id){
            (R.id.btnSumar) -> {
                try{
                    var resultado = sumar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())



                } catch(ex: Exception){
                    Log.e("Ocurrió un error en la suma", ex.toString())
                }
                if(txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()){
                    Toast.makeText(applicationContext, "El valor no es correcto", Toast.LENGTH_LONG).show()

                } else{
                    var resultado = sumar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())
                    Toast.makeText(applicationContext, "El resultado de la suma es ".plus(resultado), Toast.LENGTH_LONG).show()
                }

            }
            (R.id.btnResta) -> {
                try {
                    var resultado = restar(
                        txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt()
                    )


                } catch (ex: Exception) {
                    Log.e("Ocurrió un error en la resta", ex.toString())
                }
                if (txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "El valor no es correcto", Toast.LENGTH_LONG)
                        .show()

                } else {
                    var resultado = restar(
                        txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt()
                    )
                    Toast.makeText(
                        applicationContext,
                        "El resultado de la resta es ".plus(resultado),
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
            (R.id.btnMultiplicar) -> {
                try{
                    var resultado = multiplicar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())
                } catch (ex: Exception) {
                    Log.e("Ocurrió un error en la multiplicación",ex.toString())
                }
                if(txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "El valor no es correcto", Toast.LENGTH_LONG).show()
                }else{
                    var resultado = multiplicar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())

                    Toast.makeText(applicationContext, "El resultado de la multiplicación es ".plus(resultado), Toast.LENGTH_LONG).show()

                }

            }
            (R.id.btnDividir) -> {
                try{
                    var resultado = dividir(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())
                    Toast.makeText(applicationContext, "El resultado de la división es ".plus(resultado), Toast.LENGTH_LONG).show()

                } catch (ex: Exception) {
                    Log.e("Ocurrió un error en la división",ex.toString())
                }
                if(txtValor1.text.toString().isEmpty() || txtValor2.text.toString().isEmpty()) {
                    Toast.makeText(applicationContext, "El valor no es correcto", Toast.LENGTH_LONG).show()
                }else{
                    var resultado = multiplicar(txtValor1.text.toString().toInt(),
                        txtValor2.text.toString().toInt())
                    Toast.makeText(applicationContext, "El resultado de la división es ".plus(resultado), Toast.LENGTH_LONG).show()

                }

       }
    }

}