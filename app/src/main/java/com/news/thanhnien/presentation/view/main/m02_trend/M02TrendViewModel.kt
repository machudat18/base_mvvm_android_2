package com.news.thanhnien.presentation.view.main.m02_trend

import com.news.thanhnien.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class M02TrendViewModel @Inject constructor(private val trendRepo: TrendRepository) : BaseViewModel() {

}