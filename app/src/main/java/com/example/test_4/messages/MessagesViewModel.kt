package com.example.test_4.messages

import androidx.lifecycle.ViewModel

class MessagesViewModel: ViewModel() {
    val chatsList: MutableList<Chat> = mutableListOf()

    fun search(input: String): MutableList<Chat> {
        val filteredChat = mutableListOf<Chat>()
        for (chat in chatsList) {
            if (chat.owner.lowercase().contains(input.lowercase())) {
                filteredChat.add(chat)
            }
        }
        return filteredChat
    }

}
