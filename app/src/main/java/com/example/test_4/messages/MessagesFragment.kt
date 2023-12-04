package com.example.test_4.messages

import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test_4.databinding.FragmentMessagesBinding

class MessagesFragment : BaseFragment<FragmentMessagesBinding>(FragmentMessagesBinding::inflate) {
    private val viewModel: MessagesViewModel by viewModels()
    private val chatsAdapter by lazy { ChatRecyclerAdapter() }

    override fun setUp() {
        setUpRecycler()
    }

    private fun setUpRecycler() {
        with(binding.recyclerChats) {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = chatsAdapter
        }
    }

    override fun listeners() {
        searchListener()
    }

    private fun searchListener() {
        binding.edSearch.doOnTextChanged { text, _, _, _ ->
            chatsAdapter.setData(viewModel.search(text.toString()))
        }
    }
}