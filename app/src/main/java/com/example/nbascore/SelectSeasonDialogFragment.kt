package com.example.nbascore

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AppCompatDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SelectSeasonDialogFragment : AppCompatDialogFragment() {

    fun newInstance() :SelectSeasonDialogFragment {
        return SelectSeasonDialogFragment()
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL,R.style.FullScreenDialogFragment)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        var view : View = inflater.inflate(R.layout.select_season_fragment_layout,container,false)
        return view
    }
}