package me.khol.dagger.screens.onboarding.step.two

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import me.khol.dagger.R
import me.khol.dagger.screens.base.BaseFragment
import javax.inject.Inject

class TwoFragment : BaseFragment() {

    @Inject
    lateinit var viewModel: TwoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_continue).setOnClickListener {
            viewModel.continueToNextStep()
        }
    }
}