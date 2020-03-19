package com.app.mcqapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.greenrobot.eventbus.EventBus
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import org.greenrobot.eventbus.ThreadMode
import org.greenrobot.eventbus.Subscribe
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toast
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.gson.Gson


class PagerActivity : AppCompatActivity() {

    lateinit var queAnsData: QueAnsData
    private lateinit var pagerAdapter: MoviesPagerAdapter
    lateinit var pager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)
        queAnsData = Gson().fromJson(QuestionJson.jsonString, QueAnsData::class.java)
        pager = findViewById(R.id.view_pager)
        pagerAdapter = MoviesPagerAdapter(supportFragmentManager, queAnsData.questions)
        pager.adapter = pagerAdapter

    }

    public override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    public override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: NextClickEvent) {
        if (event.question.questionId == 4) {
            showRightAns()
        }
    }

    fun showRightAns() {

        var rightChoice = 0

        queAnsData.questions.forEach {
            if (it.answerId == it.mySelectedId) {
                rightChoice++
            }
        }

        Toast.makeText(this, "Total right answer are" + rightChoice, Toast.LENGTH_LONG).show()
        onBackPressed()
    }


}
