package com.app.mcqapp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.app.mcqapp.databinding.QuestionFragmentBinding
import android.widget.RadioButton
import org.greenrobot.eventbus.EventBus


class QuestionFragment : Fragment() {

    lateinit var question: Question
    lateinit var binding: QuestionFragmentBinding

    companion object {
        private val ARG_model = "myFragment_model"

        fun newInstance(question: Question): QuestionFragment {
            val args: Bundle = Bundle()
            args.putSerializable(ARG_model, question)
            val fragment = QuestionFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var viewModel: QuestionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        question = arguments?.getSerializable(ARG_model) as Question
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.question_fragment, container, false)
        binding.model = question
        return binding.getRoot();
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(QuestionViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rb1.setOnClickListener(clickListener)
        binding.rb2.setOnClickListener(clickListener)
        binding.rb3.setOnClickListener(clickListener)
        binding.rb4.setOnClickListener(clickListener)

        binding.button.setOnClickListener {
            EventBus.getDefault().post(NextClickEvent(question))
        }

        if (question.questionId == 4) {
            binding.button.setText("Finish")
        }

    }

    val clickListener = View.OnClickListener {
        question.answerId = it.tag as Int
    }

}
