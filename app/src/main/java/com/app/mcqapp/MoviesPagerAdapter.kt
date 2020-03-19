package com.app.mcqapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter



class MoviesPagerAdapter(fragmentManager: FragmentManager, private val questions: MutableList<Question>) :
    FragmentStatePagerAdapter(fragmentManager) {


  override fun getItem(position: Int): Fragment {
    return QuestionFragment.newInstance(questions[position])
  }


  override fun getCount(): Int {
    return questions.size
  }
}