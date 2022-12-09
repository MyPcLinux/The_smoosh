package com.example.swoosh.Controller


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_legaue.*

class LeagueActivity : BaseActivity() {

    var classPlayer = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legaue)
    }
    fun mensOnClick(view: View) {
        womensLeaguageBtn.isChecked = false
        coEdLeaguageBtn.isChecked = false
        classPlayer.league = "mens"

    }
    fun womensOnClick(view: View) {
        mensLeaguageBtn.isChecked = false
        coEdLeaguageBtn.isChecked = false
        classPlayer.league = "womens"
    }
    fun coEdOnClick(view: View) {
        mensLeaguageBtn.isChecked = false
        womensLeaguageBtn.isChecked = false
        classPlayer.league = "co-ed"
    }
    fun leagueNextClicked(view: View) {
        if (classPlayer.league != "") {
            val skillActivity = Intent (this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, classPlayer)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select one of the following items", Toast.LENGTH_LONG).show()
        }

    }
}