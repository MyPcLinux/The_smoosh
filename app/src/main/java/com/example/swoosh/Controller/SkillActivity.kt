package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity: BaseActivity() {

   lateinit var classPlayer: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
      classPlayer = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

        skillToFinishBtn.setOnClickListener {
            if (classPlayer.skill != "") {
                val finishActivity = Intent(this, FinishActivity::class.java)
                finishActivity.putExtra(EXTRA_PLAYER, classPlayer)
                startActivity(finishActivity)
            }else{
                Toast.makeText(this,"Please select one of the following items", Toast.LENGTH_LONG).show()
            }
        }
    }
    fun beginnerOnClick(view: View) {
        ballerSkillBtn.isChecked = false
        classPlayer.skill = "beginner"
    }
    fun ballerOnClick(view: View) {
        beginerSkillBtn.isChecked = false
        classPlayer.skill = "baller"
    }

}






