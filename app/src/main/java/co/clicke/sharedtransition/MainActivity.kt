package co.clicke.sharedtransition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)

            var v = findViewById<CardView>(R.id.linear)

            var activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, v, "a")
            ActivityCompat.startActivity(this, intent, activityOptionsCompat.toBundle())
        }
    }
}
