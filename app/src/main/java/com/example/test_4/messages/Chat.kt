package com.example.test_4.messages

data class Chat(
    val id: Int,
    val image: String?,
    val owner: String,
    val lastMsg: String,
    val lastActive: String,
    val unread: Int,
    val isTyping: Boolean,
    val lastMsgType: MsgType
)

enum class MsgType {
    TEXT,
    FILE,
    VOICE
}
