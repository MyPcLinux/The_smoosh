package com.example.swoosh


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_legaue.*

class LeagueActivity : BaseActivity() {
       var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legaue)
    }
    fun mensOnClick(view: View) {
        womensLeaguageBtn.isChecked = false
        coEdLeaguageBtn.isChecked = false
        selectedLeague = "mens"
    }
    fun womensOnClick(view: View) {
        mensLeaguageBtn.isChecked = false
        coEdLeaguageBtn.isChecked = false
        selectedLeague = "womens"
    }
    fun coEdOnClick(view: View) {
        mensLeaguageBtn.isChecked = false
        womensLeaguageBtn.isChecked = false
        selectedLeague = "co-ed"
    }
    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent (this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select one of the following items", Toast.LENGTH_LONG).show()
        }

    }
}