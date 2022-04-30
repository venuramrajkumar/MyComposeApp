package com.raj.mycomposeapp.fragment

import android.os.Bundle
import android.view.View
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.raj.mycomposeapp.R
import com.raj.mycomposeapp.activity.UserCardStatic

class NormalFragUsingComposeViewFragment : Fragment(R.layout.fragment_normal_uses_compose_view) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ComposeView>(R.id.myComposeView).
                setContent {
                    UserCardStatic()
                }
    }

    //If there is not Layout for the fragment

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        return ComposeView(requireContext()).apply {
//            setContent {
//                UserCardStatic()
//            }
//        }
//    }
}