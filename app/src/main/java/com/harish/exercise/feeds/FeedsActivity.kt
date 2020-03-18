package com.harish.exercise.feeds

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.harish.exercise.R
import com.harish.exercise.common.BaseActivity
import com.harish.exercise.databinding.ActivityMainBinding
import com.harish.exercise.model.FeedMainResponse
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.view.KeyEvent
import com.harish.exercise.utils.Utils


class FeedsActivity : BaseActivity() {

    var viewModel: FeedsViewModel? = null
    var binding: ActivityMainBinding? = null
    var adapter: RecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(FeedsViewModel::class.java)
        init()
    }

    fun init() {
        binding?.viewModel = viewModel
        viewModel?.onViewAvailable()
        binding?.recyclerview?.layoutManager  = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)
        viewModel?.feedsList?.observe(this, Observer<FeedMainResponse> {
            if (adapter == null) {
                adapter = RecyclerAdapter(it.items!!)
                binding?.recyclerview?.adapter = adapter
            }
            else adapter?.updateList(it.items!!)

            binding?.progressbar!!.visibility = View.GONE
        })
        binding?.searchEdit!!.setOnEditorActionListener(object : TextView.OnEditorActionListener {
            override fun onEditorAction(v: TextView, actionId: Int, event: KeyEvent?): Boolean {
                Log.e("Harry", "Triggred")
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    if(binding?.searchEdit?.text.toString().length > 3) {
                        Log.e("Harry", "Triggred 1")
                        binding?.progressbar!!.visibility = View.VISIBLE
                        viewModel?.getFeedRequest(binding?.searchEdit?.text!!.toString())
                    }
                    else
                        Utils.showToast(applicationContext, getString(R.string.error_length))

                    return true
                }
                return false
            }
        })
    }


}
