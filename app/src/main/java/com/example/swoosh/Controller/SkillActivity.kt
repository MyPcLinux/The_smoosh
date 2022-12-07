package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity: BaseActivity() {
    var league = ""
    var choseSkill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
      league = intent.getStringExtra(EXTRA_LEAGUE).toString()

        skillToFinishBtn.setOnClickListener {
            if (choseSkill != "") {
                val finishActivity = Intent(this, FinishActivity::class.java)
                finishActivity.putExtra(EXTRA_LEAGUE, league)
                finishActivity.putExtra(EXTRA_SKILL, choseSkill)
                startActivity(finishActivity)
            }else{
                Toast.makeText(this,"Please select one of the following items", Toast.LENGTH_LONG).show()
            }
        }
    }
    fun beginnerOnClick(view: View) {
        ballerSkillBtn.isChecked = false
        choseSkill = "beginner"
    }
    fun ballerOnClick(view: View) {
        beginerSkillBtn.isChecked = false
        choseSkill = "baller"
    }

}






