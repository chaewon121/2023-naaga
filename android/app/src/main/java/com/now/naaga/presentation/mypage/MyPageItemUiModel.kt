package com.now.naaga.presentation.mypage

abstract class MyPageItemUiModel(val viewType: MyPageViewType)

data class MyPagePlaceUiModel(
    val image: String,
    val description: String,
) : MyPageItemUiModel(MyPageViewType.PLACES)

data class MyPageStatisticsUiModel(
    val value: Int,
    val unit: String,
    val description: String,
) : MyPageItemUiModel(MyPageViewType.STATISTICS)

enum class MyPageViewType(val text: String) {
    STATISTICS("Statistics"),
    PLACES("My Places"),
}
